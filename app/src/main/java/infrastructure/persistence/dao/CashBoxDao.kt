package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.CashBoxEntity

@Dao
interface CashBoxDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insert(cashBox: CashBoxEntity): Long

    @Update
    suspend fun update(cashBox: CashBoxEntity)

    @Query("SELECT * FROM cash_boxes WHERE id = :id AND is_deleted = 0")
    suspend fun findById(id: Long): CashBoxEntity?

    @Query("SELECT * FROM cash_boxes WHERE box_code = :boxCode AND is_deleted = 0")
    suspend fun findByBoxCode(boxCode: String): CashBoxEntity?

    @Query("SELECT * FROM cash_boxes WHERE station_id = :stationId AND is_deleted = 0")
    suspend fun findByStation(stationId: Long): List<CashBoxEntity>

    @Query("SELECT * FROM cash_boxes WHERE responsible_user_id = :userId AND is_deleted = 0")
    suspend fun findByResponsibleUser(userId: Long): List<CashBoxEntity>

    @Query("SELECT * FROM cash_boxes WHERE status = :status AND is_deleted = 0")
    suspend fun findByStatus(status: String): List<CashBoxEntity>

    @Query("SELECT * FROM cash_boxes WHERE is_deleted = 0 ORDER BY id ASC")
    suspend fun findAll(): List<CashBoxEntity>

    @Query("""
        UPDATE cash_boxes
        SET is_deleted = 1,
            deleted_at = (CAST(strftime('%s','now') AS INTEGER) * 1000)
        WHERE id = :id
          AND is_deleted = 0
    """)
    suspend fun softDelete(id: Long): Int

    @Query("""
        UPDATE cash_boxes
        SET is_deleted = 1,
            deleted_at = (CAST(strftime('%s','now') AS INTEGER) * 1000)
        WHERE box_code = :boxCode
          AND is_deleted = 0
    """)
    suspend fun softDeleteByBoxCode(boxCode: String): Int
}
