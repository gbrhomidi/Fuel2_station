package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PumpEntity



@Dao
interface PumpsDao {



    @Insert
    suspend fun insert(
        entity: PumpEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PumpEntity>
    )



    @Update
    suspend fun update(
        entity: PumpEntity
    )



    @Delete
    suspend fun delete(
        entity: PumpEntity
    )



    @Query("SELECT * FROM pumps")
    suspend fun getAll():
        List<PumpEntity>



}
