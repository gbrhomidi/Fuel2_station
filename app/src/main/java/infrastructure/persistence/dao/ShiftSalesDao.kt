package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ShiftSaleEntity



@Dao
interface ShiftSalesDao {



    @Insert
    suspend fun insert(
        entity: ShiftSaleEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ShiftSaleEntity>
    )



    @Update
    suspend fun update(
        entity: ShiftSaleEntity
    )



    @Delete
    suspend fun delete(
        entity: ShiftSaleEntity
    )



    @Query("SELECT * FROM shift_sales")
    suspend fun getAll():
        List<ShiftSaleEntity>



}
