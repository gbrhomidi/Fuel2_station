package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "notification_logs")
data class NotificationLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val notification_id: Int?,
    val queue_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val channel: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val recipient: String?,
    val subject: String?,
    val body: String?,
    val sent_at: String? = "CURRENT_TIMESTAMP",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "sent",
    val provider_response: String?,
    val error_message: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val cost: Double? = 0
)