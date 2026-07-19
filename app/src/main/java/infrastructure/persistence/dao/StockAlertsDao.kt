package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.StockAlertEntity



@Dao
interface StockAlertsDao {



    @Insert
    suspend fun insert(
        entity: StockAlertEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<StockAlertEntity>
    )



    @Update
    suspend fun update(
        entity: StockAlertEntity
    )



    @Delete
    suspend fun delete(
        entity: StockAlertEntity
    )



    @Query("SELECT * FROM stock_alerts")
    suspend fun getAll():
        List<StockAlertEntity>



}
