package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DeliveryEntity



@Dao
interface DeliveryDao {



    @Insert
    suspend fun insert(
        entity: DeliveryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DeliveryEntity>
    )



    @Update
    suspend fun update(
        entity: DeliveryEntity
    )



    @Delete
    suspend fun delete(
        entity: DeliveryEntity
    )



    @Query("SELECT * FROM deliveries")
    suspend fun getAll():
        List<DeliveryEntity>



}
