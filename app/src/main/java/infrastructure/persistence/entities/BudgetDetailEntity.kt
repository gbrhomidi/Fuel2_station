package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "budget_details")
data class BudgetDetailEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val budget_id: Int,
    val category_id: Int,
    val allocated_amount: Double?,
    val actual_amount: Double? = 0,
    val notes: String?
)