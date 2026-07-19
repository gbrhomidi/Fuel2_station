package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "vehicle_accidents")
data class VehicleAccidentEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val vehicle_id: Int,
    val driver_id: Int?,
    val accident_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val location: String?,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val severity: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val damage_cost: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val repair_cost: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val insurance_claim_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val police_report: String?,
    val photos: String?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)