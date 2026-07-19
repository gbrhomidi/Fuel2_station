package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.JobQueueEntity



@Dao
interface JobQueueDao {



    @Insert
    suspend fun insert(
        entity: JobQueueEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<JobQueueEntity>
    )



    @Update
    suspend fun update(
        entity: JobQueueEntity
    )



    @Delete
    suspend fun delete(
        entity: JobQueueEntity
    )



    @Query("SELECT * FROM job_queue")
    suspend fun getAll():
        List<JobQueueEntity>



}
