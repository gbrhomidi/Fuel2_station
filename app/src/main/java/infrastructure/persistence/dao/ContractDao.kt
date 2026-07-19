package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.ContractEntity



@Dao
interface ContractDao {



    @Insert
    suspend fun insert(
        entity: ContractEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<ContractEntity>
    )



    @Update
    suspend fun update(
        entity: ContractEntity
    )



    @Delete
    suspend fun delete(
        entity: ContractEntity
    )



    @Query("SELECT * FROM contracts")
    suspend fun getAll():
        List<ContractEntity>



}
