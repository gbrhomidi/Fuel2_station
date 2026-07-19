package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.TerminalEntity



@Dao
interface TerminalsDao {



    @Insert
    suspend fun insert(
        entity: TerminalEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<TerminalEntity>
    )



    @Update
    suspend fun update(
        entity: TerminalEntity
    )



    @Delete
    suspend fun delete(
        entity: TerminalEntity
    )



    @Query("SELECT * FROM terminals")
    suspend fun getAll():
        List<TerminalEntity>



}
