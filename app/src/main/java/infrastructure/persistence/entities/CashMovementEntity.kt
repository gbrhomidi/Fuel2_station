package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "cash_movements")
data class CashMovementEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val cash_box_id: Int?,
    val movement_type: String,
    val amount: Double,
    val balance_before: Double?,
    val balance_after: Double?,
    val description: String?,
    val reference_type: String?,
    val reference_id: Int?,
    val created_by: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)