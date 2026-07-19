package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ReceiptTemplateEntity



@Dao
interface ReceiptTemplatesDao {



    @Insert
    suspend fun insert(
        entity: ReceiptTemplateEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ReceiptTemplateEntity>
    )



    @Update
    suspend fun update(
        entity: ReceiptTemplateEntity
    )



    @Delete
    suspend fun delete(
        entity: ReceiptTemplateEntity
    )



    @Query("SELECT * FROM receipt_templates")
    suspend fun getAll():
        List<ReceiptTemplateEntity>



}
