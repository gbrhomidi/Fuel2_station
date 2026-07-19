package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "dim_customer")
data class DimCustomerEntity(
    @PrimaryKey(autoGenerate = true)
    val customer_dim_id: Int,
    val party_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val customer_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val full_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val customer_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val city: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val country: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)