package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.BankEntity



@Dao
interface BankDao {



    @Insert
    suspend fun insert(
        entity: BankEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<BankEntity>
    )



    @Update
    suspend fun update(
        entity: BankEntity
    )



    @Delete
    suspend fun delete(
        entity: BankEntity
    )



    @Query("SELECT * FROM banks")
    suspend fun getAll():
        List<BankEntity>



}
