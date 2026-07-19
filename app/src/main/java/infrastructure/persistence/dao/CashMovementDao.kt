package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CashMovementEntity



@Dao
interface CashMovementDao {



    @Insert
    suspend fun insert(
        entity: CashMovementEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CashMovementEntity>
    )



    @Update
    suspend fun update(
        entity: CashMovementEntity
    )



    @Delete
    suspend fun delete(
        entity: CashMovementEntity
    )



    @Query("SELECT * FROM cash_movements")
    suspend fun getAll():
        List<CashMovementEntity>



}
