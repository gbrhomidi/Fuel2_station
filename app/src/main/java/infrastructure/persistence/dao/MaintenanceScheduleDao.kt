package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.MaintenanceScheduleEntity



@Dao
interface MaintenanceScheduleDao {



    @Insert
    suspend fun insert(
        entity: MaintenanceScheduleEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<MaintenanceScheduleEntity>
    )



    @Update
    suspend fun update(
        entity: MaintenanceScheduleEntity
    )



    @Delete
    suspend fun delete(
        entity: MaintenanceScheduleEntity
    )



    @Query("SELECT * FROM maintenance_schedule")
    suspend fun getAll():
        List<MaintenanceScheduleEntity>



}
