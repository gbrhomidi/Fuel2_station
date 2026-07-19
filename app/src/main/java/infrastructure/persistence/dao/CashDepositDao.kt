package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CashDepositEntity



@Dao
interface CashDepositDao {



    @Insert
    suspend fun insert(
        entity: CashDepositEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CashDepositEntity>
    )



    @Update
    suspend fun update(
        entity: CashDepositEntity
    )



    @Delete
    suspend fun delete(
        entity: CashDepositEntity
    )



    @Query("SELECT * FROM cash_deposits")
    suspend fun getAll():
        List<CashDepositEntity>



}
