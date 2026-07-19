package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.TankEntity



@Dao
interface TanksDao {



    @Insert
    suspend fun insert(
        entity: TankEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<TankEntity>
    )



    @Update
    suspend fun update(
        entity: TankEntity
    )



    @Delete
    suspend fun delete(
        entity: TankEntity
    )



    @Query("SELECT * FROM tanks")
    suspend fun getAll():
        List<TankEntity>



}
