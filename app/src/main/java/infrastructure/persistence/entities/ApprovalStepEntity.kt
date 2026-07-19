package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "approval_steps")
data class ApprovalStepEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val workflow_id: Int,
    val step_order: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val step_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val step_name_ar: String?,
    val role_id: Int?,
    val user_id: Int?,
    val is_parallel: Int? = 0,
    val timeout_hours: Int? = 24,
    val escalation_role_id: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)