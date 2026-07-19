package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ShiftEntity



@Dao
interface ShiftsDao {



    @Insert
    suspend fun insert(
        entity: ShiftEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ShiftEntity>
    )



    @Update
    suspend fun update(
        entity: ShiftEntity
    )



    @Delete
    suspend fun delete(
        entity: ShiftEntity
    )



    @Query("SELECT * FROM shifts")
    suspend fun getAll():
        List<ShiftEntity>



}
