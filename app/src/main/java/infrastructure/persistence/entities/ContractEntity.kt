package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "contracts")
data class ContractEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val contract_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val contract_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val contract_name_ar: String?,
    val party_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val contract_type: String,
    val start_date: String,
    val end_date: String?,
    val auto_renew: Int? = 0,
    val renewal_terms: String?,
    val terms: String?,
    val special_conditions: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_value: Double?,
    val currency_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    val signed_by: Int?,
    val signed_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val document_path: String?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)