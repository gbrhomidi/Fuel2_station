package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.FixedAssetEntity



@Dao
interface FixedAssetsDao {



    @Insert
    suspend fun insert(
        entity: FixedAssetEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<FixedAssetEntity>
    )



    @Update
    suspend fun update(
        entity: FixedAssetEntity
    )



    @Delete
    suspend fun delete(
        entity: FixedAssetEntity
    )



    @Query("SELECT * FROM fixed_assets")
    suspend fun getAll():
        List<FixedAssetEntity>



}
