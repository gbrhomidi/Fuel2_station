package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "price_lists")
data class PriceListEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val list_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val list_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val list_name_ar: String?,
    val description: String?,
    val party_id: Int?,
    val party_type_id: Int?,
    val station_id: Int?,
    val valid_from: String?,
    val valid_to: String?,
    val is_active: Int? = 1,
    val is_default: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val deleted_at: String?,
    val created_by: Int?,
    val updated_by: Int?,
    val deleted_by: Int?,
    val is_deleted: Int? = 0
)