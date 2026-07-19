package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "shift_expenses")
data class ShiftExpenseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val shift_id: Int?,
    val expense_type: String?,
    val amount: Double? = 0,
    val description: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)