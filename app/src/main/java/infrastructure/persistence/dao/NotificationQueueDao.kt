package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.NotificationQueueEntity



@Dao
interface NotificationQueueDao {



    @Insert
    suspend fun insert(
        entity: NotificationQueueEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<NotificationQueueEntity>
    )



    @Update
    suspend fun update(
        entity: NotificationQueueEntity
    )



    @Delete
    suspend fun delete(
        entity: NotificationQueueEntity
    )



    @Query("SELECT * FROM notification_queue")
    suspend fun getAll():
        List<NotificationQueueEntity>



}
