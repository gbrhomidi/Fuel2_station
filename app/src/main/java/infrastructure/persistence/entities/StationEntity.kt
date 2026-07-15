package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "stations",
    indices = [
        Index(value = ["uuid"], unique = true),
        Index(value = ["station_code"], unique = true),
        Index(value = ["company_id"]),
        Index(value = ["default_currency_id"])
    ],
    foreignKeys = [
        ForeignKey(
            entity = CompanyEntity::class,
            parentColumns = ["id"],
            childColumns = ["company_id"]
        ),
        ForeignKey(
            entity = CurrencyEntity::class,
            parentColumns = ["id"],
            childColumns = ["default_currency_id"]
        )
    ]
)
data class StationEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long = 0,
    @ColumnInfo(name = "uuid") val uuid: String,
    @ColumnInfo(name = "company_id") val companyId: Long,
    @ColumnInfo(name = "default_currency_id") val defaultCurrencyId: Long,
    @ColumnInfo(name = "station_code") val stationCode: String,
    @ColumnInfo(name = "station_name") val stationName: String,
    @ColumnInfo(name = "station_name_ar") val stationNameAr: String? = null,
    @ColumnInfo(name = "license_number") val licenseNumber: String? = null,
    @ColumnInfo(name = "tax_number") val taxNumber: String? = null,
    @ColumnInfo(name = "phone") val phone: String? = null,
    @ColumnInfo(name = "email") val email: String? = null,
    @ColumnInfo(name = "address_line_1") val addressLine1: String? = null,
    @ColumnInfo(name = "address_line_2") val addressLine2: String? = null,
    @ColumnInfo(name = "city") val city: String? = null,
    @ColumnInfo(name = "state") val state: String? = null,
    @ColumnInfo(name = "country") val country: String? = null,
    @ColumnInfo(name = "postal_code") val postalCode: String? = null,
    @ColumnInfo(name = "latitude") val latitude: Double? = null,
    @ColumnInfo(name = "longitude") val longitude: Double? = null,
    @ColumnInfo(name = "manager_name") val managerName: String? = null,
    @ColumnInfo(name = "manager_phone") val managerPhone: String? = null,
    @ColumnInfo(name = "operating_hours") val operatingHours: String? = null,
    @ColumnInfo(name = "storage_capacity") val storageCapacity: Double? = null,
    @ColumnInfo(name = "number_of_pumps") val numberOfPumps: Int? = null,
    @ColumnInfo(name = "number_of_tanks") val numberOfTanks: Int? = null,
    @ColumnInfo(name = "has_convenience_store", defaultValue = "0") val hasConvenienceStore: Int = 0,
    @ColumnInfo(name = "has_car_wash", defaultValue = "0") val hasCarWash: Int = 0,
    @ColumnInfo(name = "has_service_bay", defaultValue = "0") val hasServiceBay: Int = 0,
    @ColumnInfo(name = "electricity_provider") val electricityProvider: String? = null,
    @ColumnInfo(name = "water_provider") val waterProvider: String? = null,
    @ColumnInfo(name = "generator_details") val generatorDetails: String? = null,
    @ColumnInfo(name = "pos_system_name") val posSystemName: String? = null,
    @ColumnInfo(name = "internet_provider") val internetProvider: String? = null,
    @ColumnInfo(name = "safety_certificate_number") val safetyCertificateNumber: String? = null,
    @ColumnInfo(name = "safety_certificate_expiry") val safetyCertificateExpiry: String? = null,
    @ColumnInfo(name = "insurance_policy_number") val insurancePolicyNumber: String? = null,
    @ColumnInfo(name = "insurance_expiry_date") val insuranceExpiryDate: String? = null,
    @ColumnInfo(name = "commission_rate") val commissionRate: Double? = null,
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
    @ColumnInfo(name = "remarks") val remarks: String? = null,
    @ColumnInfo(name = "extra_data") val extraData: String? = null
)
