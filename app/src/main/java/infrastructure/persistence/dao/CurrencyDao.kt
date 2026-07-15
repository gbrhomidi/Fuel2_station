package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.CurrencyEntity

@Dao
interface CurrencyDao {
    @Insert
    suspend fun insert(currency: CurrencyEntity): Long

    @Update
    suspend fun update(currency: CurrencyEntity)

    @Query("""
        SELECT 
            id, uuid, currency_code, currency_name, currency_name_ar, currency_symbol, 
            exchange_rate, is_default, decimal_places, status, status_reason, 
            created_at, updated_at, deleted_at, created_by, updated_by, deleted_by, 
            is_deleted, sync_status, sync_version, sync_at, device_id, remarks, extra_data
        FROM currencies
        WHERE id = :id AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(id: Long): CurrencyEntity?

    @Query("""
        SELECT 
            id, uuid, currency_code, currency_name, currency_name_ar, currency_symbol, 
            exchange_rate, is_default, decimal_places, status, status_reason, 
            created_at, updated_at, deleted_at, created_by, updated_by, deleted_by, 
            is_deleted, sync_status, sync_version, sync_at, device_id, remarks, extra_data
        FROM currencies
        WHERE currency_code = :code AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByCode(code: String): CurrencyEntity?

    @Query("""
        SELECT 
            id, uuid, currency_code, currency_name, currency_name_ar, currency_symbol, 
            exchange_rate, is_default, decimal_places, status, status_reason, 
            created_at, updated_at, deleted_at, created_by, updated_by, deleted_by, 
            is_deleted, sync_status, sync_version, sync_at, device_id, remarks, extra_data
        FROM currencies
        WHERE is_default = 1 AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findDefaultCurrency(): CurrencyEntity?

    @Query("""
        SELECT 
            id, uuid, currency_code, currency_name, currency_name_ar, currency_symbol, 
            exchange_rate, is_default, decimal_places, status, status_reason, 
            created_at, updated_at, deleted_at, created_by, updated_by, deleted_by, 
            is_deleted, sync_status, sync_version, sync_at, device_id, remarks, extra_data
        FROM currencies
        WHERE is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findAll(): List<CurrencyEntity>
}
