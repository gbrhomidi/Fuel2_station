package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PartyTypeEntity



@Dao
interface PartyTypesDao {



    @Insert
    suspend fun insert(
        entity: PartyTypeEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PartyTypeEntity>
    )



    @Update
    suspend fun update(
        entity: PartyTypeEntity
    )



    @Delete
    suspend fun delete(
        entity: PartyTypeEntity
    )



    @Query("SELECT * FROM party_types")
    suspend fun getAll():
        List<PartyTypeEntity>



}
