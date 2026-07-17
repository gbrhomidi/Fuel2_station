package infrastructure.persistence.entities.embedded

import androidx.room.ColumnInfo


/**
 * Embedded financial value object.
 *
 * Stored as primitive SQLite columns.
 * No TypeConverter required.
 */
data class MoneyEmbeddable(

    @ColumnInfo(name = "amount_minor")
    val amountMinor: Long,

    @ColumnInfo(name = "currency_code")
    val currencyCode: String
)
