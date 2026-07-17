package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.ReceiptEntity

@Dao
interface ReceiptDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insert(receipt: ReceiptEntity): Long

    @Update
    suspend fun update(receipt: ReceiptEntity)

    @Query("SELECT * FROM receipts WHERE id = :id AND is_deleted = 0")
    suspend fun findById(id: Long): ReceiptEntity?

    @Query("SELECT * FROM receipts WHERE receipt_number = :receiptNumber AND is_deleted = 0")
    suspend fun findByReceiptNumber(receiptNumber: String): ReceiptEntity?

    @Query("SELECT * FROM receipts WHERE cash_box_id = :cashBoxId AND is_deleted = 0")
    suspend fun findByCashBox(cashBoxId: Long): List<ReceiptEntity>

    @Query("SELECT * FROM receipts WHERE payment_id = :paymentId AND is_deleted = 0")
    suspend fun findByPayment(paymentId: Long): ReceiptEntity?

    @Query("SELECT * FROM receipts WHERE is_deleted = 0 ORDER BY created_at DESC")
    suspend fun findAll(): List<ReceiptEntity>

    @Query("""
        UPDATE receipts
        SET is_deleted = 1,
            deleted_at = (CAST(strftime('%s','now') AS INTEGER) * 1000)
        WHERE id = :id
          AND is_deleted = 0
    """)
    suspend fun softDelete(id: Long): Int

    @Query("""
        UPDATE receipts
        SET is_deleted = 1,
            deleted_at = (CAST(strftime('%s','now') AS INTEGER) * 1000)
        WHERE receipt_number = :receiptNumber
          AND is_deleted = 0
    """)
    suspend fun softDeleteByReceiptNumber(receiptNumber: String): Int
}
