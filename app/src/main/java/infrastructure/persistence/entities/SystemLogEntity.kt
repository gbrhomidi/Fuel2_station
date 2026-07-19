package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "system_logs")
data class SystemLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val log_level: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val log_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val source: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val source_version: String?,
    val message: String,
    val message_ar: String?,
    val user_id: Int?,
    val station_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val ip_address: String?,
    val stack_trace: String?,
    val request_data: String?,
    val response_data: String?,
    val is_resolved: Int? = 0,
    val resolved_by: Int?,
    val resolved_at: String?,
    val resolution_notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)