package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "restore_history")
data class RestoreHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val backup_id: Int?,
    val restore_date: String? = "CURRENT_TIMESTAMP",
    val restored_by: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "success",
    val error_message: String?,
    val notes: String?
)