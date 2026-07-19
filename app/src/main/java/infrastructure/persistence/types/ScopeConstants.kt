package infrastructure.persistence.types

/**
 * Sentinel values for global scope identifiers.
 *
 * Avoid magic numbers and SQLite NULL behavior
 * inside UNIQUE constraints.
 */
object ScopeConstants {

    const val GLOBAL_STATION_ID = 0L

    const val GLOBAL_BRANCH_ID = 0L
}
