package infrastructure.persistence.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase


/**
 * Migration 2 -> 3
 *
 * Security Domain Alignment Migration
 *
 * Aligns legacy DatabaseHelper security tables
 * with Room Persistence Entities.
 *
 * Covered:
 * - roles
 * - permissions
 * - role_permissions -> role_permission_cross_ref
 * - users
 *
 * Fixes:
 * - BaseEntity missing columns
 * - SyncStatus String -> Integer contract
 * - Optimistic locking row_version
 */
class Migration2To3 : Migration(2, 3) {


    override fun migrate(db: SupportSQLiteDatabase) {

        db.beginTransaction()

        try {

            upgradeRoles(db)

            upgradePermissions(db)

            upgradeRolePermissions(db)

            upgradeUsers(db)

            normalizeSyncStatus(db)

            createSecurityIndexes(db)


            db.setTransactionSuccessful()

        } finally {

            db.endTransaction()
        }
    }



    private fun upgradeRoles(
        db: SupportSQLiteDatabase
    ) {


        if (
            tableExists(
                db,
                "roles"
            )
        ) {


            addColumnIfMissing(
                db,
                "roles",
                "row_version INTEGER NOT NULL DEFAULT 1"
            )

        }
    }





    private fun upgradePermissions(
        db: SupportSQLiteDatabase
    ) {


        if (!tableExists(db, "permissions"))
            return



        addColumnIfMissing(
            db,
            "permissions",
            "updated_by INTEGER"
        )


        addColumnIfMissing(
            db,
            "permissions",
            "deleted_by INTEGER"
        )


        addColumnIfMissing(
            db,
            "permissions",
            "deleted_at TEXT"
        )


        addColumnIfMissing(
            db,
            "permissions",
            "sync_status INTEGER NOT NULL DEFAULT 0"
        )


        addColumnIfMissing(
            db,
            "permissions",
            "sync_version INTEGER NOT NULL DEFAULT 1"
        )


        addColumnIfMissing(
            db,
            "permissions",
            "sync_at TEXT"
        )


        addColumnIfMissing(
            db,
            "permissions",
            "device_id TEXT"
        )


        addColumnIfMissing(
            db,
            "permissions",
            "row_version INTEGER NOT NULL DEFAULT 1"
        )

    }







    private fun upgradeRolePermissions(
        db: SupportSQLiteDatabase
    ) {


        /*
         * Rename old table
         *
         * role_permissions
         *
         * ->
         *
         * role_permission_cross_ref
         */


        if (
            tableExists(
                db,
                "role_permissions"
            )
            &&
            !tableExists(
                db,
                "role_permission_cross_ref"
            )
        ) {


            db.execSQL(
                """
                ALTER TABLE role_permissions
                RENAME TO role_permission_cross_ref
                """
            )

        }



        if (
            !tableExists(
                db,
                "role_permission_cross_ref"
            )
        )
            return





        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "updated_by INTEGER"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "updated_at TEXT"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "deleted_by INTEGER"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "deleted_at TEXT"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "sync_status INTEGER NOT NULL DEFAULT 0"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "sync_version INTEGER NOT NULL DEFAULT 1"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "sync_at TEXT"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "device_id TEXT"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "row_version INTEGER NOT NULL DEFAULT 1"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "remarks TEXT"
        )


        addColumnIfMissing(
            db,
            "role_permission_cross_ref",
            "extra_data TEXT"
        )

    }







    private fun upgradeUsers(
        db: SupportSQLiteDatabase
    ) {


        if (!tableExists(db,"users"))
            return



        addColumnIfMissing(
            db,
            "users",
            "row_version INTEGER NOT NULL DEFAULT 1"
        )

    }








    private fun normalizeSyncStatus(
        db: SupportSQLiteDatabase
    ) {


        val tables = listOf(
            "roles",
            "permissions",
            "role_permission_cross_ref",
            "users"
        )



        tables.forEach { table ->


            if (
                tableExists(
                    db,
                    table
                )
                &&
                columnExists(
                    db,
                    table,
                    "sync_status"
                )
            ) {


                /*
                 * Convert legacy text status
                 *
                 * pending  -> 0
                 * syncing  -> 1
                 * synced   -> 2
                 * failed   -> 3
                 *
                 */


                db.execSQL(
                    """
                    UPDATE $table
                    SET sync_status =
                    CASE LOWER(sync_status)

                        WHEN 'pending'
                        THEN 0

                        WHEN 'syncing'
                        THEN 1

                        WHEN 'synced'
                        THEN 2

                        WHEN 'failed'
                        THEN 3

                        ELSE 0

                    END
                    WHERE typeof(sync_status)='text'
                    """
                )

            }
        }

    }








    private fun createSecurityIndexes(
        db: SupportSQLiteDatabase
    ) {


        val indexes = listOf(

            """
            CREATE INDEX IF NOT EXISTS
            index_roles_row_version
            ON roles(row_version)
            """,


            """
            CREATE INDEX IF NOT EXISTS
            index_permissions_module
            ON permissions(module)
            """,


            """
            CREATE INDEX IF NOT EXISTS
            index_role_permission_role
            ON role_permission_cross_ref(role_id)
            """,


            """
            CREATE INDEX IF NOT EXISTS
            index_role_permission_permission
            ON role_permission_cross_ref(permission_id)
            """

        )



        indexes.forEach {

            db.execSQL(it)

        }

    }









    private fun addColumnIfMissing(
        db: SupportSQLiteDatabase,
        table: String,
        definition: String
    ) {


        val column =
            definition
                .trim()
                .split(" ")
                .first()



        if (
            !columnExists(
                db,
                table,
                column
            )
        ) {


            db.execSQL(
                """
                ALTER TABLE $table
                ADD COLUMN $definition
                """
            )

        }

    }








    private fun columnExists(
        db: SupportSQLiteDatabase,
        table: String,
        column: String
    ): Boolean {


        db.query(
            "PRAGMA table_info($table)"
        ).use { cursor ->


            while(cursor.moveToNext()) {


                val name =
                    cursor.getString(
                        cursor.getColumnIndexOrThrow("name")
                    )


                if(name == column)
                    return true

            }

        }


        return false
    }








    private fun tableExists(
        db: SupportSQLiteDatabase,
        table: String
    ): Boolean {


        db.query(
            """
            SELECT name
            FROM sqlite_master
            WHERE type='table'
            AND name=?
            """,
            arrayOf(table)
        )
        .use {

            return it.moveToFirst()

        }

    }

}
