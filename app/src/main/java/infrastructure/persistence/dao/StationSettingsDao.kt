package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.StationSettingEntity



@Dao
interface StationSettingsDao {



    @Insert
    suspend fun insert(
        entity: StationSettingEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<StationSettingEntity>
    )



    @Update
    suspend fun update(
        entity: StationSettingEntity
    )



    @Delete
    suspend fun delete(
        entity: StationSettingEntity
    )



    @Query("SELECT * FROM station_settings")
    suspend fun getAll():
        List<StationSettingEntity>



}
