package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "predictions")
data class PredictionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val prediction_type: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val entity_type: String?,
    val entity_id: Int?,
    val prediction_date: String,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val predicted_value: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val confidence_interval_low: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val confidence_interval_high: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val actual_value: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val model_version: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val created_by: Int?
)