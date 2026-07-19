package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.VehicleExpenseEntity



@Dao
interface VehicleExpensesDao {



    @Insert
    suspend fun insert(
        entity: VehicleExpenseEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<VehicleExpenseEntity>
    )



    @Update
    suspend fun update(
        entity: VehicleExpenseEntity
    )



    @Delete
    suspend fun delete(
        entity: VehicleExpenseEntity
    )



    @Query("SELECT * FROM vehicle_expenses")
    suspend fun getAll():
        List<VehicleExpenseEntity>



}
