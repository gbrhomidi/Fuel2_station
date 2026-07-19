package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "assets")
data class AssetEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val asset_code: String?,
    val asset_name: String,
    val asset_type: String?,
    val asset_category: String?,
    val purchase_date: String?,
    val purchase_cost: Double? = 0,
    val current_value: Double? = 0,
    val depreciation_rate: Double? = 0,
    val location: String?,
    val status: String? = "active",
    val maintenance_date: String?,
    val next_maintenance: String?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)