package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "groups_table")
data class GroupsTableEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val group_name: String,
    val description: String?,
    val is_active: Int? = 1,
    val archived: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP"
)