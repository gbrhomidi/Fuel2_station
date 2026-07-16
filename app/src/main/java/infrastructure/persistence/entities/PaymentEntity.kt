package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import infrastructure.persistence.converter.SyncConverters
import infrastructure.persistence.model.SyncStatus


/**
 * Payment persistence entity.
 *
 * Financial transaction record.
 *
 * Architectural Decisions:
 *
 * ADR-007:
 * Database schema is source of truth.
 *
 * ADR-009:
 * Audit fields preserved.
 *
 * ADR-010:
 * Monetary calculations are NOT performed here.
 * Double is storage representation only.
 *
 * ADR-011:
 * rowVersion protects offline concurrent updates.
 *
 * ADR-012:
 * Repository owns transactions.
 */
@Entity(
    tableName = "payments",

    foreignKeys = [

        ForeignKey(
            entity = SalesTransactionEntity::class,
            parentColumns = ["id"],
            childColumns = ["sale_id"],
            onDelete = ForeignKey.SET_NULL
        ),


        ForeignKey(
            entity = PartyEntity::class,
            parentColumns = ["id"],
            childColumns = ["customer_party_id"],
            onDelete = ForeignKey.SET_NULL
        ),


        ForeignKey(
            entity = PartyEntity::class,
            parentColumns = ["id"],
            childColumns = ["supplier_party_id"],
            onDelete = ForeignKey.SET_NULL
        ),


        ForeignKey(
            entity = CurrencyEntity::class,
            parentColumns = ["id"],
            childColumns = ["currency_id"],
            onDelete = ForeignKey.SET_NULL
        ),


        ForeignKey(
            entity = BankAccountEntity::class,
            parentColumns = ["id"],
            childColumns = ["bank_account_id"],
            onDelete = ForeignKey.SET_NULL
        ),


        ForeignKey(
            entity = CashBoxEntity::class,
            parentColumns = ["id"],
            childColumns = ["cash_box_id"],
            onDelete = ForeignKey.SET_NULL
        ),


        ForeignKey(
            entity = PaymentEntity::class,
            parentColumns = ["id"],
            childColumns = ["original_payment_id"],
            onDelete = ForeignKey.SET_NULL
        ),


        /**
         * Audit owner.
         *
         * Future DDL migration:
         * NOT NULL + RESTRICT
         */
        ForeignKey(
            entity = UserEntity::class,
            parentColumns = ["id"],
            childColumns = ["created_by"],
            onDelete = ForeignKey.RESTRICT
        )

    ],


    indices = [

        Index(
            value = ["uuid"],
            unique = true
        ),

        Index(
            value = ["payment_code"],
            unique = true
        ),


        Index(
            value = ["sale_id"]
        ),


        Index(
            value = ["cash_box_id"]
        ),


        Index(
            value = ["cash_box_id", "is_deleted"]
        ),


        Index(
            value = ["customer_party_id"]
        ),


        Index(
            value = ["created_at"]
        ),


        Index(
            value = ["status"]
        )

    ]
)


@TypeConverters(SyncConverters::class)
data class PaymentEntity(


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long = 0,


    @ColumnInfo(name = "uuid")
    override val uuid: String,


    @ColumnInfo(name = "payment_code")
    val paymentCode: String,


    @ColumnInfo(name = "sale_id")
    val saleId: Long? = null,


    @ColumnInfo(name = "customer_party_id")
    val customerPartyId: Long? = null,


    @ColumnInfo(name = "supplier_party_id")
    val supplierPartyId: Long? = null,


    @ColumnInfo(name = "payment_type")
    val paymentType: String,


    @ColumnInfo(name = "payment_method")
    val paymentMethod: String,


    /**
     * Storage only.
     *
     * Domain converts to BigDecimal.
     */
    @ColumnInfo(name = "amount")
    val amount: Double = 0.0,


    @ColumnInfo(name = "currency_id")
    val currencyId: Long? = null,


    @ColumnInfo(name = "exchange_rate")
    val exchangeRate: Double = 1.0,


    @ColumnInfo(name = "amount_in_default")
    val amountInDefault: Double? = null,


    @ColumnInfo(name = "is_partial")
    val isPartial: Int = 0,


    @ColumnInfo(name = "total_invoice_amount")
    val totalInvoiceAmount: Double? = null,


    @ColumnInfo(name = "remaining_after")
    val remainingAfter: Double? = null,


    @ColumnInfo(name = "cheque_number")
    val chequeNumber: String? = null,


    @ColumnInfo(name = "cheque_date")
    val chequeDate: String? = null,


    @ColumnInfo(name = "cheque_status")
    val chequeStatus: String = "pending",


    @ColumnInfo(name = "bank_account_id")
    val bankAccountId: Long? = null,


    @ColumnInfo(name = "transfer_reference")
    val transferReference: String? = null,


    @ColumnInfo(name = "card_last_four")
    val cardLastFour: String? = null,


    @ColumnInfo(name = "transaction_id")
    val transactionId: String? = null,


    @ColumnInfo(name = "cash_box_id")
    val cashBoxId: Long? = null,


    @ColumnInfo(name = "status")
    val status: String = "completed",


    @ColumnInfo(name = "is_refund")
    val isRefund: Int = 0,


    @ColumnInfo(name = "original_payment_id")
    val originalPaymentId: Long? = null,


    @ColumnInfo(name = "refund_reason")
    val refundReason: String? = null,


    @ColumnInfo(name = "operator")
    val operator: String = "System",


    @ColumnInfo(name = "notes")
    val notes: String? = null,


    // Audit

    @ColumnInfo(name = "created_by")
    override val createdBy: Long,


    @ColumnInfo(name = "updated_by")
    override val updatedBy: Long? = null,


    @ColumnInfo(name = "deleted_by")
    override val deletedBy: Long? = null,


    @ColumnInfo(name = "created_at")
    override val createdAt: String,


    @ColumnInfo(name = "updated_at")
    override val updatedAt: String? = null,


    @ColumnInfo(name = "deleted_at")
    override val deletedAt: String? = null,


    @ColumnInfo(name = "is_deleted")
    override val isDeleted: Int = 0,


    // Sync

    @ColumnInfo(name = "sync_status")
    override val syncStatus: SyncStatus = SyncStatus.SYNCED,


    @ColumnInfo(name = "sync_version")
    override val syncVersion: Int = 1,


    @ColumnInfo(name = "sync_at")
    override val syncAt: String? = null,


    @ColumnInfo(name = "device_id")
    override val deviceId: String? = null,


    @ColumnInfo(name = "remarks")
    override val remarks: String? = null,


    @ColumnInfo(name = "extra_data")
    override val extraData: String? = null,


    /**
     * Optimistic locking.
     */
    @ColumnInfo(name = "row_version")
    override val rowVersion: Int = 1

) : BaseEntity(

    id = id,
    uuid = uuid,

    createdAt = createdAt,
    createdBy = createdBy,

    updatedAt = updatedAt,
    updatedBy = updatedBy,

    deletedAt = deletedAt,
    deletedBy = deletedBy,

    isDeleted = isDeleted,

    syncStatus = syncStatus,
    syncVersion = syncVersion,
    syncAt = syncAt,

    deviceId = deviceId,

    remarks = remarks,
    extraData = extraData,

    rowVersion = rowVersion
)
