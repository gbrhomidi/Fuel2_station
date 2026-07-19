package infrastructure.persistence.base

import infrastructure.persistence.types.SyncStatus

/**
 * Pure Kotlin persistence contract.
 *
 * No Room dependency.
 * No SQLite dependency.
 * No Android dependency.
 *
 * No @Entity, @ColumnInfo, @Ignore,
 * or any Room annotations.
 *
 * Local IDs belong to Entity only.
 * UUID represents logical identity and is immutable after creation.
 */
abstract class BaseEntity(

    // Logical identity (immutable)
    open val uuid: String,

    // Audit
    open val createdBy: Long,
    open val createdAt: String,
    open val updatedBy: Long? = null,
    open val updatedAt: String? = null,

    open val deletedBy: Long? = null,
    open val deletedAt: String? = null,

    // Soft delete
    open val isDeleted: Int = 0,

    // Synchronization
    open val syncStatus: SyncStatus = SyncStatus.PENDING,
    open val syncVersion: Int = 1,
    open val syncAt: String? = null,
    open val deviceId: String? = null,

    // Optimistic locking
    open val rowVersion: Int = 1,

    // Metadata
    open val remarks: String? = null,
    open val extraData: String? = null
)
