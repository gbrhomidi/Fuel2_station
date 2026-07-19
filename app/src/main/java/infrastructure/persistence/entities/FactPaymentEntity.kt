package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "fact_payments")
data class FactPaymentEntity(
    @PrimaryKey(autoGenerate = true)
    val fact_id: Int,
    val payment_id: Int,
    val date_id: Int,
    val party_id: Int?,
    val station_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val amount: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_method: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val payment_type: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)