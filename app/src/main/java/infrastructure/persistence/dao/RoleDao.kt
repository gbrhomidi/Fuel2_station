package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.RoleEntity

@Dao
interface RoleDao {

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insert(role: RoleEntity): Long

    @Update
    suspend fun update(role: RoleEntity)

    @Query("""
        SELECT id, uuid, role_code, role_name, role_name_ar, description, description_ar,
               level, parent_role_id, is_system_role, is_active,
               created_at, updated_at, deleted_at, is_deleted, sync_status, sync_version,
               sync_at, device_id, remarks, extra_data
        FROM roles
        WHERE id = :id AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findById(id: Long): RoleEntity?

    @Query("""
        SELECT id, uuid, role_code, role_name, role_name_ar, description, description_ar,
               level, parent_role_id, is_system_role, is_active,
               created_at, updated_at, deleted_at, is_deleted, sync_status, sync_version,
               sync_at, device_id, remarks, extra_data
        FROM roles
        WHERE role_code = :code AND is_deleted = 0
        LIMIT 1
    """)
    suspend fun findByCode(code: String): RoleEntity?

    @Query("""
        SELECT id, uuid, role_code, role_name, role_name_ar, description, description_ar,
               level, parent_role_id, is_system_role, is_active,
               created_at, updated_at, deleted_at, is_deleted, sync_status, sync_version,
               sync_at, device_id, remarks, extra_data
        FROM roles
        WHERE is_deleted = 0
        ORDER BY level ASC, role_name ASC
    """)
    suspend fun findAll(): List<RoleEntity>

    @Query("UPDATE roles SET is_deleted = 1, deleted_at = datetime('now') WHERE id = :id")
    suspend fun softDelete(id: Long)
}
