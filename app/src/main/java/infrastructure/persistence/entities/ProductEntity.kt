package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val product_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val barcode: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val qr_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val product_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val product_name_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val short_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val short_name_ar: String?,
    val description: String?,
    val description_ar: String?,
    val category_id: Int,
    val fuel_type_id: Int?,
    val station_id: Int?,
    val unit_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val product_type: String? = "retail",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val purchase_price: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val sale_price: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val wholesale_price: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val min_sale_price: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val max_sale_price: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_rate: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val vat_rate: Double? = 0,
    val is_tax_exempt: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val minimum_stock: Double? = 10,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val maximum_stock: Double? = 1000,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val reorder_quantity: Double? = 50,
    val is_service: Int? = 0,
    val is_serialized: Int? = 0,
    val is_batch_tracked: Int? = 0,
    val has_expiry: Int? = 0,
    val expiry_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val weight_kg: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val volume_liters: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val length_cm: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val width_cm: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val height_cm: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val primary_image: String?,
    val gallery_images: String?,
    val preferred_supplier_id: Int?,
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