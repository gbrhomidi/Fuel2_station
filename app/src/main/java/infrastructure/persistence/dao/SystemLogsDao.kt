package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SystemLogEntity



@Dao
interface SystemLogsDao {



    @Insert
    suspend fun insert(
        entity: SystemLogEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SystemLogEntity>
    )



    @Update
    suspend fun update(
        entity: SystemLogEntity
    )



    @Delete
    suspend fun delete(
        entity: SystemLogEntity
    )



    @Query("SELECT * FROM system_logs")
    suspend fun getAll():
        List<SystemLogEntity>



}
