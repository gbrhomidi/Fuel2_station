package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.UserPermissionEntity



@Dao
interface UserPermissionsDao {



    @Insert
    suspend fun insert(
        entity: UserPermissionEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<UserPermissionEntity>
    )



    @Update
    suspend fun update(
        entity: UserPermissionEntity
    )



    @Delete
    suspend fun delete(
        entity: UserPermissionEntity
    )



    @Query("SELECT * FROM user_permissions")
    suspend fun getAll():
        List<UserPermissionEntity>



}
