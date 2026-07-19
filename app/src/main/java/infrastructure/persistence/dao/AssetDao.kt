package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.AssetEntity



@Dao
interface AssetDao {



    @Insert
    suspend fun insert(
        entity: AssetEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<AssetEntity>
    )



    @Update
    suspend fun update(
        entity: AssetEntity
    )



    @Delete
    suspend fun delete(
        entity: AssetEntity
    )



    @Query("SELECT * FROM assets")
    suspend fun getAll():
        List<AssetEntity>



}
