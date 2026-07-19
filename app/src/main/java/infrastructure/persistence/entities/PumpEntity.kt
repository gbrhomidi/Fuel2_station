package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "pumps")
data class PumpEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val pump_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val pump_number: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val pump_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val pump_name_ar: String?,
    val station_id: Int,
    val tank_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val serial_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val manufacturer: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val model: String?,
    val installation_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val max_flow_rate: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val meter_start: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val meter_current: Double? = 0,
    val meter_last_reset: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    val status_reason: String?,
    val last_maintenance: String?,
    val next_maintenance: String?,
    val maintenance_interval: Int? = 90,
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