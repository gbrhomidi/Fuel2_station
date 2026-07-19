package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "printer_profiles")
data class PrinterProfileEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val profile_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val profile_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val printer_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val printer_type: String? = "thermal",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val connection_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val ip_address: String?,
    val port: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val mac_address: String?,
    val paper_width: Int?,
    val paper_height: Int?,
    val dpi: Int? = 203,
    val driver_settings: String?,
    val is_default: Int? = 0,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)