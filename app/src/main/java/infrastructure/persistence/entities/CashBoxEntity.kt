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
    tableName = "cash_boxes",

    foreignKeys = [

        ForeignKey(
            entity = StationEntity::class,
            parentColumns = ["id"],
            childColumns = ["station_id"],
            onDelete = ForeignKey.RESTRICT
        ),

        ForeignKey(
            entity = CurrencyEntity::class,
            parentColumns = ["id"],
            childColumns = ["currency_id"],
            onDelete = ForeignKey.SET_NULL
        ),

        ForeignKey(
            entity = UserEntity::class,
            parentColumns = ["id"],
            childColumns = ["responsible_user_id"],
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
            value = ["box_code"],
            unique = true
        ),

        Index(
            value = [
                "station_id",
                "status",
                "is_deleted"
            ]
        ),

        Index(
            value = [
                "responsible_user_id",
                "is_deleted"
            ]
        )
    ]
)


@TypeConverters(
    SyncConverters::class
)
data class CashBoxEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,


    // Identity

    @ColumnInfo(name = "uuid")
    override val uuid: String,


    @ColumnInfo(name = "box_code")
    val boxCode: String,


    @ColumnInfo(name = "box_name")
    val boxName: String,


    @ColumnInfo(name = "box_name_ar")
    val boxNameAr: String? = null,


    // Relations

    @ColumnInfo(name = "station_id")
    val stationId: Long,


    @ColumnInfo(name = "currency_id")
    val currencyId: Long? = null,


    @ColumnInfo(name = "responsible_user_id")
    val responsibleUserId: Long? = null,


    // Configuration

    @ColumnInfo(name = "box_type")
    val boxType: String = "MAIN",


    // ADR-012 Money

    @ColumnInfo(name = "opening_balance_minor")
    val openingBalanceMinor: Long = 0,


    @ColumnInfo(name = "current_balance_minor")
    val currentBalanceMinor: Long = 0,


    @ColumnInfo(name = "maximum_balance_minor")
    val maximumBalanceMinor: Long = 50000000,


    @ColumnInfo(name = "currency_code")
    val currencyCode: String = "SAR",


    @ColumnInfo(name = "status")
    val status: String = "OPENED",


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
