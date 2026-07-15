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
