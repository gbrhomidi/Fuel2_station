package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import infrastructure.persistence.entities.UserEntity

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: UserEntity): Long

    @Query("SELECT id, username, is_deleted FROM users WHERE id = :id LIMIT 1")
    suspend fun findById(id: Long): UserEntity?
}
