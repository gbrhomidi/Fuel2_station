package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PartyAddresseEntity



@Dao
interface PartyAddressesDao {



    @Insert
    suspend fun insert(
        entity: PartyAddresseEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PartyAddresseEntity>
    )



    @Update
    suspend fun update(
        entity: PartyAddresseEntity
    )



    @Delete
    suspend fun delete(
        entity: PartyAddresseEntity
    )



    @Query("SELECT * FROM party_addresses")
    suspend fun getAll():
        List<PartyAddresseEntity>



}
