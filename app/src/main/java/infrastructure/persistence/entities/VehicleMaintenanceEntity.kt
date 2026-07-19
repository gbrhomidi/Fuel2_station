package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "vehicle_maintenance")
data class VehicleMaintenanceEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val vehicle_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val maintenance_type: String,
    val description: String?,
    val maintenance_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val cost: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val odometer_at_maintenance: Double?,
    val next_due_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val next_due_odometer: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val performed_by: String?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)