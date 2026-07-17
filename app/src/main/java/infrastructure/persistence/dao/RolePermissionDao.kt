package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.RolePermissionCrossRef


@Dao
interface RolePermissionDao {


    @Insert(
        onConflict = OnConflictStrategy.ABORT
    )
    suspend fun insert(
        mapping: RolePermissionCrossRef
    ): Long



    @Update
    suspend fun update(
        mapping: RolePermissionCrossRef
    )



    @Query("""
        SELECT *
        FROM role_permission_cross_ref
        WHERE id = :id
        AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(
        id: Long
    ): RolePermissionCrossRef?



    @Query("""
        SELECT *
        FROM role_permission_cross_ref
        WHERE role_id = :roleId
        AND is_deleted = 0
    """)
    suspend fun findByRoleId(
        roleId: Long
    ): List<RolePermissionCrossRef>



    @Query("""
        SELECT *
        FROM role_permission_cross_ref
        WHERE permission_id = :permissionId
        AND is_deleted = 0
    """)
    suspend fun findByPermissionId(
        permissionId: Long
    ): List<RolePermissionCrossRef>



    @Query("""
        SELECT *
        FROM role_permission_cross_ref
        WHERE role_id = :roleId
        AND permission_id = :permissionId
        AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByRoleAndPermission(
        roleId: Long,
        permissionId: Long
    ): RolePermissionCrossRef?



    @Query("""
        SELECT *
        FROM role_permission_cross_ref
        WHERE is_deleted = 0
    """)
    suspend fun findAll(): List<RolePermissionCrossRef>



    @Query("""
        UPDATE role_permission_cross_ref
        SET is_deleted = 1,
            deleted_at = datetime('now')
        WHERE id = :id
    """)
    suspend fun softDelete(
        id: Long
    )

}
