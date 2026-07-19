package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.EmployeesOldEntity



@Dao
interface EmployeesOldDao {



    @Insert
    suspend fun insert(
        entity: EmployeesOldEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<EmployeesOldEntity>
    )



    @Update
    suspend fun update(
        entity: EmployeesOldEntity
    )



    @Delete
    suspend fun delete(
        entity: EmployeesOldEntity
    )



    @Query("SELECT * FROM employees_old")
    suspend fun getAll():
        List<EmployeesOldEntity>



}
