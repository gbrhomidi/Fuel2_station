package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "stations")
data class StationEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val station_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val station_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val station_name_ar: String?,
    val company_id: Int?,
    val branch_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val country: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val city: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val district: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val street: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val building: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val postal_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val latitude: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val longitude: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val gps_location: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val phone2: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val email: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val emergency_phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val license_number: String?,
    val license_issue_date: String?,
    val license_expiry_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val tax_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val commercial_register: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val environmental_permit: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val fire_safety_cert: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val operating_hours: String?,
    val opening_time: String?,
    val closing_time: String?,
    val is_24_hours: Int? = 1,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val station_type: String? = "retail",
    val total_tanks: Int? = 0,
    val total_pumps: Int? = 0,
    val total_nozzles: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val storage_capacity: Double?,
    val default_currency_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    val status_reason: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val station_photo: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val layout_plan: String?,
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