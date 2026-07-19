package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "dim_station")
data class DimStationEntity(
    @PrimaryKey(autoGenerate = true)
    val station_dim_id: Int,
    val station_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val station_code: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val station_name: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val city: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val country: String?,
    val created_at: String? = "CURRENT_TIMESTAMP"
)