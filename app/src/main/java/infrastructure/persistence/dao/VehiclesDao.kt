package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.VehicleEntity



@Dao
interface VehiclesDao {



    @Insert
    suspend fun insert(
        entity: VehicleEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<VehicleEntity>
    )



    @Update
    suspend fun update(
        entity: VehicleEntity
    )



    @Delete
    suspend fun delete(
        entity: VehicleEntity
    )



    @Query("SELECT * FROM vehicles")
    suspend fun getAll():
        List<VehicleEntity>



}
