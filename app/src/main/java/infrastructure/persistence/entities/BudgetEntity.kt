package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "budgets")
data class BudgetEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val station_id: Int,
    val budget_name: String,
    val budget_period: String,
    val start_date: String,
    val end_date: String,
    val total_amount: Double?,
    val currency_id: Int,
    val status: String? = "draft",
    val created_by: Int,
    val created_at: String? = "CURRENT_TIMESTAMP"
)