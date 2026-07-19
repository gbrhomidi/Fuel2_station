package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "sales_transactions")
data class SalesTransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sale_code: String,
    val station_id: Int,
    val shift_id: Int,
    val customer_party_id: Int?,
    val vehicle_id: Int?,
    val driver_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val invoice_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val invoice_series: String? = "A",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val invoice_type: String? = "standard",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val receipt_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sale_type: String? = "retail",
    val fuel_type_id: Int?,
    val pump_id: Int?,
    val nozzle_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val liters: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val price_per_liter: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val fuel_subtotal: Double?,
    val product_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity: Double? = 1,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val unit_price: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val product_subtotal: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val subtotal: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val discount_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val discount_percent: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_rate: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val vat_rate: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val vat_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val service_fee: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val commission: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val gross_amount: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val net_amount: Double,
    val currency_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val exchange_rate: Double? = 1,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val amount_in_default: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_method: String? = "cash",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_status: String? = "pending",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val paid_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val remaining_amount: Double? = 0,
    val is_credit: Int? = 0,
    val credit_days: Int? = 0,
    val due_date: String?,
    val loyalty_points_earned: Int? = 0,
    val loyalty_points_used: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val loyalty_discount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val gps_latitude: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val gps_longitude: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val invoice_qr: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val digital_signature: String?,
    val zatca_xml: String?,
    val print_count: Int? = 0,
    val last_printed_at: String?,
    val offline_mode: Int? = 0,
    val synced_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "completed",
    val cancellation_reason: String?,
    val cancelled_by: Int?,
    val cancelled_at: String?,
    val cashier_id: Int,
    val attendant_id: Int?,
    val approved_by: Int?,
    val delivery_location: String?,
    val delivery_time: String?,
    val order_type: String? = "sale",
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