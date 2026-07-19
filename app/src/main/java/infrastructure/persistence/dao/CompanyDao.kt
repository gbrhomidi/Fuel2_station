package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.CompanyEntity



@Dao
interface CompanyDao {



    @Insert
    suspend fun insert(
        entity: CompanyEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<CompanyEntity>
    )



    @Update
    suspend fun update(
        entity: CompanyEntity
    )



    @Delete
    suspend fun delete(
        entity: CompanyEntity
    )



    @Query("SELECT * FROM companies")
    suspend fun getAll():
        List<CompanyEntity>



}
