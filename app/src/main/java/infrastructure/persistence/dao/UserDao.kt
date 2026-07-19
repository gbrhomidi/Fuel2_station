package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.UserEntity



@Dao
interface UsersDao {



    @Insert
    suspend fun insert(
        entity: UserEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<UserEntity>
    )



    @Update
    suspend fun update(
        entity: UserEntity
    )



    @Delete
    suspend fun delete(
        entity: UserEntity
    )



    @Query("SELECT * FROM users")
    suspend fun getAll():
        List<UserEntity>



}
