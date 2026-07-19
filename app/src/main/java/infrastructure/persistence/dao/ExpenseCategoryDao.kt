package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ExpenseCategoryEntity



@Dao
interface ExpenseCategoryDao {



    @Insert
    suspend fun insert(
        entity: ExpenseCategoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ExpenseCategoryEntity>
    )



    @Update
    suspend fun update(
        entity: ExpenseCategoryEntity
    )



    @Delete
    suspend fun delete(
        entity: ExpenseCategoryEntity
    )



    @Query("SELECT * FROM expense_categories")
    suspend fun getAll():
        List<ExpenseCategoryEntity>



}
