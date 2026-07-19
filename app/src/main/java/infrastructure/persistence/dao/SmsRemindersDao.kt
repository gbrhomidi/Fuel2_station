package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SmsReminderEntity



@Dao
interface SmsRemindersDao {



    @Insert
    suspend fun insert(
        entity: SmsReminderEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SmsReminderEntity>
    )



    @Update
    suspend fun update(
        entity: SmsReminderEntity
    )



    @Delete
    suspend fun delete(
        entity: SmsReminderEntity
    )



    @Query("SELECT * FROM sms_reminders")
    suspend fun getAll():
        List<SmsReminderEntity>



}
