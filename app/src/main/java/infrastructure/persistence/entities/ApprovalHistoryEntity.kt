package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "approval_history")
data class ApprovalHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val workflow_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String,
    val entity_id: Int,
    val current_step_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "pending",
    val requested_by: Int,
    val requested_at: String? = "CURRENT_TIMESTAMP",
    val approved_by: Int?,
    val approved_at: String?,
    val rejection_reason: String?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)