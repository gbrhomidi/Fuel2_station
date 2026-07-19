package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "fuel_sales")
data class FuelSaleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val sale_id: Int?,
    val shift_id: Int?,
    val pump_id: Int?,
    val fuel_type_id: Int?,
    val quantity: Double? = 0,
    val price_per_liter: Double? = 0,
    val total_amount: Double? = 0,
    val payment_method: String? = "cash",
    val customer_id: Int?,
    val vehicle_plate: String?,
    val sale_date: String?,
    val sale_time: String?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)