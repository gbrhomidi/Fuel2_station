package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.RestoreHistoryEntity



@Dao
interface RestoreHistoryDao {



    @Insert
    suspend fun insert(
        entity: RestoreHistoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<RestoreHistoryEntity>
    )



    @Update
    suspend fun update(
        entity: RestoreHistoryEntity
    )



    @Delete
    suspend fun delete(
        entity: RestoreHistoryEntity
    )



    @Query("SELECT * FROM restore_history")
    suspend fun getAll():
        List<RestoreHistoryEntity>



}
