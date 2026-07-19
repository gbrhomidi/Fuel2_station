package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "maintenance_history")
data class MaintenanceHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val maintenance_request_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val event_type: String,
    val event_description: String,
    val old_value: String?,
    val new_value: String?,
    val performed_by: Int,
    val performed_at: String? = "CURRENT_TIMESTAMP"
)