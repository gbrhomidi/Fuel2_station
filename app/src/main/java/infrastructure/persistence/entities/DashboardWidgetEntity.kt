package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "dashboard_widgets")
data class DashboardWidgetEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val user_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val widget_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val widget_title: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val widget_title_ar: String?,
    val position_x: Int? = 0,
    val position_y: Int? = 0,
    val width: Int? = 2,
    val height: Int? = 2,
    val config: String?,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP"
)