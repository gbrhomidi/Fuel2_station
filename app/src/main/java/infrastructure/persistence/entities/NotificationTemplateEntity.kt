package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "notification_templates")
data class NotificationTemplateEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val template_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val template_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val template_name_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val channel: String,
    val subject: String?,
    val body: String,
    val body_ar: String?,
    val variables: String?,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)