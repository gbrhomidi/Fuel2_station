package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.BalanceSheetEntity



@Dao
interface BalanceSheetDao {



    @Insert
    suspend fun insert(
        entity: BalanceSheetEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<BalanceSheetEntity>
    )



    @Update
    suspend fun update(
        entity: BalanceSheetEntity
    )



    @Delete
    suspend fun delete(
        entity: BalanceSheetEntity
    )



    @Query("SELECT * FROM balance_sheets")
    suspend fun getAll():
        List<BalanceSheetEntity>



}
