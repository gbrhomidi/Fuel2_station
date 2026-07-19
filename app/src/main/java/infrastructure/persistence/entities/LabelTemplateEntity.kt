package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "label_templates")
data class LabelTemplateEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val template_code: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val template_name: String,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val label_type: String? = "barcode",
    val template_data: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val width_mm: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val height_mm: Double?,
    val is_default: Int? = 0,
    val is_active: Int? = 1,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)