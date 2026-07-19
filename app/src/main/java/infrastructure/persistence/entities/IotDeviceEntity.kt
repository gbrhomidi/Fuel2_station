package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "iot_devices")
data class IotDeviceEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String,
    val entity_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val serial_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val model: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val manufacturer: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val firmware_version: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val ip_address: String?,
    val port: Int?,
    val last_communication: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    val config: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)