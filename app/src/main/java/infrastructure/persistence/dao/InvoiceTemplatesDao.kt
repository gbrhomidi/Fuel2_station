package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.InvoiceTemplateEntity



@Dao
interface InvoiceTemplatesDao {



    @Insert
    suspend fun insert(
        entity: InvoiceTemplateEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<InvoiceTemplateEntity>
    )



    @Update
    suspend fun update(
        entity: InvoiceTemplateEntity
    )



    @Delete
    suspend fun delete(
        entity: InvoiceTemplateEntity
    )



    @Query("SELECT * FROM invoice_templates")
    suspend fun getAll():
        List<InvoiceTemplateEntity>



}
