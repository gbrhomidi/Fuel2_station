package infrastructure.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import infrastructure.persistence.entities.SalesTransactionLineEntity


@Dao
interface SalesTransactionLineDao {


    @Insert(
        onConflict = OnConflictStrategy.ABORT
    )
    suspend fun insert(
        line: SalesTransactionLineEntity
    ): Long



    @Insert(
        onConflict = OnConflictStrategy.ABORT
    )
    suspend fun insertAll(
        lines: List<SalesTransactionLineEntity>
    )



    @Update
    suspend fun update(
        line: SalesTransactionLineEntity
    )



    @Query(
        """
        SELECT *
        FROM sales_transaction_lines
        WHERE id = :id
        AND is_deleted = 0
        """
    )
    suspend fun findById(
        id: Long
    ): SalesTransactionLineEntity?



    @Query(
        """
        SELECT *
        FROM sales_transaction_lines
        WHERE transaction_id = :transactionId
        AND is_deleted = 0
        ORDER BY id ASC
        """
    )
    suspend fun findByTransactionId(
        transactionId: Long
    ): List<SalesTransactionLineEntity>



    @Query(
        """
        UPDATE sales_transaction_lines
        SET
            is_deleted = 1,
            deleted_at = datetime('now')
        WHERE id = :id
        AND is_deleted = 0
        """
    )
    suspend fun softDelete(
        id: Long
    ): Int



    @Query(
        """
        UPDATE sales_transaction_lines
        SET
            is_deleted = 1,
            deleted_at = datetime('now')
        WHERE transaction_id = :transactionId
        AND is_deleted = 0
        """
    )
    suspend fun softDeleteByTransaction(
        transactionId: Long
    ): Int



    @Query(
        """
        DELETE FROM sales_transaction_lines
        WHERE transaction_id = :transactionId
        """
    )
    suspend fun hardDeleteByTransaction(
        transactionId: Long
    )

}
