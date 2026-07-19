package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ProductEntity



@Dao
interface ProductDao {



    @Insert
    suspend fun insert(
        entity: ProductEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ProductEntity>
    )



    @Update
    suspend fun update(
        entity: ProductEntity
    )



    @Delete
    suspend fun delete(
        entity: ProductEntity
    )



    @Query("SELECT * FROM products")
    suspend fun getAll():
        List<ProductEntity>



}
