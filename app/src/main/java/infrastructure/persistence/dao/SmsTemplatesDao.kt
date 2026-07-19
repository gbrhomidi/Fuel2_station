package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SmsTemplateEntity



@Dao
interface SmsTemplatesDao {



    @Insert
    suspend fun insert(
        entity: SmsTemplateEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SmsTemplateEntity>
    )



    @Update
    suspend fun update(
        entity: SmsTemplateEntity
    )



    @Delete
    suspend fun delete(
        entity: SmsTemplateEntity
    )



    @Query("SELECT * FROM sms_templates")
    suspend fun getAll():
        List<SmsTemplateEntity>



}
