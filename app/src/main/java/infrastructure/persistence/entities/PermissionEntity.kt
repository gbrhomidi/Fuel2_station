package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import infrastructure.persistence.base.BaseEntity
import infrastructure.persistence.types.SyncStatus
import infrastructure.persistence.types.ScopeConstants

@Entity(
    tableName = "permissions",
    indices = [
        Index(value = ["uuid"], unique = true),
        Index(value = ["permission_code"], unique = true),
        Index(value = ["module"])
    ]
)
data class PermissionEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long = 0,

    @ColumnInfo(name = "uuid")
    override val uuid: String,

    @ColumnInfo(name = "permission_code")
    val permissionCode: String = "",

    @ColumnInfo(name = "permission_name")
    val permissionName: String = "",

    @ColumnInfo(name = "permission_name_ar")
    val permissionNameAr: String? = null,

    @ColumnInfo(name = "description")
    val description: String? = null,

    @ColumnInfo(name = "module")
    val module: String = "",

    @ColumnInfo(name = "module_name_ar")
    val moduleNameAr: String? = null,

    @ColumnInfo(name = "action")
    val action: String = "",

    @ColumnInfo(name = "requires_station")
    val requiresStation: Int = 0,

    @ColumnInfo(name = "requires_branch")
    val requiresBranch: Int = 0,

    @ColumnInfo(name = "is_active")
    val isActive: Int = 1,

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
    @ColumnInfo(
        name = "sync_status",
        defaultValue = "0"
    )
    override val syncStatus: SyncStatus = SyncStatus.PENDING,

    @ColumnInfo(name = "sync_version")
    override val syncVersion: Int = 1,

    @ColumnInfo(name = "sync_at")
    override val syncAt: String? = null,

    @ColumnInfo(name = "device_id")
    override val deviceId: String? = null,

    // Optimistic locking
    @ColumnInfo(name = "row_version")
    override val rowVersion: Int = 1,

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
