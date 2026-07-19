package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.AccountEntity



@Dao
interface AccountDao {



    @Insert
    suspend fun insert(
        entity: AccountEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<AccountEntity>
    )



    @Update
    suspend fun update(
        entity: AccountEntity
    )



    @Delete
    suspend fun delete(
        entity: AccountEntity
    )



    @Query("SELECT * FROM accounts")
    suspend fun getAll():
        List<AccountEntity>



}
