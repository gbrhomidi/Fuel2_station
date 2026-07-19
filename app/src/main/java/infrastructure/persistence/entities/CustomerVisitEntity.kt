package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "customer_visits")
data class CustomerVisitEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val party_id: Int,
    val visit_date: String? = "CURRENT_TIMESTAMP",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val visit_type: String,
    val purpose: String?,
    val outcome: String?,
    val notes: String?,
    val visited_by: Int?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)