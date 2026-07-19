package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SmsLogEntity



@Dao
interface SmsLogsDao {



    @Insert
    suspend fun insert(
        entity: SmsLogEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SmsLogEntity>
    )



    @Update
    suspend fun update(
        entity: SmsLogEntity
    )



    @Delete
    suspend fun delete(
        entity: SmsLogEntity
    )



    @Query("SELECT * FROM sms_logs")
    suspend fun getAll():
        List<SmsLogEntity>



}
