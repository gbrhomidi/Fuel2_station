package domain.repositories

import infrastructure.persistence.entities.ReceiptEntity

interface ReceiptRepository {

    suspend fun insert(receipt: ReceiptEntity): Long

    suspend fun update(receipt: ReceiptEntity)

    suspend fun findById(id: Long): ReceiptEntity?

    suspend fun findByReceiptNumber(receiptNumber: String): ReceiptEntity?

    suspend fun findByCashBox(cashBoxId: Long): List<ReceiptEntity>

    suspend fun findByPayment(paymentId: Long): ReceiptEntity?

    suspend fun findAll(): List<ReceiptEntity>

    suspend fun softDelete(id: Long): Int

    suspend fun softDeleteByReceiptNumber(receiptNumber: String): Int
}
