package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SaleItemEntity



@Dao
interface SaleItemsDao {



    @Insert
    suspend fun insert(
        entity: SaleItemEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SaleItemEntity>
    )



    @Update
    suspend fun update(
        entity: SaleItemEntity
    )



    @Delete
    suspend fun delete(
        entity: SaleItemEntity
    )



    @Query("SELECT * FROM sale_items")
    suspend fun getAll():
        List<SaleItemEntity>



}
