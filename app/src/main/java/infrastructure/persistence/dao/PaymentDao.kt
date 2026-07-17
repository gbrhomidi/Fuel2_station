package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.PaymentEntity

@Dao
interface PaymentDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insert(payment: PaymentEntity): Long

    @Update
    suspend fun update(payment: PaymentEntity)

    @Query("SELECT * FROM payments WHERE id = :id AND is_deleted = 0")
    suspend fun findById(id: Long): PaymentEntity?

    @Query("SELECT * FROM payments WHERE uuid = :uuid AND is_deleted = 0")
    suspend fun findByUuid(uuid: String): PaymentEntity?

    @Query("SELECT * FROM payments WHERE cash_box_id = :cashBoxId AND is_deleted = 0")
    suspend fun findByCashBox(cashBoxId: Long): List<PaymentEntity>

    @Query("SELECT * FROM payments WHERE customer_party_id = :customerId AND is_deleted = 0")
    suspend fun findByCustomer(customerId: Long): List<PaymentEntity>

    @Query("SELECT * FROM payments WHERE is_deleted = 0 ORDER BY created_at DESC")
    suspend fun findAll(): List<PaymentEntity>

    @Query("""
        UPDATE payments
        SET is_deleted = 1,
            deleted_at = (CAST(strftime('%s','now') AS INTEGER) * 1000)
        WHERE id = :id
          AND is_deleted = 0
    """)
    suspend fun softDelete(id: Long): Int

    @Query("""
        UPDATE payments
        SET is_deleted = 1,
            deleted_at = (CAST(strftime('%s','now') AS INTEGER) * 1000)
        WHERE uuid = :uuid
          AND is_deleted = 0
    """)
    suspend fun softDeleteByUuid(uuid: String): Int
}
