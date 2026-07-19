package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "inventory_levels")
data class InventoryLevelEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val product_id: Int,
    val warehouse_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity_on_hand: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity_committed: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val average_cost: Double? = 0,
    val last_count_date: String?,
    val expiry_date: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)