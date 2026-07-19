package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "system_settings")
data class SystemSettingEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val setting_key: String,
    val setting_value: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category: String? = "general",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val data_type: String? = "string",
    val is_encrypted: Int? = 0,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val setting_group: String?,
    val is_public: Int? = 0,
    val updated_by: Int?,
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val archived: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP"
)