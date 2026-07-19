package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "vehicles")
data class VehicleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val vehicle_code: String,
    val party_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val plate_number: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val plate_number_ar: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val plate_country: String? = "Yemen",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val plate_city: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val vehicle_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val brand: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val model: String?,
    val year: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val color: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val engine_type: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val engine_capacity: Double?,
    val fuel_type_id: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tank_capacity: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val chassis_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val engine_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val registration_number: String?,
    val registration_expiry: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val insurance_number: String?,
    val insurance_expiry: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val rfid_tag: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val nfc_tag: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val current_odometer: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val last_odometer: Double? = 0,
    val odometer_updated_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val avg_consumption: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "active",
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val vehicle_photo: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val registration_doc: String?,
    val created_at: String? = "CURRENT_TIMESTAMP",
    val updated_at: String? = "CURRENT_TIMESTAMP",
    val deleted_at: String?,
    val created_by: Int?,
    val updated_by: Int?,
    val deleted_by: Int?,
    val is_deleted: Int? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val sync_status: String? = "synced",
    val sync_version: Int? = 1,
    val sync_at: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val device_id: String?,
    val remarks: String?,
    val extra_data: String?
)