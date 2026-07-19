package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.BankLedgerEntity



@Dao
interface BankLedgerDao {



    @Insert
    suspend fun insert(
        entity: BankLedgerEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<BankLedgerEntity>
    )



    @Update
    suspend fun update(
        entity: BankLedgerEntity
    )



    @Delete
    suspend fun delete(
        entity: BankLedgerEntity
    )



    @Query("SELECT * FROM bank_ledger")
    suspend fun getAll():
        List<BankLedgerEntity>



}
