package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ScheduledJobEntity



@Dao
interface ScheduledJobsDao {



    @Insert
    suspend fun insert(
        entity: ScheduledJobEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ScheduledJobEntity>
    )



    @Update
    suspend fun update(
        entity: ScheduledJobEntity
    )



    @Delete
    suspend fun delete(
        entity: ScheduledJobEntity
    )



    @Query("SELECT * FROM scheduled_jobs")
    suspend fun getAll():
        List<ScheduledJobEntity>



}
