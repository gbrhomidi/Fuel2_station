package infrastructure.persistence.entities

import androidx.room.*
import infrastructure.persistence.base.BaseEntity
import infrastructure.persistence.types.SyncStatus


@Entity(
    tableName="bank_accounts",
    indices=[
        Index(value=["uuid"],unique=true),
        Index(value=["account_number"],unique=true)
    ]
)
data class BankAccountEntity(

    @PrimaryKey(autoGenerate=true)
    val id:Long=0,


    override val uuid:String,


    @ColumnInfo(name="account_number")
    val accountNumber:String,


    @ColumnInfo(name="bank_name")
    val bankName:String,


    @ColumnInfo(name="balance")
    val balance:Double=0.0,


    @ColumnInfo(name="currency_id")
    val currencyId:Long?=null,


    override val createdBy:Long,

    override val createdAt:String,


    override val updatedBy:Long?=null,

    override val updatedAt:String?=null,


    override val deletedBy:Long?=null,

    override val deletedAt:String?=null,


    override val isDeleted:Int=0,


    override val syncStatus:SyncStatus=SyncStatus.PENDING,

    override val syncVersion:Int=1,

    override val syncAt:String?=null,

    override val deviceId:String?=null,

    override val rowVersion:Int=1,

    override val remarks:String?=null,

    override val extraData:String?=null


):BaseEntity(
    uuid,
    createdBy,
    createdAt,
    updatedBy,
    updatedAt,
    deletedBy,
    deletedAt,
    isDeleted,
    syncStatus,
    syncVersion,
    syncAt,
    deviceId,
    rowVersion,
    remarks,
    extraData
)
