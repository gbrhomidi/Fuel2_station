package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.TankEntity

@Dao
interface TankDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(tank: TankEntity): Long


    @Update
    suspend fun update(tank: TankEntity)


    @Query(
        """
        SELECT
            id,
            uuid,
            tank_code,
            tank_name,
            tank_name_ar,
            station_id,
            fuel_type_id,
            capacity_liters,
            minimum_level,
            maximum_level,
            current_quantity,
            usable_capacity,
            dead_volume,
            tank_shape,
            length_meters,
            diameter_meters,
            height_meters,
            location,
            installation_date,
            manufacturer,
            serial_number,
            model,
            sensor_serial,
            sensor_type,
            sensor_calibration_date,
            sensor_accuracy,
            leak_detection,
            overfill_protection,
            emergency_valve,
            last_inspection_date,
            next_inspection_date,
            inspection_certificate,
            status,
            status_reason,
            created_at,
            updated_at,
            deleted_at,
            created_by,
            updated_by,
            deleted_by,
            is_deleted,
            sync_status,
            sync_version,
            sync_at,
            device_id,
            remarks,
            extra_data
        FROM tanks
        WHERE is_deleted = 0
        """
    )
    suspend fun getAll(): List<TankEntity>


    @Query(
        """
        SELECT
            id,
            uuid,
            tank_code,
            tank_name,
            tank_name_ar,
            station_id,
            fuel_type_id,
            capacity_liters,
            minimum_level,
            maximum_level,
            current_quantity,
            usable_capacity,
            dead_volume,
            tank_shape,
            length_meters,
            diameter_meters,
            height_meters,
            location,
            installation_date,
            manufacturer,
            serial_number,
            model,
            sensor_serial,
            sensor_type,
            sensor_calibration_date,
            sensor_accuracy,
            leak_detection,
            overfill_protection,
            emergency_valve,
            last_inspection_date,
            next_inspection_date,
            inspection_certificate,
            status,
            status_reason,
            created_at,
            updated_at,
            deleted_at,
            created_by,
            updated_by,
            deleted_by,
            is_deleted,
            sync_status,
            sync_version,
            sync_at,
            device_id,
            remarks,
            extra_data
        FROM tanks
        WHERE id = :id
        AND is_deleted = 0
        """
    )
    suspend fun getById(id: Long): TankEntity?


    @Query(
        """
        SELECT
            id,
            uuid,
            tank_code,
            tank_name,
            tank_name_ar,
            station_id,
            fuel_type_id,
            capacity_liters,
            minimum_level,
            maximum_level,
            current_quantity,
            usable_capacity,
            dead_volume,
            tank_shape,
            length_meters,
            diameter_meters,
            height_meters,
            location,
            installation_date,
            manufacturer,
            serial_number,
            model,
            sensor_serial,
            sensor_type,
            sensor_calibration_date,
            sensor_accuracy,
            leak_detection,
            overfill_protection,
            emergency_valve,
            last_inspection_date,
            next_inspection_date,
            inspection_certificate,
            status,
            status_reason,
            created_at,
            updated_at,
            deleted_at,
            created_by,
            updated_by,
            deleted_by,
            is_deleted,
            sync_status,
            sync_version,
            sync_at,
            device_id,
            remarks,
            extra_data
        FROM tanks
        WHERE station_id = :stationId
        AND is_deleted = 0
        """
    )
    suspend fun getByStation(stationId: Long): List<TankEntity>


    @Query(
        """
        UPDATE tanks
        SET
            is_deleted = 1,
            deleted_at = :deletedAt,
            deleted_by = :deletedBy
        WHERE id = :id
        AND is_deleted = 0
        """
    )
    suspend fun softDelete(
        id: Long,
        deletedAt: String,
        deletedBy: Long?
    )
}
