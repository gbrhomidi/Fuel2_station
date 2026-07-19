package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.VehicleAccidentEntity



@Dao
interface VehicleAccidentsDao {



    @Insert
    suspend fun insert(
        entity: VehicleAccidentEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<VehicleAccidentEntity>
    )



    @Update
    suspend fun update(
        entity: VehicleAccidentEntity
    )



    @Delete
    suspend fun delete(
        entity: VehicleAccidentEntity
    )



    @Query("SELECT * FROM vehicle_accidents")
    suspend fun getAll():
        List<VehicleAccidentEntity>



}
