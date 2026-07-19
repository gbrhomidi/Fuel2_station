package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CustomerCallEntity



@Dao
interface CustomerCallsDao {



    @Insert
    suspend fun insert(
        entity: CustomerCallEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CustomerCallEntity>
    )



    @Update
    suspend fun update(
        entity: CustomerCallEntity
    )



    @Delete
    suspend fun delete(
        entity: CustomerCallEntity
    )



    @Query("SELECT * FROM customer_calls")
    suspend fun getAll():
        List<CustomerCallEntity>



}
