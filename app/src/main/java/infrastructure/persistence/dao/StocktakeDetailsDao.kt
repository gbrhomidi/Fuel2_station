package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.StocktakeDetailEntity



@Dao
interface StocktakeDetailsDao {



    @Insert
    suspend fun insert(
        entity: StocktakeDetailEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<StocktakeDetailEntity>
    )



    @Update
    suspend fun update(
        entity: StocktakeDetailEntity
    )



    @Delete
    suspend fun delete(
        entity: StocktakeDetailEntity
    )



    @Query("SELECT * FROM stocktake_details")
    suspend fun getAll():
        List<StocktakeDetailEntity>



}
