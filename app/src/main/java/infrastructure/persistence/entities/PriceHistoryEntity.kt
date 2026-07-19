package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "price_history")
data class PriceHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val product_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val old_price: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val new_price: Double,
    val change_date: String? = "CURRENT_TIMESTAMP",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val change_reason: String?,
    val created_by: Int,
    val archived: Int? = 0
)