package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DimDateEntity



@Dao
interface DimDateDao {



    @Insert
    suspend fun insert(
        entity: DimDateEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DimDateEntity>
    )



    @Update
    suspend fun update(
        entity: DimDateEntity
    )



    @Delete
    suspend fun delete(
        entity: DimDateEntity
    )



    @Query("SELECT * FROM dim_date")
    suspend fun getAll():
        List<DimDateEntity>



}
