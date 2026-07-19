package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "sale_items")
data class SaleItemEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val sale_id: Int,
    val line_number: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val item_type: String,
    val product_id: Int?,
    val fuel_type_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val unit_of_measure: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val unit_price: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val subtotal: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val discount_percent: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val discount_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_rate: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val vat_rate: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val vat_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val line_total: Double,
    val pump_id: Int?,
    val nozzle_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val meter_start: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val meter_end: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val batch_number: String?,
    val expiry_date: String?,
    val is_returned: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val returned_quantity: Double? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP"
)