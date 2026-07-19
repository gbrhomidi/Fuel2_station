package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.BackupHistoryEntity



@Dao
interface BackupHistoryDao {



    @Insert
    suspend fun insert(
        entity: BackupHistoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<BackupHistoryEntity>
    )



    @Update
    suspend fun update(
        entity: BackupHistoryEntity
    )



    @Delete
    suspend fun delete(
        entity: BackupHistoryEntity
    )



    @Query("SELECT * FROM backup_history")
    suspend fun getAll():
        List<BackupHistoryEntity>



}
