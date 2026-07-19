package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ApprovalStepEntity



@Dao
interface ApprovalStepDao {



    @Insert
    suspend fun insert(
        entity: ApprovalStepEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ApprovalStepEntity>
    )



    @Update
    suspend fun update(
        entity: ApprovalStepEntity
    )



    @Delete
    suspend fun delete(
        entity: ApprovalStepEntity
    )



    @Query("SELECT * FROM approval_steps")
    suspend fun getAll():
        List<ApprovalStepEntity>



}
