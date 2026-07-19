package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PartyEntity



@Dao
interface PartyDao {



    @Insert
    suspend fun insert(
        entity: PartyEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PartyEntity>
    )



    @Update
    suspend fun update(
        entity: PartyEntity
    )



    @Delete
    suspend fun delete(
        entity: PartyEntity
    )



    @Query("SELECT * FROM parties")
    suspend fun getAll():
        List<PartyEntity>



}
