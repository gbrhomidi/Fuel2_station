package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SchemaChangeEntity



@Dao
interface SchemaChangesDao {



    @Insert
    suspend fun insert(
        entity: SchemaChangeEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SchemaChangeEntity>
    )



    @Update
    suspend fun update(
        entity: SchemaChangeEntity
    )



    @Delete
    suspend fun delete(
        entity: SchemaChangeEntity
    )



    @Query("SELECT * FROM schema_changes")
    suspend fun getAll():
        List<SchemaChangeEntity>



}
