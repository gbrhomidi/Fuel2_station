package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "fixed_assets")
data class FixedAssetEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val station_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val asset_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val asset_name: String,
    val category_id: Int?,
    val purchase_date: String? = "CURRENT_TIMESTAMP",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val purchase_cost: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val current_value: Double?,
    val useful_life: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val salvage_value: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val depreciation_method: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val asset_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val serial_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val model: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val manufacturer: String?,
    val warranty_expiry: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val location: String?,
    val notes: String?,
    val documents: String?,
    val maintenance_history: String?,
    val transfer_history: String?,
    val disposal_data: String?,
    val disposed_at: String?,
    val disposed_by: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)