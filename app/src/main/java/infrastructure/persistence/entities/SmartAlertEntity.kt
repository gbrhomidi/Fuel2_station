package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "smart_alerts")
data class SmartAlertEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val alert_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val alert_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val alert_name_ar: String?,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val severity: String? = "warning",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val condition_type: String,
    val condition_config: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String?,
    val is_active: Int? = 1,
    val trigger_action: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)