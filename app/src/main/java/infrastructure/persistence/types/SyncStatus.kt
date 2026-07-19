package infrastructure.persistence.types

/**
 * Synchronization state persisted as INTEGER.
 *
 * ADR-011:
 * Offline Optimistic Synchronization Contract.
 *
 * Storage mapping:
 *
 * PENDING  = 0
 * SYNCING  = 1
 * SYNCED   = 2
 * FAILED   = 3
 *
 * IMPORTANT:
 * Never change numeric codes.
 * Never reorder enum constants.
 * Never reuse retired codes.
 */
enum class SyncStatus(
    val code: Int
) {

    PENDING(0),

    SYNCING(1),

    SYNCED(2),

    FAILED(3);


    companion object {

        fun fromCode(
            code: Int
        ): SyncStatus {

            return entries
                .firstOrNull {
                    it.code == code
                }
                ?: throw IllegalArgumentException(
                    "Unknown SyncStatus code: $code. " +
                    "Possible data corruption or missing migration. " +
                    "Valid codes: ${
                        entries.joinToString {
                            "${it.name}=${it.code}"
                        }
                    }"
                )
        }
    }
}
