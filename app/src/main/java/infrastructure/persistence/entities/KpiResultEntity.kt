package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "kpi_results")
data class KpiResultEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val kpi_id: Int,
    val period_start: String,
    val period_end: String,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val actual_value: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val target_value: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val variance_percent: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "on_track",
    val calculated_at: String? = "CURRENT_TIMESTAMP",
    val notes: String?
)