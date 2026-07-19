package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.InventoryLedgerEntity



@Dao
interface InventoryLedgerDao {



    @Insert
    suspend fun insert(
        entity: InventoryLedgerEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<InventoryLedgerEntity>
    )



    @Update
    suspend fun update(
        entity: InventoryLedgerEntity
    )



    @Delete
    suspend fun delete(
        entity: InventoryLedgerEntity
    )



    @Query("SELECT * FROM inventory_ledger")
    suspend fun getAll():
        List<InventoryLedgerEntity>



}
