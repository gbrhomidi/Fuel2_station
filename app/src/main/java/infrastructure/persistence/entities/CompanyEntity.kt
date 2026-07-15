package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "companies",
    indices = [
        Index(value = ["uuid"], unique = true),
        Index(value = ["company_code"], unique = true)
    ]
)
data class CompanyEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long = 0,
    @ColumnInfo(name = "uuid") val uuid: String,
    @ColumnInfo(name = "company_code") val companyCode: String,
    @ColumnInfo(name = "company_name") val companyName: String,
    @ColumnInfo(name = "company_name_ar") val companyNameAr: String? = null,
    @ColumnInfo(name = "trade_license_number") val tradeLicenseNumber: String? = null,
    @ColumnInfo(name = "tax_number") val taxNumber: String? = null,
    @ColumnInfo(name = "vat_number") val vatNumber: String? = null,
    @ColumnInfo(name = "registration_date") val registrationDate: String? = null,
    @ColumnInfo(name = "expiry_date") val expiryDate: String? = null,
    @ColumnInfo(name = "legal_form") val legalForm: String? = null,
    @ColumnInfo(name = "website") val website: String? = null,
    @ColumnInfo(name = "email") val email: String? = null,
    @ColumnInfo(name = "phone") val phone: String? = null,
    @ColumnInfo(name = "fax") val fax: String? = null,
    @ColumnInfo(name = "address_line_1") val addressLine1: String? = null,
    @ColumnInfo(name = "address_line_2") val addressLine2: String? = null,
    @ColumnInfo(name = "city") val city: String? = null,
    @ColumnInfo(name = "state") val state: String? = null,
    @ColumnInfo(name = "postal_code") val postalCode: String? = null,
    @ColumnInfo(name = "country") val country: String? = null,
    @ColumnInfo(name = "latitude") val latitude: Double? = null,
    @ColumnInfo(name = "longitude") val longitude: Double? = null,
    @ColumnInfo(name = "logo_path") val logoPath: String? = null,
    @ColumnInfo(name = "owner_name") val ownerName: String? = null,
    @ColumnInfo(name = "owner_phone") val ownerPhone: String? = null,
    @ColumnInfo(name = "manager_name") val managerName: String? = null,
    @ColumnInfo(name = "manager_phone") val managerPhone: String? = null,
    @ColumnInfo(name = "capital_amount") val capitalAmount: Double? = null,
    @ColumnInfo(name = "bank_name") val bankName: String? = null,
    @ColumnInfo(name = "bank_account_number") val bankAccountNumber: String? = null,
    @ColumnInfo(name = "iban") val iban: String? = null,
    @ColumnInfo(name = "swift_code") val swiftCode: String? = null,
    @ColumnInfo(name = "is_active", defaultValue = "1") val isActive: Int = 1,
    @ColumnInfo(name = "status", defaultValue = "'active'") val status: String = "active",
    @ColumnInfo(name = "status_reason") val statusReason: String? = null,
    @ColumnInfo(name = "created_at") val createdAt: String? = null,
    @ColumnInfo(name = "updated_at") val updatedAt: String? = null,
    @ColumnInfo(name = "deleted_at") val deletedAt: String? = null,
    @ColumnInfo(name = "created_by") val createdBy: Long? = null,
    @ColumnInfo(name = "updated_by") val updatedBy: Long? = null,
    @ColumnInfo(name = "deleted_by") val deletedBy: Long? = null,
    @ColumnInfo(name = "is_deleted", defaultValue = "0") val isDeleted: Int = 0,
    @ColumnInfo(name = "sync_status", defaultValue = "'synced'") val syncStatus: String = "synced",
    @ColumnInfo(name = "sync_version", defaultValue = "1") val syncVersion: Int = 1,
    @ColumnInfo(name = "sync_at") val syncAt: String? = null,
    @ColumnInfo(name = "device_id") val deviceId: String? = null,
    @ColumnInfo(name = "remarks") val remarks: String? = null
)
