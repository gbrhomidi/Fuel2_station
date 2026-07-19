package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.IotDeviceEntity



@Dao
interface IotDevicesDao {



    @Insert
    suspend fun insert(
        entity: IotDeviceEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<IotDeviceEntity>
    )



    @Update
    suspend fun update(
        entity: IotDeviceEntity
    )



    @Delete
    suspend fun delete(
        entity: IotDeviceEntity
    )



    @Query("SELECT * FROM iot_devices")
    suspend fun getAll():
        List<IotDeviceEntity>



}
