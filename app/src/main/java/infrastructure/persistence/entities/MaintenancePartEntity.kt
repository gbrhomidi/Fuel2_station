package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "maintenance_parts")
data class MaintenancePartEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val maintenance_request_id: Int?,
    val product_id: Int,
    val quantity: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val unit_price: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_price: Double?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)