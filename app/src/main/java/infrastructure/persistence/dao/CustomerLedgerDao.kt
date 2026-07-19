package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CustomerLedgerEntity



@Dao
interface CustomerLedgerDao {



    @Insert
    suspend fun insert(
        entity: CustomerLedgerEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CustomerLedgerEntity>
    )



    @Update
    suspend fun update(
        entity: CustomerLedgerEntity
    )



    @Delete
    suspend fun delete(
        entity: CustomerLedgerEntity
    )



    @Query("SELECT * FROM customer_ledger")
    suspend fun getAll():
        List<CustomerLedgerEntity>



}
