package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PaymentEntity



@Dao
interface PaymentsDao {



    @Insert
    suspend fun insert(
        entity: PaymentEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PaymentEntity>
    )



    @Update
    suspend fun update(
        entity: PaymentEntity
    )



    @Delete
    suspend fun delete(
        entity: PaymentEntity
    )



    @Query("SELECT * FROM payments")
    suspend fun getAll():
        List<PaymentEntity>



}
