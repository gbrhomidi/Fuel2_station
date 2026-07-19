package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PumpNozzleEntity



@Dao
interface PumpNozzlesDao {



    @Insert
    suspend fun insert(
        entity: PumpNozzleEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PumpNozzleEntity>
    )



    @Update
    suspend fun update(
        entity: PumpNozzleEntity
    )



    @Delete
    suspend fun delete(
        entity: PumpNozzleEntity
    )



    @Query("SELECT * FROM pump_nozzles")
    suspend fun getAll():
        List<PumpNozzleEntity>



}
