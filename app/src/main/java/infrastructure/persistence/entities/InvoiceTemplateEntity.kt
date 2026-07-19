package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "invoice_templates")
data class InvoiceTemplateEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val template_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val template_name: String,
    val description: String?,
    val station_id: Int?,
    val template_html: String?,
    val template_css: String?,
    val variables: String?,
    val is_default: Int? = 0,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)