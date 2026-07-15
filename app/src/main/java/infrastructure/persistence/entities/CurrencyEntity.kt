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
