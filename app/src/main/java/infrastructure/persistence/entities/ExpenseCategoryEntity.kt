package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "expense_categories")
data class ExpenseCategoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category_name_ar: String?,
    val description: String?,
    val default_account_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val monthly_budget: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val yearly_budget: Double? = 0,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0,
    val remarks: String?,
    val extra_data: String?
)