package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "employee_payments")
data class EmployeePaymentEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val employee_id: Int?,
    val amount: Double? = 0,
    val type: String?,
    val description: String?,
    val date: String? = "CURRENT_TIMESTAMP",
    val operator: String? = "System"
)