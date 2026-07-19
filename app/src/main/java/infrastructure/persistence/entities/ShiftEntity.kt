package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "shifts")
data class ShiftEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val shift_code: String,
    val station_id: Int,
    val shift_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val shift_type: String,
    val start_time: String,
    val end_time: String?,
    val duration_minutes: Int?,
    val manager_id: Int?,
    val cashier_id: Int?,
    val attendant_ids: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val opening_cash: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val opening_bank: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val opening_credit: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val closing_cash: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val closing_bank: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val closing_credit: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_sales: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_fuel_sales: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_product_sales: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_service_sales: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_discounts: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_tax: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_vat: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_cash: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_credit_card: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_bank_transfer: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_credit_sales: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_cheque: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_other: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_fuel_liters: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val cash_variance: Double? = 0,
    val variance_reason: String?,
    val variance_approved_by: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "open",
    val closed_at: String?,
    val closed_by: Int?,
    val verified_at: String?,
    val verified_by: Int?,
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