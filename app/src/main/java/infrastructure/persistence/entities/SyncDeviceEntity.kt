package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "sync_devices")
data class SyncDeviceEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val os_version: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val app_version: String?,
    val station_id: Int?,
    val last_sync_at: String?,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP"
)