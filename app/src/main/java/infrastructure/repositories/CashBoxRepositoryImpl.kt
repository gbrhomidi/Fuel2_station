package infrastructure.repositories

import domain.repositories.CashBoxRepository
import infrastructure.persistence.dao.CashBoxDao
import infrastructure.persistence.entities.CashBoxEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CashBoxRepositoryImpl @Inject constructor(
    private val cashBoxDao: CashBoxDao
) : CashBoxRepository {

    override suspend fun insert(cashBox: CashBoxEntity): Long =
        cashBoxDao.insert(cashBox)

    override suspend fun update(cashBox: CashBoxEntity) =
        cashBoxDao.update(cashBox)

    override suspend fun findById(id: Long): CashBoxEntity? =
        cashBoxDao.findById(id)

    override suspend fun findByBoxCode(boxCode: String): CashBoxEntity? =
        cashBoxDao.findByBoxCode(boxCode)

    override suspend fun findByStation(stationId: Long): List<CashBoxEntity> =
        cashBoxDao.findByStation(stationId)

    override suspend fun findByResponsibleUser(userId: Long): List<CashBoxEntity> =
        cashBoxDao.findByResponsibleUser(userId)

    override suspend fun findByStatus(status: String): List<CashBoxEntity> =
        cashBoxDao.findByStatus(status)

    override suspend fun findAll(): List<CashBoxEntity> =
        cashBoxDao.findAll()

    override suspend fun softDelete(id: Long): Int =
        cashBoxDao.softDelete(id)

    override suspend fun softDeleteByBoxCode(boxCode: String): Int =
        cashBoxDao.softDeleteByBoxCode(boxCode)
}
