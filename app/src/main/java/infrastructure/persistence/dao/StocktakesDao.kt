package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.StocktakeEntity



@Dao
interface StocktakesDao {



    @Insert
    suspend fun insert(
        entity: StocktakeEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<StocktakeEntity>
    )



    @Update
    suspend fun update(
        entity: StocktakeEntity
    )



    @Delete
    suspend fun delete(
        entity: StocktakeEntity
    )



    @Query("SELECT * FROM stocktakes")
    suspend fun getAll():
        List<StocktakeEntity>



}
