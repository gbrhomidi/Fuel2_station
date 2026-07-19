package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.TankLedgerEntity



@Dao
interface TankLedgerDao {



    @Insert
    suspend fun insert(
        entity: TankLedgerEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<TankLedgerEntity>
    )



    @Update
    suspend fun update(
        entity: TankLedgerEntity
    )



    @Delete
    suspend fun delete(
        entity: TankLedgerEntity
    )



    @Query("SELECT * FROM tank_ledger")
    suspend fun getAll():
        List<TankLedgerEntity>



}
