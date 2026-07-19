package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.DashboardWidgetEntity



@Dao
interface DashboardWidgetsDao {



    @Insert
    suspend fun insert(
        entity: DashboardWidgetEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<DashboardWidgetEntity>
    )



    @Update
    suspend fun update(
        entity: DashboardWidgetEntity
    )



    @Delete
    suspend fun delete(
        entity: DashboardWidgetEntity
    )



    @Query("SELECT * FROM dashboard_widgets")
    suspend fun getAll():
        List<DashboardWidgetEntity>



}
