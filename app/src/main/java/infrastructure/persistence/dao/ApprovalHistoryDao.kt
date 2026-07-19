package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ApprovalHistoryEntity



@Dao
interface ApprovalHistoryDao {



    @Insert
    suspend fun insert(
        entity: ApprovalHistoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ApprovalHistoryEntity>
    )



    @Update
    suspend fun update(
        entity: ApprovalHistoryEntity
    )



    @Delete
    suspend fun delete(
        entity: ApprovalHistoryEntity
    )



    @Query("SELECT * FROM approval_history")
    suspend fun getAll():
        List<ApprovalHistoryEntity>



}
