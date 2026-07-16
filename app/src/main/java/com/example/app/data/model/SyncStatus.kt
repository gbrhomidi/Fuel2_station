package com.example.app.data.model

/**
 * Synchronization state persisted as INTEGER.
 *
 * Database mapping:
 * 0 = PENDING
 * 1 = SYNCING
 * 2 = SYNCED
 * 3 = FAILED
 */
enum class SyncStatus(val code: Int) {

    PENDING(0),

    SYNCING(1),

    SYNCED(2),

    FAILED(3);


    companion object {

        fun fromCode(code: Int): SyncStatus {
            return entries.firstOrNull {
                it.code == code
            } ?: FAILED
        }
    }
}
