package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "barcode_history")
data class BarcodeHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val barcode: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val qr_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String,
    val entity_id: Int,
    val generated_at: String? = "CURRENT_TIMESTAMP",
    val generated_by: Int?,
    val is_active: Int? = 1,
    val expires_at: String?
)