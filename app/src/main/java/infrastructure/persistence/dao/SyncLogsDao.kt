package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SyncLogEntity



@Dao
interface SyncLogsDao {



    @Insert
    suspend fun insert(
        entity: SyncLogEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SyncLogEntity>
    )



    @Update
    suspend fun update(
        entity: SyncLogEntity
    )



    @Delete
    suspend fun delete(
        entity: SyncLogEntity
    )



    @Query("SELECT * FROM sync_logs")
    suspend fun getAll():
        List<SyncLogEntity>



}
