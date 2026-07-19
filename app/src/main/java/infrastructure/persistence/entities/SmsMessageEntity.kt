package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "sms_messages")
data class SmsMessageEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val phone_number: String,
    val message_body: String,
    val message_type: String? = "incoming",
    val status: String? = "pending",
    val party_id: Int?,
    val sent_at: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP"
)