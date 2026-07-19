package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.BudgetDetailEntity



@Dao
interface BudgetDetailDao {



    @Insert
    suspend fun insert(
        entity: BudgetDetailEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<BudgetDetailEntity>
    )



    @Update
    suspend fun update(
        entity: BudgetDetailEntity
    )



    @Delete
    suspend fun delete(
        entity: BudgetDetailEntity
    )



    @Query("SELECT * FROM budget_details")
    suspend fun getAll():
        List<BudgetDetailEntity>



}
