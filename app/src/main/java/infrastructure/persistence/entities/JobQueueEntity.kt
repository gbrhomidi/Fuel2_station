package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "job_queue")
data class JobQueueEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_type: String,
    val job_data: String?,
    val priority: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "pending",
    val started_at: String?,
    val completed_at: String?,
    val retry_count: Int? = 0,
    val max_retries: Int? = 3,
    val error_message: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)