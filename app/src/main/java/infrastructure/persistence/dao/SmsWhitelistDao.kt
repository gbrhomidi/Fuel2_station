package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.SmsWhitelistEntity



@Dao
interface SmsWhitelistDao {



    @Insert
    suspend fun insert(
        entity: SmsWhitelistEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<SmsWhitelistEntity>
    )



    @Update
    suspend fun update(
        entity: SmsWhitelistEntity
    )



    @Delete
    suspend fun delete(
        entity: SmsWhitelistEntity
    )



    @Query("SELECT * FROM sms_whitelist")
    suspend fun getAll():
        List<SmsWhitelistEntity>



}
