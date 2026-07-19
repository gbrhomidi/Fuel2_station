package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "terminals")
data class TerminalEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val station_id: Int,
    val terminal_code: String,
    val name: String?,
    val ip_address: String?,
    val mac_address: String?,
    val device_serial: String?,
    val status: String? = "active",
    val last_sync_at: String?,
    val is_deleted: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP"
)