package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "vehicle_trips")
data class VehicleTripEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val vehicle_id: Int,
    val driver_id: Int?,
    val trip_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val start_location: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val end_location: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val distance_km: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val fuel_consumed: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val fuel_cost: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val start_odometer: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val end_odometer: Double?,
    val trip_purpose: String?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)