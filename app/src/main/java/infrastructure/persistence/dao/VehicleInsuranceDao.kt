package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.VehicleInsuranceEntity



@Dao
interface VehicleInsuranceDao {



    @Insert
    suspend fun insert(
        entity: VehicleInsuranceEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<VehicleInsuranceEntity>
    )



    @Update
    suspend fun update(
        entity: VehicleInsuranceEntity
    )



    @Delete
    suspend fun delete(
        entity: VehicleInsuranceEntity
    )



    @Query("SELECT * FROM vehicle_insurance")
    suspend fun getAll():
        List<VehicleInsuranceEntity>



}
