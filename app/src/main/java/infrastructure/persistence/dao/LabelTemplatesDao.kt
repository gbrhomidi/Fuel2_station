package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.LabelTemplateEntity



@Dao
interface LabelTemplatesDao {



    @Insert
    suspend fun insert(
        entity: LabelTemplateEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<LabelTemplateEntity>
    )



    @Update
    suspend fun update(
        entity: LabelTemplateEntity
    )



    @Delete
    suspend fun delete(
        entity: LabelTemplateEntity
    )



    @Query("SELECT * FROM label_templates")
    suspend fun getAll():
        List<LabelTemplateEntity>



}
