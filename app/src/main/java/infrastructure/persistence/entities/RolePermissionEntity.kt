package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "role_permissions")
data class RolePermissionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val role_id: Int,
    val permission_id: Int,
    val station_id: Int?,
    val branch_id: Int?,
    val can_create: Int? = 0,
    val can_read: Int? = 1,
    val can_update: Int? = 0,
    val can_delete: Int? = 0,
    val can_export: Int? = 0,
    val can_print: Int? = 0,
    val can_approve: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?,
    val is_deleted: Int? = 0
)