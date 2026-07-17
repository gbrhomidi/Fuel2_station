package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import infrastructure.persistence.base.BaseEntity
import infrastructure.persistence.types.SyncStatus


@Entity(
    tableName = "role_permission_cross_ref",

    foreignKeys = [

        ForeignKey(
            entity = RoleEntity::class,
            parentColumns = ["id"],
            childColumns = ["role_id"],
            onDelete = ForeignKey.CASCADE
        ),

        ForeignKey(
            entity = PermissionEntity::class,
            parentColumns = ["id"],
            childColumns = ["permission_id"],
            onDelete = ForeignKey.CASCADE
        )

    ],

    indices = [

        Index(
            value = [
                "role_id",
                "permission_id"
            ],
            unique = true
        ),

        Index(
            value = ["role_id"]
        ),

        Index(
            value = ["permission_id"]
        ),

        Index(
            value = ["station_id"]
        ),

        Index(
            value = ["created_by"]
        ),

        Index(
            value = ["is_deleted"]
        )
    ]
)


data class RolePermissionCrossRef(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long = 0,


    // =========================
    // Relations
    // =========================

    @ColumnInfo(name = "role_id")
    val roleId: Long,


    @ColumnInfo(name = "permission_id")
    val permissionId: Long,


    @ColumnInfo(name = "station_id")
    val stationId: Long? = null,


    @ColumnInfo(name = "branch_id")
    val branchId: Long? = null,


    // =========================
    // Permissions Flags
    // =========================

    @ColumnInfo(name = "can_create")
    val canCreate: Int = 0,


    @ColumnInfo(name = "can_read")
    val canRead: Int = 1,


    @ColumnInfo(name = "can_update")
    val canUpdate: Int = 0,


    @ColumnInfo(name = "can_delete")
    val canDelete: Int = 0,


    @ColumnInfo(name = "can_export")
    val canExport: Int = 0,


    @ColumnInfo(name = "can_print")
    val canPrint: Int = 0,


    @ColumnInfo(name = "can_approve")
    val canApprove: Int = 0,


    // =========================
    // Base Identity
    // =========================

    @ColumnInfo(name = "uuid")
    override val uuid: String,


    // =========================
    // Audit
    // =========================

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


    // =========================
    // Soft Delete
    // =========================

    @ColumnInfo(name = "is_deleted")
    override val isDeleted: Int = 0,


    // =========================
    // Sync
    // =========================

    @ColumnInfo(name = "sync_status")
    override val syncStatus: SyncStatus = SyncStatus.PENDING,


    @ColumnInfo(name = "sync_version")
    override val syncVersion: Int = 1,


    @ColumnInfo(name = "sync_at")
    override val syncAt: String? = null,


    @ColumnInfo(name = "device_id")
    override val deviceId: String? = null,


    // =========================
    // Optimistic Lock
    // =========================

    @ColumnInfo(name = "row_version")
    override val rowVersion: Int = 1,


    // =========================
    // Metadata
    // =========================

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
