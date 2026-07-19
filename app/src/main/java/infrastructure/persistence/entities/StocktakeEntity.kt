package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "stocktakes")
data class StocktakeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val warehouse_id: Int,
    val start_date: String? = "CURRENT_TIMESTAMP",
    val end_date: String?,
    val status: String,
    val total_variance: Double?,
    val notes: String?,
    val created_by: Int,
    val archived: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP"
)