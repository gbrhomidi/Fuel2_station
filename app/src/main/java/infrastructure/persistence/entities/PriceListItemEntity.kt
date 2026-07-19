package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "price_list_items")
data class PriceListItemEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val price_list_id: Int,
    val product_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val unit_price: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val min_quantity: Double? = 1,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val max_quantity: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val discount_percent: Double? = 0,
    val valid_from: String?,
    val valid_to: String?,
    val is_active: Int? = 1
)