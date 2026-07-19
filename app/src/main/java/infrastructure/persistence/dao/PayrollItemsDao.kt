package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PayrollItemEntity



@Dao
interface PayrollItemsDao {



    @Insert
    suspend fun insert(
        entity: PayrollItemEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PayrollItemEntity>
    )



    @Update
    suspend fun update(
        entity: PayrollItemEntity
    )



    @Delete
    suspend fun delete(
        entity: PayrollItemEntity
    )



    @Query("SELECT * FROM payroll_items")
    suspend fun getAll():
        List<PayrollItemEntity>



}
