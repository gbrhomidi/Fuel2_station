package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.PumpEntity

@Dao
interface PumpDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pump: PumpEntity): Long


    @Update
    suspend fun update(pump: PumpEntity)


    @Query(
        """
        SELECT
            id,
            uuid,
            pump_code,
            pump_number,
            pump_name,
            pump_name_ar,
            station_id,
            tank_id,
            serial_number,
            manufacturer,
            model,
            installation_date,
            max_flow_rate,
            meter_start,
            meter_current,
            meter_last_reset,
            status,
            status_reason,
            last_maintenance,
            next_maintenance,
            maintenance_interval,
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
        FROM pumps
        WHERE is_deleted = 0
        """
    )
    suspend fun getAll(): List<PumpEntity>


    @Query(
        """
        SELECT
            id,
            uuid,
            pump_code,
            pump_number,
            pump_name,
            pump_name_ar,
            station_id,
            tank_id,
            serial_number,
            manufacturer,
            model,
            installation_date,
            max_flow_rate,
            meter_start,
            meter_current,
            meter_last_reset,
            status,
            status_reason,
            last_maintenance,
            next_maintenance,
            maintenance_interval,
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
        FROM pumps
        WHERE id = :id
        AND is_deleted = 0
        """
    )
    suspend fun getById(id: Long): PumpEntity?


    @Query(
        """
        SELECT
            id,
            uuid,
            pump_code,
            pump_number,
            pump_name,
            pump_name_ar,
            station_id,
            tank_id,
            serial_number,
            manufacturer,
            model,
            installation_date,
            max_flow_rate,
            meter_start,
            meter_current,
            meter_last_reset,
            status,
            status_reason,
            last_maintenance,
            next_maintenance,
            maintenance_interval,
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
        FROM pumps
        WHERE station_id = :stationId
        AND is_deleted = 0
        """
    )
    suspend fun getByStation(stationId: Long): List<PumpEntity>


    @Query(
        """
        SELECT
            id,
            uuid,
            pump_code,
            pump_number,
            pump_name,
            pump_name_ar,
            station_id,
            tank_id,
            serial_number,
            manufacturer,
            model,
            installation_date,
            max_flow_rate,
            meter_start,
            meter_current,
            meter_last_reset,
            status,
            status_reason,
            last_maintenance,
            next_maintenance,
            maintenance_interval,
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
        FROM pumps
        WHERE tank_id = :tankId
        AND is_deleted = 0
        """
    )
    suspend fun getByTank(tankId: Long): List<PumpEntity>


    @Query(
        """
        UPDATE pumps
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
