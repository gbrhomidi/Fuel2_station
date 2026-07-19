package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "units")
data class UnitEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val unit_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val unit_symbol: String,
    val is_decimal: Int? = 0,
    val base_unit_id: Int?,
    val conversion_factor: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category: String? = "fuel",
    val created_at: String? = "CURRENT_TIMESTAMP"
)