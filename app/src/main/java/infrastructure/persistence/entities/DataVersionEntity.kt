package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "data_versions")
data class DataVersionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val table_name: String,
    val record_id: Int,
    val version_number: Int,
    val old_row_json: String,
    val new_row_json: String,
    val changed_columns: String?,
    val change_reason: String?,
    val changed_by: Int,
    val changed_at: String? = "CURRENT_TIMESTAMP",
    val is_active: Int? = 1
)