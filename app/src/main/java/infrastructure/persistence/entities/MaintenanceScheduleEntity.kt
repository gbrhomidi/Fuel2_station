package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "maintenance_schedule")
data class MaintenanceScheduleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val schedule_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val schedule_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val asset_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val frequency_type: String,
    val frequency_value: Int?,
    val day_of_week: Int?,
    val day_of_month: Int?,
    val month: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val meter_trigger: Double?,
    val description: String?,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)