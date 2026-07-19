package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.AiChatHistoryEntity



@Dao
interface AiChatHistoryDao {



    @Insert
    suspend fun insert(
        entity: AiChatHistoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<AiChatHistoryEntity>
    )



    @Update
    suspend fun update(
        entity: AiChatHistoryEntity
    )



    @Delete
    suspend fun delete(
        entity: AiChatHistoryEntity
    )



    @Query("SELECT * FROM ai_chat_history")
    suspend fun getAll():
        List<AiChatHistoryEntity>



}
