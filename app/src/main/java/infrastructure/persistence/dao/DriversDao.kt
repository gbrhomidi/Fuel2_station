package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DriverEntity



@Dao
interface DriversDao {



    @Insert
    suspend fun insert(
        entity: DriverEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DriverEntity>
    )



    @Update
    suspend fun update(
        entity: DriverEntity
    )



    @Delete
    suspend fun delete(
        entity: DriverEntity
    )



    @Query("SELECT * FROM drivers")
    suspend fun getAll():
        List<DriverEntity>



}
