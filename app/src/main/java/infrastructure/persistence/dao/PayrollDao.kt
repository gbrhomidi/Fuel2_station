package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PayrollEntity



@Dao
interface PayrollDao {



    @Insert
    suspend fun insert(
        entity: PayrollEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PayrollEntity>
    )



    @Update
    suspend fun update(
        entity: PayrollEntity
    )



    @Delete
    suspend fun delete(
        entity: PayrollEntity
    )



    @Query("SELECT * FROM payroll")
    suspend fun getAll():
        List<PayrollEntity>



}
