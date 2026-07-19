package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.TankRefillEntity



@Dao
interface TankRefillsDao {



    @Insert
    suspend fun insert(
        entity: TankRefillEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<TankRefillEntity>
    )



    @Update
    suspend fun update(
        entity: TankRefillEntity
    )



    @Delete
    suspend fun delete(
        entity: TankRefillEntity
    )



    @Query("SELECT * FROM tank_refills")
    suspend fun getAll():
        List<TankRefillEntity>



}
