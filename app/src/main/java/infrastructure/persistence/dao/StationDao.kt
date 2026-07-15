package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.StationEntity

@Dao
interface StationDao {
    @Insert
    suspend fun insert(station: StationEntity): Long

    @Update
    suspend fun update(station: StationEntity)

    @Query("""
        SELECT 
            id, uuid, company_id, default_currency_id, station_code, station_name, 
            station_name_ar, license_number, tax_number, phone, email, address_line_1, 
            address_line_2, city, state, country, postal_code, latitude, longitude, 
            manager_name, manager_phone, operating_hours, storage_capacity, number_of_pumps, 
            number_of_tanks, has_convenience_store, has_car_wash, has_service_bay, 
            electricity_provider, water_provider, generator_details, pos_system_name, 
            internet_provider, safety_certificate_number, safety_certificate_expiry, 
            insurance_policy_number, insurance_expiry_date, commission_rate, is_active, 
            status, status_reason, created_at, updated_at, deleted_at, created_by, 
            updated_by, deleted_by, is_deleted, sync_status, sync_version, sync_at, 
            device_id, remarks, extra_data
        FROM stations
        WHERE id = :id AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(id: Long): StationEntity?

    @Query("""
        SELECT 
            id, uuid, company_id, default_currency_id, station_code, station_name, 
            station_name_ar, license_number, tax_number, phone, email, address_line_1, 
            address_line_2, city, state, country, postal_code, latitude, longitude, 
            manager_name, manager_phone, operating_hours, storage_capacity, number_of_pumps, 
            number_of_tanks, has_convenience_store, has_car_wash, has_service_bay, 
            electricity_provider, water_provider, generator_details, pos_system_name, 
            internet_provider, safety_certificate_number, safety_certificate_expiry, 
            insurance_policy_number, insurance_expiry_date, commission_rate, is_active, 
            status, status_reason, created_at, updated_at, deleted_at, created_by, 
            updated_by, deleted_by, is_deleted, sync_status, sync_version, sync_at, 
            device_id, remarks, extra_data
        FROM stations
        WHERE station_code = :code AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByCode(code: String): StationEntity?

    @Query("""
        SELECT 
            id, uuid, company_id, default_currency_id, station_code, station_name, 
            station_name_ar, license_number, tax_number, phone, email, address_line_1, 
            address_line_2, city, state, country, postal_code, latitude, longitude, 
            manager_name, manager_phone, operating_hours, storage_capacity, number_of_pumps, 
            number_of_tanks, has_convenience_store, has_car_wash, has_service_bay, 
            electricity_provider, water_provider, generator_details, pos_system_name, 
            internet_provider, safety_certificate_number, safety_certificate_expiry, 
            insurance_policy_number, insurance_expiry_date, commission_rate, is_active, 
            status, status_reason, created_at, updated_at, deleted_at, created_by, 
            updated_by, deleted_by, is_deleted, sync_status, sync_version, sync_at, 
            device_id, remarks, extra_data
        FROM stations
        WHERE company_id = :companyId AND is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findByCompany(companyId: Long): List<StationEntity>

    @Query("""
        SELECT 
            id, uuid, company_id, default_currency_id, station_code, station_name, 
            station_name_ar, license_number, tax_number, phone, email, address_line_1, 
            address_line_2, city, state, country, postal_code, latitude, longitude, 
            manager_name, manager_phone, operating_hours, storage_capacity, number_of_pumps, 
            number_of_tanks, has_convenience_store, has_car_wash, has_service_bay, 
            electricity_provider, water_provider, generator_details, pos_system_name, 
            internet_provider, safety_certificate_number, safety_certificate_expiry, 
            insurance_policy_number, insurance_expiry_date, commission_rate, is_active, 
            status, status_reason, created_at, updated_at, deleted_at, created_by, 
            updated_by, deleted_by, is_deleted, sync_status, sync_version, sync_at, 
            device_id, remarks, extra_data
        FROM stations
        WHERE is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findAll(): List<StationEntity>
}
