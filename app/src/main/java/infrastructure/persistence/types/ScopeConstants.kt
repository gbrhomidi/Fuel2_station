package infrastructure.persistence.types

/**
 * Sentinel values for global/unspecified scope identifiers.
 * 
 * Using explicit constants instead of magic numbers (0) or NULL
 * to avoid SQLite NULL behavior in UNIQUE constraints.
 */
object ScopeConstants {
    const val GLOBAL_STATION_ID = 0L
    const val GLOBAL_BRANCH_ID = 0L
}
