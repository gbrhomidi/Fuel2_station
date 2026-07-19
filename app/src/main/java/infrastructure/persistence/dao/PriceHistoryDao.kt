package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PriceHistoryEntity



@Dao
interface PriceHistoryDao {



    @Insert
    suspend fun insert(
        entity: PriceHistoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PriceHistoryEntity>
    )



    @Update
    suspend fun update(
        entity: PriceHistoryEntity
    )



    @Delete
    suspend fun delete(
        entity: PriceHistoryEntity
    )



    @Query("SELECT * FROM price_history")
    suspend fun getAll():
        List<PriceHistoryEntity>



}
