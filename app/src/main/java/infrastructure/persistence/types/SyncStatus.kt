package infrastructure.persistence.types

/**
 * Synchronization state persisted in SQLite as INTEGER.
 * ADR-011: Offline Optimistic Synchronization Contract.
 *
 * Storage mapping:
 * PENDING  = 0
 * SYNCING  = 1
 * SYNCED   = 2
 * FAILED   = 3
 *
 * IMPORTANT:
 * - Never change numeric codes.
 * - Never reorder enum constants.
 * - Never reuse retired codes.
 * - New states must be appended only.
 * - Changing codes will corrupt existing database data.
 * - Migration required if adding new states to existing databases.
 *
 * @see ADR-011.md for full policy.
 */
enum class SyncStatus(val code: Int) {
    PENDING(0),
    SYNCING(1),
    SYNCED(2),
    FAILED(3);

    companion object {
        /**
         * Returns SyncStatus for given code.
         * Fails fast on unknown codes to prevent silent data corruption.
         * 
         * For legacy data handling, use Migration layer, not this method.
         */
        fun fromCode(code: Int): SyncStatus {
            return entries.firstOrNull { it.code == code }
                ?: throw IllegalArgumentException(
                    "Unknown SyncStatus code: $code. " +
                    "This indicates data corruption or missing Migration. " +
                    "Valid codes: ${entries.joinToString { "${it.name}=${it.code}" }}"
                )
        }
    }
}
