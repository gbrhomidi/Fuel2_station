package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "smart_alert_logs")
data class SmartAlertLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val alert_id: Int,
    val entity_id: Int?,
    val detected_value: String?,
    val triggered_at: String? = "CURRENT_TIMESTAMP",
    val is_resolved: Int? = 0,
    val resolved_at: String?,
    val resolved_by: Int?,
    val resolution_notes: String?
)