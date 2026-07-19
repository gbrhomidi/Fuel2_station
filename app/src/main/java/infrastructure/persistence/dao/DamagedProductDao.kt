package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DamagedProductEntity



@Dao
interface DamagedProductDao {



    @Insert
    suspend fun insert(
        entity: DamagedProductEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DamagedProductEntity>
    )



    @Update
    suspend fun update(
        entity: DamagedProductEntity
    )



    @Delete
    suspend fun delete(
        entity: DamagedProductEntity
    )



    @Query("SELECT * FROM damaged_products")
    suspend fun getAll():
        List<DamagedProductEntity>



}
