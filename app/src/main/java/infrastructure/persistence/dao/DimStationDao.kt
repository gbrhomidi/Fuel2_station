package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DimStationEntity



@Dao
interface DimStationDao {



    @Insert
    suspend fun insert(
        entity: DimStationEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DimStationEntity>
    )



    @Update
    suspend fun update(
        entity: DimStationEntity
    )



    @Delete
    suspend fun delete(
        entity: DimStationEntity
    )



    @Query("SELECT * FROM dim_station")
    suspend fun getAll():
        List<DimStationEntity>



}
