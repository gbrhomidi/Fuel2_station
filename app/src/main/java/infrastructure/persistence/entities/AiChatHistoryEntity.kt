package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "ai_chat_history")
data class AiChatHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val session_id: String,
    val role: String,
    val content: String,
    val created_at: String? = "CURRENT_TIMESTAMP"
)