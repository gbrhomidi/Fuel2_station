package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SyncQueueEntity



@Dao
interface SyncQueueDao {



    @Insert
    suspend fun insert(
        entity: SyncQueueEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SyncQueueEntity>
    )



    @Update
    suspend fun update(
        entity: SyncQueueEntity
    )



    @Delete
    suspend fun delete(
        entity: SyncQueueEntity
    )



    @Query("SELECT * FROM sync_queue")
    suspend fun getAll():
        List<SyncQueueEntity>



}
