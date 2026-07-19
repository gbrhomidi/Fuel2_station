package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "customer_calls")
data class CustomerCallEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val party_id: Int,
    val call_date: String? = "CURRENT_TIMESTAMP",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val caller: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val receiver: String?,
    val duration_seconds: Int?,
    val topic: String?,
    val summary: String?,
    val is_outgoing: Int? = 1,
    val created_by: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)