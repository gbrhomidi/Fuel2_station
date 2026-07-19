package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "stock_alerts")
data class StockAlertEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val product_id: Int,
    val station_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val alert_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val alert_level: String? = "warning",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val current_quantity: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val threshold_quantity: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val shortage_quantity: Double?,
    val is_resolved: Int? = 0,
    val resolved_at: String?,
    val resolved_by: Int?,
    val resolution_notes: String?,
    val notification_sent: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val notification_method: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sync_status: String? = "synced",
    val sync_version: Int? = 1,
    val sync_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    val remarks: String?,
    val extra_data: String?
)