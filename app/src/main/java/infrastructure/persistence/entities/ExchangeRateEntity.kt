package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "exchange_rates")
data class ExchangeRateEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val from_currency_id: Int,
    val to_currency_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val rate: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val inverse_rate: Double,
    val effective_date: String,
    val expiry_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val source: String?,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?,
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