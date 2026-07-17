package infrastructure.persistence.converter

import androidx.room.TypeConverter
import infrastructure.persistence.model.SyncStatus

/**
 * Room converters.
 * Database: INTEGER
 * Application: Enum
 * ADR-011: Prevent string-based synchronization corruption.
 */
class SyncConverters {

    @TypeConverter
    fun fromSyncStatus(
        status: SyncStatus?
    ): Int? = status?.code

    @TypeConverter
    fun toSyncStatus(
        value: Int?
    ): SyncStatus? = value?.let(SyncStatus::fromCode)
}
