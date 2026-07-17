package domain.repositories

import infrastructure.persistence.entities.CashBoxEntity

interface CashBoxRepository {

    suspend fun insert(cashBox: CashBoxEntity): Long

    suspend fun update(cashBox: CashBoxEntity)

    suspend fun findById(id: Long): CashBoxEntity?

    suspend fun findByBoxCode(boxCode: String): CashBoxEntity?

    suspend fun findByStation(stationId: Long): List<CashBoxEntity>

    suspend fun findByResponsibleUser(userId: Long): List<CashBoxEntity>

    suspend fun findByStatus(status: String): List<CashBoxEntity>

    suspend fun findAll(): List<CashBoxEntity>

    suspend fun softDelete(id: Long): Int

    suspend fun softDeleteByBoxCode(boxCode: String): Int
}
