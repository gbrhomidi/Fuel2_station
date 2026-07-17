package infrastructure.persistence.migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

/**
 * Migration from version 1 to 2.
 * 
 * Adds Phase 1 financial entities:
 * - payments
 * - receipts
 * - cash_boxes
 * 
 * ADR-013: Financial Entity Migration
 */
class Migration1To2 : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        // Create payments table
        db.execSQL("""
            CREATE TABLE IF NOT EXISTS `payments` (
                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                `uuid` TEXT NOT NULL,
                `payment_code` TEXT NOT NULL,
                `sale_id` INTEGER,
                `customer_party_id` INTEGER,
                `supplier_party_id` INTEGER,
                `payment_type` TEXT NOT NULL,
                `payment_method` TEXT NOT NULL,
                `amount_minor` INTEGER NOT NULL DEFAULT 0,
                `currency_code` TEXT NOT NULL DEFAULT 'SAR',
                `currency_id` INTEGER,
                `exchange_rate` INTEGER NOT NULL DEFAULT 100,
                `cash_box_id` INTEGER,
                `status` TEXT NOT NULL DEFAULT 'completed',
                `is_refund` INTEGER NOT NULL DEFAULT 0,
                `original_payment_id` INTEGER,
                `refund_reason` TEXT,
                `notes` TEXT,
                `created_by` INTEGER NOT NULL,
                `updated_by` INTEGER,
                `deleted_by` INTEGER,
                `created_at` TEXT NOT NULL,
                `updated_at` TEXT,
                `deleted_at` TEXT,
                `is_deleted` INTEGER NOT NULL DEFAULT 0,
                `sync_status` INTEGER NOT NULL DEFAULT 0,
                `sync_version` INTEGER NOT NULL DEFAULT 1,
                `sync_at` TEXT,
                `device_id` TEXT,
                `row_version` INTEGER NOT NULL DEFAULT 1,
                `remarks` TEXT,
                `extra_data` TEXT,
                FOREIGN KEY(`sale_id`) REFERENCES `sales_transactions`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`customer_party_id`) REFERENCES `parties`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`supplier_party_id`) REFERENCES `parties`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`currency_id`) REFERENCES `currencies`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`cash_box_id`) REFERENCES `cash_boxes`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`original_payment_id`) REFERENCES `payments`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`created_by`) REFERENCES `users`(`id`) ON DELETE RESTRICT
            )
        """)
        
        // Create receipts table
        db.execSQL("""
            CREATE TABLE IF NOT EXISTS `receipts` (
                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                `uuid` TEXT NOT NULL,
                `receipt_number` TEXT NOT NULL,
                `customer_party_id` INTEGER,
                `payment_id` INTEGER,
                `cash_box_id` INTEGER,
                `receipt_type` TEXT NOT NULL,
                `received_from` TEXT NOT NULL,
                `received_by` INTEGER,
                `amount_minor` INTEGER NOT NULL,
                `currency_code` TEXT NOT NULL DEFAULT 'SAR',
                `currency_id` INTEGER,
                `cash_amount_minor` INTEGER NOT NULL DEFAULT 0,
                `cheque_amount_minor` INTEGER NOT NULL DEFAULT 0,
                `bank_amount_minor` INTEGER NOT NULL DEFAULT 0,
                `other_amount_minor` INTEGER NOT NULL DEFAULT 0,
                `status` TEXT NOT NULL DEFAULT 'ACTIVE',
                `created_by` INTEGER NOT NULL,
                `created_at` TEXT NOT NULL,
                `updated_at` TEXT,
                `deleted_at` TEXT,
                `is_deleted` INTEGER NOT NULL DEFAULT 0,
                `sync_status` INTEGER NOT NULL DEFAULT 0,
                `sync_version` INTEGER NOT NULL DEFAULT 1,
                `sync_at` TEXT,
                `device_id` TEXT,
                `row_version` INTEGER NOT NULL DEFAULT 1,
                `remarks` TEXT,
                `extra_data` TEXT,
                FOREIGN KEY(`customer_party_id`) REFERENCES `parties`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`payment_id`) REFERENCES `payments`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`cash_box_id`) REFERENCES `cash_boxes`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`created_by`) REFERENCES `users`(`id`) ON DELETE RESTRICT
            )
        """)
        
        // Create cash_boxes table
        db.execSQL("""
            CREATE TABLE IF NOT EXISTS `cash_boxes` (
                `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                `uuid` TEXT NOT NULL,
                `box_code` TEXT NOT NULL,
                `box_name` TEXT NOT NULL,
                `box_name_ar` TEXT,
                `station_id` INTEGER NOT NULL,
                `box_type` TEXT NOT NULL DEFAULT 'MAIN',
                `opening_balance_minor` INTEGER NOT NULL DEFAULT 0,
                `current_balance_minor` INTEGER NOT NULL DEFAULT 0,
                `maximum_balance_minor` INTEGER NOT NULL DEFAULT 50000000,
                `currency_code` TEXT NOT NULL DEFAULT 'SAR',
                `currency_id` INTEGER,
                `responsible_user_id` INTEGER,
                `status` TEXT NOT NULL DEFAULT 'OPENED',
                `created_by` INTEGER NOT NULL,
                `created_at` TEXT NOT NULL,
                `updated_at` TEXT,
                `deleted_at` TEXT,
                `is_deleted` INTEGER NOT NULL DEFAULT 0,
                `sync_status` INTEGER NOT NULL DEFAULT 0,
                `sync_version` INTEGER NOT NULL DEFAULT 1,
                `sync_at` TEXT,
                `device_id` TEXT,
                `row_version` INTEGER NOT NULL DEFAULT 1,
                `remarks` TEXT,
                `extra_data` TEXT,
                FOREIGN KEY(`station_id`) REFERENCES `stations`(`id`) ON DELETE RESTRICT,
                FOREIGN KEY(`currency_id`) REFERENCES `currencies`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`responsible_user_id`) REFERENCES `users`(`id`) ON DELETE SET NULL,
                FOREIGN KEY(`created_by`) REFERENCES `users`(`id`) ON DELETE RESTRICT
            )
        """)
        
        // Create indices
        createIndices(db)
    }
    
    private fun createIndices(db: SupportSQLiteDatabase) {
        // Payments indices
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_payments_uuid` ON `payments` (`uuid`)")
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_payments_payment_code` ON `payments` (`payment_code`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_payments_cash_box_id_is_deleted` ON `payments` (`cash_box_id`, `is_deleted`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_payments_sale_id_is_deleted` ON `payments` (`sale_id`, `is_deleted`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_payments_customer_party_id` ON `payments` (`customer_party_id`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_payments_created_at` ON `payments` (`created_at`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_payments_status` ON `payments` (`status`)")
        
        // Receipts indices
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_receipts_uuid` ON `receipts` (`uuid`)")
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_receipts_receipt_number` ON `receipts` (`receipt_number`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_receipts_payment_id` ON `receipts` (`payment_id`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_receipts_cash_box_id_is_deleted` ON `receipts` (`cash_box_id`, `is_deleted`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_receipts_customer_party_id_is_deleted` ON `receipts` (`customer_party_id`, `is_deleted`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_receipts_created_at` ON `receipts` (`created_at`)")
        
        // Cash boxes indices
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_cash_boxes_uuid` ON `cash_boxes` (`uuid`)")
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_cash_boxes_box_code` ON `cash_boxes` (`box_code`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_cash_boxes_station_id_status_is_deleted` ON `cash_boxes` (`station_id`, `status`, `is_deleted`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_cash_boxes_responsible_user_id_is_deleted` ON `cash_boxes` (`responsible_user_id`, `is_deleted`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_cash_boxes_status_is_deleted` ON `cash_boxes` (`status`, `is_deleted`)")
    }
}
