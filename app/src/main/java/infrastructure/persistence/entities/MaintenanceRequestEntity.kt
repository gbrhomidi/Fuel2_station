package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "maintenance_requests")
data class MaintenanceRequestEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val request_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val asset_type: String,
    val asset_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val request_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val priority: String? = "medium",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val title: String,
    val description: String,
    val description_ar: String?,
    val symptoms: String?,
    val error_codes: String?,
    val reported_by: Int,
    val reported_at: String? = "CURRENT_TIMESTAMP",
    val assigned_to: Int?,
    val assigned_at: String?,
    val scheduled_date: String?,
    val scheduled_time: String?,
    val estimated_duration: Int?,
    val started_at: String?,
    val completed_at: String?,
    val actual_duration: Int?,
    val resolution: String?,
    val resolution_ar: String?,
    val parts_used: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val labor_cost: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val parts_cost: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_cost: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "open",
    val approved_by: Int?,
    val approved_at: String?,
    val before_photos: String?,
    val after_photos: String?,
    val station_id: Int,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val deleted_at: String?,
    val created_by: Int?,
    val updated_by: Int?,
    val deleted_by: Int?,
    val is_deleted: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sync_status: String? = "synced",
    val sync_version: Int? = 1,
    val sync_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    val remarks: String?,
    val extra_data: String?
)