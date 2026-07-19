package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ReceiptEntity



@Dao
interface ReceiptsDao {



    @Insert
    suspend fun insert(
        entity: ReceiptEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ReceiptEntity>
    )



    @Update
    suspend fun update(
        entity: ReceiptEntity
    )



    @Delete
    suspend fun delete(
        entity: ReceiptEntity
    )



    @Query("SELECT * FROM receipts")
    suspend fun getAll():
        List<ReceiptEntity>



}
