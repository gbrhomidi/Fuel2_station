package infrastructure.persistence.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import infrastructure.persistence.base.BaseEntity
import infrastructure.persistence.types.SyncStatus
import infrastructure.persistence.types.ScopeConstants

@Entity(
    tableName = "roles",
    foreignKeys = [
        ForeignKey(
            entity = RoleEntity::class,
            parentColumns = ["id"],
            childColumns = ["parent_role_id"],
            onDelete = ForeignKey.SET_NULL,
            deferred = true
        )
    ],
    indices = [
        Index(value = ["uuid"], unique = true),
        Index(value = ["role_code"], unique = true),
        Index(value = ["parent_role_id"])
    ]
)
data class RoleEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Long = 0,

    @ColumnInfo(name = "uuid")
    override val uuid: String,

    @ColumnInfo(name = "role_code")
    val roleCode: String = "",

    @ColumnInfo(name = "role_name")
    val roleName: String = "",

    @ColumnInfo(name = "role_name_ar")
    val roleNameAr: String? = null,

    @ColumnInfo(name = "description")
    val description: String? = null,

    @ColumnInfo(name = "description_ar")
    val descriptionAr: String? = null,

    @ColumnInfo(name = "level")
    val level: Int = 1,

    @ColumnInfo(name = "parent_role_id")
    val parentRoleId: Long? = null,

    @ColumnInfo(name = "is_system_role")
    val isSystemRole: Int = 0,

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
