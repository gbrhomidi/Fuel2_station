package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "payroll")
data class PayrollEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payroll_code: String,
    val payroll_year: Int,
    val payroll_month: Int,
    val period_start: String,
    val period_end: String,
    val total_employees: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_basic_salary: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_allowances: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_deductions: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_net_salary: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "draft",
    val calculated_at: String?,
    val calculated_by: Int?,
    val approved_by: Int?,
    val approved_at: String?,
    val paid_at: String?,
    val paid_by: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val deleted_at: String?,
    val created_by: Int?,
    val updated_by: Int?,
    val deleted_by: Int?,
    val is_deleted: Int? = 0
)