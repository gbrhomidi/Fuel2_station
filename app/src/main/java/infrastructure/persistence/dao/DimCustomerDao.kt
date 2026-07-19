package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DimCustomerEntity



@Dao
interface DimCustomerDao {



    @Insert
    suspend fun insert(
        entity: DimCustomerEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DimCustomerEntity>
    )



    @Update
    suspend fun update(
        entity: DimCustomerEntity
    )



    @Delete
    suspend fun delete(
        entity: DimCustomerEntity
    )



    @Query("SELECT * FROM dim_customer")
    suspend fun getAll():
        List<DimCustomerEntity>



}
