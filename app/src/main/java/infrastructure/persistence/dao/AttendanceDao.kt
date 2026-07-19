package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.AttendanceEntity



@Dao
interface AttendanceDao {



    @Insert
    suspend fun insert(
        entity: AttendanceEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<AttendanceEntity>
    )



    @Update
    suspend fun update(
        entity: AttendanceEntity
    )



    @Delete
    suspend fun delete(
        entity: AttendanceEntity
    )



    @Query("SELECT * FROM attendance")
    suspend fun getAll():
        List<AttendanceEntity>



}
