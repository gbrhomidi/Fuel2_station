package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "attendance")
data class AttendanceEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val employee_id: Int,
    val station_id: Int?,
    val shift_id: Int?,
    val attendance_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val work_hours: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val overtime_hours: Double? = 0,
    val late_minutes: Int? = 0,
    val early_leave_minutes: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "present",
    val absence_reason: String?,
    val approved_by: Int?,
    val approved_at: String?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)