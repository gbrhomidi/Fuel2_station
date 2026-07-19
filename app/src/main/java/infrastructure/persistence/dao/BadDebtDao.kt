package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.BadDebtEntity



@Dao
interface BadDebtDao {



    @Insert
    suspend fun insert(
        entity: BadDebtEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<BadDebtEntity>
    )



    @Update
    suspend fun update(
        entity: BadDebtEntity
    )



    @Delete
    suspend fun delete(
        entity: BadDebtEntity
    )



    @Query("SELECT * FROM bad_debts")
    suspend fun getAll():
        List<BadDebtEntity>



}
