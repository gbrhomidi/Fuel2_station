package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.EmployeePaymentEntity



@Dao
interface EmployeePaymentsDao {



    @Insert
    suspend fun insert(
        entity: EmployeePaymentEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<EmployeePaymentEntity>
    )



    @Update
    suspend fun update(
        entity: EmployeePaymentEntity
    )



    @Delete
    suspend fun delete(
        entity: EmployeePaymentEntity
    )



    @Query("SELECT * FROM employee_payments")
    suspend fun getAll():
        List<EmployeePaymentEntity>



}
