package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.JournalEntryEntity



@Dao
interface JournalEntryDao {



    @Insert
    suspend fun insert(
        entity: JournalEntryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<JournalEntryEntity>
    )



    @Update
    suspend fun update(
        entity: JournalEntryEntity
    )



    @Delete
    suspend fun delete(
        entity: JournalEntryEntity
    )



    @Query("SELECT * FROM journal_entries")
    suspend fun getAll():
        List<JournalEntryEntity>



}
