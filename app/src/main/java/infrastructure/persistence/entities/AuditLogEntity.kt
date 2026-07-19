package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "audit_logs")
data class AuditLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val user_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val action_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val table_name: String,
    val record_id: Int?,
    val old_row_json: String?,
    val new_row_json: String?,
    val changed_columns: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val ip_address: String?,
    val user_agent: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val os_version: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val app_version: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val browser: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val gps: String?,
    val execution_time: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val request_id: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)