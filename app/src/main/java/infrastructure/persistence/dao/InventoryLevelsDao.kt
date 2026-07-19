package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.InventoryLevelEntity



@Dao
interface InventoryLevelsDao {



    @Insert
    suspend fun insert(
        entity: InventoryLevelEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<InventoryLevelEntity>
    )



    @Update
    suspend fun update(
        entity: InventoryLevelEntity
    )



    @Delete
    suspend fun delete(
        entity: InventoryLevelEntity
    )



    @Query("SELECT * FROM inventory_levels")
    suspend fun getAll():
        List<InventoryLevelEntity>



}
