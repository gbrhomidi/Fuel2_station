package infrastructure.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
@Entity(tableName = "tank_refills")
data class TankRefillEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val uuid: String,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val refill_code: String,
    val tank_id: Int,
    val supplier_id: Int?,
    val station_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val tanker_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val tanker_driver: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val tanker_driver_phone: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val seal_number: String?,
    val fuel_type_id: Int,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val ordered_quantity: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val delivered_quantity: Double,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val actual_quantity: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val quantity_difference: Double?,
    val unloading_start: String?,
    val unloading_end: String?,
    val unloading_duration: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tank_level_before: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tank_level_after: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val fuel_density: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val fuel_temperature: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val quality_certificate: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val lab_test_result: String? = "pending",
    val lab_test_notes: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val unit_price: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val total_amount: Double?,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val transport_cost: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val discount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val tax_amount: Double? = 0,
    @ColumnInfo(typeAffinity = ColumnInfo.REAL)
    val net_amount: Double?,
    val currency_id: Int?,
    val order_date: String?,
    val expected_date: String?,
    val arrival_date: String?,
    val received_by: Int?,
    val approved_by: Int?,
    val inspected_by: Int?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val status: String? = "pending",
    val rejection_reason: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val invoice_number: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val invoice_path: String?,
    @ColumnInfo(typeAffinity = ColumnInfo.TEXT)
    val delivery_note_path: String?,
    val photos: String?,
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