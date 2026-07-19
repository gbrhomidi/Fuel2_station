package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "field_permissions")
data class FieldPermissionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val role_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val table_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val field_name: String,
    val can_view: Int? = 1,
    val can_edit: Int? = 0,
    val can_hide: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)