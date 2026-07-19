package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "damaged_products")
data class DamagedProductEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val product_id: Int,
    val warehouse_id: Int?,
    val tank_id: Int?,
    val quantity: Double,
    val reason: String?,
    val notes: String?,
    val report_date: String? = "CURRENT_TIMESTAMP",
    val reported_by: Int,
    val status: String? = "pending",
    val approved_by: Int?,
    val approved_at: String?,
    val archived: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP"
)