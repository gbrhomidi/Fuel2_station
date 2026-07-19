package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.EmployeeEntity



@Dao
interface EmployeesDao {



    @Insert
    suspend fun insert(
        entity: EmployeeEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<EmployeeEntity>
    )



    @Update
    suspend fun update(
        entity: EmployeeEntity
    )



    @Delete
    suspend fun delete(
        entity: EmployeeEntity
    )



    @Query("SELECT * FROM employees")
    suspend fun getAll():
        List<EmployeeEntity>



}
