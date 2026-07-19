package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "approval_workflows")
data class ApprovalWorkflowEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val workflow_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val workflow_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val workflow_name_ar: String?,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)