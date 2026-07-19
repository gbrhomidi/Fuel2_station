package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.VehicleMaintenanceEntity



@Dao
interface VehicleMaintenanceDao {



    @Insert
    suspend fun insert(
        entity: VehicleMaintenanceEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<VehicleMaintenanceEntity>
    )



    @Update
    suspend fun update(
        entity: VehicleMaintenanceEntity
    )



    @Delete
    suspend fun delete(
        entity: VehicleMaintenanceEntity
    )



    @Query("SELECT * FROM vehicle_maintenance")
    suspend fun getAll():
        List<VehicleMaintenanceEntity>



}
