package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "banks")
data class BankEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val bank_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val bank_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val bank_name_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val swift_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val country: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val city: String?,
    val address: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val email: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val website: String?,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0,
    val remarks: String?,
    val extra_data: String?
)