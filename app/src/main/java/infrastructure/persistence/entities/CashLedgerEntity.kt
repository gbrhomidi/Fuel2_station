package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "cash_ledger")
data class CashLedgerEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val cash_box_id: Int,
    val transaction_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val transaction_type: String,
    val transaction_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val reference_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val debit: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val credit: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val balance: Double,
    val description: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)