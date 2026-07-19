package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.InventoryMovementEntity



@Dao
interface InventoryMovementsDao {



    @Insert
    suspend fun insert(
        entity: InventoryMovementEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<InventoryMovementEntity>
    )



    @Update
    suspend fun update(
        entity: InventoryMovementEntity
    )



    @Delete
    suspend fun delete(
        entity: InventoryMovementEntity
    )



    @Query("SELECT * FROM inventory_movements")
    suspend fun getAll():
        List<InventoryMovementEntity>



}
