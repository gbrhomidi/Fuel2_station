package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.UserSessionEntity



@Dao
interface UserSessionsDao {



    @Insert
    suspend fun insert(
        entity: UserSessionEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<UserSessionEntity>
    )



    @Update
    suspend fun update(
        entity: UserSessionEntity
    )



    @Delete
    suspend fun delete(
        entity: UserSessionEntity
    )



    @Query("SELECT * FROM user_sessions")
    suspend fun getAll():
        List<UserSessionEntity>



}
