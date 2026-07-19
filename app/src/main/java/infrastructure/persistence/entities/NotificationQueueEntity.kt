package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "notification_queue")
data class NotificationQueueEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val notification_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val channel: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val recipient: String,
    val retry_count: Int? = 0,
    val max_retries: Int? = 3,
    val next_attempt_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "pending",
    val error_message: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)