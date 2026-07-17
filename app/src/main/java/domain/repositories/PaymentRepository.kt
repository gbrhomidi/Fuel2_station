package domain.repositories

import infrastructure.persistence.entities.PaymentEntity

interface PaymentRepository {

    suspend fun insert(payment: PaymentEntity): Long

    suspend fun update(payment: PaymentEntity)

    suspend fun findById(id: Long): PaymentEntity?

    suspend fun findByUuid(uuid: String): PaymentEntity?

    suspend fun findByCashBox(cashBoxId: Long): List<PaymentEntity>

    suspend fun findByCustomer(customerId: Long): List<PaymentEntity>

    suspend fun findAll(): List<PaymentEntity>

    suspend fun softDelete(id: Long): Int

    suspend fun softDeleteByUuid(uuid: String): Int
}
