package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.NotificationLogEntity



@Dao
interface NotificationLogsDao {



    @Insert
    suspend fun insert(
        entity: NotificationLogEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<NotificationLogEntity>
    )



    @Update
    suspend fun update(
        entity: NotificationLogEntity
    )



    @Delete
    suspend fun delete(
        entity: NotificationLogEntity
    )



    @Query("SELECT * FROM notification_logs")
    suspend fun getAll():
        List<NotificationLogEntity>



}
