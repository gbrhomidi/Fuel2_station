package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "payroll_items")
data class PayrollItemEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val payroll_id: Int,
    val employee_id: Int,
    val work_days: Int? = 0,
    val absent_days: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val overtime_hours: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val late_hours: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val basic_salary: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val housing_allowance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val transport_allowance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val food_allowance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val overtime_pay: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val bonus: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val other_earnings: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_earnings: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val absence_deduction: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val late_deduction: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val insurance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val loan_deduction: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val other_deductions: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_deductions: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val net_salary: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_method: String? = "bank_transfer",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_status: String? = "pending",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val paid_amount: Double? = 0,
    val paid_at: String?
)