package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "tanks")
data class TankEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val tank_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val tank_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val tank_name_ar: String?,
    val station_id: Int,
    val fuel_type_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val capacity_liters: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val minimum_level: Double? = 500,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val maximum_level: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val current_quantity: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val usable_capacity: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val dead_volume: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val tank_shape: String? = "cylindrical",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val length_meters: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val diameter_meters: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val height_meters: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val location: String?,
    val installation_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val manufacturer: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val serial_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val model: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sensor_serial: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sensor_type: String?,
    val sensor_calibration_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val sensor_accuracy: Double?,
    val leak_detection: Int? = 0,
    val overfill_protection: Int? = 0,
    val emergency_valve: Int? = 0,
    val last_inspection_date: String?,
    val next_inspection_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val inspection_certificate: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    val status_reason: String?,
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