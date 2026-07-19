package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PartyContactEntity



@Dao
interface PartyContactsDao {



    @Insert
    suspend fun insert(
        entity: PartyContactEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PartyContactEntity>
    )



    @Update
    suspend fun update(
        entity: PartyContactEntity
    )



    @Delete
    suspend fun delete(
        entity: PartyContactEntity
    )



    @Query("SELECT * FROM party_contacts")
    suspend fun getAll():
        List<PartyContactEntity>



}
