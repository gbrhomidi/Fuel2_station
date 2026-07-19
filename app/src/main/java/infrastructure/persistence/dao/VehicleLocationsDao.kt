package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.VehicleLocationEntity



@Dao
interface VehicleLocationsDao {



    @Insert
    suspend fun insert(
        entity: VehicleLocationEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<VehicleLocationEntity>
    )



    @Update
    suspend fun update(
        entity: VehicleLocationEntity
    )



    @Delete
    suspend fun delete(
        entity: VehicleLocationEntity
    )



    @Query("SELECT * FROM vehicle_locations")
    suspend fun getAll():
        List<VehicleLocationEntity>



}
