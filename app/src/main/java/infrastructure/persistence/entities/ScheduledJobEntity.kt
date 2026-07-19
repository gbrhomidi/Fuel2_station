package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "scheduled_jobs")
data class ScheduledJobEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_name: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_name_ar: String?,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val job_class: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val schedule_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val cron_expression: String?,
    val interval_seconds: Int?,
    val run_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val timezone: String? = "UTC",
    val enabled: Int? = 1,
    val last_run_at: String?,
    val next_run_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val last_run_status: String?,
    val last_run_error: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)