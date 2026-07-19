package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "employees_old")
data class EmployeesOldEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val phone: String?,
    val position: String?,
    val base_salary: Double? = 0,
    val advances: Double? = 0,
    val penalties: Double? = 0,
    val bonuses: Double? = 0,
    val net_salary: Double? = 0,
    val notes: String?,
    val active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP"
)