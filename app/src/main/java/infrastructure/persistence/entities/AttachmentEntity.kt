package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "attachments")
data class AttachmentEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String,
    val entity_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_name_original: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_path: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_url: String?,
    val file_size: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_extension: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val thumbnail_path: String?,
    val description: String?,
    val description_ar: String?,
    val uploaded_by: Int,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)