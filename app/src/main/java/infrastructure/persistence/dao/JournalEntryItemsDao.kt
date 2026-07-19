package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.JournalEntryItemEntity



@Dao
interface JournalEntryItemsDao {



    @Insert
    suspend fun insert(
        entity: JournalEntryItemEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<JournalEntryItemEntity>
    )



    @Update
    suspend fun update(
        entity: JournalEntryItemEntity
    )



    @Delete
    suspend fun delete(
        entity: JournalEntryItemEntity
    )



    @Query("SELECT * FROM journal_entry_items")
    suspend fun getAll():
        List<JournalEntryItemEntity>



}
