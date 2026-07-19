package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "customer_complaints")
data class CustomerComplaintEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val party_id: Int,
    val complaint_date: String? = "CURRENT_TIMESTAMP",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val complaint_type: String?,
    val description: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val priority: String? = "medium",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "open",
    val resolution: String?,
    val resolved_date: String?,
    val resolved_by: Int?,
    val created_by: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)