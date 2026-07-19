package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.NotificationTemplateEntity



@Dao
interface NotificationTemplatesDao {



    @Insert
    suspend fun insert(
        entity: NotificationTemplateEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<NotificationTemplateEntity>
    )



    @Update
    suspend fun update(
        entity: NotificationTemplateEntity
    )



    @Delete
    suspend fun delete(
        entity: NotificationTemplateEntity
    )



    @Query("SELECT * FROM notification_templates")
    suspend fun getAll():
        List<NotificationTemplateEntity>



}
