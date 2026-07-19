package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.FuelTypeEntity



@Dao
interface FuelTypesDao {



    @Insert
    suspend fun insert(
        entity: FuelTypeEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<FuelTypeEntity>
    )



    @Update
    suspend fun update(
        entity: FuelTypeEntity
    )



    @Delete
    suspend fun delete(
        entity: FuelTypeEntity
    )



    @Query("SELECT * FROM fuel_types")
    suspend fun getAll():
        List<FuelTypeEntity>



}
