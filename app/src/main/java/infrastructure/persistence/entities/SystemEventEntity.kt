package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "system_events")
data class SystemEventEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val event_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val event_source: String?,
    val event_data: String?,
    val user_id: Int?,
    val station_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val ip_address: String?,
    val is_processed: Int? = 0,
    val processed_at: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)