package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "shift_deliveries")
data class ShiftDeliveryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val shift_id: Int?,
    val delivery_id: Int?,
    val amount: Double? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP"
)