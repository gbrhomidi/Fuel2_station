package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "initial_inventory")
data class InitialInventoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val warehouse_id: Int,
    val product_id: Int,
    val quantity: Double,
    val unit_cost: Double,
    val entry_date: String? = "CURRENT_TIMESTAMP",
    val created_by: Int,
    val archived: Int? = 0
)