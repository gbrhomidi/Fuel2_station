package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import infrastructure.persistence.base.BaseEntity
import infrastructure.persistence.converters.SyncConverters
import infrastructure.persistence.types.SyncStatus


@Entity(
    tableName = "receipts",

    foreignKeys = [

        ForeignKey(
            entity = PartyEntity::class,
            parentColumns = ["id"],
            childColumns = ["customer_party_id"],
            onDelete = ForeignKey.SET_NULL
        ),

        ForeignKey(
            entity = PaymentEntity::class,
            parentColumns = ["id"],
            childColumns = ["payment_id"],
            onDelete = ForeignKey.SET_NULL
        ),

        ForeignKey(
            entity = CashBoxEntity::class,
            parentColumns = ["id"],
            childColumns = ["cash_box_id"],
            onDelete = ForeignKey.SET_NULL
        ),

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
            value = ["receipt_number"],
            unique = true
        ),

        Index(
            value = ["payment_id"]
        ),

        Index(
            value = [
                "cash_box_id",
                "is_deleted"
            ]
        ),

        Index(
            value = [
                "customer_party_id",
                "is_deleted"
            ]
        ),

        Index(
            value = [
                "created_at"
            ]
        )
    ]
)


@TypeConverters(
    SyncConverters::class
)
data class ReceiptEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,


    // Identity

    @ColumnInfo(name = "uuid")
    override val uuid: String,


    @ColumnInfo(name = "receipt_number")
    val receiptNumber: String,


    // Relations

    @ColumnInfo(name = "customer_party_id")
    val customerPartyId: Long? = null,


    @ColumnInfo(name = "payment_id")
    val paymentId: Long? = null,


    @ColumnInfo(name = "cash_box_id")
    val cashBoxId: Long? = null,


    @ColumnInfo(name = "currency_id")
    val currencyId: Long? = null,


    // Money Contract ADR-012

    @ColumnInfo(name = "amount_minor")
    val amountMinor: Long = 0,


    @ColumnInfo(name = "currency_code")
    val currencyCode: String = "SAR",


    @ColumnInfo(name = "cash_amount_minor")
    val cashAmountMinor: Long = 0,


    @ColumnInfo(name = "cheque_amount_minor")
    val chequeAmountMinor: Long = 0,


    @ColumnInfo(name = "bank_amount_minor")
    val bankAmountMinor: Long = 0,


    @ColumnInfo(name = "other_amount_minor")
    val otherAmountMinor: Long = 0,


    // Receipt info

    @ColumnInfo(name = "receipt_type")
    val receiptType: String,


    @ColumnInfo(name = "received_from")
    val receivedFrom: String,


    @ColumnInfo(name = "received_by")
    val receivedBy: Long? = null,


    @ColumnInfo(name = "status")
    val status: String = "ACTIVE",


    // Audit

    @ColumnInfo(name = "created_by")
    override val createdBy: Long,


    @ColumnInfo(name = "created_at")
    override val createdAt: String,


    @ColumnInfo(name = "updated_by")
    override val updatedBy: Long? = null,


    @ColumnInfo(name = "updated_at")
    override val updatedAt: String? = null,


    @ColumnInfo(name = "deleted_by")
    override val deletedBy: Long? = null,


    @ColumnInfo(name = "deleted_at")
    override val deletedAt: String? = null,


    @ColumnInfo(name = "is_deleted")
    override val isDeleted: Int = 0,


    // Sync

    @ColumnInfo(name = "sync_status")
    override val syncStatus: SyncStatus = SyncStatus.PENDING,


    @ColumnInfo(name = "sync_version")
    override val syncVersion: Int = 1,


    @ColumnInfo(name = "sync_at")
    override val syncAt: String? = null,


    @ColumnInfo(name = "device_id")
    override val deviceId: String? = null,


    // Lock

    @ColumnInfo(name = "row_version")
    override val rowVersion: Int = 1,


    // Metadata

    @ColumnInfo(name = "remarks")
    override val remarks: String? = null,


    @ColumnInfo(name = "extra_data")
    override val extraData: String? = null


) : BaseEntity(

    uuid = uuid,

    createdBy = createdBy,
    createdAt = createdAt,

    updatedBy = updatedBy,
    updatedAt = updatedAt,

    deletedBy = deletedBy,
    deletedAt = deletedAt,

    isDeleted = isDeleted,

    syncStatus = syncStatus,
    syncVersion = syncVersion,
    syncAt = syncAt,

    deviceId = deviceId,

    rowVersion = rowVersion,

    remarks = remarks,
    extraData = extraData
)
