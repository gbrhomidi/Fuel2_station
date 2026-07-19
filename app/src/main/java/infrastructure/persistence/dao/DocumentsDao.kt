package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DocumentEntity



@Dao
interface DocumentsDao {



    @Insert
    suspend fun insert(
        entity: DocumentEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DocumentEntity>
    )



    @Update
    suspend fun update(
        entity: DocumentEntity
    )



    @Delete
    suspend fun delete(
        entity: DocumentEntity
    )



    @Query("SELECT * FROM documents")
    suspend fun getAll():
        List<DocumentEntity>



}
