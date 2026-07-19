package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "party_types")
data class PartyTypeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val type_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val type_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val type_name_ar: String?,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val default_discount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val default_credit_limit: Double? = 0,
    val payment_terms_days: Int? = 0,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0,
    val remarks: String?,
    val extra_data: String?
)