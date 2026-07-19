package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SyncConflictEntity



@Dao
interface SyncConflictsDao {



    @Insert
    suspend fun insert(
        entity: SyncConflictEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SyncConflictEntity>
    )



    @Update
    suspend fun update(
        entity: SyncConflictEntity
    )



    @Delete
    suspend fun delete(
        entity: SyncConflictEntity
    )



    @Query("SELECT * FROM sync_conflicts")
    suspend fun getAll():
        List<SyncConflictEntity>



}
