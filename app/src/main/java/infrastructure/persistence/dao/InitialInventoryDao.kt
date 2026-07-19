package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.InitialInventoryEntity



@Dao
interface InitialInventoryDao {



    @Insert
    suspend fun insert(
        entity: InitialInventoryEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<InitialInventoryEntity>
    )



    @Update
    suspend fun update(
        entity: InitialInventoryEntity
    )



    @Delete
    suspend fun delete(
        entity: InitialInventoryEntity
    )



    @Query("SELECT * FROM initial_inventory")
    suspend fun getAll():
        List<InitialInventoryEntity>



}
