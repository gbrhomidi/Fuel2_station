package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val username: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val email: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val password_hash: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val password_salt: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val full_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val full_name_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val display_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val avatar_path: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val national_id: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val passport_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val nationality: String?,
    val birth_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val gender: String?,
    val employee_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_title: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val department: String?,
    val hire_date: String?,
    val role_id: Int,
    val station_id: Int?,
    val branch_id: Int?,
    val company_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val preferred_language: String? = "ar",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val theme: String? = "light",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val timezone: String? = "UTC",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val date_format: String? = "YYYY-MM-DD",
    val two_factor_enabled: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val two_factor_method: String? = "none",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val otp_secret: String?,
    val biometric_enabled: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val biometric_type: String?,
    val last_password_change: String?,
    val password_expiry_days: Int? = 90,
    val password_expiry_date: String?,
    val must_change_password: Int? = 1,
    val failed_login_attempts: Int? = 0,
    val account_locked: Int? = 0,
    val locked_until: String?,
    val last_login_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val last_login_ip: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val last_login_device: String?,
    val session_timeout: Int? = 30,
    val device_limit: Int? = 3,
    val public_key: ByteArray?,
    val sign_count: Int? = 0,
    val webauthn_id: String?,
    val credential_id: ByteArray?,
    val has_biometrics: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    val status_reason: String?,
    val email_verified: Int? = 0,
    val phone_verified: Int? = 0,
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