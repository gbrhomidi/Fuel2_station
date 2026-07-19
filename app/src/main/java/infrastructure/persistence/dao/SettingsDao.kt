package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SettingEntity



@Dao
interface SettingsDao {



    @Insert
    suspend fun insert(
        entity: SettingEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SettingEntity>
    )



    @Update
    suspend fun update(
        entity: SettingEntity
    )



    @Delete
    suspend fun delete(
        entity: SettingEntity
    )



    @Query("SELECT * FROM settings")
    suspend fun getAll():
        List<SettingEntity>



}
