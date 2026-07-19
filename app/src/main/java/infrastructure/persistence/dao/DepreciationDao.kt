package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DepreciationEntity



@Dao
interface DepreciationDao {



    @Insert
    suspend fun insert(
        entity: DepreciationEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DepreciationEntity>
    )



    @Update
    suspend fun update(
        entity: DepreciationEntity
    )



    @Delete
    suspend fun delete(
        entity: DepreciationEntity
    )



    @Query("SELECT * FROM depreciation")
    suspend fun getAll():
        List<DepreciationEntity>



}
