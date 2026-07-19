package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "calibration_records")
data class CalibrationRecordEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val calibration_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String,
    val entity_id: Int,
    val calibration_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val technician: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val before_value: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val after_value: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val error_value: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val correction_percent: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val calibration_factor: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val certificate_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val certificate_path: String?,
    val next_calibration_date: String?,
    val notes: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "completed",
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)