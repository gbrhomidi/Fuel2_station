package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.PasswordResetTokenEntity



@Dao
interface PasswordResetTokensDao {



    @Insert
    suspend fun insert(
        entity: PasswordResetTokenEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<PasswordResetTokenEntity>
    )



    @Update
    suspend fun update(
        entity: PasswordResetTokenEntity
    )



    @Delete
    suspend fun delete(
        entity: PasswordResetTokenEntity
    )



    @Query("SELECT * FROM password_reset_tokens")
    suspend fun getAll():
        List<PasswordResetTokenEntity>



}
