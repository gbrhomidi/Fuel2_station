package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SmartAlertEntity



@Dao
interface SmartAlertsDao {



    @Insert
    suspend fun insert(
        entity: SmartAlertEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SmartAlertEntity>
    )



    @Update
    suspend fun update(
        entity: SmartAlertEntity
    )



    @Delete
    suspend fun delete(
        entity: SmartAlertEntity
    )



    @Query("SELECT * FROM smart_alerts")
    suspend fun getAll():
        List<SmartAlertEntity>



}
