package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.RoleEntity



@Dao
interface RolesDao {



    @Insert
    suspend fun insert(
        entity: RoleEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<RoleEntity>
    )



    @Update
    suspend fun update(
        entity: RoleEntity
    )



    @Delete
    suspend fun delete(
        entity: RoleEntity
    )



    @Query("SELECT * FROM roles")
    suspend fun getAll():
        List<RoleEntity>



}
