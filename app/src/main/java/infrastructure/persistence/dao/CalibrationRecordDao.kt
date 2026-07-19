package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CalibrationRecordEntity



@Dao
interface CalibrationRecordDao {



    @Insert
    suspend fun insert(
        entity: CalibrationRecordEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CalibrationRecordEntity>
    )



    @Update
    suspend fun update(
        entity: CalibrationRecordEntity
    )



    @Delete
    suspend fun delete(
        entity: CalibrationRecordEntity
    )



    @Query("SELECT * FROM calibration_records")
    suspend fun getAll():
        List<CalibrationRecordEntity>



}
