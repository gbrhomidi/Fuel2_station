package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "user_settings")
data class UserSettingEntity(
    @PrimaryKey
    val user_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val language: String? = "ar",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val timezone: String? = "Asia/Riyadh",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val date_format: String? = "dd/MM/yyyy",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val time_format: String? = "HH:mm",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val theme: String? = "light",
    val alert_types: String?,
    val notification_channels: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val default_filter: String? = "all",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val default_time_filter: String? = "today",
    val display_limit: Int? = 10,
    val critical_threshold: Int? = 30,
    val preferred_product_id: Int?,
    val preferred_warehouse_id: Int?
)