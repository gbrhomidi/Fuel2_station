package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ExpenseEntity



@Dao
interface ExpensesDao {



    @Insert
    suspend fun insert(
        entity: ExpenseEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ExpenseEntity>
    )



    @Update
    suspend fun update(
        entity: ExpenseEntity
    )



    @Delete
    suspend fun delete(
        entity: ExpenseEntity
    )



    @Query("SELECT * FROM expenses")
    suspend fun getAll():
        List<ExpenseEntity>



}
