package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SmartAlertLogEntity



@Dao
interface SmartAlertLogsDao {



    @Insert
    suspend fun insert(
        entity: SmartAlertLogEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SmartAlertLogEntity>
    )



    @Update
    suspend fun update(
        entity: SmartAlertLogEntity
    )



    @Delete
    suspend fun delete(
        entity: SmartAlertLogEntity
    )



    @Query("SELECT * FROM smart_alert_logs")
    suspend fun getAll():
        List<SmartAlertLogEntity>



}
