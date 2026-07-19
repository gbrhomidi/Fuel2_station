package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "settings")
data class SettingEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val setting_key: String,
    val setting_value: String?,
    val setting_type: String? = "string",
    val description: String?,
    val is_editable: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP"
)