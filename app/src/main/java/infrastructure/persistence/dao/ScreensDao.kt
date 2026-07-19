package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ScreenEntity



@Dao
interface ScreensDao {



    @Insert
    suspend fun insert(
        entity: ScreenEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ScreenEntity>
    )



    @Update
    suspend fun update(
        entity: ScreenEntity
    )



    @Delete
    suspend fun delete(
        entity: ScreenEntity
    )



    @Query("SELECT * FROM screens")
    suspend fun getAll():
        List<ScreenEntity>



}
