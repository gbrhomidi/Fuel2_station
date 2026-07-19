package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "tank_level_log")
data class TankLevelLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val tank_id: Int,
    val reading_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val reading_type: String? = "auto",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val opening_level: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val closing_level: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val measured_level: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val calculated_level: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val difference: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val fuel_temperature: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val fuel_density: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val volume_at_15c: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val refills_total: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val sales_total: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val evaporation_loss: Double? = 0,
    val is_below_minimum: Int? = 0,
    val is_near_maximum: Int? = 0,
    val alert_triggered: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sync_status: String? = "synced",
    val sync_version: Int? = 1,
    val sync_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    val remarks: String?,
    val extra_data: String?
)