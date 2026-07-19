package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.FactPaymentEntity



@Dao
interface FactPaymentsDao {



    @Insert
    suspend fun insert(
        entity: FactPaymentEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<FactPaymentEntity>
    )



    @Update
    suspend fun update(
        entity: FactPaymentEntity
    )



    @Delete
    suspend fun delete(
        entity: FactPaymentEntity
    )



    @Query("SELECT * FROM fact_payments")
    suspend fun getAll():
        List<FactPaymentEntity>



}
