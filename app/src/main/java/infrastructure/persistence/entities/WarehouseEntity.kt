package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "warehouses")
data class WarehouseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val station_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val warehouse_name: String,
    val location_details: String?,
    val is_default: Int? = 0,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP"
)