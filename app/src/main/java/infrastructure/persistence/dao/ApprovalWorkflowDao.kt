package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ApprovalWorkflowEntity



@Dao
interface ApprovalWorkflowDao {



    @Insert
    suspend fun insert(
        entity: ApprovalWorkflowEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ApprovalWorkflowEntity>
    )



    @Update
    suspend fun update(
        entity: ApprovalWorkflowEntity
    )



    @Delete
    suspend fun delete(
        entity: ApprovalWorkflowEntity
    )



    @Query("SELECT * FROM approval_workflows")
    suspend fun getAll():
        List<ApprovalWorkflowEntity>



}
