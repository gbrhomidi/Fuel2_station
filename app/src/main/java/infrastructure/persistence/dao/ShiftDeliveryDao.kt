package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ShiftDeliveryEntity



@Dao
interface ShiftDeliveryDao {



    @Insert
    suspend fun insert(
        entity: ShiftDeliveryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ShiftDeliveryEntity>
    )



    @Update
    suspend fun update(
        entity: ShiftDeliveryEntity
    )



    @Delete
    suspend fun delete(
        entity: ShiftDeliveryEntity
    )



    @Query("SELECT * FROM shift_deliveries")
    suspend fun getAll():
        List<ShiftDeliveryEntity>



}
