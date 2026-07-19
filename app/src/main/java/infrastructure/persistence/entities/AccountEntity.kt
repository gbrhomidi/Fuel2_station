package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "accounts")
data class AccountEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val account_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val account_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val account_name_ar: String?,
    val parent_account_id: Int?,
    val level: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val account_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val account_category: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val normal_balance: String,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val opening_balance: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val current_balance: Double? = 0,
    val is_bank_account: Int? = 0,
    val is_cash_account: Int? = 0,
    val is_control_account: Int? = 0,
    val is_active: Int? = 1,
    val bank_account_id: Int?,
    val cash_box_id: Int?,
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