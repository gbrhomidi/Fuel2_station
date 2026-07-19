package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "backup_history")
data class BackupHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val backup_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val backup_method: String? = "manual",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val database_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val database_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val file_path: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val file_size_mb: Double?,
    val tables_included: String?,
    val tables_excluded: String?,
    val started_at: String,
    val completed_at: String?,
    val duration_seconds: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "in_progress",
    val error_message: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val storage_location: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val storage_path: String?,
    val is_encrypted: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val encryption_method: String?,
    val expiry_date: String?,
    val is_deleted: Int? = 0,
    val deleted_at: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)