package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "kpi_definitions")
data class KpiDefinitionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val kpi_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val kpi_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val kpi_name_ar: String?,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category: String,
    val formula: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val target_value: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val unit: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val frequency: String? = "daily",
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)