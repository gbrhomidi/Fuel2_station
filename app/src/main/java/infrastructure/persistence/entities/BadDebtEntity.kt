package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "bad_debts")
data class BadDebtEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val customer_id: Int?,
    val amount: Double? = 0,
    val type: String?,
    val description: String?,
    val date: String? = "CURRENT_TIMESTAMP",
    val resolved: Int? = 0,
    val resolved_date: String?
)