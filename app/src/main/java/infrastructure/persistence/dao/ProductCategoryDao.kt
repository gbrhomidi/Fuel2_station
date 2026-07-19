package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ProductCategoryEntity



@Dao
interface ProductCategoryDao {



    @Insert
    suspend fun insert(
        entity: ProductCategoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ProductCategoryEntity>
    )



    @Update
    suspend fun update(
        entity: ProductCategoryEntity
    )



    @Delete
    suspend fun delete(
        entity: ProductCategoryEntity
    )



    @Query("SELECT * FROM product_categories")
    suspend fun getAll():
        List<ProductCategoryEntity>



}
