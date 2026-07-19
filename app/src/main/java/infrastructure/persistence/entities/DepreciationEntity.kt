package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "depreciation")
data class DepreciationEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val asset_id: Int,
    val depreciation_date: String? = "CURRENT_TIMESTAMP",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val depreciation_amount: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val accumulated_depreciation: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val remaining_value: Double?,
    val journal_entry_id: Int?,
    val created_by: Int?,
    val archived: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP"
)