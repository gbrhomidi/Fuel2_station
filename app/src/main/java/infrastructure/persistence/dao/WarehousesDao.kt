package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.WarehouseEntity



@Dao
interface WarehousesDao {



    @Insert
    suspend fun insert(
        entity: WarehouseEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<WarehouseEntity>
    )



    @Update
    suspend fun update(
        entity: WarehouseEntity
    )



    @Delete
    suspend fun delete(
        entity: WarehouseEntity
    )



    @Query("SELECT * FROM warehouses")
    suspend fun getAll():
        List<WarehouseEntity>



}
