package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CustomerVisitEntity



@Dao
interface CustomerVisitsDao {



    @Insert
    suspend fun insert(
        entity: CustomerVisitEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CustomerVisitEntity>
    )



    @Update
    suspend fun update(
        entity: CustomerVisitEntity
    )



    @Delete
    suspend fun delete(
        entity: CustomerVisitEntity
    )



    @Query("SELECT * FROM customer_visits")
    suspend fun getAll():
        List<CustomerVisitEntity>



}
