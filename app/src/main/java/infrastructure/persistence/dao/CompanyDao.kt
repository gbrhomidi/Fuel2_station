package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.CompanyEntity

@Dao
interface CompanyDao {
    @Insert
    suspend fun insert(company: CompanyEntity): Long

    @Update
    suspend fun update(company: CompanyEntity)

    @Query("""
        SELECT 
            id, uuid, company_code, company_name, company_name_ar, trade_license_number, 
            tax_number, vat_number, registration_date, expiry_date, legal_form, website, 
            email, phone, fax, address_line_1, address_line_2, city, state, postal_code, 
            country, latitude, longitude, logo_path, owner_name, owner_phone, manager_name, 
            manager_phone, capital_amount, bank_name, bank_account_number, iban, swift_code, 
            is_active, status, status_reason, created_at, updated_at, deleted_at, 
            created_by, updated_by, deleted_by, is_deleted, sync_status, sync_version, 
            sync_at, device_id, remarks
        FROM companies
        WHERE id = :id AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(id: Long): CompanyEntity?

    @Query("""
        SELECT 
            id, uuid, company_code, company_name, company_name_ar, trade_license_number, 
            tax_number, vat_number, registration_date, expiry_date, legal_form, website, 
            email, phone, fax, address_line_1, address_line_2, city, state, postal_code, 
            country, latitude, longitude, logo_path, owner_name, owner_phone, manager_name, 
            manager_phone, capital_amount, bank_name, bank_account_number, iban, swift_code, 
            is_active, status, status_reason, created_at, updated_at, deleted_at, 
            created_by, updated_by, deleted_by, is_deleted, sync_status, sync_version, 
            sync_at, device_id, remarks
        FROM companies
        WHERE company_code = :code AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByCode(code: String): CompanyEntity?

    @Query("""
        SELECT 
            id, uuid, company_code, company_name, company_name_ar, trade_license_number, 
            tax_number, vat_number, registration_date, expiry_date, legal_form, website, 
            email, phone, fax, address_line_1, address_line_2, city, state, postal_code, 
            country, latitude, longitude, logo_path, owner_name, owner_phone, manager_name, 
            manager_phone, capital_amount, bank_name, bank_account_number, iban, swift_code, 
            is_active, status, status_reason, created_at, updated_at, deleted_at, 
            created_by, updated_by, deleted_by, is_deleted, sync_status, sync_version, 
            sync_at, device_id, remarks
        FROM companies
        WHERE is_deleted = 0
        ORDER BY id ASC
    """)
    suspend fun findAll(): List<CompanyEntity>
}
