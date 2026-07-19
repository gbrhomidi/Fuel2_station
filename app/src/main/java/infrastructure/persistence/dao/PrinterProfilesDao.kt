package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PrinterProfileEntity



@Dao
interface PrinterProfilesDao {



    @Insert
    suspend fun insert(
        entity: PrinterProfileEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PrinterProfileEntity>
    )



    @Update
    suspend fun update(
        entity: PrinterProfileEntity
    )



    @Delete
    suspend fun delete(
        entity: PrinterProfileEntity
    )



    @Query("SELECT * FROM printer_profiles")
    suspend fun getAll():
        List<PrinterProfileEntity>



}
