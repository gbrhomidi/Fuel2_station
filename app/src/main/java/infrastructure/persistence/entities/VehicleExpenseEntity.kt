package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "vehicle_expenses")
data class VehicleExpenseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val vehicle_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val expense_type: String,
    val expense_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val amount: Double,
    val currency_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val odometer_reading: Double?,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val invoice_path: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)