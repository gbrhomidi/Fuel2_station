package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ExchangeRateEntity



@Dao
interface ExchangeRatesDao {



    @Insert
    suspend fun insert(
        entity: ExchangeRateEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ExchangeRateEntity>
    )



    @Update
    suspend fun update(
        entity: ExchangeRateEntity
    )



    @Delete
    suspend fun delete(
        entity: ExchangeRateEntity
    )



    @Query("SELECT * FROM exchange_rates")
    suspend fun getAll():
        List<ExchangeRateEntity>



}
