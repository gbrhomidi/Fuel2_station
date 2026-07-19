package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PriceListEntity



@Dao
interface PriceListsDao {



    @Insert
    suspend fun insert(
        entity: PriceListEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PriceListEntity>
    )



    @Update
    suspend fun update(
        entity: PriceListEntity
    )



    @Delete
    suspend fun delete(
        entity: PriceListEntity
    )



    @Query("SELECT * FROM price_lists")
    suspend fun getAll():
        List<PriceListEntity>



}
