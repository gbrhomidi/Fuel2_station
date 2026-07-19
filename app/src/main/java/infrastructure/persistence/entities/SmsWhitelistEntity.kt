package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "sms_whitelist")
data class SmsWhitelistEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val phone: String,
    val name: String?,
    val enabled: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP"
)