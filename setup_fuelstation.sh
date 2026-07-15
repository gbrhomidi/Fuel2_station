#!/data/data/com.termux/files/usr/bin/bash
cd ~
mkdir -p Fuel_station/app/src/main/java/infrastructure/persistence/entities
mkdir -p Fuel_station/app/src/main/java/infrastructure/persistence/dao
mkdir -p Fuel_station/app/src/androidTest/java/infrastructure/persistence
cd Fuel_station
echo "سيتم اضافة الملفات فقط. لن يتم حذف اي شيء"

# -------------------------------------------------------------
# 1. إنشاء وتحديث الكيانات (Entities)
# -------------------------------------------------------------

# كتابة ملف CompanyEntity.kt (48 عموداً كاملاً ومطابقاً)
cat > app/src/main/java/infrastructure/persistence/entities/CompanyEntity.kt << 'EOF'
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
EOF

# كتابة ملف CurrencyEntity.kt (24 عموداً كاملاً ومطابقاً)
cat > app/src/main/java/infrastructure/persistence/entities/CurrencyEntity.kt << 'EOF'
package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "currencies",
    indices = [
        Index(value = ["uuid"], unique = true),
        Index(value = ["currency_code"], unique = true),
        Index(value = ["status"])
    ]
)
data class CurrencyEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long = 0,
    @ColumnInfo(name = "uuid") val uuid: String,
    @ColumnInfo(name = "currency_code") val currencyCode: String,
    @ColumnInfo(name = "currency_name") val currencyName: String,
    @ColumnInfo(name = "currency_name_ar") val currencyNameAr: String? = null,
    @ColumnInfo(name = "currency_symbol") val currencySymbol: String,
    @ColumnInfo(name = "exchange_rate", defaultValue = "1.0") val exchangeRate: Double = 1.0,
    @ColumnInfo(name = "is_default", defaultValue = "0") val isDefault: Int = 0,
    @ColumnInfo(name = "decimal_places", defaultValue = "2") val decimalPlaces: Int = 2,
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
EOF

# كتابة ملف StationEntity.kt (54 عموداً كاملاً ومطابقاً)
cat > app/src/main/java/infrastructure/persistence/entities/StationEntity.kt << 'EOF'
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
EOF

# كتابة ملف UserEntity.kt (مساعد لضمان تماسك العلاقات البرمجية)
cat > app/src/main/java/infrastructure/persistence/entities/UserEntity.kt << 'EOF'
package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long = 0,
    @ColumnInfo(name = "username") val username: String,
    @ColumnInfo(name = "is_deleted", defaultValue = "0") val isDeleted: Int = 0
)
EOF

# كتابة ملف FuelTypeEntity.kt (29 عموداً كاملاً ومطابقاً)
cat > app/src/main/java/infrastructure/persistence/entities/FuelTypeEntity.kt << 'EOF'
package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "fuel_types",
    indices = [
        Index(value = ["uuid"], unique = true),
        Index(value = ["fuel_code"], unique = true)
    ],
    foreignKeys = [
        ForeignKey(
            entity = UserEntity::class,
            parentColumns = ["id"],
            childColumns = ["created_by"]
        )
    ]
)
data class FuelTypeEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long = 0,
    @ColumnInfo(name = "uuid") val uuid: String,
    @ColumnInfo(name = "fuel_code") val fuelCode: String,
    @ColumnInfo(name = "fuel_name") val fuelName: String,
    @ColumnInfo(name = "fuel_name_ar") val fuelNameAr: String? = null,
    @ColumnInfo(name = "description") val description: String? = null,
    @ColumnInfo(name = "density_standard") val densityStandard: Double? = null,
    @ColumnInfo(name = "temperature_standard", defaultValue = "15.0") val temperatureStandard: Double = 15.0,
    @ColumnInfo(name = "flash_point") val flashPoint: Double? = null,
    @ColumnInfo(name = "default_sale_price") val defaultSalePrice: Double? = null,
    @ColumnInfo(name = "default_purchase_price") val defaultPurchasePrice: Double? = null,
    @ColumnInfo(name = "tax_rate", defaultValue = "0") val taxRate: Double = 0.0,
    @ColumnInfo(name = "vat_rate", defaultValue = "0") val vatRate: Double = 0.0,
    @ColumnInfo(name = "color_code") val colorCode: String? = null,
    @ColumnInfo(name = "icon_path") val iconPath: String? = null,
    @ColumnInfo(name = "is_active", defaultValue = "1") val isActive: Int = 1,
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
EOF


# -------------------------------------------------------------
# 2. إنشاء وتحديث واجهات الوصول للبيانات (DAOs)
# -------------------------------------------------------------

# كتابة ملف CompanyDao.kt
cat > app/src/main/java/infrastructure/persistence/dao/CompanyDao.kt << 'EOF'
package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.CompanyEntity

@Dao
interface CompanyDao {
    @Insert
    suspend fun insert(company: CompanyEntity): Long

    @Update
    suspend fun update(company: CompanyEntity)

    @Query("""
        SELECT 
            id, uuid, company_code, company_name, company_name_ar, trade_license_number, 
            tax_number, vat_number, registration_date, expiry_date, legal_form, website, 
            email, phone, fax, address_line_1, address_line_2, city, state, postal_code, 
            country, latitude, longitude, logo_path, owner_name, owner_phone, manager_name, 
            manager_phone, capital_amount, bank_name, bank_account_number, iban, swift_code, 
            is_active, status, status_reason, created_at, updated_at, deleted_at, 
            created_by, updated_by, deleted_by, is_deleted, sync_status, sync_version, 
            sync_at, device_id, remarks
        FROM companies
        WHERE id = :id AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(id: Long): CompanyEntity?

    @Query("""
        SELECT 
            id, uuid, company_code, company_name, company_name_ar, trade_license_number, 
            tax_number, vat_number, registration_date, expiry_date, legal_form, website, 
            email, phone, fax, address_line_1, address_line_2, city, state, postal_code, 
            country, latitude, longitude, logo_path, owner_name, owner_phone, manager_name, 
            manager_phone, capital_amount, bank_name, bank_account_number, iban, swift_code, 
            is_active, status, status_reason, created_at, updated_at, deleted_at, 
            created_by, updated_by, deleted_by, is_deleted, sync_status, sync_version, 
            sync_at, device_id, remarks
        FROM companies
        WHERE company_code = :code AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByCode(code: String): CompanyEntity?

    @Query("""
        SELECT 
            id, uuid, company_code, company_name, company_name_ar, trade_license_number, 
            tax_number, vat_number, registration_date, expiry_date, legal_form, website, 
            email, phone, fax, address_line_1, address_line_2, city, state, postal_code, 
            country, latitude, longitude, logo_path, owner_name, owner_phone, manager_name, 
            manager_phone, capital_amount, bank_name, bank_account_number, iban, swift_code, 
            is_active, status, status_reason, created_at, updated_at, deleted_at, 
            created_by, updated_by, deleted_by, is_deleted, sync_status, sync_version, 
            sync_at, device_id, remarks
        FROM companies
        WHERE is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findAll(): List<CompanyEntity>
}
EOF

# كتابة ملف StationDao.kt
cat > app/src/main/java/infrastructure/persistence/dao/StationDao.kt << 'EOF'
package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.StationEntity

@Dao
interface StationDao {
    @Insert
    suspend fun insert(station: StationEntity): Long

    @Update
    suspend fun update(station: StationEntity)

    @Query("""
        SELECT 
            id, uuid, company_id, default_currency_id, station_code, station_name, 
            station_name_ar, license_number, tax_number, phone, email, address_line_1, 
            address_line_2, city, state, country, postal_code, latitude, longitude, 
            manager_name, manager_phone, operating_hours, storage_capacity, number_of_pumps, 
            number_of_tanks, has_convenience_store, has_car_wash, has_service_bay, 
            electricity_provider, water_provider, generator_details, pos_system_name, 
            internet_provider, safety_certificate_number, safety_certificate_expiry, 
            insurance_policy_number, insurance_expiry_date, commission_rate, is_active, 
            status, status_reason, created_at, updated_at, deleted_at, created_by, 
            updated_by, deleted_by, is_deleted, sync_status, sync_version, sync_at, 
            device_id, remarks, extra_data
        FROM stations
        WHERE id = :id AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(id: Long): StationEntity?

    @Query("""
        SELECT 
            id, uuid, company_id, default_currency_id, station_code, station_name, 
            station_name_ar, license_number, tax_number, phone, email, address_line_1, 
            address_line_2, city, state, country, postal_code, latitude, longitude, 
            manager_name, manager_phone, operating_hours, storage_capacity, number_of_pumps, 
            number_of_tanks, has_convenience_store, has_car_wash, has_service_bay, 
            electricity_provider, water_provider, generator_details, pos_system_name, 
            internet_provider, safety_certificate_number, safety_certificate_expiry, 
            insurance_policy_number, insurance_expiry_date, commission_rate, is_active, 
            status, status_reason, created_at, updated_at, deleted_at, created_by, 
            updated_by, deleted_by, is_deleted, sync_status, sync_version, sync_at, 
            device_id, remarks, extra_data
        FROM stations
        WHERE station_code = :code AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByCode(code: String): StationEntity?

    @Query("""
        SELECT 
            id, uuid, company_id, default_currency_id, station_code, station_name, 
            station_name_ar, license_number, tax_number, phone, email, address_line_1, 
            address_line_2, city, state, country, postal_code, latitude, longitude, 
            manager_name, manager_phone, operating_hours, storage_capacity, number_of_pumps, 
            number_of_tanks, has_convenience_store, has_car_wash, has_service_bay, 
            electricity_provider, water_provider, generator_details, pos_system_name, 
            internet_provider, safety_certificate_number, safety_certificate_expiry, 
            insurance_policy_number, insurance_expiry_date, commission_rate, is_active, 
            status, status_reason, created_at, updated_at, deleted_at, created_by, 
            updated_by, deleted_by, is_deleted, sync_status, sync_version, sync_at, 
            device_id, remarks, extra_data
        FROM stations
        WHERE company_id = :companyId AND is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findByCompany(companyId: Long): List<StationEntity>

    @Query("""
        SELECT 
            id, uuid, company_id, default_currency_id, station_code, station_name, 
            station_name_ar, license_number, tax_number, phone, email, address_line_1, 
            address_line_2, city, state, country, postal_code, latitude, longitude, 
            manager_name, manager_phone, operating_hours, storage_capacity, number_of_pumps, 
            number_of_tanks, has_convenience_store, has_car_wash, has_service_bay, 
            electricity_provider, water_provider, generator_details, pos_system_name, 
            internet_provider, safety_certificate_number, safety_certificate_expiry, 
            insurance_policy_number, insurance_expiry_date, commission_rate, is_active, 
            status, status_reason, created_at, updated_at, deleted_at, created_by, 
            updated_by, deleted_by, is_deleted, sync_status, sync_version, sync_at, 
            device_id, remarks, extra_data
        FROM stations
        WHERE is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findAll(): List<StationEntity>
}
EOF

# كتابة ملف CurrencyDao.kt
cat > app/src/main/java/infrastructure/persistence/dao/CurrencyDao.kt << 'EOF'
package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.CurrencyEntity

@Dao
interface CurrencyDao {
    @Insert
    suspend fun insert(currency: CurrencyEntity): Long

    @Update
    suspend fun update(currency: CurrencyEntity)

    @Query("""
        SELECT 
            id, uuid, currency_code, currency_name, currency_name_ar, currency_symbol, 
            exchange_rate, is_default, decimal_places, status, status_reason, 
            created_at, updated_at, deleted_at, created_by, updated_by, deleted_by, 
            is_deleted, sync_status, sync_version, sync_at, device_id, remarks, extra_data
        FROM currencies
        WHERE id = :id AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(id: Long): CurrencyEntity?

    @Query("""
        SELECT 
            id, uuid, currency_code, currency_name, currency_name_ar, currency_symbol, 
            exchange_rate, is_default, decimal_places, status, status_reason, 
            created_at, updated_at, deleted_at, created_by, updated_by, deleted_by, 
            is_deleted, sync_status, sync_version, sync_at, device_id, remarks, extra_data
        FROM currencies
        WHERE currency_code = :code AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByCode(code: String): CurrencyEntity?

    @Query("""
        SELECT 
            id, uuid, currency_code, currency_name, currency_name_ar, currency_symbol, 
            exchange_rate, is_default, decimal_places, status, status_reason, 
            created_at, updated_at, deleted_at, created_by, updated_by, deleted_by, 
            is_deleted, sync_status, sync_version, sync_at, device_id, remarks, extra_data
        FROM currencies
        WHERE is_default = 1 AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findDefaultCurrency(): CurrencyEntity?

    @Query("""
        SELECT 
            id, uuid, currency_code, currency_name, currency_name_ar, currency_symbol, 
            exchange_rate, is_default, decimal_places, status, status_reason, 
            created_at, updated_at, deleted_at, created_by, updated_by, deleted_by, 
            is_deleted, sync_status, sync_version, sync_at, device_id, remarks, extra_data
        FROM currencies
        WHERE is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findAll(): List<CurrencyEntity>
}
EOF

# كتابة ملف UserDao.kt (مساعد للتحكم بكيان المستخدمين)
cat > app/src/main/java/infrastructure/persistence/dao/UserDao.kt << 'EOF'
package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import infrastructure.persistence.entities.UserEntity

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: UserEntity): Long

    @Query("SELECT id, username, is_deleted FROM users WHERE id = :id LIMIT 1")
    suspend fun findById(id: Long): UserEntity?
}
EOF

# كتابة ملف FuelTypeDao.kt
cat > app/src/main/java/infrastructure/persistence/dao/FuelTypeDao.kt << 'EOF'
package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.FuelTypeEntity

@Dao
interface FuelTypeDao {
    @Insert
    suspend fun insert(fuelType: FuelTypeEntity): Long

    @Update
    suspend fun update(fuelType: FuelTypeEntity)

    @Query("""
        SELECT 
            id, uuid, fuel_code, fuel_name, fuel_name_ar, description, density_standard, 
            temperature_standard, flash_point, default_sale_price, default_purchase_price, 
            tax_rate, vat_rate, color_code, icon_path, is_active, created_at, updated_at, 
            deleted_at, created_by, updated_by, deleted_by, is_deleted, sync_status, 
            sync_version, sync_at, device_id, remarks, extra_data
        FROM fuel_types
        WHERE id = :id AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(id: Long): FuelTypeEntity?

    @Query("""
        SELECT 
            id, uuid, fuel_code, fuel_name, fuel_name_ar, description, density_standard, 
            temperature_standard, flash_point, default_sale_price, default_purchase_price, 
            tax_rate, vat_rate, color_code, icon_path, is_active, created_at, updated_at, 
            deleted_at, created_by, updated_by, deleted_by, is_deleted, sync_status, 
            sync_version, sync_at, device_id, remarks, extra_data
        FROM fuel_types
        WHERE fuel_code = :code AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByCode(code: String): FuelTypeEntity?

    @Query("""
        SELECT 
            id, uuid, fuel_code, fuel_name, fuel_name_ar, description, density_standard, 
            temperature_standard, flash_point, default_sale_price, default_purchase_price, 
            tax_rate, vat_rate, color_code, icon_path, is_active, created_at, updated_at, 
            deleted_at, created_by, updated_by, deleted_by, is_deleted, sync_status, 
            sync_version, sync_at, device_id, remarks, extra_data
        FROM fuel_types
        WHERE is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findAll(): List<FuelTypeEntity>
}
EOF


# -------------------------------------------------------------
# 3. إنشاء وتحديث فئة قاعدة البيانات الرئيسية (AppDatabase)
# -------------------------------------------------------------

# كتابة ملف AppDatabase.kt
cat > app/src/main/java/infrastructure/persistence/AppDatabase.kt << 'EOF'
package infrastructure.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import infrastructure.persistence.dao.CompanyDao
import infrastructure.persistence.dao.CurrencyDao
import infrastructure.persistence.dao.StationDao
import infrastructure.persistence.dao.FuelTypeDao
import infrastructure.persistence.dao.UserDao
import infrastructure.persistence.entities.CompanyEntity
import infrastructure.persistence.entities.CurrencyEntity
import infrastructure.persistence.entities.StationEntity
import infrastructure.persistence.entities.FuelTypeEntity
import infrastructure.persistence.entities.UserEntity

@Database(
    entities = [
        CompanyEntity::class,
        StationEntity::class,
        CurrencyEntity::class,
        FuelTypeEntity::class,
        UserEntity::class
    ],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun companyDao(): CompanyDao
    abstract fun stationDao(): StationDao
    abstract fun currencyDao(): CurrencyDao
    abstract fun fuelTypeDao(): FuelTypeDao
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        private const val DATABASE_NAME = "petro_station_db"

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                )
                .addCallback(object : Callback() {
                    override fun onOpen(db: SupportSQLiteDatabase) {
                        super.onOpen(db)
                        db.execSQL("PRAGMA foreign_keys = ON;")
                    }
                })
                .fallbackToDestructiveMigration()
                .build()
                
                INSTANCE = instance
                instance
            }
        }
    }
}
EOF


# -------------------------------------------------------------
# 4. إنشاء وتحديث فئات الاختبار (Instrumented Tests)
# -------------------------------------------------------------

# كتابة ملف FuelTypeDaoTest.kt
cat > app/src/androidTest/java/infrastructure/persistence/FuelTypeDaoTest.kt << 'EOF'
package infrastructure.persistence

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import infrastructure.persistence.dao.FuelTypeDao
import infrastructure.persistence.dao.UserDao
import infrastructure.persistence.entities.FuelTypeEntity
import infrastructure.persistence.entities.UserEntity
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class FuelTypeDaoTest {

    private lateinit var db: AppDatabase
    private lateinit var fuelTypeDao: FuelTypeDao
    private lateinit var userDao: UserDao

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        fuelTypeDao = db.fuelTypeDao()
        userDao = db.userDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun writeFuelTypeAndReadInList() = runBlocking {
        // إنشاء مستخدم أولاً لتفادي استثناء قيود المفاتيح الأجنبية (FK Constraint)
        val user = UserEntity(username = "admin")
        val userId = userDao.insert(user)

        val fuelType = FuelTypeEntity(
            uuid = "f8c3de3d-1fea-4d7c-a8b0-29f63c4c3454",
            fuelCode = "DSL",
            fuelName = "Diesel",
            fuelNameAr = "ديزل",
            createdBy = userId,
            temperatureStandard = 15.0,
            taxRate = 0.0,
            vatRate = 0.0,
            isActive = 1,
            isDeleted = 0
        )
        
        val id = fuelTypeDao.insert(fuelType)
        assertNotNull(id)

        val retrieved = fuelTypeDao.findById(id)
        assertNotNull(retrieved)
        assertEquals("Diesel", retrieved?.fuelName)
        assertEquals("DSL", retrieved?.fuelCode)
        assertEquals(userId, retrieved?.createdBy)
    }

    @Test
    @Throws(Exception::class)
    fun testSoftDelete() = runBlocking {
        val user = UserEntity(username = "admin")
        val userId = userDao.insert(user)

        val fuelType = FuelTypeEntity(
            uuid = "a1b2c3d4-e5f6-7a8b-9c0d-e1f2a3b4c5d6",
            fuelCode = "OCT95",
            fuelName = "Octane 95",
            fuelNameAr = "بنزين 95",
            createdBy = userId
        )
        val id = fuelTypeDao.insert(fuelType)

        val insertedFuel = fuelTypeDao.findById(id)
        assertNotNull(insertedFuel)
        
        // إجراء حذف منطقي (Soft Delete) عن طريق تحديث العلم المخصص
        val deletedFuel = insertedFuel!!.copy(isDeleted = 1)
        fuelTypeDao.update(deletedFuel)

        // يجب أن ترجع null لأن الاستعلام المكتوب يستبعد السجلات المحذوفة منطقياً
        val searchDeleted = fuelTypeDao.findById(id)
        assertNull(searchDeleted)
    }
}
EOF

echo "=========================================================="
echo "🎉 [SUCCESS] Additive Setup Complete!"
echo "📍 Files added/updated under: ~/Fuel_station"
echo "🔐 All previous non-related files are perfectly safe and preserved."
echo "=========================================================="
