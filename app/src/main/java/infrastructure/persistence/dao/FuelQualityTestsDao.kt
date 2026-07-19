package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.FuelQualityTestEntity



@Dao
interface FuelQualityTestsDao {



    @Insert
    suspend fun insert(
        entity: FuelQualityTestEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<FuelQualityTestEntity>
    )



    @Update
    suspend fun update(
        entity: FuelQualityTestEntity
    )



    @Delete
    suspend fun delete(
        entity: FuelQualityTestEntity
    )



    @Query("SELECT * FROM fuel_quality_tests")
    suspend fun getAll():
        List<FuelQualityTestEntity>



}
