package infrastructure.persistence.database

import androidx.room.Database
import androidx.room.RoomDatabase

import infrastructure.persistence.entity.AccountEntity
import infrastructure.persistence.entity.AiChatHistoryEntity
import infrastructure.persistence.entity.ApprovalHistoryEntity
import infrastructure.persistence.entity.ApprovalStepEntity
import infrastructure.persistence.entity.ApprovalWorkflowEntity
import infrastructure.persistence.entity.AssetEntity
import infrastructure.persistence.entity.AttachmentEntity
import infrastructure.persistence.entity.AttendanceEntity
import infrastructure.persistence.entity.AuditLogEntity
import infrastructure.persistence.entity.BackupHistoryEntity
import infrastructure.persistence.entity.BadDebtEntity
import infrastructure.persistence.entity.BalanceSheetEntity
import infrastructure.persistence.entity.BankAccountEntity
import infrastructure.persistence.entity.BankEntity
import infrastructure.persistence.entity.BankLedgerEntity
import infrastructure.persistence.entity.BarcodeHistoryEntity
import infrastructure.persistence.entity.BudgetDetailEntity
import infrastructure.persistence.entity.BudgetEntity
import infrastructure.persistence.entity.CalibrationRecordEntity
import infrastructure.persistence.entity.CashBoxeEntity
import infrastructure.persistence.entity.CashDepositEntity
import infrastructure.persistence.entity.CashLedgerEntity
import infrastructure.persistence.entity.CashMovementEntity
import infrastructure.persistence.entity.CompanyEntity
import infrastructure.persistence.entity.ContractEntity
import infrastructure.persistence.entity.CurrencyEntity
import infrastructure.persistence.entity.CustomerCallEntity
import infrastructure.persistence.entity.CustomerComplaintEntity
import infrastructure.persistence.entity.CustomerFollowupEntity
import infrastructure.persistence.entity.CustomerLedgerEntity
import infrastructure.persistence.entity.CustomerVisitEntity
import infrastructure.persistence.entity.DamagedProductEntity
import infrastructure.persistence.entity.DashboardWidgetEntity
import infrastructure.persistence.entity.DataVersionEntity
import infrastructure.persistence.entity.DeliveryEntity
import infrastructure.persistence.entity.DepreciationEntity
import infrastructure.persistence.entity.DimCustomerEntity
import infrastructure.persistence.entity.DimDateEntity
import infrastructure.persistence.entity.DimProductEntity
import infrastructure.persistence.entity.DimStationEntity
import infrastructure.persistence.entity.DocumentEntity
import infrastructure.persistence.entity.DriverEntity
import infrastructure.persistence.entity.EmployeeEntity
import infrastructure.persistence.entity.EmployeePaymentEntity
import infrastructure.persistence.entity.EmployeesOldEntity
import infrastructure.persistence.entity.ExchangeRateEntity
import infrastructure.persistence.entity.ExpenseCategoryEntity
import infrastructure.persistence.entity.ExpenseEntity
import infrastructure.persistence.entity.FactInventoryEntity
import infrastructure.persistence.entity.FactPaymentEntity
import infrastructure.persistence.entity.FactSaleEntity
import infrastructure.persistence.entity.FieldPermissionEntity
import infrastructure.persistence.entity.FixedAssetEntity
import infrastructure.persistence.entity.FuelQualityTestEntity
import infrastructure.persistence.entity.FuelSaleEntity
import infrastructure.persistence.entity.FuelTypeEntity
import infrastructure.persistence.entity.GroupsTableEntity
import infrastructure.persistence.entity.InitialInventoryEntity
import infrastructure.persistence.entity.InventoryLedgerEntity
import infrastructure.persistence.entity.InventoryLevelEntity
import infrastructure.persistence.entity.InventoryMovementEntity
import infrastructure.persistence.entity.InvoiceTemplateEntity
import infrastructure.persistence.entity.IotDeviceEntity
import infrastructure.persistence.entity.JobQueueEntity
import infrastructure.persistence.entity.JournalEntryEntity
import infrastructure.persistence.entity.JournalEntryItemEntity
import infrastructure.persistence.entity.KpiDefinitionEntity
import infrastructure.persistence.entity.KpiResultEntity
import infrastructure.persistence.entity.LabelTemplateEntity
import infrastructure.persistence.entity.MaintenanceHistoryEntity
import infrastructure.persistence.entity.MaintenancePartEntity
import infrastructure.persistence.entity.MaintenanceRequestEntity
import infrastructure.persistence.entity.MaintenanceScheduleEntity
import infrastructure.persistence.entity.MeterReadingEntity
import infrastructure.persistence.entity.NotificationEntity
import infrastructure.persistence.entity.NotificationLogEntity
import infrastructure.persistence.entity.NotificationQueueEntity
import infrastructure.persistence.entity.NotificationTemplateEntity
import infrastructure.persistence.entity.PartyAddresseEntity
import infrastructure.persistence.entity.PartyContactEntity
import infrastructure.persistence.entity.PartyEntity
import infrastructure.persistence.entity.PartyTypeEntity
import infrastructure.persistence.entity.PasswordResetTokenEntity
import infrastructure.persistence.entity.PaymentEntity
import infrastructure.persistence.entity.PayrollEntity
import infrastructure.persistence.entity.PayrollItemEntity
import infrastructure.persistence.entity.PermissionEntity
import infrastructure.persistence.entity.PredictionEntity
import infrastructure.persistence.entity.PriceHistoryEntity
import infrastructure.persistence.entity.PriceListEntity
import infrastructure.persistence.entity.PriceListItemEntity
import infrastructure.persistence.entity.PrinterProfileEntity
import infrastructure.persistence.entity.ProductCategoryEntity
import infrastructure.persistence.entity.ProductEntity
import infrastructure.persistence.entity.PumpEntity
import infrastructure.persistence.entity.PumpNozzleEntity
import infrastructure.persistence.entity.ReceiptEntity
import infrastructure.persistence.entity.ReceiptTemplateEntity
import infrastructure.persistence.entity.RestoreHistoryEntity
import infrastructure.persistence.entity.RoleEntity
import infrastructure.persistence.entity.RolePermissionEntity
import infrastructure.persistence.entity.SaleItemEntity
import infrastructure.persistence.entity.SalesTransactionEntity
import infrastructure.persistence.entity.ScheduledJobEntity
import infrastructure.persistence.entity.SchemaChangeEntity
import infrastructure.persistence.entity.ScreenEntity
import infrastructure.persistence.entity.SettingEntity
import infrastructure.persistence.entity.ShiftDeliveryEntity
import infrastructure.persistence.entity.ShiftEntity
import infrastructure.persistence.entity.ShiftExpenseEntity
import infrastructure.persistence.entity.ShiftSaleEntity
import infrastructure.persistence.entity.SmartAlertEntity
import infrastructure.persistence.entity.SmartAlertLogEntity
import infrastructure.persistence.entity.SmsLogEntity
import infrastructure.persistence.entity.SmsMessageEntity
import infrastructure.persistence.entity.SmsReminderEntity
import infrastructure.persistence.entity.SmsTemplateEntity
import infrastructure.persistence.entity.SmsWhitelistEntity
import infrastructure.persistence.entity.StationEntity
import infrastructure.persistence.entity.StationSettingEntity
import infrastructure.persistence.entity.StockAlertEntity
import infrastructure.persistence.entity.StockMovementEntity
import infrastructure.persistence.entity.StocktakeDetailEntity
import infrastructure.persistence.entity.StocktakeEntity
import infrastructure.persistence.entity.SupplierLedgerEntity
import infrastructure.persistence.entity.SyncConflictEntity
import infrastructure.persistence.entity.SyncDeviceEntity
import infrastructure.persistence.entity.SyncLogEntity
import infrastructure.persistence.entity.SyncQueueEntity
import infrastructure.persistence.entity.SystemEventEntity
import infrastructure.persistence.entity.SystemLogEntity
import infrastructure.persistence.entity.SystemSettingEntity
import infrastructure.persistence.entity.TankEntity
import infrastructure.persistence.entity.TankLedgerEntity
import infrastructure.persistence.entity.TankLevelLogEntity
import infrastructure.persistence.entity.TankRefillEntity
import infrastructure.persistence.entity.TerminalEntity
import infrastructure.persistence.entity.UnitEntity
import infrastructure.persistence.entity.UserActivityLogEntity
import infrastructure.persistence.entity.UserEntity
import infrastructure.persistence.entity.UserPermissionEntity
import infrastructure.persistence.entity.UserSessionEntity
import infrastructure.persistence.entity.UserSettingEntity
import infrastructure.persistence.entity.VehicleAccidentEntity
import infrastructure.persistence.entity.VehicleEntity
import infrastructure.persistence.entity.VehicleExpenseEntity
import infrastructure.persistence.entity.VehicleInsuranceEntity
import infrastructure.persistence.entity.VehicleLocationEntity
import infrastructure.persistence.entity.VehicleMaintenanceEntity
import infrastructure.persistence.entity.VehicleTripEntity
import infrastructure.persistence.entity.WarehouseEntity


@Database(
    entities = [
        AccountEntity::class,
        AiChatHistoryEntity::class,
        ApprovalHistoryEntity::class,
        ApprovalStepEntity::class,
        ApprovalWorkflowEntity::class,
        AssetEntity::class,
        AttachmentEntity::class,
        AttendanceEntity::class,
        AuditLogEntity::class,
        BackupHistoryEntity::class,
        BadDebtEntity::class,
        BalanceSheetEntity::class,
        BankAccountEntity::class,
        BankLedgerEntity::class,
        BankEntity::class,
        BarcodeHistoryEntity::class,
        BudgetDetailEntity::class,
        BudgetEntity::class,
        CalibrationRecordEntity::class,
        CashBoxEntity::class,
        CashDepositEntity::class,
        CashLedgerEntity::class,
        CashMovementEntity::class,
        CompanyEntity::class,
        ContractEntity::class,
        Currencies::class,
        CustomerCalls::class,
        CustomerComplaints::class,
        CustomerFollowups::class,
        CustomerLedgerEntity::class,
        CustomerVisits::class,
        DamagedProductEntity::class,
        DashboardWidgets::class,
        DataVersions::class,
        Deliveries::class,
        DepreciationEntity::class,
        DimCustomerEntity::class,
        DimDateEntity::class,
        DimProductEntity::class,
        DimStationEntity::class,
        Documents::class,
        Drivers::class,
        EmployeePayments::class,
        Employees::class,
        EmployeesOldEntity::class,
        ExchangeRates::class,
        ExpenseCategories::class,
        Expenses::class,
        FactInventoryEntity::class,
        FactPayments::class,
        FactSales::class,
        FieldPermissions::class,
        FixedAssets::class,
        FuelQualityTests::class,
        FuelSales::class,
        FuelTypes::class,
        GroupsTableEntity::class,
        InitialInventoryEntity::class,
        InventoryLedgerEntity::class,
        InventoryLevels::class,
        InventoryMovements::class,
        InvoiceTemplates::class,
        IotDevices::class,
        JobQueueEntity::class,
        JournalEntries::class,
        JournalEntryItems::class,
        KpiDefinitions::class,
        KpiResults::class,
        LabelTemplates::class,
        MaintenanceHistoryEntity::class,
        MaintenanceParts::class,
        MaintenanceRequests::class,
        MaintenanceScheduleEntity::class,
        MeterReadings::class,
        NotificationLogs::class,
        NotificationQueueEntity::class,
        NotificationTemplates::class,
        Notifications::class,
        Parties::class,
        PartyAddresses::class,
        PartyContacts::class,
        PartyTypes::class,
        PasswordResetTokens::class,
        Payments::class,
        PayrollEntity::class,
        PayrollItems::class,
        Permissions::class,
        Predictions::class,
        PriceHistoryEntity::class,
        PriceListItems::class,
        PriceLists::class,
        PrinterProfiles::class,
        ProductCategories::class,
        ProductEntity::class,
        PumpNozzles::class,
        Pumps::class,
        ReceiptTemplates::class,
        Receipts::class,
        RestoreHistoryEntity::class,
        RolePermissions::class,
        Roles::class,
        SaleItems::class,
        SalesTransactions::class,
        ScheduledJobs::class,
        SchemaChanges::class,
        Screens::class,
        Settings::class,
        ShiftDeliveries::class,
        ShiftExpenses::class,
        ShiftSales::class,
        Shifts::class,
        SmartAlertLogs::class,
        SmartAlerts::class,
        SmsLogs::class,
        SmsMessages::class,
        SmsReminders::class,
        SmsTemplates::class,
        SmsWhitelistEntity::class,
        StationSettings::class,
        Stations::class,
        StockAlerts::class,
        StockMovements::class,
        StocktakeDetails::class,
        Stocktakes::class,
        SupplierLedgerEntity::class,
        SyncConflicts::class,
        SyncDevices::class,
        SyncLogs::class,
        SyncQueueEntity::class,
        SystemEvents::class,
        SystemLogs::class,
        SystemSettings::class,
        TankLedgerEntity::class,
        TankLevelLogEntity::class,
        TankRefills::class,
        Tanks::class,
        Terminals::class,
        Units::class,
        UserActivityLogEntity::class,
        UserPermissions::class,
        UserSessions::class,
        UserSettings::class,
        Users::class,
        VehicleAccidents::class,
        VehicleExpenses::class,
        VehicleInsuranceEntity::class,
        VehicleLocations::class,
        VehicleMaintenanceEntity::class,
        VehicleTrips::class,
        Vehicles::class,
        Warehouses::class,
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun accountsDao(): AccountDao

    abstract fun aiChatHistoryDao(): AiChatHistoryDao

    abstract fun approvalHistoryDao(): ApprovalHistoryDao

    abstract fun approvalStepsDao(): ApprovalStepDao

    abstract fun approvalWorkflowsDao(): ApprovalWorkflowDao

    abstract fun assetsDao(): AssetDao

    abstract fun attachmentsDao(): AttachmentDao

    abstract fun attendanceDao(): AttendanceDao

    abstract fun auditLogsDao(): AuditLogDao

    abstract fun backupHistoryDao(): BackupHistoryDao

    abstract fun badDebtsDao(): BadDebtDao

    abstract fun balanceSheetsDao(): BalanceSheetDao

    abstract fun bankAccountsDao(): BankAccountDao

    abstract fun bankLedgerDao(): BankLedgerDao

    abstract fun banksDao(): BankDao

    abstract fun barcodeHistoryDao(): BarcodeHistoryDao

    abstract fun budgetDetailsDao(): BudgetDetailDao

    abstract fun budgetsDao(): BudgetDao

    abstract fun calibrationRecordsDao(): CalibrationRecordDao

    abstract fun cashBoxesDao(): CashBoxDao

    abstract fun cashDepositsDao(): CashDepositDao

    abstract fun cashLedgerDao(): CashLedgerDao

    abstract fun cashMovementsDao(): CashMovementDao

    abstract fun companiesDao(): CompanyDao

    abstract fun contractsDao(): ContractDao

    abstract fun currenciesDao(): CurrencyDao

    abstract fun customerCallsDao(): CustomerCallsDao

    abstract fun customerComplaintsDao(): CustomerComplaintsDao

    abstract fun customerFollowupsDao(): CustomerFollowupsDao

    abstract fun customerLedgerDao(): CustomerLedgerDao

    abstract fun customerVisitsDao(): CustomerVisitsDao

    abstract fun damagedProductDao(): DamagedProductDao

    abstract fun dashboardWidgetsDao(): DashboardWidgetsDao

    abstract fun dataVersionsDao(): DataVersionsDao

    abstract fun deliveriesDao(): DeliveryDao

    abstract fun depreciationDao(): DepreciationDao

    abstract fun dimCustomerDao(): DimCustomerDao

    abstract fun dimDateDao(): DimDateDao

    abstract fun dimProductDao(): DimProductDao

    abstract fun dimStationDao(): DimStationDao

    abstract fun documentsDao(): DocumentsDao

    abstract fun driversDao(): DriversDao

    abstract fun employeePaymentsDao(): EmployeePaymentsDao

    abstract fun employeesDao(): EmployeesDao

    abstract fun employeesOldDao(): EmployeesOldDao

    abstract fun exchangeRatesDao(): ExchangeRatesDao

    abstract fun expenseCategoriesDao(): ExpenseCategoryDao

    abstract fun expensesDao(): ExpensesDao

    abstract fun factInventoryDao(): FactInventoryDao

    abstract fun factPaymentsDao(): FactPaymentsDao

    abstract fun factSalesDao(): FactSalesDao

    abstract fun fieldPermissionsDao(): FieldPermissionsDao

    abstract fun fixedAssetsDao(): FixedAssetsDao

    abstract fun fuelQualityTestsDao(): FuelQualityTestsDao

    abstract fun fuelSalesDao(): FuelSalesDao

    abstract fun fuelTypesDao(): FuelTypesDao

    abstract fun groupsTableDao(): GroupsTableDao

    abstract fun initialInventoryDao(): InitialInventoryDao

    abstract fun inventoryLedgerDao(): InventoryLedgerDao

    abstract fun inventoryLevelsDao(): InventoryLevelsDao

    abstract fun inventoryMovementsDao(): InventoryMovementsDao

    abstract fun invoiceTemplatesDao(): InvoiceTemplatesDao

    abstract fun iotDevicesDao(): IotDevicesDao

    abstract fun jobQueueDao(): JobQueueDao

    abstract fun journalEntriesDao(): JournalEntryDao

    abstract fun journalEntryItemsDao(): JournalEntryItemsDao

    abstract fun kpiDefinitionsDao(): KpiDefinitionsDao

    abstract fun kpiResultsDao(): KpiResultsDao

    abstract fun labelTemplatesDao(): LabelTemplatesDao

    abstract fun maintenanceHistoryDao(): MaintenanceHistoryDao

    abstract fun maintenancePartsDao(): MaintenancePartsDao

    abstract fun maintenanceRequestsDao(): MaintenanceRequestsDao

    abstract fun maintenanceScheduleDao(): MaintenanceScheduleDao

    abstract fun meterReadingsDao(): MeterReadingsDao

    abstract fun notificationLogsDao(): NotificationLogsDao

    abstract fun notificationQueueDao(): NotificationQueueDao

    abstract fun notificationTemplatesDao(): NotificationTemplatesDao

    abstract fun notificationsDao(): NotificationsDao

    abstract fun partiesDao(): PartyDao

    abstract fun partyAddressesDao(): PartyAddressesDao

    abstract fun partyContactsDao(): PartyContactsDao

    abstract fun partyTypesDao(): PartyTypesDao

    abstract fun passwordResetTokensDao(): PasswordResetTokensDao

    abstract fun paymentsDao(): PaymentsDao

    abstract fun payrollDao(): PayrollDao

    abstract fun payrollItemsDao(): PayrollItemsDao

    abstract fun permissionsDao(): PermissionsDao

    abstract fun predictionsDao(): PredictionsDao

    abstract fun priceHistoryDao(): PriceHistoryDao

    abstract fun priceListItemsDao(): PriceListItemsDao

    abstract fun priceListsDao(): PriceListsDao

    abstract fun printerProfilesDao(): PrinterProfilesDao

    abstract fun productCategoriesDao(): ProductCategoryDao

    abstract fun productsDao(): ProductDao

    abstract fun pumpNozzlesDao(): PumpNozzlesDao

    abstract fun pumpsDao(): PumpsDao

    abstract fun receiptTemplatesDao(): ReceiptTemplatesDao

    abstract fun receiptsDao(): ReceiptsDao

    abstract fun restoreHistoryDao(): RestoreHistoryDao

    abstract fun rolePermissionsDao(): RolePermissionsDao

    abstract fun rolesDao(): RolesDao

    abstract fun saleItemsDao(): SaleItemsDao

    abstract fun salesTransactionsDao(): SalesTransactionsDao

    abstract fun scheduledJobsDao(): ScheduledJobsDao

    abstract fun schemaChangesDao(): SchemaChangesDao

    abstract fun screensDao(): ScreensDao

    abstract fun settingsDao(): SettingsDao

    abstract fun shiftDeliveryDao(): ShiftDeliveryDao

    abstract fun shiftExpensesDao(): ShiftExpensesDao

    abstract fun shiftSalesDao(): ShiftSalesDao

    abstract fun shiftsDao(): ShiftsDao

    abstract fun smartAlertLogsDao(): SmartAlertLogsDao

    abstract fun smartAlertsDao(): SmartAlertsDao

    abstract fun smsLogsDao(): SmsLogsDao

    abstract fun smsMessagesDao(): SmsMessagesDao

    abstract fun smsRemindersDao(): SmsRemindersDao

    abstract fun smsTemplatesDao(): SmsTemplatesDao

    abstract fun smsWhitelistDao(): SmsWhitelistDao

    abstract fun stationSettingsDao(): StationSettingsDao

    abstract fun stationsDao(): StationsDao

    abstract fun stockAlertsDao(): StockAlertsDao

    abstract fun stockMovementsDao(): StockMovementsDao

    abstract fun stocktakeDetailsDao(): StocktakeDetailsDao

    abstract fun stocktakesDao(): StocktakesDao

    abstract fun supplierLedgerDao(): SupplierLedgerDao

    abstract fun syncConflictsDao(): SyncConflictsDao

    abstract fun syncDevicesDao(): SyncDevicesDao

    abstract fun syncLogsDao(): SyncLogsDao

    abstract fun syncQueueDao(): SyncQueueDao

    abstract fun systemEventsDao(): SystemEventsDao

    abstract fun systemLogsDao(): SystemLogsDao

    abstract fun systemSettingsDao(): SystemSettingsDao

    abstract fun tankLedgerDao(): TankLedgerDao

    abstract fun tankLevelLogDao(): TankLevelLogDao

    abstract fun tankRefillsDao(): TankRefillsDao

    abstract fun tanksDao(): TanksDao

    abstract fun terminalsDao(): TerminalsDao

    abstract fun unitsDao(): UnitsDao

    abstract fun userActivityLogDao(): UserActivityLogDao

    abstract fun userPermissionsDao(): UserPermissionsDao

    abstract fun userSessionsDao(): UserSessionsDao

    abstract fun userSettingsDao(): UserSettingsDao

    abstract fun usersDao(): UsersDao

    abstract fun vehicleAccidentsDao(): VehicleAccidentsDao

    abstract fun vehicleExpensesDao(): VehicleExpensesDao

    abstract fun vehicleInsuranceDao(): VehicleInsuranceDao

    abstract fun vehicleLocationsDao(): VehicleLocationsDao

    abstract fun vehicleMaintenanceDao(): VehicleMaintenanceDao

    abstract fun vehicleTripsDao(): VehicleTripsDao

    abstract fun vehiclesDao(): VehiclesDao

    abstract fun warehousesDao(): WarehousesDao
}
