package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PredictionEntity



@Dao
interface PredictionsDao {



    @Insert
    suspend fun insert(
        entity: PredictionEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PredictionEntity>
    )



    @Update
    suspend fun update(
        entity: PredictionEntity
    )



    @Delete
    suspend fun delete(
        entity: PredictionEntity
    )



    @Query("SELECT * FROM predictions")
    suspend fun getAll():
        List<PredictionEntity>



}
