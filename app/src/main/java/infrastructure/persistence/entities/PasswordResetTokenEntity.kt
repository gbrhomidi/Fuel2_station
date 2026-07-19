package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "password_reset_tokens")
data class PasswordResetTokenEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val user_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val token: String,
    val expires_at: String,
    val is_used: Int? = 0,
    val used_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val ip_address: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)