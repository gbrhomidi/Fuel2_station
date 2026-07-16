package infrastructure.persistence.entities

import infrastructure.persistence.model.SyncStatus


/**
 * Base persistence contract.
 *
 * This class is NOT a Room Entity.
 *
 * It only provides shared persistence fields.
 *
 * ADR-007:
 * Database schema is the source of truth.
 *
 * ADR-008:
 * UTC ISO-8601 timestamps.
 *
 * ADR-009:
 * Financial audit preservation.
 *
 * ADR-011:
 * Optimistic Offline Locking.
 *
 * ADR-012:
 * Repository isolates persistence details.
 */
abstract class BaseEntity(

    /**
     * SQLite primary key.
     */
    open val id: Long,


    /**
     * Globally unique identifier.
     *
     * Required for:
     * - Offline creation
     * - Device synchronization
     * - Conflict resolution
     */
    open val uuid: String,


    /**
     * Creation audit.
     */
    open val createdAt: String?,

    open val createdBy: Long?,


    /**
     * Modification audit.
     */
    open val updatedAt: String?,

    open val updatedBy: Long?,


    /**
     * Soft delete audit.
     */
    open val deletedAt: String?,

    open val deletedBy: Long?,


    /**
     * Soft delete flag.
     *
     * 0 = active
     * 1 = deleted
     */
    open val isDeleted: Int,


    /**
     * Synchronization state.
     *
     * Stored as INTEGER through SyncConverters.
     */
    open val syncStatus: SyncStatus,


    /**
     * Synchronization revision.
     */
    open val syncVersion: Int,


    /**
     * Last successful sync timestamp.
     */
    open val syncAt: String?,


    /**
     * Device origin.
     */
    open val deviceId: String?,


    /**
     * Additional notes.
     */
    open val remarks: String?,


    /**
     * JSON extension field.
     */
    open val extraData: String?,


    /**
     * Optimistic Lock Version.
     *
     * Every successful update:
     *
     * row_version = row_version + 1
     *
     * Update condition:
     *
     * WHERE id = ?
     * AND row_version = expectedVersion
     */
    open val rowVersion: Int = 1

)
