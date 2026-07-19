package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "schema_changes")
data class SchemaChangeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val change_description: String,
    val change_type: String,
    val changed_by: Int,
    val change_date: String? = "CURRENT_TIMESTAMP",
    val sql_script: String?,
    val version_from: String?,
    val version_to: String?,
    val archived: Int? = 0
)