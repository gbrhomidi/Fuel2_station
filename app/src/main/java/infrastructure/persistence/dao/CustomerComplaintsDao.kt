package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CustomerComplaintEntity



@Dao
interface CustomerComplaintsDao {



    @Insert
    suspend fun insert(
        entity: CustomerComplaintEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CustomerComplaintEntity>
    )



    @Update
    suspend fun update(
        entity: CustomerComplaintEntity
    )



    @Delete
    suspend fun delete(
        entity: CustomerComplaintEntity
    )



    @Query("SELECT * FROM customer_complaints")
    suspend fun getAll():
        List<CustomerComplaintEntity>



}
