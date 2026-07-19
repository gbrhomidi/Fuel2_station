package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.FactSaleEntity



@Dao
interface FactSalesDao {



    @Insert
    suspend fun insert(
        entity: FactSaleEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<FactSaleEntity>
    )



    @Update
    suspend fun update(
        entity: FactSaleEntity
    )



    @Delete
    suspend fun delete(
        entity: FactSaleEntity
    )



    @Query("SELECT * FROM fact_sales")
    suspend fun getAll():
        List<FactSaleEntity>



}
