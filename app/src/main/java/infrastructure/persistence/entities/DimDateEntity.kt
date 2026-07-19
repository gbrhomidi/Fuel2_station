package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "dim_date")
data class DimDateEntity(
    @PrimaryKey
    val date_id: Int,
    val full_date: String,
    val year: Int,
    val quarter: Int,
    val month: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val month_name: String?,
    val day: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val day_name: String?,
    val day_of_week: Int,
    val week_of_year: Int,
    val is_weekend: Int? = 0,
    val is_holiday: Int? = 0
)