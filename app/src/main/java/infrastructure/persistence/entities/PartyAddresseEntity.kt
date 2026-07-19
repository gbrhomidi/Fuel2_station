package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "party_addresses")
data class PartyAddresseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val party_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val address_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val address_line1: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val address_line2: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val city: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val state: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val postal_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val country: String?,
    val is_default: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)