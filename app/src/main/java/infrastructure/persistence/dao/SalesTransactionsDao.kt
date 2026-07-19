package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SalesTransactionEntity



@Dao
interface SalesTransactionsDao {



    @Insert
    suspend fun insert(
        entity: SalesTransactionEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SalesTransactionEntity>
    )



    @Update
    suspend fun update(
        entity: SalesTransactionEntity
    )



    @Delete
    suspend fun delete(
        entity: SalesTransactionEntity
    )



    @Query("SELECT * FROM sales_transactions")
    suspend fun getAll():
        List<SalesTransactionEntity>



}
