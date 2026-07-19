package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SyncDeviceEntity



@Dao
interface SyncDevicesDao {



    @Insert
    suspend fun insert(
        entity: SyncDeviceEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SyncDeviceEntity>
    )



    @Update
    suspend fun update(
        entity: SyncDeviceEntity
    )



    @Delete
    suspend fun delete(
        entity: SyncDeviceEntity
    )



    @Query("SELECT * FROM sync_devices")
    suspend fun getAll():
        List<SyncDeviceEntity>



}
