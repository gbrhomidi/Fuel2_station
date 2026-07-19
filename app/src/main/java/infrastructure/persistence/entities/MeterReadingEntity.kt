package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "meter_readings")
data class MeterReadingEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val reading_code: String,
    val pump_id: Int,
    val nozzle_id: Int,
    val station_id: Int,
    val shift_id: Int?,
    val reading_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val period: String? = "morning",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val opening_reading: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val closing_reading: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val sold_liters: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val system_sold_liters: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val difference: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val difference_percent: Double?,
    val is_balanced: Int? = 1,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tolerance_limit: Double? = 0.5,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val adjustment_amount: Double? = 0,
    val adjustment_reason: String?,
    val adjusted_by: Int?,
    val read_by: Int,
    val verified_by: Int?,
    val approved_by: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "draft",
    val rejection_reason: String?,
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