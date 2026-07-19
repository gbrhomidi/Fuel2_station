package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.FuelSaleEntity



@Dao
interface FuelSalesDao {



    @Insert
    suspend fun insert(
        entity: FuelSaleEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<FuelSaleEntity>
    )



    @Update
    suspend fun update(
        entity: FuelSaleEntity
    )



    @Delete
    suspend fun delete(
        entity: FuelSaleEntity
    )



    @Query("SELECT * FROM fuel_sales")
    suspend fun getAll():
        List<FuelSaleEntity>



}
