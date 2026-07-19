package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.StockMovementEntity



@Dao
interface StockMovementsDao {



    @Insert
    suspend fun insert(
        entity: StockMovementEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<StockMovementEntity>
    )



    @Update
    suspend fun update(
        entity: StockMovementEntity
    )



    @Delete
    suspend fun delete(
        entity: StockMovementEntity
    )



    @Query("SELECT * FROM stock_movements")
    suspend fun getAll():
        List<StockMovementEntity>



}
