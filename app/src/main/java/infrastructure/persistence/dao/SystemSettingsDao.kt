package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SystemSettingEntity



@Dao
interface SystemSettingsDao {



    @Insert
    suspend fun insert(
        entity: SystemSettingEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SystemSettingEntity>
    )



    @Update
    suspend fun update(
        entity: SystemSettingEntity
    )



    @Delete
    suspend fun delete(
        entity: SystemSettingEntity
    )



    @Query("SELECT * FROM system_settings")
    suspend fun getAll():
        List<SystemSettingEntity>



}
