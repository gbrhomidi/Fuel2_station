package infrastructure.persistence.dao


import androidx.room.*


import infrastructure.persistence.entity.GroupsTableEntity



@Dao
interface GroupsTableDao {



    @Insert
    suspend fun insert(
        entity: GroupsTableEntity
    )



    @Insert
    suspend fun insertAll(
        entities: List<GroupsTableEntity>
    )



    @Update
    suspend fun update(
        entity: GroupsTableEntity
    )



    @Delete
    suspend fun delete(
        entity: GroupsTableEntity
    )



    @Query("SELECT * FROM groups_table")
    suspend fun getAll():
        List<GroupsTableEntity>



}
