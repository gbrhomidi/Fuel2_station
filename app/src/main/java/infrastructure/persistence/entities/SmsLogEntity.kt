package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "sms_logs")
data class SmsLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val customer_party_id: Int?,
    val reminder_id: Int?,
    val phone_number: String,
    val message_content: String,
    val message_type: String? = "reminder",
    val gateway_type: String? = "android_app",
    val gateway_response: String?,
    val device_id: String?,
    val sim_slot: Int? = 1,
    val status: String? = "queued",
    val sent_at: String?,
    val delivered_at: String?,
    val error_message: String?,
    val cost: Double? = 0,
    val created_by: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)