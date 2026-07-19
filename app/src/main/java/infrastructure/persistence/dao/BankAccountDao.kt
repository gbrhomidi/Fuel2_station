package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.BankAccountEntity



@Dao
interface BankAccountDao {



    @Insert
    suspend fun insert(
        entity: BankAccountEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<BankAccountEntity>
    )



    @Update
    suspend fun update(
        entity: BankAccountEntity
    )



    @Delete
    suspend fun delete(
        entity: BankAccountEntity
    )



    @Query("SELECT * FROM bank_accounts")
    suspend fun getAll():
        List<BankAccountEntity>



}
