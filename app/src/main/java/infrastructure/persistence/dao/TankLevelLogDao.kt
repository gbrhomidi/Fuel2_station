package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.TankLevelLogEntity



@Dao
interface TankLevelLogDao {



    @Insert
    suspend fun insert(
        entity: TankLevelLogEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<TankLevelLogEntity>
    )



    @Update
    suspend fun update(
        entity: TankLevelLogEntity
    )



    @Delete
    suspend fun delete(
        entity: TankLevelLogEntity
    )



    @Query("SELECT * FROM tank_level_log")
    suspend fun getAll():
        List<TankLevelLogEntity>



}
