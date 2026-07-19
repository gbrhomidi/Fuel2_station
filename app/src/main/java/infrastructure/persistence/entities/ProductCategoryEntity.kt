package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "product_categories")
data class ProductCategoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category_name_ar: String?,
    val description: String?,
    val description_ar: String?,
    val parent_category_id: Int?,
    val level: Int? = 1,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category_type: String? = "product",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val color_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val icon_path: String?,
    val display_order: Int? = 0,
    val tax_rate: Double? = 0.0,
    val is_active: Int? = 1,
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