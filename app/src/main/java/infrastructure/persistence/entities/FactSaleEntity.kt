package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "fact_sales")
data class FactSaleEntity(
    @PrimaryKey(autoGenerate = true)
    val fact_id: Int,
    val sale_id: Int,
    val date_id: Int,
    val customer_dim_id: Int?,
    val station_dim_id: Int,
    val product_dim_id: Int?,
    val fuel_type_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val unit_price: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_amount: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val discount_amount: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_amount: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val net_amount: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val gross_profit: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_method: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)