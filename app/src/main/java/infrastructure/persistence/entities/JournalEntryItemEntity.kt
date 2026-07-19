package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "journal_entry_items")
data class JournalEntryItemEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val journal_entry_id: Int,
    val line_number: Int,
    val account_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val debit: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val credit: Double? = 0,
    val currency_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val exchange_rate: Double? = 1,
    val description: String?,
    val description_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val cost_center: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val project_code: String?,
    val customer_party_id: Int?,
    val supplier_party_id: Int?,
    val employee_id: Int?
)