package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "customer_followups")
data class CustomerFollowupEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val party_id: Int,
    val followup_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val followup_type: String,
    val description: String?,
    val reminder_date: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "pending",
    val assigned_to: Int?,
    val created_by: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP"
)