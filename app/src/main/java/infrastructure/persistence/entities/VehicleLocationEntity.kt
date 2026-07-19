package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "vehicle_locations")
data class VehicleLocationEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val vehicle_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val latitude: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val longitude: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val speed: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val heading: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val fuel_level: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val odometer: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val altitude: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val accuracy: Double?,
    val location_time: String? = "CURRENT_TIMESTAMP",
    val created_at: String? = "CURRENT_TIMESTAMP"
)