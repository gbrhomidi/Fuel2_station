package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "vehicle_insurance")
data class VehicleInsuranceEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val vehicle_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val insurance_company: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val policy_number: String?,
    val start_date: String,
    val end_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val premium: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val coverage_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val insurance_doc: String?,
    val is_active: Int? = 1,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)