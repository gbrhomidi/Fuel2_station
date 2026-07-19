package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.MaintenanceRequestEntity



@Dao
interface MaintenanceRequestsDao {



    @Insert
    suspend fun insert(
        entity: MaintenanceRequestEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<MaintenanceRequestEntity>
    )



    @Update
    suspend fun update(
        entity: MaintenanceRequestEntity
    )



    @Delete
    suspend fun delete(
        entity: MaintenanceRequestEntity
    )



    @Query("SELECT * FROM maintenance_requests")
    suspend fun getAll():
        List<MaintenanceRequestEntity>



}
