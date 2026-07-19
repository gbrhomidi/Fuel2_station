package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "inventory_movements")
data class InventoryMovementEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val movement_code: String,
    val product_id: Int,
    val station_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val movement_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val movement_subtype: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity_before: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity_change: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity_after: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val unit_cost: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_cost: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val reference_type: String?,
    val reference_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val reference_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val from_location: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val to_location: String?,
    val reason: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val reason_code: String?,
    val performed_by: Int,
    val approved_by: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "completed",
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