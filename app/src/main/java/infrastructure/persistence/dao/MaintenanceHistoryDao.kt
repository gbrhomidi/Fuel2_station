package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.MaintenanceHistoryEntity



@Dao
interface MaintenanceHistoryDao {



    @Insert
    suspend fun insert(
        entity: MaintenanceHistoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<MaintenanceHistoryEntity>
    )



    @Update
    suspend fun update(
        entity: MaintenanceHistoryEntity
    )



    @Delete
    suspend fun delete(
        entity: MaintenanceHistoryEntity
    )



    @Query("SELECT * FROM maintenance_history")
    suspend fun getAll():
        List<MaintenanceHistoryEntity>



}
