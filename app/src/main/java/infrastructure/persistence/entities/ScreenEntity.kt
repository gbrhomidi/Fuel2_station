package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "screens")
data class ScreenEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val screen_name: String,
    val module: String?,
    val description: String?,
    val is_active: Int? = 1,
    val archived: Int? = 0,
    val created_at: String? = "CURRENT_TIMESTAMP"
)