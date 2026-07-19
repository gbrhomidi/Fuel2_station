package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.UnitEntity



@Dao
interface UnitsDao {



    @Insert
    suspend fun insert(
        entity: UnitEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<UnitEntity>
    )



    @Update
    suspend fun update(
        entity: UnitEntity
    )



    @Delete
    suspend fun delete(
        entity: UnitEntity
    )



    @Query("SELECT * FROM units")
    suspend fun getAll():
        List<UnitEntity>



}
