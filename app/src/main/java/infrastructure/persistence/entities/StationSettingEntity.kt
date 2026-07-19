package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "station_settings")
data class StationSettingEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val station_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val setting_key: String,
    val setting_value: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val data_type: String? = "string",
    val description: String?,
    val updated_by: Int?,
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_at: String? = "CURRENT_TIMESTAMP"
)