package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CurrencyEntity



@Dao
interface CurrencyDao {



    @Insert
    suspend fun insert(
        entity: CurrencyEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CurrencyEntity>
    )



    @Update
    suspend fun update(
        entity: CurrencyEntity
    )



    @Delete
    suspend fun delete(
        entity: CurrencyEntity
    )



    @Query("SELECT * FROM currencies")
    suspend fun getAll():
        List<CurrencyEntity>



}
