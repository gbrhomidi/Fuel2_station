package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DimProductEntity



@Dao
interface DimProductDao {



    @Insert
    suspend fun insert(
        entity: DimProductEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DimProductEntity>
    )



    @Update
    suspend fun update(
        entity: DimProductEntity
    )



    @Delete
    suspend fun delete(
        entity: DimProductEntity
    )



    @Query("SELECT * FROM dim_product")
    suspend fun getAll():
        List<DimProductEntity>



}
