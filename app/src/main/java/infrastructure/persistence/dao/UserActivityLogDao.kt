package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.UserActivityLogEntity



@Dao
interface UserActivityLogDao {



    @Insert
    suspend fun insert(
        entity: UserActivityLogEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<UserActivityLogEntity>
    )



    @Update
    suspend fun update(
        entity: UserActivityLogEntity
    )



    @Delete
    suspend fun delete(
        entity: UserActivityLogEntity
    )



    @Query("SELECT * FROM user_activity_log")
    suspend fun getAll():
        List<UserActivityLogEntity>



}
