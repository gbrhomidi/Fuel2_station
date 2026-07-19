package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.BudgetEntity



@Dao
interface BudgetDao {



    @Insert
    suspend fun insert(
        entity: BudgetEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<BudgetEntity>
    )



    @Update
    suspend fun update(
        entity: BudgetEntity
    )



    @Delete
    suspend fun delete(
        entity: BudgetEntity
    )



    @Query("SELECT * FROM budgets")
    suspend fun getAll():
        List<BudgetEntity>



}
