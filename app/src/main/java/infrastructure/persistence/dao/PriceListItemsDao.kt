package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PriceListItemEntity



@Dao
interface PriceListItemsDao {



    @Insert
    suspend fun insert(
        entity: PriceListItemEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PriceListItemEntity>
    )



    @Update
    suspend fun update(
        entity: PriceListItemEntity
    )



    @Delete
    suspend fun delete(
        entity: PriceListItemEntity
    )



    @Query("SELECT * FROM price_list_items")
    suspend fun getAll():
        List<PriceListItemEntity>



}
