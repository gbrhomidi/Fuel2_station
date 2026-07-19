package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "user_activity_log")
data class UserActivityLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val user_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val action: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val action_category: String?,
    val description: String?,
    val description_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val target_table: String?,
    val target_id: Int?,
    val target_uuid: String?,
    val station_id: Int?,
    val branch_id: Int?,
    val company_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val ip_address: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_type: String?,
    val user_agent: String?,
    val old_values: String?,
    val new_values: String?,
    val old_row_json: String?,
    val new_row_json: String?,
    val changed_columns: String?,
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
    val is_success: Int? = 1,
    val error_message: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)