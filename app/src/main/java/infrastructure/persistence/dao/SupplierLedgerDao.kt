package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SupplierLedgerEntity



@Dao
interface SupplierLedgerDao {



    @Insert
    suspend fun insert(
        entity: SupplierLedgerEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SupplierLedgerEntity>
    )



    @Update
    suspend fun update(
        entity: SupplierLedgerEntity
    )



    @Delete
    suspend fun delete(
        entity: SupplierLedgerEntity
    )



    @Query("SELECT * FROM supplier_ledger")
    suspend fun getAll():
        List<SupplierLedgerEntity>



}
