package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.KpiResultEntity



@Dao
interface KpiResultsDao {



    @Insert
    suspend fun insert(
        entity: KpiResultEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<KpiResultEntity>
    )



    @Update
    suspend fun update(
        entity: KpiResultEntity
    )



    @Delete
    suspend fun delete(
        entity: KpiResultEntity
    )



    @Query("SELECT * FROM kpi_results")
    suspend fun getAll():
        List<KpiResultEntity>



}
