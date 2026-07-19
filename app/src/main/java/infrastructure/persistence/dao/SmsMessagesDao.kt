package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SmsMessageEntity



@Dao
interface SmsMessagesDao {



    @Insert
    suspend fun insert(
        entity: SmsMessageEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SmsMessageEntity>
    )



    @Update
    suspend fun update(
        entity: SmsMessageEntity
    )



    @Delete
    suspend fun delete(
        entity: SmsMessageEntity
    )



    @Query("SELECT * FROM sms_messages")
    suspend fun getAll():
        List<SmsMessageEntity>



}
