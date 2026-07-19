package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "employees")
data class EmployeeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val employee_code: String,
    val party_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val full_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val full_name_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val national_id: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val passport_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val nationality: String?,
    val birth_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val gender: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val marital_status: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val phone2: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val email: String?,
    val address: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val emergency_contact: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val emergency_phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val department: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_title: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_title_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val employment_type: String? = "full_time",
    val hire_date: String,
    val termination_date: String?,
    val termination_reason: String?,
    val station_id: Int?,
    val branch_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val basic_salary: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val housing_allowance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val transport_allowance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val food_allowance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val other_allowances: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_salary: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val insurance_deduction: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_deduction: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val other_deductions: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val bank_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val bank_account: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val contract_path: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val id_doc_path: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val photo_path: String?,
    val user_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val deleted_at: String?,
    val created_by: Int?,
    val updated_by: Int?,
    val deleted_by: Int?,
    val is_deleted: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sync_status: String? = "synced",
    val sync_version: Int? = 1,
    val sync_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    val remarks: String?,
    val extra_data: String?
)