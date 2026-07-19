package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.FactInventoryEntity



@Dao
interface FactInventoryDao {



    @Insert
    suspend fun insert(
        entity: FactInventoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<FactInventoryEntity>
    )



    @Update
    suspend fun update(
        entity: FactInventoryEntity
    )



    @Delete
    suspend fun delete(
        entity: FactInventoryEntity
    )



    @Query("SELECT * FROM fact_inventory")
    suspend fun getAll():
        List<FactInventoryEntity>



}
