package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PermissionEntity



@Dao
interface PermissionsDao {



    @Insert
    suspend fun insert(
        entity: PermissionEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PermissionEntity>
    )



    @Update
    suspend fun update(
        entity: PermissionEntity
    )



    @Delete
    suspend fun delete(
        entity: PermissionEntity
    )



    @Query("SELECT * FROM permissions")
    suspend fun getAll():
        List<PermissionEntity>



}
