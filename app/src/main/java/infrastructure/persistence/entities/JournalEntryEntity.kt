package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "journal_entries")
data class JournalEntryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entry_number: String,
    val entry_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entry_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val reference_type: String?,
    val reference_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val reference_code: String?,
    val description: String,
    val description_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_debit: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_credit: Double,
    val is_balanced: Int? = 1,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "draft",
    val posted_at: String?,
    val posted_by: Int?,
    val reversed_entry_id: Int?,
    val reversal_reason: String?,
    val fiscal_year: Int?,
    val fiscal_period: Int?,
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