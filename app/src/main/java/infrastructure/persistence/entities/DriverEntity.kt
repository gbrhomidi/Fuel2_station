package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "drivers")
data class DriverEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val driver_code: String,
    val party_id: Int?,
    val vehicle_id: Int?,
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
    val phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val phone2: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val email: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val whatsapp: String?,
    val address: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val license_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val license_type: String?,
    val license_issue_date: String?,
    val license_expiry_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val license_issuing_authority: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val license_doc_path: String?,
    val hire_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_title: String? = "Driver",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val salary: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val emergency_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val emergency_phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val emergency_relation: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    val termination_date: String?,
    val termination_reason: String?,
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