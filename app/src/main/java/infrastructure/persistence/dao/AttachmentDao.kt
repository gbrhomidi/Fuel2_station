package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.AttachmentEntity



@Dao
interface AttachmentDao {



    @Insert
    suspend fun insert(
        entity: AttachmentEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<AttachmentEntity>
    )



    @Update
    suspend fun update(
        entity: AttachmentEntity
    )



    @Delete
    suspend fun delete(
        entity: AttachmentEntity
    )



    @Query("SELECT * FROM attachments")
    suspend fun getAll():
        List<AttachmentEntity>



}
