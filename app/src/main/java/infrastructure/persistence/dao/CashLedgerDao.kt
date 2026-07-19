package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CashLedgerEntity



@Dao
interface CashLedgerDao {



    @Insert
    suspend fun insert(
        entity: CashLedgerEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CashLedgerEntity>
    )



    @Update
    suspend fun update(
        entity: CashLedgerEntity
    )



    @Delete
    suspend fun delete(
        entity: CashLedgerEntity
    )



    @Query("SELECT * FROM cash_ledger")
    suspend fun getAll():
        List<CashLedgerEntity>



}
