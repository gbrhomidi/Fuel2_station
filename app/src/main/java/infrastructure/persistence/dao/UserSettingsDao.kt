package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.UserSettingEntity



@Dao
interface UserSettingsDao {



    @Insert
    suspend fun insert(
        entity: UserSettingEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<UserSettingEntity>
    )



    @Update
    suspend fun update(
        entity: UserSettingEntity
    )



    @Delete
    suspend fun delete(
        entity: UserSettingEntity
    )



    @Query("SELECT * FROM user_settings")
    suspend fun getAll():
        List<UserSettingEntity>



}
