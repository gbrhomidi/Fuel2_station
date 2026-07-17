package infrastructure.persistence.entities

import androidx.room.*
import infrastructure.persistence.base.BaseEntity
import infrastructure.persistence.converters.SyncConverters
import infrastructure.persistence.types.SyncStatus


@Entity(
    tableName = "sales_transactions",

    foreignKeys = [

        ForeignKey(
            entity = PartyEntity::class,
            parentColumns = ["id"],
            childColumns = ["customer_party_id"],
            onDelete = ForeignKey.SET_NULL
        ),

        ForeignKey(
            entity = CurrencyEntity::class,
            parentColumns = ["id"],
            childColumns = ["currency_id"],
            onDelete = ForeignKey.SET_NULL
        )
    ],


    indices = [

        Index(
            value=["uuid"],
            unique=true
        ),

        Index(
            value=["invoice_number"],
            unique=true
        ),

        Index(
            value=["customer_party_id"]
        ),

        Index(
            value=["is_deleted"]
        )
    ]
)


@TypeConverters(
    SyncConverters::class
)
data class SalesTransactionEntity(

    @PrimaryKey(autoGenerate=true)
    val id:Long = 0,


    @ColumnInfo(name="uuid")
    override val uuid:String,


    @ColumnInfo(name="invoice_number")
    val invoiceNumber:String,


    @ColumnInfo(name="customer_party_id")
    val customerPartyId:Long? = null,


    @ColumnInfo(name="currency_id")
    val currencyId:Long? = null,


    // ADR-012

    @ColumnInfo(name="total_amount_minor")
    val totalAmountMinor:Long = 0,


    @ColumnInfo(name="paid_amount_minor")
    val paidAmountMinor:Long = 0,


    @ColumnInfo(name="currency_code")
    val currencyCode:String = "SAR",


    @ColumnInfo(name="status")
    val status:String = "OPEN",


    // Audit

    override val createdBy:Long,


    override val createdAt:String,


    override val updatedBy:Long? = null,


    override val updatedAt:String? = null,


    override val deletedBy:Long? = null,


    override val deletedAt:String? = null,


    override val isDeleted:Int = 0,


    // Sync

    override val syncStatus:SyncStatus = SyncStatus.PENDING,


    override val syncVersion:Int = 1,


    override val syncAt:String? = null,


    override val deviceId:String? = null,


    // Lock

    override val rowVersion:Int = 1,


    override val remarks:String? = null,


    override val extraData:String? = null


):BaseEntity(

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
