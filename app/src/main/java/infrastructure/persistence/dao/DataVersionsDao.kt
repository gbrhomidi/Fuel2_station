package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DataVersionEntity



@Dao
interface DataVersionsDao {



    @Insert
    suspend fun insert(
        entity: DataVersionEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DataVersionEntity>
    )



    @Update
    suspend fun update(
        entity: DataVersionEntity
    )



    @Delete
    suspend fun delete(
        entity: DataVersionEntity
    )



    @Query("SELECT * FROM data_versions")
    suspend fun getAll():
        List<DataVersionEntity>



}
