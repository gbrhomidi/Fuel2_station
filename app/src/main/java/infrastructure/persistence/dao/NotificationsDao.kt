package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.NotificationEntity



@Dao
interface NotificationsDao {



    @Insert
    suspend fun insert(
        entity: NotificationEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<NotificationEntity>
    )



    @Update
    suspend fun update(
        entity: NotificationEntity
    )



    @Delete
    suspend fun delete(
        entity: NotificationEntity
    )



    @Query("SELECT * FROM notifications")
    suspend fun getAll():
        List<NotificationEntity>



}
