package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "dim_product")
data class DimProductEntity(
    @PrimaryKey(autoGenerate = true)
    val product_dim_id: Int,
    val product_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val product_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val product_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val category_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val product_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val unit: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)