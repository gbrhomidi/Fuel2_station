package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CustomerFollowupEntity



@Dao
interface CustomerFollowupsDao {



    @Insert
    suspend fun insert(
        entity: CustomerFollowupEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CustomerFollowupEntity>
    )



    @Update
    suspend fun update(
        entity: CustomerFollowupEntity
    )



    @Delete
    suspend fun delete(
        entity: CustomerFollowupEntity
    )



    @Query("SELECT * FROM customer_followups")
    suspend fun getAll():
        List<CustomerFollowupEntity>



}
