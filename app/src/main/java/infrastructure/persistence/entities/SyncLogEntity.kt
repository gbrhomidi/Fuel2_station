package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "sync_logs")
data class SyncLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sync_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sync_direction: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val app_version: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String,
    val records_synced: Int? = 0,
    val records_failed: Int? = 0,
    val records_total: Int? = 0,
    val started_at: String,
    val completed_at: String?,
    val duration_seconds: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "in_progress",
    val error_message: String?,
    val error_details: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val network_type: String?,
    val data_transferred_kb: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)