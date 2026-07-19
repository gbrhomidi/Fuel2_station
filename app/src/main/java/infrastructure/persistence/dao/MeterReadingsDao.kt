package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.MeterReadingEntity



@Dao
interface MeterReadingsDao {



    @Insert
    suspend fun insert(
        entity: MeterReadingEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<MeterReadingEntity>
    )



    @Update
    suspend fun update(
        entity: MeterReadingEntity
    )



    @Delete
    suspend fun delete(
        entity: MeterReadingEntity
    )



    @Query("SELECT * FROM meter_readings")
    suspend fun getAll():
        List<MeterReadingEntity>



}
