package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.FuelTypeEntity

@Dao
interface FuelTypeDao {
    @Insert
    suspend fun insert(fuelType: FuelTypeEntity): Long

    @Update
    suspend fun update(fuelType: FuelTypeEntity)

    @Query("""
        SELECT 
            id, uuid, fuel_code, fuel_name, fuel_name_ar, description, density_standard, 
            temperature_standard, flash_point, default_sale_price, default_purchase_price, 
            tax_rate, vat_rate, color_code, icon_path, is_active, created_at, updated_at, 
            deleted_at, created_by, updated_by, deleted_by, is_deleted, sync_status, 
            sync_version, sync_at, device_id, remarks, extra_data
        FROM fuel_types
        WHERE id = :id AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(id: Long): FuelTypeEntity?

    @Query("""
        SELECT 
            id, uuid, fuel_code, fuel_name, fuel_name_ar, description, density_standard, 
            temperature_standard, flash_point, default_sale_price, default_purchase_price, 
            tax_rate, vat_rate, color_code, icon_path, is_active, created_at, updated_at, 
            deleted_at, created_by, updated_by, deleted_by, is_deleted, sync_status, 
            sync_version, sync_at, device_id, remarks, extra_data
        FROM fuel_types
        WHERE fuel_code = :code AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByCode(code: String): FuelTypeEntity?

    @Query("""
        SELECT 
            id, uuid, fuel_code, fuel_name, fuel_name_ar, description, density_standard, 
            temperature_standard, flash_point, default_sale_price, default_purchase_price, 
            tax_rate, vat_rate, color_code, icon_path, is_active, created_at, updated_at, 
            deleted_at, created_by, updated_by, deleted_by, is_deleted, sync_status, 
            sync_version, sync_at, device_id, remarks, extra_data
        FROM fuel_types
        WHERE is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findAll(): List<FuelTypeEntity>
}
