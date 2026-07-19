package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "cash_deposits")
data class CashDepositEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val customer_id: Int?,
    val amount: Double? = 0,
    val balance_after: Double? = 0,
    val notes: String?,
    val operator: String? = "System",
    val date: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)