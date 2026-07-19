package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "stocktake_details")
data class StocktakeDetailEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val stocktake_id: Int,
    val product_id: Int,
    val system_quantity: Double? = 0,
    val counted_quantity: Double? = 0,
    val variance_value: Double?,
    val notes: String?,
    val archived: Int? = 0
)