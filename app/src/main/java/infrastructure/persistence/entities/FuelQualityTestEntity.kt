package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "fuel_quality_tests")
data class FuelQualityTestEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    val refill_id: Int,
    val test_date: String? = "CURRENT_TIMESTAMP",
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val density: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val temperature: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val water_content: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val sulfur_content: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val viscosity: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val flash_point: Double?,
    val cetane_number: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val result: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val certificate_url: String?,
    val tested_by: Int?,
    val notes: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)