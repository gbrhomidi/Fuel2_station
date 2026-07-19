package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.BarcodeHistoryEntity



@Dao
interface BarcodeHistoryDao {



    @Insert
    suspend fun insert(
        entity: BarcodeHistoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<BarcodeHistoryEntity>
    )



    @Update
    suspend fun update(
        entity: BarcodeHistoryEntity
    )



    @Delete
    suspend fun delete(
        entity: BarcodeHistoryEntity
    )



    @Query("SELECT * FROM barcode_history")
    suspend fun getAll():
        List<BarcodeHistoryEntity>



}
