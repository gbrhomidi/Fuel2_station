package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.MaintenancePartEntity



@Dao
interface MaintenancePartsDao {



    @Insert
    suspend fun insert(
        entity: MaintenancePartEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<MaintenancePartEntity>
    )



    @Update
    suspend fun update(
        entity: MaintenancePartEntity
    )



    @Delete
    suspend fun delete(
        entity: MaintenancePartEntity
    )



    @Query("SELECT * FROM maintenance_parts")
    suspend fun getAll():
        List<MaintenancePartEntity>



}
