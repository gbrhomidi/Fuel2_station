package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.AuditLogEntity



@Dao
interface AuditLogDao {



    @Insert
    suspend fun insert(
        entity: AuditLogEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<AuditLogEntity>
    )



    @Update
    suspend fun update(
        entity: AuditLogEntity
    )



    @Delete
    suspend fun delete(
        entity: AuditLogEntity
    )



    @Query("SELECT * FROM audit_logs")
    suspend fun getAll():
        List<AuditLogEntity>



}
