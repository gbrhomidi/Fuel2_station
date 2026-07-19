package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "stock_movements")
data class StockMovementEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val product_id: Int?,
    val movement_type: String? = "in",
    val quantity: Double? = 0,
    val unit_cost: Double? = 0,
    val total_cost: Double? = 0,
    val reference_type: String?,
    val reference_id: Int?,
    val movement_date: String?,
    val notes: String?,
    val created_by: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)