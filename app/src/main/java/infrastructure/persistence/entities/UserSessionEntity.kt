package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "user_sessions")
data class UserSessionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val user_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val session_token: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val refresh_token: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_os: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_browser: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val ip_address: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val location_country: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val location_city: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val latitude: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val longitude: Double?,
    val login_at: String? = "CURRENT_TIMESTAMP",
    val last_activity_at: String? = "CURRENT_TIMESTAMP",
    val expires_at: String,
    val logout_at: String?,
    val is_active: Int? = 1,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val logout_reason: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)