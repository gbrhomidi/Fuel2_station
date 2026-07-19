package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "parties")
data class PartyEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val party_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val barcode: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val qr_code: String?,
    val party_type_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val legal_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val commercial_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val commercial_name_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val tax_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val commercial_register: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val vat_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val credit_limit: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val current_balance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_purchases: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_payments: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_due: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val overdue_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_terms: String?,
    val currency_id: Int?,
    val loyalty_points: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val loyalty_tier: String? = "bronze",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val risk_level: String? = "low",
    val blacklist_reason: String?,
    val blacklist_date: String?,
    val blacklist_by: Int?,
    val referred_by: Int?,
    val assigned_to: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val rating: Double? = 3.00,
    val total_orders: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_order_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val on_time_rate: Double? = 100.00,
    val fuel_type_preference_id: Int?,
    val fleet_size: Int? = 0,
    val is_active: Int? = 1,
    val notes: String?,
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