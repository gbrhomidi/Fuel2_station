package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "receipt_templates")
data class ReceiptTemplateEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val template_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val template_name: String,
    val description: String?,
    val station_id: Int?,
    val header: String?,
    val body: String?,
    val footer: String?,
    val variables: String?,
    val paper_width: Int? = 80,
    val font_size: Int? = 12,
    val is_default: Int? = 0,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)