package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "documents")
data class DocumentEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val document_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val document_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val document_name_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val document_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String,
    val entity_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_path: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_url: String?,
    val file_size: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val mime_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_hash: String?,
    val version: Int? = 1,
    val description: String?,
    val description_ar: String?,
    val expiry_date: String?,
    val is_confidential: Int? = 0,
    val uploaded_by: Int,
    val uploaded_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0,
    val deleted_at: String?
)