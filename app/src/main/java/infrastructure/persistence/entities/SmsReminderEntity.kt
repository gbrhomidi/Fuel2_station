package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "sms_reminders")
data class SmsReminderEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val customer_party_id: Int,
    val transaction_id: Int,
    val reminder_type: String? = "due_date",
    val reminder_date: String,
    val days_before_due: Int? = 2,
    val message_content: String?,
    val message_template: String? = "default",
    val status: String? = "pending",
    val retry_count: Int? = 0,
    val max_retries: Int? = 3,
    val sent_at: String?,
    val sms_provider_response: String?,
    val error_message: String?,
    val created_by: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)