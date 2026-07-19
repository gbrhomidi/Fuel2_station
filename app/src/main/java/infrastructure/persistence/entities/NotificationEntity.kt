package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "notifications")
data class NotificationEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val user_id: Int?,
    val role_id: Int?,
    val customer_party_id: Int?,
    val template_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val notification_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val title: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val title_ar: String?,
    val message: String,
    val message_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val priority: String? = "normal",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val channel: String? = "in_app",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "pending",
    val is_read: Int? = 0,
    val read_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val reference_type: String?,
    val reference_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val action_url: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val action_text: String?,
    val expires_at: String?,
    val sent_at: String?,
    val error_message: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)