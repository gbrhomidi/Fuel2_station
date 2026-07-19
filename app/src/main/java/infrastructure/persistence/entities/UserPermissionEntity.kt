package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "user_permissions")
data class UserPermissionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val user_id: Int,
    val permission_id: Int,
    val is_granted: Int? = 1,
    val reason: String?,
    val set_by: Int?,
    val set_at: String? = "CURRENT_TIMESTAMP"
)