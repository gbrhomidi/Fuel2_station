package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.RolePermissionEntity



@Dao
interface RolePermissionsDao {



    @Insert
    suspend fun insert(
        entity: RolePermissionEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<RolePermissionEntity>
    )



    @Update
    suspend fun update(
        entity: RolePermissionEntity
    )



    @Delete
    suspend fun delete(
        entity: RolePermissionEntity
    )



    @Query("SELECT * FROM role_permissions")
    suspend fun getAll():
        List<RolePermissionEntity>



}
