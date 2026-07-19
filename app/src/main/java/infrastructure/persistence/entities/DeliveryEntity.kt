package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "deliveries")
data class DeliveryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val sale_id: Int?,
    val party_id: Int?,
    val vehicle_id: Int?,
    val driver_id: Int?,
    val delivery_date: String,
    val quantity: Double? = 0,
    val fuel_type: String? = "diesel",
    val price_per_liter: Double? = 0,
    val total_amount: Double? = 0,
    val status: String? = "delivered",
    val location: String?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)