package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "expenses")
data class ExpenseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val expense_code: String,
    val expense_category_id: Int,
    val station_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payee_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payee_name_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payee_type: String? = "other",
    val payee_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val amount: Double,
    val currency_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val exchange_rate: Double? = 1,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val amount_in_default: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_rate: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val vat_rate: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val vat_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_amount: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_method: String? = "cash",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_status: String? = "pending",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val paid_amount: Double? = 0,
    val is_recurring: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val recurrence_type: String?,
    val next_due_date: String?,
    val description: String,
    val description_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val invoice_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val invoice_path: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val receipt_path: String?,
    val journal_entry_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "pending",
    val approved_by: Int?,
    val approved_at: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val deleted_at: String?,
    val created_by: Int?,
    val updated_by: Int?,
    val deleted_by: Int?,
    val is_deleted: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sync_status: String? = "synced",
    val sync_version: Int? = 1,
    val sync_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    val remarks: String?,
    val extra_data: String?
)