package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SystemEventEntity



@Dao
interface SystemEventsDao {



    @Insert
    suspend fun insert(
        entity: SystemEventEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SystemEventEntity>
    )



    @Update
    suspend fun update(
        entity: SystemEventEntity
    )



    @Delete
    suspend fun delete(
        entity: SystemEventEntity
    )



    @Query("SELECT * FROM system_events")
    suspend fun getAll():
        List<SystemEventEntity>



}
