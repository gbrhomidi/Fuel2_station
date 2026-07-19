package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "fact_inventory")
data class FactInventoryEntity(
    @PrimaryKey(autoGenerate = true)
    val fact_id: Int,
    val product_id: Int,
    val station_id: Int,
    val date_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val opening_quantity: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val closing_quantity: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val average_cost: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_value: Double?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)