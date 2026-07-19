package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "party_contacts")
data class PartyContactEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val party_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val contact_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val contact_name_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_title: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val department: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val phone2: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val email: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val whatsapp: String?,
    val is_primary: Int? = 0,
    val is_billing: Int? = 0,
    val is_technical: Int? = 0,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val is_deleted: Int? = 0
)