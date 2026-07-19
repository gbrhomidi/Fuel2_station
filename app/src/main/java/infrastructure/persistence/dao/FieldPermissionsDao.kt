package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.FieldPermissionEntity



@Dao
interface FieldPermissionsDao {



    @Insert
    suspend fun insert(
        entity: FieldPermissionEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<FieldPermissionEntity>
    )



    @Update
    suspend fun update(
        entity: FieldPermissionEntity
    )



    @Delete
    suspend fun delete(
        entity: FieldPermissionEntity
    )



    @Query("SELECT * FROM field_permissions")
    suspend fun getAll():
        List<FieldPermissionEntity>



}
