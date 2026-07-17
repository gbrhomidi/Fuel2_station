package infrastructure.persistence.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase


/**
 * Migration 1 -> 2
 *
 * ADR-012:
 * Financial Precision Contract
 *
 * All monetary values:
 * - Stored as INTEGER minor units
 * - Never REAL / DOUBLE
 *
 * Entities covered:
 * - payments
 * - receipts
 * - cash_boxes
 * - sales_transactions
 * - bank_accounts
 */
class Migration1To2 : Migration(1, 2) {


    override fun migrate(db: SupportSQLiteDatabase) {


        createSalesTransactions(db)

        createBankAccounts(db)

        createCashBoxes(db)

        createPayments(db)

        createReceipts(db)


        createIndexes(db)
    }



    private fun createSalesTransactions(
        db: SupportSQLiteDatabase
    ) {

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS sales_transactions (

                id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,

                uuid TEXT NOT NULL,

                invoice_number TEXT NOT NULL,

                customer_party_id INTEGER,

                currency_id INTEGER,

                total_amount_minor INTEGER NOT NULL DEFAULT 0,

                paid_amount_minor INTEGER NOT NULL DEFAULT 0,

                currency_code TEXT NOT NULL DEFAULT 'SAR',

                status TEXT NOT NULL DEFAULT 'OPEN',


                created_by INTEGER NOT NULL,

                created_at TEXT NOT NULL,

                updated_by INTEGER,

                updated_at TEXT,

                deleted_by INTEGER,

                deleted_at TEXT,

                is_deleted INTEGER NOT NULL DEFAULT 0,


                sync_status INTEGER NOT NULL DEFAULT 0,

                sync_version INTEGER NOT NULL DEFAULT 1,

                sync_at TEXT,

                device_id TEXT,

                row_version INTEGER NOT NULL DEFAULT 1,


                remarks TEXT,

                extra_data TEXT,


                FOREIGN KEY(customer_party_id)
                REFERENCES parties(id)
                ON DELETE SET NULL,


                FOREIGN KEY(currency_id)
                REFERENCES currencies(id)
                ON DELETE SET NULL

            )
            """
        )
    }




    private fun createBankAccounts(
        db: SupportSQLiteDatabase
    ){

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS bank_accounts (

                id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,


                uuid TEXT NOT NULL,


                account_number TEXT NOT NULL,


                bank_name TEXT NOT NULL,


                currency_id INTEGER,


                balance_minor INTEGER NOT NULL DEFAULT 0,


                currency_code TEXT NOT NULL DEFAULT 'SAR',



                created_by INTEGER NOT NULL,

                created_at TEXT NOT NULL,

                updated_by INTEGER,

                updated_at TEXT,

                deleted_by INTEGER,

                deleted_at TEXT,


                is_deleted INTEGER NOT NULL DEFAULT 0,


                sync_status INTEGER NOT NULL DEFAULT 0,

                sync_version INTEGER NOT NULL DEFAULT 1,

                sync_at TEXT,

                device_id TEXT,


                row_version INTEGER NOT NULL DEFAULT 1,


                remarks TEXT,

                extra_data TEXT,


                FOREIGN KEY(currency_id)
                REFERENCES currencies(id)
                ON DELETE SET NULL

            )
            """
        )
    }




    private fun createCashBoxes(
        db: SupportSQLiteDatabase
    ){

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS cash_boxes (

                id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,


                uuid TEXT NOT NULL,


                box_code TEXT NOT NULL,


                box_name TEXT NOT NULL,


                box_name_ar TEXT,


                station_id INTEGER NOT NULL,


                currency_id INTEGER,


                responsible_user_id INTEGER,


                box_type TEXT NOT NULL DEFAULT 'MAIN',


                opening_balance_minor INTEGER NOT NULL DEFAULT 0,


                current_balance_minor INTEGER NOT NULL DEFAULT 0,


                maximum_balance_minor INTEGER NOT NULL DEFAULT 50000000,


                currency_code TEXT NOT NULL DEFAULT 'SAR',


                status TEXT NOT NULL DEFAULT 'OPENED',



                created_by INTEGER NOT NULL,

                created_at TEXT NOT NULL,

                updated_by INTEGER,

                updated_at TEXT,

                deleted_by INTEGER,

                deleted_at TEXT,


                is_deleted INTEGER NOT NULL DEFAULT 0,


                sync_status INTEGER NOT NULL DEFAULT 0,

                sync_version INTEGER NOT NULL DEFAULT 1,

                sync_at TEXT,

                device_id TEXT,


                row_version INTEGER NOT NULL DEFAULT 1,


                remarks TEXT,

                extra_data TEXT,


                FOREIGN KEY(station_id)
                REFERENCES stations(id)
                ON DELETE RESTRICT,


                FOREIGN KEY(currency_id)
                REFERENCES currencies(id)
                ON DELETE SET NULL,


                FOREIGN KEY(responsible_user_id)
                REFERENCES users(id)
                ON DELETE SET NULL

            )
            """
        )
    }




    private fun createPayments(
        db: SupportSQLiteDatabase
    ){

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS payments (

                id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,


                uuid TEXT NOT NULL,


                payment_code TEXT NOT NULL,


                sale_id INTEGER,


                customer_party_id INTEGER,


                supplier_party_id INTEGER,


                bank_account_id INTEGER,


                cash_box_id INTEGER,


                currency_id INTEGER,


                amount_minor INTEGER NOT NULL DEFAULT 0,


                exchange_rate_minor INTEGER NOT NULL DEFAULT 100,


                currency_code TEXT NOT NULL DEFAULT 'SAR',


                payment_type TEXT NOT NULL,


                payment_method TEXT NOT NULL,


                status TEXT NOT NULL DEFAULT 'completed',


                is_refund INTEGER NOT NULL DEFAULT 0,


                original_payment_id INTEGER,


                refund_reason TEXT,


                notes TEXT,



                created_by INTEGER NOT NULL,

                created_at TEXT NOT NULL,

                updated_by INTEGER,

                updated_at TEXT,

                deleted_by INTEGER,

                deleted_at TEXT,


                is_deleted INTEGER NOT NULL DEFAULT 0,


                sync_status INTEGER NOT NULL DEFAULT 0,

                sync_version INTEGER NOT NULL DEFAULT 1,

                sync_at TEXT,

                device_id TEXT,


                row_version INTEGER NOT NULL DEFAULT 1,


                remarks TEXT,

                extra_data TEXT,


                FOREIGN KEY(sale_id)
                REFERENCES sales_transactions(id)
                ON DELETE SET NULL,


                FOREIGN KEY(customer_party_id)
                REFERENCES parties(id)
                ON DELETE SET NULL,


                FOREIGN KEY(currency_id)
                REFERENCES currencies(id)
                ON DELETE SET NULL,


                FOREIGN KEY(bank_account_id)
                REFERENCES bank_accounts(id)
                ON DELETE SET NULL,


                FOREIGN KEY(cash_box_id)
                REFERENCES cash_boxes(id)
                ON DELETE SET NULL,


                FOREIGN KEY(original_payment_id)
                REFERENCES payments(id)
                ON DELETE SET NULL,


                FOREIGN KEY(created_by)
                REFERENCES users(id)
                ON DELETE RESTRICT

            )
            """
        )
    }





    private fun createReceipts(
        db: SupportSQLiteDatabase
    ){

        db.execSQL(
            """
            CREATE TABLE IF NOT EXISTS receipts (

                id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,


                uuid TEXT NOT NULL,


                receipt_number TEXT NOT NULL,


                customer_party_id INTEGER,


                payment_id INTEGER,


                cash_box_id INTEGER,


                receipt_type TEXT NOT NULL,


                received_from TEXT NOT NULL,


                received_by INTEGER,


                amount_minor INTEGER NOT NULL DEFAULT 0,


                currency_id INTEGER,


                cash_amount_minor INTEGER NOT NULL DEFAULT 0,


                cheque_amount_minor INTEGER NOT NULL DEFAULT 0,


                bank_amount_minor INTEGER NOT NULL DEFAULT 0,


                other_amount_minor INTEGER NOT NULL DEFAULT 0,


                status TEXT NOT NULL DEFAULT 'ACTIVE',



                created_by INTEGER NOT NULL,

                created_at TEXT NOT NULL,

                updated_at TEXT,

                deleted_at TEXT,


                is_deleted INTEGER NOT NULL DEFAULT 0,


                sync_status INTEGER NOT NULL DEFAULT 0,

                sync_version INTEGER NOT NULL DEFAULT 1,

                sync_at TEXT,

                device_id TEXT,


                row_version INTEGER NOT NULL DEFAULT 1,


                remarks TEXT,

                extra_data TEXT,


                FOREIGN KEY(customer_party_id)
                REFERENCES parties(id)
                ON DELETE SET NULL,


                FOREIGN KEY(payment_id)
                REFERENCES payments(id)
                ON DELETE SET NULL,


                FOREIGN KEY(cash_box_id)
                REFERENCES cash_boxes(id)
                ON DELETE SET NULL,


                FOREIGN KEY(created_by)
                REFERENCES users(id)
                ON DELETE RESTRICT

            )
            """
        )
    }




    private fun createIndexes(
        db: SupportSQLiteDatabase
    ){


        val indexes = listOf(

            "CREATE UNIQUE INDEX index_sales_uuid ON sales_transactions(uuid)",

            "CREATE UNIQUE INDEX index_sales_invoice ON sales_transactions(invoice_number)",


            "CREATE UNIQUE INDEX index_bank_uuid ON bank_accounts(uuid)",

            "CREATE UNIQUE INDEX index_bank_account_number ON bank_accounts(account_number)",


            "CREATE UNIQUE INDEX index_cash_uuid ON cash_boxes(uuid)",

            "CREATE UNIQUE INDEX index_cash_code ON cash_boxes(box_code)",


            "CREATE UNIQUE INDEX index_payment_uuid ON payments(uuid)",

            "CREATE UNIQUE INDEX index_payment_code ON payments(payment_code)",


            "CREATE UNIQUE INDEX index_receipt_uuid ON receipts(uuid)",

            "CREATE UNIQUE INDEX index_receipt_number ON receipts(receipt_number)"

        )


        indexes.forEach {
            db.execSQL(it)
        }
    }
}
