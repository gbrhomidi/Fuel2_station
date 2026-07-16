package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "pump_nozzles",
    foreignKeys = [
        ForeignKey(
            entity = PumpEntity::class,
            parentColumns = ["id"],
            childColumns = ["pump_id"],
            onDelete = ForeignKey.RESTRICT
        ),
        ForeignKey(
            entity = FuelTypeEntity::class,
            parentColumns = ["id"],
            childColumns = ["fuel_type_id"],
            onDelete = ForeignKey.RESTRICT
        ),
        ForeignKey(
            entity = UserEntity::class,
            parentColumns = ["id"],
            childColumns = ["created_by"],
            onDelete = ForeignKey.RESTRICT
        )
    ],
    indices = [
        Index(value = ["uuid"], unique = true),
        Index(value = ["nozzle_code"], unique = true)
    ]
)
data class PumpNozzleEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long = 0,

    @ColumnInfo(name = "uuid")
    val uuid: String,

    @ColumnInfo(name = "nozzle_code")
    val nozzleCode: String,

    @ColumnInfo(name = "nozzle_number")
    val nozzleNumber: String,

    @ColumnInfo(name = "pump_id")
    val pumpId: Long,

    @ColumnInfo(name = "fuel_type_id")
    val fuelTypeId: Long,

    @ColumnInfo(name = "meter_start")
    val meterStart: Double = 0.0,

    @ColumnInfo(name = "meter_current")
    val meterCurrent: Double = 0.0,

    @ColumnInfo(name = "meter_last_reset")
    val meterLastReset: String? = null,

    @ColumnInfo(name = "total_sold_liters")
    val totalSoldLiters: Double = 0.0,

    @ColumnInfo(name = "calibration_date")
    val calibrationDate: String? = null,

    @ColumnInfo(name = "calibration_factor")
    val calibrationFactor: Double = 1.0,

    @ColumnInfo(name = "accuracy_percentage")
    val accuracyPercentage: Double = 100.0,

    @ColumnInfo(name = "hose_length")
    val hoseLength: Double? = null,

    @ColumnInfo(name = "auto_stop_enabled")
    val autoStopEnabled: Int = 1,

    @ColumnInfo(name = "status")
    val status: String = "active",

    @ColumnInfo(name = "created_at")
    val createdAt: String? = null,

    @ColumnInfo(name = "updated_at")
    val updatedAt: String? = null,

    @ColumnInfo(name = "deleted_at")
    val deletedAt: String? = null,

    @ColumnInfo(name = "created_by")
    val createdBy: Long? = null,

    @ColumnInfo(name = "updated_by")
    val updatedBy: Long? = null,

    @ColumnInfo(name = "deleted_by")
    val deletedBy: Long? = null,

    @ColumnInfo(name = "is_deleted")
    val isDeleted: Int = 0,

    @ColumnInfo(name = "sync_status")
    val syncStatus: String = "synced",

    @ColumnInfo(name = "sync_version")
    val syncVersion: Int = 1,

    @ColumnInfo(name = "sync_at")
    val syncAt: String? = null,

    @ColumnInfo(name = "device_id")
    val deviceId: String? = null,

    @ColumnInfo(name = "remarks")
    val remarks: String? = null,

    @ColumnInfo(name = "extra_data")
    val extraData: String? = null
)
