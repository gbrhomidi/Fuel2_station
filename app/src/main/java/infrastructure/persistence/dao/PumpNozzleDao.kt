package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.PumpNozzleEntity

@Dao
interface PumpNozzleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pumpNozzle: PumpNozzleEntity): Long


    @Update
    suspend fun update(pumpNozzle: PumpNozzleEntity)


    @Query(
        """
        SELECT
            id,
            uuid,
            nozzle_code,
            nozzle_number,
            pump_id,
            fuel_type_id,
            meter_start,
            meter_current,
            meter_last_reset,
            total_sold_liters,
            calibration_date,
            calibration_factor,
            accuracy_percentage,
            hose_length,
            auto_stop_enabled,
            status,
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
        FROM pump_nozzles
        WHERE is_deleted = 0
        """
    )
    suspend fun getAll(): List<PumpNozzleEntity>


    @Query(
        """
        SELECT
            id,
            uuid,
            nozzle_code,
            nozzle_number,
            pump_id,
            fuel_type_id,
            meter_start,
            meter_current,
            meter_last_reset,
            total_sold_liters,
            calibration_date,
            calibration_factor,
            accuracy_percentage,
            hose_length,
            auto_stop_enabled,
            status,
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
        FROM pump_nozzles
        WHERE id = :id
        AND is_deleted = 0
        """
    )
    suspend fun getById(id: Long): PumpNozzleEntity?


    @Query(
        """
        SELECT
            id,
            uuid,
            nozzle_code,
            nozzle_number,
            pump_id,
            fuel_type_id,
            meter_start,
            meter_current,
            meter_last_reset,
            total_sold_liters,
            calibration_date,
            calibration_factor,
            accuracy_percentage,
            hose_length,
            auto_stop_enabled,
            status,
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
        FROM pump_nozzles
        WHERE pump_id = :pumpId
        AND is_deleted = 0
        """
    )
    suspend fun getByPump(pumpId: Long): List<PumpNozzleEntity>


    @Query(
        """
        SELECT
            id,
            uuid,
            nozzle_code,
            nozzle_number,
            pump_id,
            fuel_type_id,
            meter_start,
            meter_current,
            meter_last_reset,
            total_sold_liters,
            calibration_date,
            calibration_factor,
            accuracy_percentage,
            hose_length,
            auto_stop_enabled,
            status,
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
        FROM pump_nozzles
        WHERE fuel_type_id = :fuelTypeId
        AND is_deleted = 0
        """
    )
    suspend fun getByFuelType(fuelTypeId: Long): List<PumpNozzleEntity>


    @Query(
        """
        UPDATE pump_nozzles
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
