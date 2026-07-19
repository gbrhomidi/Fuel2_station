package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "balance_sheets")
data class BalanceSheetEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val station_id: Int,
    val report_date: String,
    val assets_total: Double,
    val liabilities_total: Double,
    val equity_total: Double,
    val net_income: Double?,
    val currency_id: Int,
    val generated_by: Int,
    val generated_at: String? = "CURRENT_TIMESTAMP",
    val archived: Int? = 0
)