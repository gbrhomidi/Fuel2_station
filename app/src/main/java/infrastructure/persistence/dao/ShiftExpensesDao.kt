package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ShiftExpenseEntity



@Dao
interface ShiftExpensesDao {



    @Insert
    suspend fun insert(
        entity: ShiftExpenseEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ShiftExpenseEntity>
    )



    @Update
    suspend fun update(
        entity: ShiftExpenseEntity
    )



    @Delete
    suspend fun delete(
        entity: ShiftExpenseEntity
    )



    @Query("SELECT * FROM shift_expenses")
    suspend fun getAll():
        List<ShiftExpenseEntity>



}
