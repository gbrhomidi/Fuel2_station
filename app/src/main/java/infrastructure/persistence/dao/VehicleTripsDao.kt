package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.VehicleTripEntity



@Dao
interface VehicleTripsDao {



    @Insert
    suspend fun insert(
        entity: VehicleTripEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<VehicleTripEntity>
    )



    @Update
    suspend fun update(
        entity: VehicleTripEntity
    )



    @Delete
    suspend fun delete(
        entity: VehicleTripEntity
    )



    @Query("SELECT * FROM vehicle_trips")
    suspend fun getAll():
        List<VehicleTripEntity>



}
