package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.KpiDefinitionEntity



@Dao
interface KpiDefinitionsDao {



    @Insert
    suspend fun insert(
        entity: KpiDefinitionEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<KpiDefinitionEntity>
    )



    @Update
    suspend fun update(
        entity: KpiDefinitionEntity
    )



    @Delete
    suspend fun delete(
        entity: KpiDefinitionEntity
    )



    @Query("SELECT * FROM kpi_definitions")
    suspend fun getAll():
        List<KpiDefinitionEntity>



}
