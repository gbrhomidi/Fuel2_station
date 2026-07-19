package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "cash_boxes")
data class CashBoxeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val box_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val box_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val box_name_ar: String?,
    val station_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val box_type: String? = "main",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val opening_balance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val current_balance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val maximum_balance: Double? = 500000,
    val currency_id: Int?,
    val responsible_user_id: Int?,
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