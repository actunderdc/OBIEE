
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oracle.bi.web.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateCauseAndEffectLinkagesSessionID_QNAME = new QName("urn://oracle.bi.webservices/v12", "sessionID");
    private final static QName _DescribeSubjectAreaWithSortSortOrderCaseSensitive_QNAME = new QName("urn://oracle.bi.webservices/v12", "sortOrderCaseSensitive");
    private final static QName _DescribeSubjectAreaWithSortSortOrder_QNAME = new QName("urn://oracle.bi.webservices/v12", "sortOrder");
    private final static QName _ScorecardSettingsTimeOut_QNAME = new QName("urn://oracle.bi.webservices/v12", "timeOut");
    private final static QName _ScorecardSettingsItemInfo_QNAME = new QName("urn://oracle.bi.webservices/v12", "itemInfo");
    private final static QName _OpenTreeNodeResultNodeStrategy_QNAME = new QName("urn://oracle.bi.webservices/v12", "nodeStrategy");
    private final static QName _OpenTreeNodeResultNodeInitiative_QNAME = new QName("urn://oracle.bi.webservices/v12", "nodeInitiative");
    private final static QName _AddStrategyNodeResultNode_QNAME = new QName("urn://oracle.bi.webservices/v12", "node");
    private final static QName _PerspectivePermission_QNAME = new QName("urn://oracle.bi.webservices/v12", "permission");
    private final static QName _PerspectiveObj_QNAME = new QName("urn://oracle.bi.webservices/v12", "obj");
    private final static QName _UpdateScorecardItemACLId_QNAME = new QName("urn://oracle.bi.webservices/v12", "id");
    private final static QName _KPIDimensionPinningDisplayValue_QNAME = new QName("urn://oracle.bi.webservices/v12", "displayValue");
    private final static QName _StrategyNodeBalanceInfo_QNAME = new QName("urn://oracle.bi.webservices/v12", "balanceInfo");
    private final static QName _ScorecardNodeResultValidActionLinks_QNAME = new QName("urn://oracle.bi.webservices/v12", "validActionLinks");
    private final static QName _AnnotationEntryTimeDisplay_QNAME = new QName("urn://oracle.bi.webservices/v12", "entryTimeDisplay");
    private final static QName _KPIDimensionValueLevelID_QNAME = new QName("urn://oracle.bi.webservices/v12", "levelID");
    private final static QName _KPIDimensionReferencesKPIDimensionReferenceMappedToDimensionID_QNAME = new QName("urn://oracle.bi.webservices/v12", "mappedToDimensionID");
    private final static QName _KPIDimensionReferencesKPIDimensionReferenceDefaultValue_QNAME = new QName("urn://oracle.bi.webservices/v12", "defaultValue");
    private final static QName _KPIDimensionReferencesKPIDimensionReferenceDisplayLabel_QNAME = new QName("urn://oracle.bi.webservices/v12", "displayLabel");
    private final static QName _OverriddenAssessmentOverriddenTimeDisplay_QNAME = new QName("urn://oracle.bi.webservices/v12", "overriddenTimeDisplay");
    private final static QName _GetScorecardDetailsOptions_QNAME = new QName("urn://oracle.bi.webservices/v12", "options");
    private final static QName _GetAnnotationsOverridesOnly_QNAME = new QName("urn://oracle.bi.webservices/v12", "overridesOnly");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oracle.bi.web.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScorecardDimensionReferences }
     * 
     */
    public ScorecardDimensionReferences createScorecardDimensionReferences() {
        return new ScorecardDimensionReferences();
    }

    /**
     * Create an instance of {@link KPIDimensionReferences }
     * 
     */
    public KPIDimensionReferences createKPIDimensionReferences() {
        return new KPIDimensionReferences();
    }

    /**
     * Create an instance of {@link JobInfo }
     * 
     */
    public JobInfo createJobInfo() {
        return new JobInfo();
    }

    /**
     * Create an instance of {@link GetCSPWhitelist }
     * 
     */
    public GetCSPWhitelist createGetCSPWhitelist() {
        return new GetCSPWhitelist();
    }

    /**
     * Create an instance of {@link FetchNextKPIDimensionLOVResult }
     * 
     */
    public FetchNextKPIDimensionLOVResult createFetchNextKPIDimensionLOVResult() {
        return new FetchNextKPIDimensionLOVResult();
    }

    /**
     * Create an instance of {@link KPIDimensionLOVExecutionStatus }
     * 
     */
    public KPIDimensionLOVExecutionStatus createKPIDimensionLOVExecutionStatus() {
        return new KPIDimensionLOVExecutionStatus();
    }

    /**
     * Create an instance of {@link UnprovisionServiceInstance }
     * 
     */
    public UnprovisionServiceInstance createUnprovisionServiceInstance() {
        return new UnprovisionServiceInstance();
    }

    /**
     * Create an instance of {@link GenerateKPIDrillToResult }
     * 
     */
    public GenerateKPIDrillToResult createGenerateKPIDrillToResult() {
        return new GenerateKPIDrillToResult();
    }

    /**
     * Create an instance of {@link ScorecardGenerateDrillToStatus }
     * 
     */
    public ScorecardGenerateDrillToStatus createScorecardGenerateDrillToStatus() {
        return new ScorecardGenerateDrillToStatus();
    }

    /**
     * Create an instance of {@link UpdateCauseAndEffectLinkages }
     * 
     */
    public UpdateCauseAndEffectLinkages createUpdateCauseAndEffectLinkages() {
        return new UpdateCauseAndEffectLinkages();
    }

    /**
     * Create an instance of {@link CauseAndEffectLinkages }
     * 
     */
    public CauseAndEffectLinkages createCauseAndEffectLinkages() {
        return new CauseAndEffectLinkages();
    }

    /**
     * Create an instance of {@link PurgeJobInstancesResult }
     * 
     */
    public PurgeJobInstancesResult createPurgeJobInstancesResult() {
        return new PurgeJobInstancesResult();
    }

    /**
     * Create an instance of {@link CloseScorecardAssessment }
     * 
     */
    public CloseScorecardAssessment createCloseScorecardAssessment() {
        return new CloseScorecardAssessment();
    }

    /**
     * Create an instance of {@link DescribeColumn }
     * 
     */
    public DescribeColumn createDescribeColumn() {
        return new DescribeColumn();
    }

    /**
     * Create an instance of {@link OpenScorecardResult }
     * 
     */
    public OpenScorecardResult createOpenScorecardResult() {
        return new OpenScorecardResult();
    }

    /**
     * Create an instance of {@link Logon }
     * 
     */
    public Logon createLogon() {
        return new Logon();
    }

    /**
     * Create an instance of {@link GetObjectCreateListResult }
     * 
     */
    public GetObjectCreateListResult createGetObjectCreateListResult() {
        return new GetObjectCreateListResult();
    }

    /**
     * Create an instance of {@link ObjectGroup }
     * 
     */
    public ObjectGroup createObjectGroup() {
        return new ObjectGroup();
    }

    /**
     * Create an instance of {@link DescribeSubjectAreaWithSort }
     * 
     */
    public DescribeSubjectAreaWithSort createDescribeSubjectAreaWithSort() {
        return new DescribeSubjectAreaWithSort();
    }

    /**
     * Create an instance of {@link GetSubItemsResult }
     * 
     */
    public GetSubItemsResult createGetSubItemsResult() {
        return new GetSubItemsResult();
    }

    /**
     * Create an instance of {@link ItemInfo }
     * 
     */
    public ItemInfo createItemInfo() {
        return new ItemInfo();
    }

    /**
     * Create an instance of {@link GetConditionCustomizableReportElementsResult }
     * 
     */
    public GetConditionCustomizableReportElementsResult createGetConditionCustomizableReportElementsResult() {
        return new GetConditionCustomizableReportElementsResult();
    }

    /**
     * Create an instance of {@link ApplyReportParamsResult }
     * 
     */
    public ApplyReportParamsResult createApplyReportParamsResult() {
        return new ApplyReportParamsResult();
    }

    /**
     * Create an instance of {@link EnableIBot }
     * 
     */
    public EnableIBot createEnableIBot() {
        return new EnableIBot();
    }

    /**
     * Create an instance of {@link Unsubscribe }
     * 
     */
    public Unsubscribe createUnsubscribe() {
        return new Unsubscribe();
    }

    /**
     * Create an instance of {@link DeleteInitiativeNodeResult }
     * 
     */
    public DeleteInitiativeNodeResult createDeleteInitiativeNodeResult() {
        return new DeleteInitiativeNodeResult();
    }

    /**
     * Create an instance of {@link PrepareCacheResult }
     * 
     */
    public PrepareCacheResult createPrepareCacheResult() {
        return new PrepareCacheResult();
    }

    /**
     * Create an instance of {@link MoveItemResult }
     * 
     */
    public MoveItemResult createMoveItemResult() {
        return new MoveItemResult();
    }

    /**
     * Create an instance of {@link GetUserHomeDirPathResult }
     * 
     */
    public GetUserHomeDirPathResult createGetUserHomeDirPathResult() {
        return new GetUserHomeDirPathResult();
    }

    /**
     * Create an instance of {@link RestoreTenantResult }
     * 
     */
    public RestoreTenantResult createRestoreTenantResult() {
        return new RestoreTenantResult();
    }

    /**
     * Create an instance of {@link DescribeSubjectArea }
     * 
     */
    public DescribeSubjectArea createDescribeSubjectArea() {
        return new DescribeSubjectArea();
    }

    /**
     * Create an instance of {@link DeleteFavorite }
     * 
     */
    public DeleteFavorite createDeleteFavorite() {
        return new DeleteFavorite();
    }

    /**
     * Create an instance of {@link CancelJobInstance }
     * 
     */
    public CancelJobInstance createCancelJobInstance() {
        return new CancelJobInstance();
    }

    /**
     * Create an instance of {@link UpdateMostRecents }
     * 
     */
    public UpdateMostRecents createUpdateMostRecents() {
        return new UpdateMostRecents();
    }

    /**
     * Create an instance of {@link GetPermissions }
     * 
     */
    public GetPermissions createGetPermissions() {
        return new GetPermissions();
    }

    /**
     * Create an instance of {@link ACL }
     * 
     */
    public ACL createACL() {
        return new ACL();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link UpdateScorecardViewResult }
     * 
     */
    public UpdateScorecardViewResult createUpdateScorecardViewResult() {
        return new UpdateScorecardViewResult();
    }

    /**
     * Create an instance of {@link ScorecardView }
     * 
     */
    public ScorecardView createScorecardView() {
        return new ScorecardView();
    }

    /**
     * Create an instance of {@link AddReportToPage }
     * 
     */
    public AddReportToPage createAddReportToPage() {
        return new AddReportToPage();
    }

    /**
     * Create an instance of {@link ReportRef }
     * 
     */
    public ReportRef createReportRef() {
        return new ReportRef();
    }

    /**
     * Create an instance of {@link ReportParams }
     * 
     */
    public ReportParams createReportParams() {
        return new ReportParams();
    }

    /**
     * Create an instance of {@link ReportHTMLOptions }
     * 
     */
    public ReportHTMLOptions createReportHTMLOptions() {
        return new ReportHTMLOptions();
    }

    /**
     * Create an instance of {@link GetKPIContributionWheelDimensionsResult }
     * 
     */
    public GetKPIContributionWheelDimensionsResult createGetKPIContributionWheelDimensionsResult() {
        return new GetKPIContributionWheelDimensionsResult();
    }

    /**
     * Create an instance of {@link GetFavoritesResult }
     * 
     */
    public GetFavoritesResult createGetFavoritesResult() {
        return new GetFavoritesResult();
    }

    /**
     * Create an instance of {@link FavoriteItem }
     * 
     */
    public FavoriteItem createFavoriteItem() {
        return new FavoriteItem();
    }

    /**
     * Create an instance of {@link AddAnnotation }
     * 
     */
    public AddAnnotation createAddAnnotation() {
        return new AddAnnotation();
    }

    /**
     * Create an instance of {@link ForgetAccounts }
     * 
     */
    public ForgetAccounts createForgetAccounts() {
        return new ForgetAccounts();
    }

    /**
     * Create an instance of {@link GetGlobalPrivilegeACLResult }
     * 
     */
    public GetGlobalPrivilegeACLResult createGetGlobalPrivilegeACLResult() {
        return new GetGlobalPrivilegeACLResult();
    }

    /**
     * Create an instance of {@link ImportServiceResult }
     * 
     */
    public ImportServiceResult createImportServiceResult() {
        return new ImportServiceResult();
    }

    /**
     * Create an instance of {@link UpdateFavoritesResult }
     * 
     */
    public UpdateFavoritesResult createUpdateFavoritesResult() {
        return new UpdateFavoritesResult();
    }

    /**
     * Create an instance of {@link GetPermissionsExResult }
     * 
     */
    public GetPermissionsExResult createGetPermissionsExResult() {
        return new GetPermissionsExResult();
    }

    /**
     * Create an instance of {@link GetCommonBodyHtmlResult }
     * 
     */
    public GetCommonBodyHtmlResult createGetCommonBodyHtmlResult() {
        return new GetCommonBodyHtmlResult();
    }

    /**
     * Create an instance of {@link MaintenanceMode }
     * 
     */
    public MaintenanceMode createMaintenanceMode() {
        return new MaintenanceMode();
    }

    /**
     * Create an instance of {@link EndPage }
     * 
     */
    public EndPage createEndPage() {
        return new EndPage();
    }

    /**
     * Create an instance of {@link AddReportToPageResult }
     * 
     */
    public AddReportToPageResult createAddReportToPageResult() {
        return new AddReportToPageResult();
    }

    /**
     * Create an instance of {@link GetIBotStatusResult }
     * 
     */
    public GetIBotStatusResult createGetIBotStatusResult() {
        return new GetIBotStatusResult();
    }

    /**
     * Create an instance of {@link ClearQueryCacheResult }
     * 
     */
    public ClearQueryCacheResult createClearQueryCacheResult() {
        return new ClearQueryCacheResult();
    }

    /**
     * Create an instance of {@link UpdateGlobalPrivilegeACLResult }
     * 
     */
    public UpdateGlobalPrivilegeACLResult createUpdateGlobalPrivilegeACLResult() {
        return new UpdateGlobalPrivilegeACLResult();
    }

    /**
     * Create an instance of {@link GetReportElements }
     * 
     */
    public GetReportElements createGetReportElements() {
        return new GetReportElements();
    }

    /**
     * Create an instance of {@link ResumeServiceResult }
     * 
     */
    public ResumeServiceResult createResumeServiceResult() {
        return new ResumeServiceResult();
    }

    /**
     * Create an instance of {@link DescribeTableWithSort }
     * 
     */
    public DescribeTableWithSort createDescribeTableWithSort() {
        return new DescribeTableWithSort();
    }

    /**
     * Create an instance of {@link SetItemPropertyResult }
     * 
     */
    public SetItemPropertyResult createSetItemPropertyResult() {
        return new SetItemPropertyResult();
    }

    /**
     * Create an instance of {@link LeaveGroupsResult }
     * 
     */
    public LeaveGroupsResult createLeaveGroupsResult() {
        return new LeaveGroupsResult();
    }

    /**
     * Create an instance of {@link EnableIBotResult }
     * 
     */
    public EnableIBotResult createEnableIBotResult() {
        return new EnableIBotResult();
    }

    /**
     * Create an instance of {@link ProvisionTenantResult }
     * 
     */
    public ProvisionTenantResult createProvisionTenantResult() {
        return new ProvisionTenantResult();
    }

    /**
     * Create an instance of {@link RenameAccountsEx }
     * 
     */
    public RenameAccountsEx createRenameAccountsEx() {
        return new RenameAccountsEx();
    }

    /**
     * Create an instance of {@link RenameAccount }
     * 
     */
    public RenameAccount createRenameAccount() {
        return new RenameAccount();
    }

    /**
     * Create an instance of {@link SendMessageResult }
     * 
     */
    public SendMessageResult createSendMessageResult() {
        return new SendMessageResult();
    }

    /**
     * Create an instance of {@link GetScorecardViewDimensionsResult }
     * 
     */
    public GetScorecardViewDimensionsResult createGetScorecardViewDimensionsResult() {
        return new GetScorecardViewDimensionsResult();
    }

    /**
     * Create an instance of {@link UpdateCSPWhitelist }
     * 
     */
    public UpdateCSPWhitelist createUpdateCSPWhitelist() {
        return new UpdateCSPWhitelist();
    }

    /**
     * Create an instance of {@link ImpersonateResult }
     * 
     */
    public ImpersonateResult createImpersonateResult() {
        return new ImpersonateResult();
    }

    /**
     * Create an instance of {@link ExecuteIBotNow }
     * 
     */
    public ExecuteIBotNow createExecuteIBotNow() {
        return new ExecuteIBotNow();
    }

    /**
     * Create an instance of {@link CreateLinkResult }
     * 
     */
    public CreateLinkResult createCreateLinkResult() {
        return new CreateLinkResult();
    }

    /**
     * Create an instance of {@link GetObjectTypes }
     * 
     */
    public GetObjectTypes createGetObjectTypes() {
        return new GetObjectTypes();
    }

    /**
     * Create an instance of {@link GenerateDrillTo }
     * 
     */
    public GenerateDrillTo createGenerateDrillTo() {
        return new GenerateDrillTo();
    }

    /**
     * Create an instance of {@link KPIRequest }
     * 
     */
    public KPIRequest createKPIRequest() {
        return new KPIRequest();
    }

    /**
     * Create an instance of {@link KPIColumnList }
     * 
     */
    public KPIColumnList createKPIColumnList() {
        return new KPIColumnList();
    }

    /**
     * Create an instance of {@link KPIVariableList }
     * 
     */
    public KPIVariableList createKPIVariableList() {
        return new KPIVariableList();
    }

    /**
     * Create an instance of {@link PurgeLogResult }
     * 
     */
    public PurgeLogResult createPurgeLogResult() {
        return new PurgeLogResult();
    }

    /**
     * Create an instance of {@link DeleteFavoriteCategoryResult }
     * 
     */
    public DeleteFavoriteCategoryResult createDeleteFavoriteCategoryResult() {
        return new DeleteFavoriteCategoryResult();
    }

    /**
     * Create an instance of {@link EvaluateCondition }
     * 
     */
    public EvaluateCondition createEvaluateCondition() {
        return new EvaluateCondition();
    }

    /**
     * Create an instance of {@link ForgetAccountsEx }
     * 
     */
    public ForgetAccountsEx createForgetAccountsEx() {
        return new ForgetAccountsEx();
    }

    /**
     * Create an instance of {@link ForgetAccount }
     * 
     */
    public ForgetAccount createForgetAccount() {
        return new ForgetAccount();
    }

    /**
     * Create an instance of {@link KeepAlive }
     * 
     */
    public KeepAlive createKeepAlive() {
        return new KeepAlive();
    }

    /**
     * Create an instance of {@link EvaluateInlineConditionResult }
     * 
     */
    public EvaluateInlineConditionResult createEvaluateInlineConditionResult() {
        return new EvaluateInlineConditionResult();
    }

    /**
     * Create an instance of {@link GetCounts }
     * 
     */
    public GetCounts createGetCounts() {
        return new GetCounts();
    }

    /**
     * Create an instance of {@link SegmentationOptions }
     * 
     */
    public SegmentationOptions createSegmentationOptions() {
        return new SegmentationOptions();
    }

    /**
     * Create an instance of {@link AddFavoriteResult }
     * 
     */
    public AddFavoriteResult createAddFavoriteResult() {
        return new AddFavoriteResult();
    }

    /**
     * Create an instance of {@link ArchiveTenantResult }
     * 
     */
    public ArchiveTenantResult createArchiveTenantResult() {
        return new ArchiveTenantResult();
    }

    /**
     * Create an instance of {@link RemoveFolderResult }
     * 
     */
    public RemoveFolderResult createRemoveFolderResult() {
        return new RemoveFolderResult();
    }

    /**
     * Create an instance of {@link GetSubItems }
     * 
     */
    public GetSubItems createGetSubItems() {
        return new GetSubItems();
    }

    /**
     * Create an instance of {@link GetSubItemsParams }
     * 
     */
    public GetSubItemsParams createGetSubItemsParams() {
        return new GetSubItemsParams();
    }

    /**
     * Create an instance of {@link GetScorecardViewDimensions }
     * 
     */
    public GetScorecardViewDimensions createGetScorecardViewDimensions() {
        return new GetScorecardViewDimensions();
    }

    /**
     * Create an instance of {@link GetPromptedFilters }
     * 
     */
    public GetPromptedFilters createGetPromptedFilters() {
        return new GetPromptedFilters();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link AddScorecardView }
     * 
     */
    public AddScorecardView createAddScorecardView() {
        return new AddScorecardView();
    }

    /**
     * Create an instance of {@link GetHeadersHtml }
     * 
     */
    public GetHeadersHtml createGetHeadersHtml() {
        return new GetHeadersHtml();
    }

    /**
     * Create an instance of {@link MoveInitiativeNode }
     * 
     */
    public MoveInitiativeNode createMoveInitiativeNode() {
        return new MoveInitiativeNode();
    }

    /**
     * Create an instance of {@link MoveInitiativeNodeResult }
     * 
     */
    public MoveInitiativeNodeResult createMoveInitiativeNodeResult() {
        return new MoveInitiativeNodeResult();
    }

    /**
     * Create an instance of {@link InitiativeNodeList }
     * 
     */
    public InitiativeNodeList createInitiativeNodeList() {
        return new InitiativeNodeList();
    }

    /**
     * Create an instance of {@link DeleteItem }
     * 
     */
    public DeleteItem createDeleteItem() {
        return new DeleteItem();
    }

    /**
     * Create an instance of {@link GetSubjectAreasResult }
     * 
     */
    public GetSubjectAreasResult createGetSubjectAreasResult() {
        return new GetSubjectAreasResult();
    }

    /**
     * Create an instance of {@link SASubjectArea }
     * 
     */
    public SASubjectArea createSASubjectArea() {
        return new SASubjectArea();
    }

    /**
     * Create an instance of {@link GetObjectCategoriesResult }
     * 
     */
    public GetObjectCategoriesResult createGetObjectCategoriesResult() {
        return new GetObjectCategoriesResult();
    }

    /**
     * Create an instance of {@link ObjectCategory }
     * 
     */
    public ObjectCategory createObjectCategory() {
        return new ObjectCategory();
    }

    /**
     * Create an instance of {@link RenameAccountsResult }
     * 
     */
    public RenameAccountsResult createRenameAccountsResult() {
        return new RenameAccountsResult();
    }

    /**
     * Create an instance of {@link Logonex }
     * 
     */
    public Logonex createLogonex() {
        return new Logonex();
    }

    /**
     * Create an instance of {@link SAWSessionParameters }
     * 
     */
    public SAWSessionParameters createSAWSessionParameters() {
        return new SAWSessionParameters();
    }

    /**
     * Create an instance of {@link GetSessionVariables }
     * 
     */
    public GetSessionVariables createGetSessionVariables() {
        return new GetSessionVariables();
    }

    /**
     * Create an instance of {@link WriteListFilesResult }
     * 
     */
    public WriteListFilesResult createWriteListFilesResult() {
        return new WriteListFilesResult();
    }

    /**
     * Create an instance of {@link AddPerspectiveResult }
     * 
     */
    public AddPerspectiveResult createAddPerspectiveResult() {
        return new AddPerspectiveResult();
    }

    /**
     * Create an instance of {@link Perspective }
     * 
     */
    public Perspective createPerspective() {
        return new Perspective();
    }

    /**
     * Create an instance of {@link UpdateScorecardItemACLResult }
     * 
     */
    public UpdateScorecardItemACLResult createUpdateScorecardItemACLResult() {
        return new UpdateScorecardItemACLResult();
    }

    /**
     * Create an instance of {@link UpdatedScorecardACLItem }
     * 
     */
    public UpdatedScorecardACLItem createUpdatedScorecardACLItem() {
        return new UpdatedScorecardACLItem();
    }

    /**
     * Create an instance of {@link CancelJob }
     * 
     */
    public CancelJob createCancelJob() {
        return new CancelJob();
    }

    /**
     * Create an instance of {@link GetBIPSVariablesResult }
     * 
     */
    public GetBIPSVariablesResult createGetBIPSVariablesResult() {
        return new GetBIPSVariablesResult();
    }

    /**
     * Create an instance of {@link WriteObjects }
     * 
     */
    public WriteObjects createWriteObjects() {
        return new WriteObjects();
    }

    /**
     * Create an instance of {@link CatalogObject }
     * 
     */
    public CatalogObject createCatalogObject() {
        return new CatalogObject();
    }

    /**
     * Create an instance of {@link SaveResultSet }
     * 
     */
    public SaveResultSet createSaveResultSet() {
        return new SaveResultSet();
    }

    /**
     * Create an instance of {@link TreeNodePath }
     * 
     */
    public TreeNodePath createTreeNodePath() {
        return new TreeNodePath();
    }

    /**
     * Create an instance of {@link ExecuteScorecardResult }
     * 
     */
    public ExecuteScorecardResult createExecuteScorecardResult() {
        return new ExecuteScorecardResult();
    }

    /**
     * Create an instance of {@link ScorecardExecutionStatus }
     * 
     */
    public ScorecardExecutionStatus createScorecardExecutionStatus() {
        return new ScorecardExecutionStatus();
    }

    /**
     * Create an instance of {@link DeleteService }
     * 
     */
    public DeleteService createDeleteService() {
        return new DeleteService();
    }

    /**
     * Create an instance of {@link PurgeLog }
     * 
     */
    public PurgeLog createPurgeLog() {
        return new PurgeLog();
    }

    /**
     * Create an instance of {@link UpdateInitiativeNodeResult }
     * 
     */
    public UpdateInitiativeNodeResult createUpdateInitiativeNodeResult() {
        return new UpdateInitiativeNodeResult();
    }

    /**
     * Create an instance of {@link InitiativeNode }
     * 
     */
    public InitiativeNode createInitiativeNode() {
        return new InitiativeNode();
    }

    /**
     * Create an instance of {@link OpenTreeNodeResult }
     * 
     */
    public OpenTreeNodeResult createOpenTreeNodeResult() {
        return new OpenTreeNodeResult();
    }

    /**
     * Create an instance of {@link StrategyNode }
     * 
     */
    public StrategyNode createStrategyNode() {
        return new StrategyNode();
    }

    /**
     * Create an instance of {@link GetBIPSVariables }
     * 
     */
    public GetBIPSVariables createGetBIPSVariables() {
        return new GetBIPSVariables();
    }

    /**
     * Create an instance of {@link UpdateGlobalPrivilegeACL }
     * 
     */
    public UpdateGlobalPrivilegeACL createUpdateGlobalPrivilegeACL() {
        return new UpdateGlobalPrivilegeACL();
    }

    /**
     * Create an instance of {@link UpdateACLParams }
     * 
     */
    public UpdateACLParams createUpdateACLParams() {
        return new UpdateACLParams();
    }

    /**
     * Create an instance of {@link OverrideAssessmentResult }
     * 
     */
    public OverrideAssessmentResult createOverrideAssessmentResult() {
        return new OverrideAssessmentResult();
    }

    /**
     * Create an instance of {@link AssessmentOverrideStatus }
     * 
     */
    public AssessmentOverrideStatus createAssessmentOverrideStatus() {
        return new AssessmentOverrideStatus();
    }

    /**
     * Create an instance of {@link CopyItemResult }
     * 
     */
    public CopyItemResult createCopyItemResult() {
        return new CopyItemResult();
    }

    /**
     * Create an instance of {@link UpgradeXML }
     * 
     */
    public UpgradeXML createUpgradeXML() {
        return new UpgradeXML();
    }

    /**
     * Create an instance of {@link CreateLink }
     * 
     */
    public CreateLink createCreateLink() {
        return new CreateLink();
    }

    /**
     * Create an instance of {@link UnarchiveTenantResult }
     * 
     */
    public UnarchiveTenantResult createUnarchiveTenantResult() {
        return new UnarchiveTenantResult();
    }

    /**
     * Create an instance of {@link ExportServiceResult }
     * 
     */
    public ExportServiceResult createExportServiceResult() {
        return new ExportServiceResult();
    }

    /**
     * Create an instance of {@link CreateScorecard }
     * 
     */
    public CreateScorecard createCreateScorecard() {
        return new CreateScorecard();
    }

    /**
     * Create an instance of {@link ExportResult }
     * 
     */
    public ExportResult createExportResult() {
        return new ExportResult();
    }

    /**
     * Create an instance of {@link GetObjectCreateList }
     * 
     */
    public GetObjectCreateList createGetObjectCreateList() {
        return new GetObjectCreateList();
    }

    /**
     * Create an instance of {@link KeepAliveResult }
     * 
     */
    public KeepAliveResult createKeepAliveResult() {
        return new KeepAliveResult();
    }

    /**
     * Create an instance of {@link GetScorecardKPIDimensions }
     * 
     */
    public GetScorecardKPIDimensions createGetScorecardKPIDimensions() {
        return new GetScorecardKPIDimensions();
    }

    /**
     * Create an instance of {@link MoveIBotResult }
     * 
     */
    public MoveIBotResult createMoveIBotResult() {
        return new MoveIBotResult();
    }

    /**
     * Create an instance of {@link SetItemAttributes }
     * 
     */
    public SetItemAttributes createSetItemAttributes() {
        return new SetItemAttributes();
    }

    /**
     * Create an instance of {@link DescribeTableResult }
     * 
     */
    public DescribeTableResult createDescribeTableResult() {
        return new DescribeTableResult();
    }

    /**
     * Create an instance of {@link SATable }
     * 
     */
    public SATable createSATable() {
        return new SATable();
    }

    /**
     * Create an instance of {@link SetBridgeResult }
     * 
     */
    public SetBridgeResult createSetBridgeResult() {
        return new SetBridgeResult();
    }

    /**
     * Create an instance of {@link GetJobInfoResult }
     * 
     */
    public GetJobInfoResult createGetJobInfoResult() {
        return new GetJobInfoResult();
    }

    /**
     * Create an instance of {@link EndPageResult }
     * 
     */
    public EndPageResult createEndPageResult() {
        return new EndPageResult();
    }

    /**
     * Create an instance of {@link CloseScorecardResult }
     * 
     */
    public CloseScorecardResult createCloseScorecardResult() {
        return new CloseScorecardResult();
    }

    /**
     * Create an instance of {@link VoidType }
     * 
     */
    public VoidType createVoidType() {
        return new VoidType();
    }

    /**
     * Create an instance of {@link GetRelatedSubjectAreas }
     * 
     */
    public GetRelatedSubjectAreas createGetRelatedSubjectAreas() {
        return new GetRelatedSubjectAreas();
    }

    /**
     * Create an instance of {@link Export }
     * 
     */
    public Export createExport() {
        return new Export();
    }

    /**
     * Create an instance of {@link CatalogItemsFilter }
     * 
     */
    public CatalogItemsFilter createCatalogItemsFilter() {
        return new CatalogItemsFilter();
    }

    /**
     * Create an instance of {@link DeleteCSPWhitelistResult }
     * 
     */
    public DeleteCSPWhitelistResult createDeleteCSPWhitelistResult() {
        return new DeleteCSPWhitelistResult();
    }

    /**
     * Create an instance of {@link InitiateAnalysisExport }
     * 
     */
    public InitiateAnalysisExport createInitiateAnalysisExport() {
        return new InitiateAnalysisExport();
    }

    /**
     * Create an instance of {@link AnalysisExportExecutionOptions }
     * 
     */
    public AnalysisExportExecutionOptions createAnalysisExportExecutionOptions() {
        return new AnalysisExportExecutionOptions();
    }

    /**
     * Create an instance of {@link CompleteAnalysisExport }
     * 
     */
    public CompleteAnalysisExport createCompleteAnalysisExport() {
        return new CompleteAnalysisExport();
    }

    /**
     * Create an instance of {@link IsMemberResult }
     * 
     */
    public IsMemberResult createIsMemberResult() {
        return new IsMemberResult();
    }

    /**
     * Create an instance of {@link WriteListFiles }
     * 
     */
    public WriteListFiles createWriteListFiles() {
        return new WriteListFiles();
    }

    /**
     * Create an instance of {@link GetFavorites }
     * 
     */
    public GetFavorites createGetFavorites() {
        return new GetFavorites();
    }

    /**
     * Create an instance of {@link GetPermissionsEx }
     * 
     */
    public GetPermissionsEx createGetPermissionsEx() {
        return new GetPermissionsEx();
    }

    /**
     * Create an instance of {@link GetHtmlForPageWithOneReport }
     * 
     */
    public GetHtmlForPageWithOneReport createGetHtmlForPageWithOneReport() {
        return new GetHtmlForPageWithOneReport();
    }

    /**
     * Create an instance of {@link StartPageParams }
     * 
     */
    public StartPageParams createStartPageParams() {
        return new StartPageParams();
    }

    /**
     * Create an instance of {@link ExecuteKPIDimensionLOVQueryResult }
     * 
     */
    public ExecuteKPIDimensionLOVQueryResult createExecuteKPIDimensionLOVQueryResult() {
        return new ExecuteKPIDimensionLOVQueryResult();
    }

    /**
     * Create an instance of {@link GetKPIContributionWheelDimensions }
     * 
     */
    public GetKPIContributionWheelDimensions createGetKPIContributionWheelDimensions() {
        return new GetKPIContributionWheelDimensions();
    }

    /**
     * Create an instance of {@link RemoveJobsResult }
     * 
     */
    public RemoveJobsResult createRemoveJobsResult() {
        return new RemoveJobsResult();
    }

    /**
     * Create an instance of {@link GetGlobalPrivilegeACL }
     * 
     */
    public GetGlobalPrivilegeACL createGetGlobalPrivilegeACL() {
        return new GetGlobalPrivilegeACL();
    }

    /**
     * Create an instance of {@link GetCommonBodyHtml }
     * 
     */
    public GetCommonBodyHtml createGetCommonBodyHtml() {
        return new GetCommonBodyHtml();
    }

    /**
     * Create an instance of {@link GetPromptElements }
     * 
     */
    public GetPromptElements createGetPromptElements() {
        return new GetPromptElements();
    }

    /**
     * Create an instance of {@link NameValuePair }
     * 
     */
    public NameValuePair createNameValuePair() {
        return new NameValuePair();
    }

    /**
     * Create an instance of {@link ClearRoleHierarchyCacheResult }
     * 
     */
    public ClearRoleHierarchyCacheResult createClearRoleHierarchyCacheResult() {
        return new ClearRoleHierarchyCacheResult();
    }

    /**
     * Create an instance of {@link GetMostRecents }
     * 
     */
    public GetMostRecents createGetMostRecents() {
        return new GetMostRecents();
    }

    /**
     * Create an instance of {@link LogonmtResult }
     * 
     */
    public LogonmtResult createLogonmtResult() {
        return new LogonmtResult();
    }

    /**
     * Create an instance of {@link DeleteScorecardView }
     * 
     */
    public DeleteScorecardView createDeleteScorecardView() {
        return new DeleteScorecardView();
    }

    /**
     * Create an instance of {@link GetAccountTenantIDResult }
     * 
     */
    public GetAccountTenantIDResult createGetAccountTenantIDResult() {
        return new GetAccountTenantIDResult();
    }

    /**
     * Create an instance of {@link DeleteStrategyNodeResult }
     * 
     */
    public DeleteStrategyNodeResult createDeleteStrategyNodeResult() {
        return new DeleteStrategyNodeResult();
    }

    /**
     * Create an instance of {@link CancelJobResult }
     * 
     */
    public CancelJobResult createCancelJobResult() {
        return new CancelJobResult();
    }

    /**
     * Create an instance of {@link OverrideAssessment }
     * 
     */
    public OverrideAssessment createOverrideAssessment() {
        return new OverrideAssessment();
    }

    /**
     * Create an instance of {@link ExportService }
     * 
     */
    public ExportService createExportService() {
        return new ExportService();
    }

    /**
     * Create an instance of {@link RemoveFolder }
     * 
     */
    public RemoveFolder createRemoveFolder() {
        return new RemoveFolder();
    }

    /**
     * Create an instance of {@link UpdateCatalogItemACL }
     * 
     */
    public UpdateCatalogItemACL createUpdateCatalogItemACL() {
        return new UpdateCatalogItemACL();
    }

    /**
     * Create an instance of {@link UpdateCatalogItemACLParams }
     * 
     */
    public UpdateCatalogItemACLParams createUpdateCatalogItemACLParams() {
        return new UpdateCatalogItemACLParams();
    }

    /**
     * Create an instance of {@link GetMembers }
     * 
     */
    public GetMembers createGetMembers() {
        return new GetMembers();
    }

    /**
     * Create an instance of {@link ExecuteSQLQuery }
     * 
     */
    public ExecuteSQLQuery createExecuteSQLQuery() {
        return new ExecuteSQLQuery();
    }

    /**
     * Create an instance of {@link XMLQueryExecutionOptions }
     * 
     */
    public XMLQueryExecutionOptions createXMLQueryExecutionOptions() {
        return new XMLQueryExecutionOptions();
    }

    /**
     * Create an instance of {@link CloseScorecardAssessmentResult }
     * 
     */
    public CloseScorecardAssessmentResult createCloseScorecardAssessmentResult() {
        return new CloseScorecardAssessmentResult();
    }

    /**
     * Create an instance of {@link ScorecardCloseStatus }
     * 
     */
    public ScorecardCloseStatus createScorecardCloseStatus() {
        return new ScorecardCloseStatus();
    }

    /**
     * Create an instance of {@link GetMembersResult }
     * 
     */
    public GetMembersResult createGetMembersResult() {
        return new GetMembersResult();
    }

    /**
     * Create an instance of {@link GetJobReferencesResult }
     * 
     */
    public GetJobReferencesResult createGetJobReferencesResult() {
        return new GetJobReferencesResult();
    }

    /**
     * Create an instance of {@link GetSessionVariablesResult }
     * 
     */
    public GetSessionVariablesResult createGetSessionVariablesResult() {
        return new GetSessionVariablesResult();
    }

    /**
     * Create an instance of {@link Import }
     * 
     */
    public Import createImport() {
        return new Import();
    }

    /**
     * Create an instance of {@link PathMap }
     * 
     */
    public PathMap createPathMap() {
        return new PathMap();
    }

    /**
     * Create an instance of {@link ProvisionServiceInstanceResult }
     * 
     */
    public ProvisionServiceInstanceResult createProvisionServiceInstanceResult() {
        return new ProvisionServiceInstanceResult();
    }

    /**
     * Create an instance of {@link LeaveGroups }
     * 
     */
    public LeaveGroups createLeaveGroups() {
        return new LeaveGroups();
    }

    /**
     * Create an instance of {@link GetCSPWhitelistResult }
     * 
     */
    public GetCSPWhitelistResult createGetCSPWhitelistResult() {
        return new GetCSPWhitelistResult();
    }

    /**
     * Create an instance of {@link SubscribeResult }
     * 
     */
    public SubscribeResult createSubscribeResult() {
        return new SubscribeResult();
    }

    /**
     * Create an instance of {@link GetSessionEnvironmentResult }
     * 
     */
    public GetSessionEnvironmentResult createGetSessionEnvironmentResult() {
        return new GetSessionEnvironmentResult();
    }

    /**
     * Create an instance of {@link SessionEnvironment }
     * 
     */
    public SessionEnvironment createSessionEnvironment() {
        return new SessionEnvironment();
    }

    /**
     * Create an instance of {@link SetItemAttributesResult }
     * 
     */
    public SetItemAttributesResult createSetItemAttributesResult() {
        return new SetItemAttributesResult();
    }

    /**
     * Create an instance of {@link DescribeColumnResult }
     * 
     */
    public DescribeColumnResult createDescribeColumnResult() {
        return new DescribeColumnResult();
    }

    /**
     * Create an instance of {@link SAColumn }
     * 
     */
    public SAColumn createSAColumn() {
        return new SAColumn();
    }

    /**
     * Create an instance of {@link EvaluateInlineCondition }
     * 
     */
    public EvaluateInlineCondition createEvaluateInlineCondition() {
        return new EvaluateInlineCondition();
    }

    /**
     * Create an instance of {@link ArchiveTenant }
     * 
     */
    public ArchiveTenant createArchiveTenant() {
        return new ArchiveTenant();
    }

    /**
     * Create an instance of {@link PurgeJobInstances }
     * 
     */
    public PurgeJobInstances createPurgeJobInstances() {
        return new PurgeJobInstances();
    }

    /**
     * Create an instance of {@link PurgeJobInstancesFilter }
     * 
     */
    public PurgeJobInstancesFilter createPurgeJobInstancesFilter() {
        return new PurgeJobInstancesFilter();
    }

    /**
     * Create an instance of {@link UpdateScorecardItemACL }
     * 
     */
    public UpdateScorecardItemACL createUpdateScorecardItemACL() {
        return new UpdateScorecardItemACL();
    }

    /**
     * Create an instance of {@link GetMostRecentsResult }
     * 
     */
    public GetMostRecentsResult createGetMostRecentsResult() {
        return new GetMostRecentsResult();
    }

    /**
     * Create an instance of {@link MRUItem }
     * 
     */
    public MRUItem createMRUItem() {
        return new MRUItem();
    }

    /**
     * Create an instance of {@link ReloadLogConfiguration }
     * 
     */
    public ReloadLogConfiguration createReloadLogConfiguration() {
        return new ReloadLogConfiguration();
    }

    /**
     * Create an instance of {@link ReadObjectsResult }
     * 
     */
    public ReadObjectsResult createReadObjectsResult() {
        return new ReadObjectsResult();
    }

    /**
     * Create an instance of {@link SetOwnershipResult }
     * 
     */
    public SetOwnershipResult createSetOwnershipResult() {
        return new SetOwnershipResult();
    }

    /**
     * Create an instance of {@link CancelKPIExecutionResult }
     * 
     */
    public CancelKPIExecutionResult createCancelKPIExecutionResult() {
        return new CancelKPIExecutionResult();
    }

    /**
     * Create an instance of {@link KPICancelationStatus }
     * 
     */
    public KPICancelationStatus createKPICancelationStatus() {
        return new KPICancelationStatus();
    }

    /**
     * Create an instance of {@link WriteIBotResult }
     * 
     */
    public WriteIBotResult createWriteIBotResult() {
        return new WriteIBotResult();
    }

    /**
     * Create an instance of {@link GetMaintenanceMode }
     * 
     */
    public GetMaintenanceMode createGetMaintenanceMode() {
        return new GetMaintenanceMode();
    }

    /**
     * Create an instance of {@link JoinGroupsResult }
     * 
     */
    public JoinGroupsResult createJoinGroupsResult() {
        return new JoinGroupsResult();
    }

    /**
     * Create an instance of {@link FetchNext }
     * 
     */
    public FetchNext createFetchNext() {
        return new FetchNext();
    }

    /**
     * Create an instance of {@link SetItemProperty }
     * 
     */
    public SetItemProperty createSetItemProperty() {
        return new SetItemProperty();
    }

    /**
     * Create an instance of {@link GetHtmlForPageWithOneReportResult }
     * 
     */
    public GetHtmlForPageWithOneReportResult createGetHtmlForPageWithOneReportResult() {
        return new GetHtmlForPageWithOneReportResult();
    }

    /**
     * Create an instance of {@link DescribeSubjectAreaResult }
     * 
     */
    public DescribeSubjectAreaResult createDescribeSubjectAreaResult() {
        return new DescribeSubjectAreaResult();
    }

    /**
     * Create an instance of {@link DeleteStrategyNode }
     * 
     */
    public DeleteStrategyNode createDeleteStrategyNode() {
        return new DeleteStrategyNode();
    }

    /**
     * Create an instance of {@link StartPageResult }
     * 
     */
    public StartPageResult createStartPageResult() {
        return new StartPageResult();
    }

    /**
     * Create an instance of {@link GetSessionEnvironment }
     * 
     */
    public GetSessionEnvironment createGetSessionEnvironment() {
        return new GetSessionEnvironment();
    }

    /**
     * Create an instance of {@link FetchNextKPIDimensionLOV }
     * 
     */
    public FetchNextKPIDimensionLOV createFetchNextKPIDimensionLOV() {
        return new FetchNextKPIDimensionLOV();
    }

    /**
     * Create an instance of {@link UpdateFavorites }
     * 
     */
    public UpdateFavorites createUpdateFavorites() {
        return new UpdateFavorites();
    }

    /**
     * Create an instance of {@link MoveStrategyNodeResult }
     * 
     */
    public MoveStrategyNodeResult createMoveStrategyNodeResult() {
        return new MoveStrategyNodeResult();
    }

    /**
     * Create an instance of {@link StrategyNodeList }
     * 
     */
    public StrategyNodeList createStrategyNodeList() {
        return new StrategyNodeList();
    }

    /**
     * Create an instance of {@link GetJobReferences }
     * 
     */
    public GetJobReferences createGetJobReferences() {
        return new GetJobReferences();
    }

    /**
     * Create an instance of {@link JobFilter }
     * 
     */
    public JobFilter createJobFilter() {
        return new JobFilter();
    }

    /**
     * Create an instance of {@link ApplyReportDefaultsResult }
     * 
     */
    public ApplyReportDefaultsResult createApplyReportDefaultsResult() {
        return new ApplyReportDefaultsResult();
    }

    /**
     * Create an instance of {@link StartPage }
     * 
     */
    public StartPage createStartPage() {
        return new StartPage();
    }

    /**
     * Create an instance of {@link UpdateServiceInstanceResult }
     * 
     */
    public UpdateServiceInstanceResult createUpdateServiceInstanceResult() {
        return new UpdateServiceInstanceResult();
    }

    /**
     * Create an instance of {@link GetAnnotationsResult }
     * 
     */
    public GetAnnotationsResult createGetAnnotationsResult() {
        return new GetAnnotationsResult();
    }

    /**
     * Create an instance of {@link AnnotationStatus }
     * 
     */
    public AnnotationStatus createAnnotationStatus() {
        return new AnnotationStatus();
    }

    /**
     * Create an instance of {@link SaveResultSetResult }
     * 
     */
    public SaveResultSetResult createSaveResultSetResult() {
        return new SaveResultSetResult();
    }

    /**
     * Create an instance of {@link GetIBotStatus }
     * 
     */
    public GetIBotStatus createGetIBotStatus() {
        return new GetIBotStatus();
    }

    /**
     * Create an instance of {@link FetchKPIAssessmentResult }
     * 
     */
    public FetchKPIAssessmentResult createFetchKPIAssessmentResult() {
        return new FetchKPIAssessmentResult();
    }

    /**
     * Create an instance of {@link KPIExecutionStatus }
     * 
     */
    public KPIExecutionStatus createKPIExecutionStatus() {
        return new KPIExecutionStatus();
    }

    /**
     * Create an instance of {@link GetScorecardDetailsResult }
     * 
     */
    public GetScorecardDetailsResult createGetScorecardDetailsResult() {
        return new GetScorecardDetailsResult();
    }

    /**
     * Create an instance of {@link ScorecardSettings }
     * 
     */
    public ScorecardSettings createScorecardSettings() {
        return new ScorecardSettings();
    }

    /**
     * Create an instance of {@link PerspectiveList }
     * 
     */
    public PerspectiveList createPerspectiveList() {
        return new PerspectiveList();
    }

    /**
     * Create an instance of {@link ScorecardViewDocuments }
     * 
     */
    public ScorecardViewDocuments createScorecardViewDocuments() {
        return new ScorecardViewDocuments();
    }

    /**
     * Create an instance of {@link CancelScorecardAssessmentResult }
     * 
     */
    public CancelScorecardAssessmentResult createCancelScorecardAssessmentResult() {
        return new CancelScorecardAssessmentResult();
    }

    /**
     * Create an instance of {@link ScorecardCancelationStatus }
     * 
     */
    public ScorecardCancelationStatus createScorecardCancelationStatus() {
        return new ScorecardCancelationStatus();
    }

    /**
     * Create an instance of {@link GetJob }
     * 
     */
    public GetJob createGetJob() {
        return new GetJob();
    }

    /**
     * Create an instance of {@link DeleteItemResult }
     * 
     */
    public DeleteItemResult createDeleteItemResult() {
        return new DeleteItemResult();
    }

    /**
     * Create an instance of {@link PurgeCache }
     * 
     */
    public PurgeCache createPurgeCache() {
        return new PurgeCache();
    }

    /**
     * Create an instance of {@link UpdateScorecardSettingsResult }
     * 
     */
    public UpdateScorecardSettingsResult createUpdateScorecardSettingsResult() {
        return new UpdateScorecardSettingsResult();
    }

    /**
     * Create an instance of {@link ImportService }
     * 
     */
    public ImportService createImportService() {
        return new ImportService();
    }

    /**
     * Create an instance of {@link ExecuteScorecard }
     * 
     */
    public ExecuteScorecard createExecuteScorecard() {
        return new ExecuteScorecard();
    }

    /**
     * Create an instance of {@link ScorecardExecutionOptions }
     * 
     */
    public ScorecardExecutionOptions createScorecardExecutionOptions() {
        return new ScorecardExecutionOptions();
    }

    /**
     * Create an instance of {@link ScorecardNodeList }
     * 
     */
    public ScorecardNodeList createScorecardNodeList() {
        return new ScorecardNodeList();
    }

    /**
     * Create an instance of {@link ScorecardVariableList }
     * 
     */
    public ScorecardVariableList createScorecardVariableList() {
        return new ScorecardVariableList();
    }

    /**
     * Create an instance of {@link GetCountsResult }
     * 
     */
    public GetCountsResult createGetCountsResult() {
        return new GetCountsResult();
    }

    /**
     * Create an instance of {@link GetCurUser }
     * 
     */
    public GetCurUser createGetCurUser() {
        return new GetCurUser();
    }

    /**
     * Create an instance of {@link ArchiveTenantExResult }
     * 
     */
    public ArchiveTenantExResult createArchiveTenantExResult() {
        return new ArchiveTenantExResult();
    }

    /**
     * Create an instance of {@link UpdateScorecardSettings }
     * 
     */
    public UpdateScorecardSettings createUpdateScorecardSettings() {
        return new UpdateScorecardSettings();
    }

    /**
     * Create an instance of {@link GetPermissionsResult }
     * 
     */
    public GetPermissionsResult createGetPermissionsResult() {
        return new GetPermissionsResult();
    }

    /**
     * Create an instance of {@link ProvisionTenant }
     * 
     */
    public ProvisionTenant createProvisionTenant() {
        return new ProvisionTenant();
    }

    /**
     * Create an instance of {@link GetItemInfoResult }
     * 
     */
    public GetItemInfoResult createGetItemInfoResult() {
        return new GetItemInfoResult();
    }

    /**
     * Create an instance of {@link GetAccounts }
     * 
     */
    public GetAccounts createGetAccounts() {
        return new GetAccounts();
    }

    /**
     * Create an instance of {@link ApplyReportParams }
     * 
     */
    public ApplyReportParams createApplyReportParams() {
        return new ApplyReportParams();
    }

    /**
     * Create an instance of {@link GetScorecardDetails }
     * 
     */
    public GetScorecardDetails createGetScorecardDetails() {
        return new GetScorecardDetails();
    }

    /**
     * Create an instance of {@link ScorecardDetailsOptions }
     * 
     */
    public ScorecardDetailsOptions createScorecardDetailsOptions() {
        return new ScorecardDetailsOptions();
    }

    /**
     * Create an instance of {@link GenerateReportSQLResult }
     * 
     */
    public GenerateReportSQLResult createGenerateReportSQLResult() {
        return new GenerateReportSQLResult();
    }

    /**
     * Create an instance of {@link EditScorecard }
     * 
     */
    public EditScorecard createEditScorecard() {
        return new EditScorecard();
    }

    /**
     * Create an instance of {@link GetCurUserResult }
     * 
     */
    public GetCurUserResult createGetCurUserResult() {
        return new GetCurUserResult();
    }

    /**
     * Create an instance of {@link PrepareCache }
     * 
     */
    public PrepareCache createPrepareCache() {
        return new PrepareCache();
    }

    /**
     * Create an instance of {@link DeleteFavoriteResult }
     * 
     */
    public DeleteFavoriteResult createDeleteFavoriteResult() {
        return new DeleteFavoriteResult();
    }

    /**
     * Create an instance of {@link Logoff }
     * 
     */
    public Logoff createLogoff() {
        return new Logoff();
    }

    /**
     * Create an instance of {@link ApplyReportDefaults }
     * 
     */
    public ApplyReportDefaults createApplyReportDefaults() {
        return new ApplyReportDefaults();
    }

    /**
     * Create an instance of {@link CreateFolderResult }
     * 
     */
    public CreateFolderResult createCreateFolderResult() {
        return new CreateFolderResult();
    }

    /**
     * Create an instance of {@link GetGlobalPrivileges }
     * 
     */
    public GetGlobalPrivileges createGetGlobalPrivileges() {
        return new GetGlobalPrivileges();
    }

    /**
     * Create an instance of {@link ExecuteKPIDimensionLOVQuery }
     * 
     */
    public ExecuteKPIDimensionLOVQuery createExecuteKPIDimensionLOVQuery() {
        return new ExecuteKPIDimensionLOVQuery();
    }

    /**
     * Create an instance of {@link GetHtmlForReport }
     * 
     */
    public GetHtmlForReport createGetHtmlForReport() {
        return new GetHtmlForReport();
    }

    /**
     * Create an instance of {@link ExecuteXMLQuery }
     * 
     */
    public ExecuteXMLQuery createExecuteXMLQuery() {
        return new ExecuteXMLQuery();
    }

    /**
     * Create an instance of {@link WriteIBot }
     * 
     */
    public WriteIBot createWriteIBot() {
        return new WriteIBot();
    }

    /**
     * Create an instance of {@link GetRelatedSubjectAreasResult }
     * 
     */
    public GetRelatedSubjectAreasResult createGetRelatedSubjectAreasResult() {
        return new GetRelatedSubjectAreasResult();
    }

    /**
     * Create an instance of {@link GetObjectCategories }
     * 
     */
    public GetObjectCategories createGetObjectCategories() {
        return new GetObjectCategories();
    }

    /**
     * Create an instance of {@link LogonResult }
     * 
     */
    public LogonResult createLogonResult() {
        return new LogonResult();
    }

    /**
     * Create an instance of {@link GetReportElementsResult }
     * 
     */
    public GetReportElementsResult createGetReportElementsResult() {
        return new GetReportElementsResult();
    }

    /**
     * Create an instance of {@link ReportADFParameters }
     * 
     */
    public ReportADFParameters createReportADFParameters() {
        return new ReportADFParameters();
    }

    /**
     * Create an instance of {@link WriteObjectsResult }
     * 
     */
    public WriteObjectsResult createWriteObjectsResult() {
        return new WriteObjectsResult();
    }

    /**
     * Create an instance of {@link ErrorInfo }
     * 
     */
    public ErrorInfo createErrorInfo() {
        return new ErrorInfo();
    }

    /**
     * Create an instance of {@link CreateScorecardResult }
     * 
     */
    public CreateScorecardResult createCreateScorecardResult() {
        return new CreateScorecardResult();
    }

    /**
     * Create an instance of {@link MoveItem }
     * 
     */
    public MoveItem createMoveItem() {
        return new MoveItem();
    }

    /**
     * Create an instance of {@link DescribeTable }
     * 
     */
    public DescribeTable createDescribeTable() {
        return new DescribeTable();
    }

    /**
     * Create an instance of {@link MaintenanceModeResult }
     * 
     */
    public MaintenanceModeResult createMaintenanceModeResult() {
        return new MaintenanceModeResult();
    }

    /**
     * Create an instance of {@link PurgeCacheResult }
     * 
     */
    public PurgeCacheResult createPurgeCacheResult() {
        return new PurgeCacheResult();
    }

    /**
     * Create an instance of {@link UnprovisionTenantResult }
     * 
     */
    public UnprovisionTenantResult createUnprovisionTenantResult() {
        return new UnprovisionTenantResult();
    }

    /**
     * Create an instance of {@link CompleteAnalysisExportResult }
     * 
     */
    public CompleteAnalysisExportResult createCompleteAnalysisExportResult() {
        return new CompleteAnalysisExportResult();
    }

    /**
     * Create an instance of {@link AnalysisExportResult }
     * 
     */
    public AnalysisExportResult createAnalysisExportResult() {
        return new AnalysisExportResult();
    }

    /**
     * Create an instance of {@link GetAccountTenantID }
     * 
     */
    public GetAccountTenantID createGetAccountTenantID() {
        return new GetAccountTenantID();
    }

    /**
     * Create an instance of {@link GenerateReportSQL }
     * 
     */
    public GenerateReportSQL createGenerateReportSQL() {
        return new GenerateReportSQL();
    }

    /**
     * Create an instance of {@link GetReportColumns }
     * 
     */
    public GetReportColumns createGetReportColumns() {
        return new GetReportColumns();
    }

    /**
     * Create an instance of {@link UpdateMostRecentsResult }
     * 
     */
    public UpdateMostRecentsResult createUpdateMostRecentsResult() {
        return new UpdateMostRecentsResult();
    }

    /**
     * Create an instance of {@link GetMaintenanceModeResult }
     * 
     */
    public GetMaintenanceModeResult createGetMaintenanceModeResult() {
        return new GetMaintenanceModeResult();
    }

    /**
     * Create an instance of {@link GetObjectTypesResult }
     * 
     */
    public GetObjectTypesResult createGetObjectTypesResult() {
        return new GetObjectTypesResult();
    }

    /**
     * Create an instance of {@link ObjectTypes }
     * 
     */
    public ObjectTypes createObjectTypes() {
        return new ObjectTypes();
    }

    /**
     * Create an instance of {@link Logonmt }
     * 
     */
    public Logonmt createLogonmt() {
        return new Logonmt();
    }

    /**
     * Create an instance of {@link GetSubjectAreas }
     * 
     */
    public GetSubjectAreas createGetSubjectAreas() {
        return new GetSubjectAreas();
    }

    /**
     * Create an instance of {@link GetHtmlForReportResult }
     * 
     */
    public GetHtmlForReportResult createGetHtmlForReportResult() {
        return new GetHtmlForReportResult();
    }

    /**
     * Create an instance of {@link DeleteResultSetResult }
     * 
     */
    public DeleteResultSetResult createDeleteResultSetResult() {
        return new DeleteResultSetResult();
    }

    /**
     * Create an instance of {@link GetHeadersHtmlResult }
     * 
     */
    public GetHeadersHtmlResult createGetHeadersHtmlResult() {
        return new GetHeadersHtmlResult();
    }

    /**
     * Create an instance of {@link AddStrategyNode }
     * 
     */
    public AddStrategyNode createAddStrategyNode() {
        return new AddStrategyNode();
    }

    /**
     * Create an instance of {@link ForgetAccountsResult }
     * 
     */
    public ForgetAccountsResult createForgetAccountsResult() {
        return new ForgetAccountsResult();
    }

    /**
     * Create an instance of {@link RenameAccounts }
     * 
     */
    public RenameAccounts createRenameAccounts() {
        return new RenameAccounts();
    }

    /**
     * Create an instance of {@link UnsubscribeResult }
     * 
     */
    public UnsubscribeResult createUnsubscribeResult() {
        return new UnsubscribeResult();
    }

    /**
     * Create an instance of {@link UnprovisionTenant }
     * 
     */
    public UnprovisionTenant createUnprovisionTenant() {
        return new UnprovisionTenant();
    }

    /**
     * Create an instance of {@link GetConditionCustomizableReportElements }
     * 
     */
    public GetConditionCustomizableReportElements createGetConditionCustomizableReportElements() {
        return new GetConditionCustomizableReportElements();
    }

    /**
     * Create an instance of {@link GetAnnotations }
     * 
     */
    public GetAnnotations createGetAnnotations() {
        return new GetAnnotations();
    }

    /**
     * Create an instance of {@link FetchScorecardAssessment }
     * 
     */
    public FetchScorecardAssessment createFetchScorecardAssessment() {
        return new FetchScorecardAssessment();
    }

    /**
     * Create an instance of {@link UpgradeXMLResult }
     * 
     */
    public UpgradeXMLResult createUpgradeXMLResult() {
        return new UpgradeXMLResult();
    }

    /**
     * Create an instance of {@link UpdateServiceInstance }
     * 
     */
    public UpdateServiceInstance createUpdateServiceInstance() {
        return new UpdateServiceInstance();
    }

    /**
     * Create an instance of {@link ServiceInstanceConfigParams }
     * 
     */
    public ServiceInstanceConfigParams createServiceInstanceConfigParams() {
        return new ServiceInstanceConfigParams();
    }

    /**
     * Create an instance of {@link ImportResult }
     * 
     */
    public ImportResult createImportResult() {
        return new ImportResult();
    }

    /**
     * Create an instance of {@link ImportError }
     * 
     */
    public ImportError createImportError() {
        return new ImportError();
    }

    /**
     * Create an instance of {@link UnarchiveTenant }
     * 
     */
    public UnarchiveTenant createUnarchiveTenant() {
        return new UnarchiveTenant();
    }

    /**
     * Create an instance of {@link SetBridge }
     * 
     */
    public SetBridge createSetBridge() {
        return new SetBridge();
    }

    /**
     * Create an instance of {@link UpdateInitiativeNode }
     * 
     */
    public UpdateInitiativeNode createUpdateInitiativeNode() {
        return new UpdateInitiativeNode();
    }

    /**
     * Create an instance of {@link CancelQueryResult }
     * 
     */
    public CancelQueryResult createCancelQueryResult() {
        return new CancelQueryResult();
    }

    /**
     * Create an instance of {@link AddStrategyNodeResult }
     * 
     */
    public AddStrategyNodeResult createAddStrategyNodeResult() {
        return new AddStrategyNodeResult();
    }

    /**
     * Create an instance of {@link GetJobInstanceReferences }
     * 
     */
    public GetJobInstanceReferences createGetJobInstanceReferences() {
        return new GetJobInstanceReferences();
    }

    /**
     * Create an instance of {@link JobInstanceFilter }
     * 
     */
    public JobInstanceFilter createJobInstanceFilter() {
        return new JobInstanceFilter();
    }

    /**
     * Create an instance of {@link RenameAccountsExResult }
     * 
     */
    public RenameAccountsExResult createRenameAccountsExResult() {
        return new RenameAccountsExResult();
    }

    /**
     * Create an instance of {@link RenameAccountsStatus }
     * 
     */
    public RenameAccountsStatus createRenameAccountsStatus() {
        return new RenameAccountsStatus();
    }

    /**
     * Create an instance of {@link DeleteServiceResult }
     * 
     */
    public DeleteServiceResult createDeleteServiceResult() {
        return new DeleteServiceResult();
    }

    /**
     * Create an instance of {@link AddFavoriteCategory }
     * 
     */
    public AddFavoriteCategory createAddFavoriteCategory() {
        return new AddFavoriteCategory();
    }

    /**
     * Create an instance of {@link AddFavoriteCategoryResult }
     * 
     */
    public AddFavoriteCategoryResult createAddFavoriteCategoryResult() {
        return new AddFavoriteCategoryResult();
    }

    /**
     * Create an instance of {@link ExecuteXMLQueryResult }
     * 
     */
    public ExecuteXMLQueryResult createExecuteXMLQueryResult() {
        return new ExecuteXMLQueryResult();
    }

    /**
     * Create an instance of {@link QueryResults }
     * 
     */
    public QueryResults createQueryResults() {
        return new QueryResults();
    }

    /**
     * Create an instance of {@link ExecuteIBotNowResult }
     * 
     */
    public ExecuteIBotNowResult createExecuteIBotNowResult() {
        return new ExecuteIBotNowResult();
    }

    /**
     * Create an instance of {@link ClearRoleHierarchyCache }
     * 
     */
    public ClearRoleHierarchyCache createClearRoleHierarchyCache() {
        return new ClearRoleHierarchyCache();
    }

    /**
     * Create an instance of {@link CopyItem2 }
     * 
     */
    public CopyItem2 createCopyItem2() {
        return new CopyItem2();
    }

    /**
     * Create an instance of {@link GetGroupsResult }
     * 
     */
    public GetGroupsResult createGetGroupsResult() {
        return new GetGroupsResult();
    }

    /**
     * Create an instance of {@link UnprovisionServiceInstanceResult }
     * 
     */
    public UnprovisionServiceInstanceResult createUnprovisionServiceInstanceResult() {
        return new UnprovisionServiceInstanceResult();
    }

    /**
     * Create an instance of {@link GetJobInstanceReferencesResult }
     * 
     */
    public GetJobInstanceReferencesResult createGetJobInstanceReferencesResult() {
        return new GetJobInstanceReferencesResult();
    }

    /**
     * Create an instance of {@link JobReferenceAndInstanceReferences }
     * 
     */
    public JobReferenceAndInstanceReferences createJobReferenceAndInstanceReferences() {
        return new JobReferenceAndInstanceReferences();
    }

    /**
     * Create an instance of {@link ArchiveTenantEx }
     * 
     */
    public ArchiveTenantEx createArchiveTenantEx() {
        return new ArchiveTenantEx();
    }

    /**
     * Create an instance of {@link ArchiveOptions }
     * 
     */
    public ArchiveOptions createArchiveOptions() {
        return new ArchiveOptions();
    }

    /**
     * Create an instance of {@link AddInitiativeNode }
     * 
     */
    public AddInitiativeNode createAddInitiativeNode() {
        return new AddInitiativeNode();
    }

    /**
     * Create an instance of {@link SuspendServiceResult }
     * 
     */
    public SuspendServiceResult createSuspendServiceResult() {
        return new SuspendServiceResult();
    }

    /**
     * Create an instance of {@link GetPrivilegesStatusResult }
     * 
     */
    public GetPrivilegesStatusResult createGetPrivilegesStatusResult() {
        return new GetPrivilegesStatusResult();
    }

    /**
     * Create an instance of {@link GenerateDrillToResult }
     * 
     */
    public GenerateDrillToResult createGenerateDrillToResult() {
        return new GenerateDrillToResult();
    }

    /**
     * Create an instance of {@link KPIGenerateDrillToStatus }
     * 
     */
    public KPIGenerateDrillToStatus createKPIGenerateDrillToStatus() {
        return new KPIGenerateDrillToStatus();
    }

    /**
     * Create an instance of {@link UpdateCatalogItemACLResult }
     * 
     */
    public UpdateCatalogItemACLResult createUpdateCatalogItemACLResult() {
        return new UpdateCatalogItemACLResult();
    }

    /**
     * Create an instance of {@link IsMember }
     * 
     */
    public IsMember createIsMember() {
        return new IsMember();
    }

    /**
     * Create an instance of {@link RestoreTenant }
     * 
     */
    public RestoreTenant createRestoreTenant() {
        return new RestoreTenant();
    }

    /**
     * Create an instance of {@link RemoveJobs }
     * 
     */
    public RemoveJobs createRemoveJobs() {
        return new RemoveJobs();
    }

    /**
     * Create an instance of {@link GetUserHomeDirPath }
     * 
     */
    public GetUserHomeDirPath createGetUserHomeDirPath() {
        return new GetUserHomeDirPath();
    }

    /**
     * Create an instance of {@link ProvisionServiceInstance }
     * 
     */
    public ProvisionServiceInstance createProvisionServiceInstance() {
        return new ProvisionServiceInstance();
    }

    /**
     * Create an instance of {@link FetchNextResult }
     * 
     */
    public FetchNextResult createFetchNextResult() {
        return new FetchNextResult();
    }

    /**
     * Create an instance of {@link CopyItem2Result }
     * 
     */
    public CopyItem2Result createCopyItem2Result() {
        return new CopyItem2Result();
    }

    /**
     * Create an instance of {@link GetPromptedColumns }
     * 
     */
    public GetPromptedColumns createGetPromptedColumns() {
        return new GetPromptedColumns();
    }

    /**
     * Create an instance of {@link GetReportColumnsResult }
     * 
     */
    public GetReportColumnsResult createGetReportColumnsResult() {
        return new GetReportColumnsResult();
    }

    /**
     * Create an instance of {@link Impersonate }
     * 
     */
    public Impersonate createImpersonate() {
        return new Impersonate();
    }

    /**
     * Create an instance of {@link ImpersonateexResult }
     * 
     */
    public ImpersonateexResult createImpersonateexResult() {
        return new ImpersonateexResult();
    }

    /**
     * Create an instance of {@link AuthResult }
     * 
     */
    public AuthResult createAuthResult() {
        return new AuthResult();
    }

    /**
     * Create an instance of {@link UpdateCSPWhitelistResult }
     * 
     */
    public UpdateCSPWhitelistResult createUpdateCSPWhitelistResult() {
        return new UpdateCSPWhitelistResult();
    }

    /**
     * Create an instance of {@link CancelKPIExecution }
     * 
     */
    public CancelKPIExecution createCancelKPIExecution() {
        return new CancelKPIExecution();
    }

    /**
     * Create an instance of {@link GenerateKPIDrillTo }
     * 
     */
    public GenerateKPIDrillTo createGenerateKPIDrillTo() {
        return new GenerateKPIDrillTo();
    }

    /**
     * Create an instance of {@link CreateFolder }
     * 
     */
    public CreateFolder createCreateFolder() {
        return new CreateFolder();
    }

    /**
     * Create an instance of {@link JoinGroups }
     * 
     */
    public JoinGroups createJoinGroups() {
        return new JoinGroups();
    }

    /**
     * Create an instance of {@link GetGroups }
     * 
     */
    public GetGroups createGetGroups() {
        return new GetGroups();
    }

    /**
     * Create an instance of {@link ReadObjects }
     * 
     */
    public ReadObjects createReadObjects() {
        return new ReadObjects();
    }

    /**
     * Create an instance of {@link FetchKPIAssessment }
     * 
     */
    public FetchKPIAssessment createFetchKPIAssessment() {
        return new FetchKPIAssessment();
    }

    /**
     * Create an instance of {@link InitiateAnalysisExportResult }
     * 
     */
    public InitiateAnalysisExportResult createInitiateAnalysisExportResult() {
        return new InitiateAnalysisExportResult();
    }

    /**
     * Create an instance of {@link DeleteIBotResult }
     * 
     */
    public DeleteIBotResult createDeleteIBotResult() {
        return new DeleteIBotResult();
    }

    /**
     * Create an instance of {@link AddScorecardViewResult }
     * 
     */
    public AddScorecardViewResult createAddScorecardViewResult() {
        return new AddScorecardViewResult();
    }

    /**
     * Create an instance of {@link GetKPIWatchlistDimensionsResult }
     * 
     */
    public GetKPIWatchlistDimensionsResult createGetKPIWatchlistDimensionsResult() {
        return new GetKPIWatchlistDimensionsResult();
    }

    /**
     * Create an instance of {@link GetGlobalPrivilegesResult }
     * 
     */
    public GetGlobalPrivilegesResult createGetGlobalPrivilegesResult() {
        return new GetGlobalPrivilegesResult();
    }

    /**
     * Create an instance of {@link Privilege }
     * 
     */
    public Privilege createPrivilege() {
        return new Privilege();
    }

    /**
     * Create an instance of {@link CloseScorecard }
     * 
     */
    public CloseScorecard createCloseScorecard() {
        return new CloseScorecard();
    }

    /**
     * Create an instance of {@link DeletePerspective }
     * 
     */
    public DeletePerspective createDeletePerspective() {
        return new DeletePerspective();
    }

    /**
     * Create an instance of {@link AddPerspective }
     * 
     */
    public AddPerspective createAddPerspective() {
        return new AddPerspective();
    }

    /**
     * Create an instance of {@link DeleteCSPWhitelist }
     * 
     */
    public DeleteCSPWhitelist createDeleteCSPWhitelist() {
        return new DeleteCSPWhitelist();
    }

    /**
     * Create an instance of {@link PasteItem2 }
     * 
     */
    public PasteItem2 createPasteItem2() {
        return new PasteItem2();
    }

    /**
     * Create an instance of {@link PasteItem2Params }
     * 
     */
    public PasteItem2Params createPasteItem2Params() {
        return new PasteItem2Params();
    }

    /**
     * Create an instance of {@link DeleteResultSet }
     * 
     */
    public DeleteResultSet createDeleteResultSet() {
        return new DeleteResultSet();
    }

    /**
     * Create an instance of {@link ArrayOfGUIDs }
     * 
     */
    public ArrayOfGUIDs createArrayOfGUIDs() {
        return new ArrayOfGUIDs();
    }

    /**
     * Create an instance of {@link EditScorecardResult }
     * 
     */
    public EditScorecardResult createEditScorecardResult() {
        return new EditScorecardResult();
    }

    /**
     * Create an instance of {@link GetSubjectAreasWithSort }
     * 
     */
    public GetSubjectAreasWithSort createGetSubjectAreasWithSort() {
        return new GetSubjectAreasWithSort();
    }

    /**
     * Create an instance of {@link GetScorecardKPIDimensionsResult }
     * 
     */
    public GetScorecardKPIDimensionsResult createGetScorecardKPIDimensionsResult() {
        return new GetScorecardKPIDimensionsResult();
    }

    /**
     * Create an instance of {@link RestoreTenantExResult }
     * 
     */
    public RestoreTenantExResult createRestoreTenantExResult() {
        return new RestoreTenantExResult();
    }

    /**
     * Create an instance of {@link GetPromptElementsResult }
     * 
     */
    public GetPromptElementsResult createGetPromptElementsResult() {
        return new GetPromptElementsResult();
    }

    /**
     * Create an instance of {@link PromptsObjectModel }
     * 
     */
    public PromptsObjectModel createPromptsObjectModel() {
        return new PromptsObjectModel();
    }

    /**
     * Create an instance of {@link MarkForReplication }
     * 
     */
    public MarkForReplication createMarkForReplication() {
        return new MarkForReplication();
    }

    /**
     * Create an instance of {@link ClearQueryCache }
     * 
     */
    public ClearQueryCache createClearQueryCache() {
        return new ClearQueryCache();
    }

    /**
     * Create an instance of {@link ReloadMetadataResult }
     * 
     */
    public ReloadMetadataResult createReloadMetadataResult() {
        return new ReloadMetadataResult();
    }

    /**
     * Create an instance of {@link GetJobResult }
     * 
     */
    public GetJobResult createGetJobResult() {
        return new GetJobResult();
    }

    /**
     * Create an instance of {@link Job }
     * 
     */
    public Job createJob() {
        return new Job();
    }

    /**
     * Create an instance of {@link GetJobInstance }
     * 
     */
    public GetJobInstance createGetJobInstance() {
        return new GetJobInstance();
    }

    /**
     * Create an instance of {@link ForgetAccountsExResult }
     * 
     */
    public ForgetAccountsExResult createForgetAccountsExResult() {
        return new ForgetAccountsExResult();
    }

    /**
     * Create an instance of {@link ForgetAccountsStatus }
     * 
     */
    public ForgetAccountsStatus createForgetAccountsStatus() {
        return new ForgetAccountsStatus();
    }

    /**
     * Create an instance of {@link CancelJobInstanceResult }
     * 
     */
    public CancelJobInstanceResult createCancelJobInstanceResult() {
        return new CancelJobInstanceResult();
    }

    /**
     * Create an instance of {@link GetPromptedColumnsResult }
     * 
     */
    public GetPromptedColumnsResult createGetPromptedColumnsResult() {
        return new GetPromptedColumnsResult();
    }

    /**
     * Create an instance of {@link PromptedColumnInfo }
     * 
     */
    public PromptedColumnInfo createPromptedColumnInfo() {
        return new PromptedColumnInfo();
    }

    /**
     * Create an instance of {@link UpdatePerspective }
     * 
     */
    public UpdatePerspective createUpdatePerspective() {
        return new UpdatePerspective();
    }

    /**
     * Create an instance of {@link GetJobInfo }
     * 
     */
    public GetJobInfo createGetJobInfo() {
        return new GetJobInfo();
    }

    /**
     * Create an instance of {@link OpenTreeNode }
     * 
     */
    public OpenTreeNode createOpenTreeNode() {
        return new OpenTreeNode();
    }

    /**
     * Create an instance of {@link ExecuteKPI }
     * 
     */
    public ExecuteKPI createExecuteKPI() {
        return new ExecuteKPI();
    }

    /**
     * Create an instance of {@link KPIExecutionOptions }
     * 
     */
    public KPIExecutionOptions createKPIExecutionOptions() {
        return new KPIExecutionOptions();
    }

    /**
     * Create an instance of {@link KPIRequestList }
     * 
     */
    public KPIRequestList createKPIRequestList() {
        return new KPIRequestList();
    }

    /**
     * Create an instance of {@link DeletePerspectiveResult }
     * 
     */
    public DeletePerspectiveResult createDeletePerspectiveResult() {
        return new DeletePerspectiveResult();
    }

    /**
     * Create an instance of {@link ExecuteKPIResult }
     * 
     */
    public ExecuteKPIResult createExecuteKPIResult() {
        return new ExecuteKPIResult();
    }

    /**
     * Create an instance of {@link RestoreTenantEx }
     * 
     */
    public RestoreTenantEx createRestoreTenantEx() {
        return new RestoreTenantEx();
    }

    /**
     * Create an instance of {@link RestoreOptions }
     * 
     */
    public RestoreOptions createRestoreOptions() {
        return new RestoreOptions();
    }

    /**
     * Create an instance of {@link MoveIBot }
     * 
     */
    public MoveIBot createMoveIBot() {
        return new MoveIBot();
    }

    /**
     * Create an instance of {@link DeleteIBot }
     * 
     */
    public DeleteIBot createDeleteIBot() {
        return new DeleteIBot();
    }

    /**
     * Create an instance of {@link ReloadMetadata }
     * 
     */
    public ReloadMetadata createReloadMetadata() {
        return new ReloadMetadata();
    }

    /**
     * Create an instance of {@link UpdatePerspectiveResult }
     * 
     */
    public UpdatePerspectiveResult createUpdatePerspectiveResult() {
        return new UpdatePerspectiveResult();
    }

    /**
     * Create an instance of {@link GetAccountsResult }
     * 
     */
    public GetAccountsResult createGetAccountsResult() {
        return new GetAccountsResult();
    }

    /**
     * Create an instance of {@link UpdateCauseAndEffectLinkagesResult }
     * 
     */
    public UpdateCauseAndEffectLinkagesResult createUpdateCauseAndEffectLinkagesResult() {
        return new UpdateCauseAndEffectLinkagesResult();
    }

    /**
     * Create an instance of {@link CauseAndEffectLinkagesUpdateFailures }
     * 
     */
    public CauseAndEffectLinkagesUpdateFailures createCauseAndEffectLinkagesUpdateFailures() {
        return new CauseAndEffectLinkagesUpdateFailures();
    }

    /**
     * Create an instance of {@link LogoffResult }
     * 
     */
    public LogoffResult createLogoffResult() {
        return new LogoffResult();
    }

    /**
     * Create an instance of {@link UpdateScorecardView }
     * 
     */
    public UpdateScorecardView createUpdateScorecardView() {
        return new UpdateScorecardView();
    }

    /**
     * Create an instance of {@link AddFavorite }
     * 
     */
    public AddFavorite createAddFavorite() {
        return new AddFavorite();
    }

    /**
     * Create an instance of {@link GetItemInfo }
     * 
     */
    public GetItemInfo createGetItemInfo() {
        return new GetItemInfo();
    }

    /**
     * Create an instance of {@link DeleteFavoriteCategory }
     * 
     */
    public DeleteFavoriteCategory createDeleteFavoriteCategory() {
        return new DeleteFavoriteCategory();
    }

    /**
     * Create an instance of {@link LogonexResult }
     * 
     */
    public LogonexResult createLogonexResult() {
        return new LogonexResult();
    }

    /**
     * Create an instance of {@link GetKPIWatchlistDimensions }
     * 
     */
    public GetKPIWatchlistDimensions createGetKPIWatchlistDimensions() {
        return new GetKPIWatchlistDimensions();
    }

    /**
     * Create an instance of {@link OpenScorecard }
     * 
     */
    public OpenScorecard createOpenScorecard() {
        return new OpenScorecard();
    }

    /**
     * Create an instance of {@link ExecuteSQLQueryResult }
     * 
     */
    public ExecuteSQLQueryResult createExecuteSQLQueryResult() {
        return new ExecuteSQLQueryResult();
    }

    /**
     * Create an instance of {@link GetJobInstanceResult }
     * 
     */
    public GetJobInstanceResult createGetJobInstanceResult() {
        return new GetJobInstanceResult();
    }

    /**
     * Create an instance of {@link JobInstance }
     * 
     */
    public JobInstance createJobInstance() {
        return new JobInstance();
    }

    /**
     * Create an instance of {@link AddInitiativeNodeResult }
     * 
     */
    public AddInitiativeNodeResult createAddInitiativeNodeResult() {
        return new AddInitiativeNodeResult();
    }

    /**
     * Create an instance of {@link CancelQuery }
     * 
     */
    public CancelQuery createCancelQuery() {
        return new CancelQuery();
    }

    /**
     * Create an instance of {@link GetPromptedFiltersResult }
     * 
     */
    public GetPromptedFiltersResult createGetPromptedFiltersResult() {
        return new GetPromptedFiltersResult();
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link GetPrivilegesStatus }
     * 
     */
    public GetPrivilegesStatus createGetPrivilegesStatus() {
        return new GetPrivilegesStatus();
    }

    /**
     * Create an instance of {@link FetchScorecardAssessmentResult }
     * 
     */
    public FetchScorecardAssessmentResult createFetchScorecardAssessmentResult() {
        return new FetchScorecardAssessmentResult();
    }

    /**
     * Create an instance of {@link UpdateStrategyNodeResult }
     * 
     */
    public UpdateStrategyNodeResult createUpdateStrategyNodeResult() {
        return new UpdateStrategyNodeResult();
    }

    /**
     * Create an instance of {@link DeleteScorecardViewResult }
     * 
     */
    public DeleteScorecardViewResult createDeleteScorecardViewResult() {
        return new DeleteScorecardViewResult();
    }

    /**
     * Create an instance of {@link UpdateStrategyNode }
     * 
     */
    public UpdateStrategyNode createUpdateStrategyNode() {
        return new UpdateStrategyNode();
    }

    /**
     * Create an instance of {@link CancelScorecardAssessment }
     * 
     */
    public CancelScorecardAssessment createCancelScorecardAssessment() {
        return new CancelScorecardAssessment();
    }

    /**
     * Create an instance of {@link SuspendService }
     * 
     */
    public SuspendService createSuspendService() {
        return new SuspendService();
    }

    /**
     * Create an instance of {@link MarkForReplicationResult }
     * 
     */
    public MarkForReplicationResult createMarkForReplicationResult() {
        return new MarkForReplicationResult();
    }

    /**
     * Create an instance of {@link MoveStrategyNode }
     * 
     */
    public MoveStrategyNode createMoveStrategyNode() {
        return new MoveStrategyNode();
    }

    /**
     * Create an instance of {@link SetOwnership }
     * 
     */
    public SetOwnership createSetOwnership() {
        return new SetOwnership();
    }

    /**
     * Create an instance of {@link Impersonateex }
     * 
     */
    public Impersonateex createImpersonateex() {
        return new Impersonateex();
    }

    /**
     * Create an instance of {@link EvaluateConditionResult }
     * 
     */
    public EvaluateConditionResult createEvaluateConditionResult() {
        return new EvaluateConditionResult();
    }

    /**
     * Create an instance of {@link ReloadLogConfigurationResult }
     * 
     */
    public ReloadLogConfigurationResult createReloadLogConfigurationResult() {
        return new ReloadLogConfigurationResult();
    }

    /**
     * Create an instance of {@link AddAnnotationResult }
     * 
     */
    public AddAnnotationResult createAddAnnotationResult() {
        return new AddAnnotationResult();
    }

    /**
     * Create an instance of {@link CopyItem }
     * 
     */
    public CopyItem createCopyItem() {
        return new CopyItem();
    }

    /**
     * Create an instance of {@link PasteItem2Result }
     * 
     */
    public PasteItem2Result createPasteItem2Result() {
        return new PasteItem2Result();
    }

    /**
     * Create an instance of {@link ResumeService }
     * 
     */
    public ResumeService createResumeService() {
        return new ResumeService();
    }

    /**
     * Create an instance of {@link DeleteInitiativeNode }
     * 
     */
    public DeleteInitiativeNode createDeleteInitiativeNode() {
        return new DeleteInitiativeNode();
    }

    /**
     * Create an instance of {@link BalanceInfo }
     * 
     */
    public BalanceInfo createBalanceInfo() {
        return new BalanceInfo();
    }

    /**
     * Create an instance of {@link InitiativeReferences }
     * 
     */
    public InitiativeReferences createInitiativeReferences() {
        return new InitiativeReferences();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo }
     * 
     */
    public IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo createIndividualPromptRunTimeInfoDataTypeDoubleColumnInfo() {
        return new IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoDataTypeHierarchyInfo }
     * 
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyInfo createIndividualPromptRunTimeInfoDataTypeHierarchyInfo() {
        return new IndividualPromptRunTimeInfoDataTypeHierarchyInfo();
    }

    /**
     * Create an instance of {@link ObjectIcon }
     * 
     */
    public ObjectIcon createObjectIcon() {
        return new ObjectIcon();
    }

    /**
     * Create an instance of {@link AssessmentRule }
     * 
     */
    public AssessmentRule createAssessmentRule() {
        return new AssessmentRule();
    }

    /**
     * Create an instance of {@link CreatableItem }
     * 
     */
    public CreatableItem createCreatableItem() {
        return new CreatableItem();
    }

    /**
     * Create an instance of {@link KPIResultColumn }
     * 
     */
    public KPIResultColumn createKPIResultColumn() {
        return new KPIResultColumn();
    }

    /**
     * Create an instance of {@link ScorecardAssessmentResultSet }
     * 
     */
    public ScorecardAssessmentResultSet createScorecardAssessmentResultSet() {
        return new ScorecardAssessmentResultSet();
    }

    /**
     * Create an instance of {@link TemplateInfoInstance }
     * 
     */
    public TemplateInfoInstance createTemplateInfoInstance() {
        return new TemplateInfoInstance();
    }

    /**
     * Create an instance of {@link KPIDimensionLOVResultSet }
     * 
     */
    public KPIDimensionLOVResultSet createKPIDimensionLOVResultSet() {
        return new KPIDimensionLOVResultSet();
    }

    /**
     * Create an instance of {@link RenameAccountResult }
     * 
     */
    public RenameAccountResult createRenameAccountResult() {
        return new RenameAccountResult();
    }

    /**
     * Create an instance of {@link JobTrigger }
     * 
     */
    public JobTrigger createJobTrigger() {
        return new JobTrigger();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoSingleValueType }
     * 
     */
    public IndividualPromptRunTimeInfoSingleValueType createIndividualPromptRunTimeInfoSingleValueType() {
        return new IndividualPromptRunTimeInfoSingleValueType();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoLimitedByPromptRefGroups }
     * 
     */
    public IndividualPromptRunTimeInfoLimitedByPromptRefGroups createIndividualPromptRunTimeInfoLimitedByPromptRefGroups() {
        return new IndividualPromptRunTimeInfoLimitedByPromptRefGroups();
    }

    /**
     * Create an instance of {@link MonthlyDateTrigger }
     * 
     */
    public MonthlyDateTrigger createMonthlyDateTrigger() {
        return new MonthlyDateTrigger();
    }

    /**
     * Create an instance of {@link TenantUnarchiveDetails }
     * 
     */
    public TenantUnarchiveDetails createTenantUnarchiveDetails() {
        return new TenantUnarchiveDetails();
    }

    /**
     * Create an instance of {@link SubType }
     * 
     */
    public SubType createSubType() {
        return new SubType();
    }

    /**
     * Create an instance of {@link CauseAndEffectLinkagesUpdateFailure }
     * 
     */
    public CauseAndEffectLinkagesUpdateFailure createCauseAndEffectLinkagesUpdateFailure() {
        return new CauseAndEffectLinkagesUpdateFailure();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels }
     * 
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels createIndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels() {
        return new IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels();
    }

    /**
     * Create an instance of {@link Weight }
     * 
     */
    public Weight createWeight() {
        return new Weight();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo }
     * 
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo createIndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo() {
        return new IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo();
    }

    /**
     * Create an instance of {@link DimensionMappings }
     * 
     */
    public DimensionMappings createDimensionMappings() {
        return new DimensionMappings();
    }

    /**
     * Create an instance of {@link LinkedStrategyNode }
     * 
     */
    public LinkedStrategyNode createLinkedStrategyNode() {
        return new LinkedStrategyNode();
    }

    /**
     * Create an instance of {@link LinkedInitiativeNode }
     * 
     */
    public LinkedInitiativeNode createLinkedInitiativeNode() {
        return new LinkedInitiativeNode();
    }

    /**
     * Create an instance of {@link KPIDimensionValue }
     * 
     */
    public KPIDimensionValue createKPIDimensionValue() {
        return new KPIDimensionValue();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoLimitedByPromptReference }
     * 
     */
    public IndividualPromptRunTimeInfoLimitedByPromptReference createIndividualPromptRunTimeInfoLimitedByPromptReference() {
        return new IndividualPromptRunTimeInfoLimitedByPromptReference();
    }

    /**
     * Create an instance of {@link GetSubItemsFilter }
     * 
     */
    public GetSubItemsFilter createGetSubItemsFilter() {
        return new GetSubItemsFilter();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoCurrentValues }
     * 
     */
    public IndividualPromptRunTimeInfoCurrentValues createIndividualPromptRunTimeInfoCurrentValues() {
        return new IndividualPromptRunTimeInfoCurrentValues();
    }

    /**
     * Create an instance of {@link KPIPinning }
     * 
     */
    public KPIPinning createKPIPinning() {
        return new KPIPinning();
    }

    /**
     * Create an instance of {@link ScorecardNodeResult }
     * 
     */
    public ScorecardNodeResult createScorecardNodeResult() {
        return new ScorecardNodeResult();
    }

    /**
     * Create an instance of {@link TenantArchiveDetails }
     * 
     */
    public TenantArchiveDetails createTenantArchiveDetails() {
        return new TenantArchiveDetails();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevels }
     * 
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyLevels createIndividualPromptRunTimeInfoDataTypeHierarchyLevels() {
        return new IndividualPromptRunTimeInfoDataTypeHierarchyLevels();
    }

    /**
     * Create an instance of {@link Initiative }
     * 
     */
    public Initiative createInitiative() {
        return new Initiative();
    }

    /**
     * Create an instance of {@link ObjectIcons }
     * 
     */
    public ObjectIcons createObjectIcons() {
        return new ObjectIcons();
    }

    /**
     * Create an instance of {@link KPIVariable }
     * 
     */
    public KPIVariable createKPIVariable() {
        return new KPIVariable();
    }

    /**
     * Create an instance of {@link CauseAndEffectLinkage }
     * 
     */
    public CauseAndEffectLinkage createCauseAndEffectLinkage() {
        return new CauseAndEffectLinkage();
    }

    /**
     * Create an instance of {@link ReportRegularColumn }
     * 
     */
    public ReportRegularColumn createReportRegularColumn() {
        return new ReportRegularColumn();
    }

    /**
     * Create an instance of {@link PromptStepObjectModel }
     * 
     */
    public PromptStepObjectModel createPromptStepObjectModel() {
        return new PromptStepObjectModel();
    }

    /**
     * Create an instance of {@link KPIResult }
     * 
     */
    public KPIResult createKPIResult() {
        return new KPIResult();
    }

    /**
     * Create an instance of {@link DimensionMapping }
     * 
     */
    public DimensionMapping createDimensionMapping() {
        return new DimensionMapping();
    }

    /**
     * Create an instance of {@link ReportADFParameter }
     * 
     */
    public ReportADFParameter createReportADFParameter() {
        return new ReportADFParameter();
    }

    /**
     * Create an instance of {@link CustomAttributes }
     * 
     */
    public CustomAttributes createCustomAttributes() {
        return new CustomAttributes();
    }

    /**
     * Create an instance of {@link ObjectCustomAttribute }
     * 
     */
    public ObjectCustomAttribute createObjectCustomAttribute() {
        return new ObjectCustomAttribute();
    }

    /**
     * Create an instance of {@link SAWLocale }
     * 
     */
    public SAWLocale createSAWLocale() {
        return new SAWLocale();
    }

    /**
     * Create an instance of {@link ForgetAccountResult }
     * 
     */
    public ForgetAccountResult createForgetAccountResult() {
        return new ForgetAccountResult();
    }

    /**
     * Create an instance of {@link URLGeneratorParams }
     * 
     */
    public URLGeneratorParams createURLGeneratorParams() {
        return new URLGeneratorParams();
    }

    /**
     * Create an instance of {@link ScorecardVariable }
     * 
     */
    public ScorecardVariable createScorecardVariable() {
        return new ScorecardVariable();
    }

    /**
     * Create an instance of {@link ObjectFilter }
     * 
     */
    public ObjectFilter createObjectFilter() {
        return new ObjectFilter();
    }

    /**
     * Create an instance of {@link LogonParameter }
     * 
     */
    public LogonParameter createLogonParameter() {
        return new LogonParameter();
    }

    /**
     * Create an instance of {@link ScorecardNode }
     * 
     */
    public ScorecardNode createScorecardNode() {
        return new ScorecardNode();
    }

    /**
     * Create an instance of {@link DailyTrigger }
     * 
     */
    public DailyTrigger createDailyTrigger() {
        return new DailyTrigger();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoAdditionalAttributes }
     * 
     */
    public IndividualPromptRunTimeInfoAdditionalAttributes createIndividualPromptRunTimeInfoAdditionalAttributes() {
        return new IndividualPromptRunTimeInfoAdditionalAttributes();
    }

    /**
     * Create an instance of {@link WeeklyTrigger }
     * 
     */
    public WeeklyTrigger createWeeklyTrigger() {
        return new WeeklyTrigger();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfo }
     * 
     */
    public IndividualPromptRunTimeInfo createIndividualPromptRunTimeInfo() {
        return new IndividualPromptRunTimeInfo();
    }

    /**
     * Create an instance of {@link OverriddenAssessment }
     * 
     */
    public OverriddenAssessment createOverriddenAssessment() {
        return new OverriddenAssessment();
    }

    /**
     * Create an instance of {@link IndividualPromptObjectModel }
     * 
     */
    public IndividualPromptObjectModel createIndividualPromptObjectModel() {
        return new IndividualPromptObjectModel();
    }

    /**
     * Create an instance of {@link MonthlyDayOfWeekTrigger }
     * 
     */
    public MonthlyDayOfWeekTrigger createMonthlyDayOfWeekTrigger() {
        return new MonthlyDayOfWeekTrigger();
    }

    /**
     * Create an instance of {@link ObjectiveReferences }
     * 
     */
    public ObjectiveReferences createObjectiveReferences() {
        return new ObjectiveReferences();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link SubTypes }
     * 
     */
    public SubTypes createSubTypes() {
        return new SubTypes();
    }

    /**
     * Create an instance of {@link ReportHierarchicalColumn }
     * 
     */
    public ReportHierarchicalColumn createReportHierarchicalColumn() {
        return new ReportHierarchicalColumn();
    }

    /**
     * Create an instance of {@link ADFParameterValues }
     * 
     */
    public ADFParameterValues createADFParameterValues() {
        return new ADFParameterValues();
    }

    /**
     * Create an instance of {@link NameValueArrayPair }
     * 
     */
    public NameValueArrayPair createNameValueArrayPair() {
        return new NameValueArrayPair();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoAvailableOptions }
     * 
     */
    public IndividualPromptRunTimeInfoAvailableOptions createIndividualPromptRunTimeInfoAvailableOptions() {
        return new IndividualPromptRunTimeInfoAvailableOptions();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo }
     * 
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo createIndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo() {
        return new IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo();
    }

    /**
     * Create an instance of {@link PathMapEntry }
     * 
     */
    public PathMapEntry createPathMapEntry() {
        return new PathMapEntry();
    }

    /**
     * Create an instance of {@link PinnedKPI }
     * 
     */
    public PinnedKPI createPinnedKPI() {
        return new PinnedKPI();
    }

    /**
     * Create an instance of {@link KPIResultSet }
     * 
     */
    public KPIResultSet createKPIResultSet() {
        return new KPIResultSet();
    }

    /**
     * Create an instance of {@link FileInfo }
     * 
     */
    public FileInfo createFileInfo() {
        return new FileInfo();
    }

    /**
     * Create an instance of {@link AssessmentMappings }
     * 
     */
    public AssessmentMappings createAssessmentMappings() {
        return new AssessmentMappings();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoValuesType }
     * 
     */
    public IndividualPromptRunTimeInfoValuesType createIndividualPromptRunTimeInfoValuesType() {
        return new IndividualPromptRunTimeInfoValuesType();
    }

    /**
     * Create an instance of {@link Objective }
     * 
     */
    public Objective createObjective() {
        return new Objective();
    }

    /**
     * Create an instance of {@link PromptStepRunTimeInfo }
     * 
     */
    public PromptStepRunTimeInfo createPromptStepRunTimeInfo() {
        return new PromptStepRunTimeInfo();
    }

    /**
     * Create an instance of {@link Variable }
     * 
     */
    public Variable createVariable() {
        return new Variable();
    }

    /**
     * Create an instance of {@link WeightedRule }
     * 
     */
    public WeightedRule createWeightedRule() {
        return new WeightedRule();
    }

    /**
     * Create an instance of {@link AssessmentMapping }
     * 
     */
    public AssessmentMapping createAssessmentMapping() {
        return new AssessmentMapping();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoLimitedByInfo }
     * 
     */
    public IndividualPromptRunTimeInfoLimitedByInfo createIndividualPromptRunTimeInfoLimitedByInfo() {
        return new IndividualPromptRunTimeInfoLimitedByInfo();
    }

    /**
     * Create an instance of {@link AccessControlToken }
     * 
     */
    public AccessControlToken createAccessControlToken() {
        return new AccessControlToken();
    }

    /**
     * Create an instance of {@link SAWException }
     * 
     */
    public SAWException createSAWException() {
        return new SAWException();
    }

    /**
     * Create an instance of {@link AnnotationsList }
     * 
     */
    public AnnotationsList createAnnotationsList() {
        return new AnnotationsList();
    }

    /**
     * Create an instance of {@link KPIDimensionPinning }
     * 
     */
    public KPIDimensionPinning createKPIDimensionPinning() {
        return new KPIDimensionPinning();
    }

    /**
     * Create an instance of {@link JobStats }
     * 
     */
    public JobStats createJobStats() {
        return new JobStats();
    }

    /**
     * Create an instance of {@link TemplateInfo }
     * 
     */
    public TemplateInfo createTemplateInfo() {
        return new TemplateInfo();
    }

    /**
     * Create an instance of {@link PromptCollectionRunTimeInfo }
     * 
     */
    public PromptCollectionRunTimeInfo createPromptCollectionRunTimeInfo() {
        return new PromptCollectionRunTimeInfo();
    }

    /**
     * Create an instance of {@link IndividualPromptRunTimeInfoDataType }
     * 
     */
    public IndividualPromptRunTimeInfoDataType createIndividualPromptRunTimeInfoDataType() {
        return new IndividualPromptRunTimeInfoDataType();
    }

    /**
     * Create an instance of {@link ScorecardDimensionReferences.ScorecardDimensionReference }
     * 
     */
    public ScorecardDimensionReferences.ScorecardDimensionReference createScorecardDimensionReferencesScorecardDimensionReference() {
        return new ScorecardDimensionReferences.ScorecardDimensionReference();
    }

    /**
     * Create an instance of {@link KPIDimensionReferences.KPIDimensionReference }
     * 
     */
    public KPIDimensionReferences.KPIDimensionReference createKPIDimensionReferencesKPIDimensionReference() {
        return new KPIDimensionReferences.KPIDimensionReference();
    }

    /**
     * Create an instance of {@link JobInfo.DetailedInfo }
     * 
     */
    public JobInfo.DetailedInfo createJobInfoDetailedInfo() {
        return new JobInfo.DetailedInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = UpdateCauseAndEffectLinkages.class)
    public JAXBElement<String> createUpdateCauseAndEffectLinkagesSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, UpdateCauseAndEffectLinkages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sortOrderCaseSensitive", scope = DescribeSubjectAreaWithSort.class)
    public JAXBElement<String> createDescribeSubjectAreaWithSortSortOrderCaseSensitive(String value) {
        return new JAXBElement<String>(_DescribeSubjectAreaWithSortSortOrderCaseSensitive_QNAME, String.class, DescribeSubjectAreaWithSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sortOrder", scope = DescribeSubjectAreaWithSort.class)
    public JAXBElement<String> createDescribeSubjectAreaWithSortSortOrder(String value) {
        return new JAXBElement<String>(_DescribeSubjectAreaWithSortSortOrder_QNAME, String.class, DescribeSubjectAreaWithSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = CloseScorecard.class)
    public JAXBElement<String> createCloseScorecardSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, CloseScorecard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "timeOut", scope = ScorecardSettings.class)
    public JAXBElement<Integer> createScorecardSettingsTimeOut(Integer value) {
        return new JAXBElement<Integer>(_ScorecardSettingsTimeOut_QNAME, Integer.class, ScorecardSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "itemInfo", scope = ScorecardSettings.class)
    public JAXBElement<ItemInfo> createScorecardSettingsItemInfo(ItemInfo value) {
        return new JAXBElement<ItemInfo>(_ScorecardSettingsItemInfo_QNAME, ItemInfo.class, ScorecardSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = CloseScorecardAssessment.class)
    public JAXBElement<String> createCloseScorecardAssessmentSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, CloseScorecardAssessment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "nodeStrategy", scope = OpenTreeNodeResult.class)
    public JAXBElement<StrategyNode> createOpenTreeNodeResultNodeStrategy(StrategyNode value) {
        return new JAXBElement<StrategyNode>(_OpenTreeNodeResultNodeStrategy_QNAME, StrategyNode.class, OpenTreeNodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitiativeNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "nodeInitiative", scope = OpenTreeNodeResult.class)
    public JAXBElement<InitiativeNode> createOpenTreeNodeResultNodeInitiative(InitiativeNode value) {
        return new JAXBElement<InitiativeNode>(_OpenTreeNodeResultNodeInitiative_QNAME, InitiativeNode.class, OpenTreeNodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = ExecuteKPIDimensionLOVQuery.class)
    public JAXBElement<String> createExecuteKPIDimensionLOVQuerySessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, ExecuteKPIDimensionLOVQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = ExecuteScorecard.class)
    public JAXBElement<String> createExecuteScorecardSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, ExecuteScorecard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "node", scope = AddStrategyNodeResult.class)
    public JAXBElement<StrategyNode> createAddStrategyNodeResultNode(StrategyNode value) {
        return new JAXBElement<StrategyNode>(_AddStrategyNodeResultNode_QNAME, StrategyNode.class, AddStrategyNodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = EditScorecard.class)
    public JAXBElement<String> createEditScorecardSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, EditScorecard.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = UpdateScorecardView.class)
    public JAXBElement<String> createUpdateScorecardViewSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, UpdateScorecardView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "permission", scope = Perspective.class)
    public JAXBElement<Integer> createPerspectivePermission(Integer value) {
        return new JAXBElement<Integer>(_PerspectivePermission_QNAME, Integer.class, Perspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "obj", scope = Perspective.class)
    public JAXBElement<CatalogObject> createPerspectiveObj(CatalogObject value) {
        return new JAXBElement<CatalogObject>(_PerspectiveObj_QNAME, CatalogObject.class, Perspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = GenerateKPIDrillTo.class)
    public JAXBElement<String> createGenerateKPIDrillToSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, GenerateKPIDrillTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sortOrderCaseSensitive", scope = GetSubjectAreasWithSort.class)
    public JAXBElement<String> createGetSubjectAreasWithSortSortOrderCaseSensitive(String value) {
        return new JAXBElement<String>(_DescribeSubjectAreaWithSortSortOrderCaseSensitive_QNAME, String.class, GetSubjectAreasWithSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sortOrder", scope = GetSubjectAreasWithSort.class)
    public JAXBElement<String> createGetSubjectAreasWithSortSortOrder(String value) {
        return new JAXBElement<String>(_DescribeSubjectAreaWithSortSortOrder_QNAME, String.class, GetSubjectAreasWithSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "permission", scope = PinnedKPI.class)
    public JAXBElement<Integer> createPinnedKPIPermission(Integer value) {
        return new JAXBElement<Integer>(_PerspectivePermission_QNAME, Integer.class, PinnedKPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "obj", scope = PinnedKPI.class)
    public JAXBElement<CatalogObject> createPinnedKPIObj(CatalogObject value) {
        return new JAXBElement<CatalogObject>(_PerspectiveObj_QNAME, CatalogObject.class, PinnedKPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "id", scope = UpdateScorecardItemACL.class)
    public JAXBElement<String> createUpdateScorecardItemACLId(String value) {
        return new JAXBElement<String>(_UpdateScorecardItemACLId_QNAME, String.class, UpdateScorecardItemACL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = UpdateScorecardItemACL.class)
    public JAXBElement<String> createUpdateScorecardItemACLSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, UpdateScorecardItemACL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = MoveInitiativeNode.class)
    public JAXBElement<String> createMoveInitiativeNodeSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, MoveInitiativeNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = DeleteStrategyNode.class)
    public JAXBElement<String> createDeleteStrategyNodeSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, DeleteStrategyNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "displayValue", scope = KPIDimensionPinning.class)
    public JAXBElement<String> createKPIDimensionPinningDisplayValue(String value) {
        return new JAXBElement<String>(_KPIDimensionPinningDisplayValue_QNAME, String.class, KPIDimensionPinning.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = UpdateInitiativeNode.class)
    public JAXBElement<String> createUpdateInitiativeNodeSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, UpdateInitiativeNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = GetKPIContributionWheelDimensions.class)
    public JAXBElement<String> createGetKPIContributionWheelDimensionsSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, GetKPIContributionWheelDimensions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "permission", scope = StrategyNode.class)
    public JAXBElement<Integer> createStrategyNodePermission(Integer value) {
        return new JAXBElement<Integer>(_PerspectivePermission_QNAME, Integer.class, StrategyNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "balanceInfo", scope = StrategyNode.class)
    public JAXBElement<BalanceInfo> createStrategyNodeBalanceInfo(BalanceInfo value) {
        return new JAXBElement<BalanceInfo>(_StrategyNodeBalanceInfo_QNAME, BalanceInfo.class, StrategyNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "itemInfo", scope = StrategyNode.class)
    public JAXBElement<ItemInfo> createStrategyNodeItemInfo(ItemInfo value) {
        return new JAXBElement<ItemInfo>(_ScorecardSettingsItemInfo_QNAME, ItemInfo.class, StrategyNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "permission", scope = InitiativeNode.class)
    public JAXBElement<Integer> createInitiativeNodePermission(Integer value) {
        return new JAXBElement<Integer>(_PerspectivePermission_QNAME, Integer.class, InitiativeNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "itemInfo", scope = InitiativeNode.class)
    public JAXBElement<ItemInfo> createInitiativeNodeItemInfo(ItemInfo value) {
        return new JAXBElement<ItemInfo>(_ScorecardSettingsItemInfo_QNAME, ItemInfo.class, InitiativeNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "validActionLinks", scope = ScorecardNodeResult.class)
    public JAXBElement<String> createScorecardNodeResultValidActionLinks(String value) {
        return new JAXBElement<String>(_ScorecardNodeResultValidActionLinks_QNAME, String.class, ScorecardNodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = AddAnnotation.class)
    public JAXBElement<String> createAddAnnotationSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, AddAnnotation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = AddStrategyNode.class)
    public JAXBElement<String> createAddStrategyNodeSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, AddStrategyNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "id", scope = UpdatedScorecardACLItem.class)
    public JAXBElement<String> createUpdatedScorecardACLItemId(String value) {
        return new JAXBElement<String>(_UpdateScorecardItemACLId_QNAME, String.class, UpdatedScorecardACLItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "itemInfo", scope = UpdatedScorecardACLItem.class)
    public JAXBElement<ItemInfo> createUpdatedScorecardACLItemItemInfo(ItemInfo value) {
        return new JAXBElement<ItemInfo>(_ScorecardSettingsItemInfo_QNAME, ItemInfo.class, UpdatedScorecardACLItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = GetScorecardViewDimensions.class)
    public JAXBElement<String> createGetScorecardViewDimensionsSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, GetScorecardViewDimensions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = AddInitiativeNode.class)
    public JAXBElement<String> createAddInitiativeNodeSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, AddInitiativeNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "entryTimeDisplay", scope = Annotation.class)
    public JAXBElement<String> createAnnotationEntryTimeDisplay(String value) {
        return new JAXBElement<String>(_AnnotationEntryTimeDisplay_QNAME, String.class, Annotation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = UpdatePerspective.class)
    public JAXBElement<String> createUpdatePerspectiveSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, UpdatePerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = CancelKPIExecution.class)
    public JAXBElement<String> createCancelKPIExecutionSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, CancelKPIExecution.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "permission", scope = Initiative.class)
    public JAXBElement<Integer> createInitiativePermission(Integer value) {
        return new JAXBElement<Integer>(_PerspectivePermission_QNAME, Integer.class, Initiative.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "obj", scope = Initiative.class)
    public JAXBElement<CatalogObject> createInitiativeObj(CatalogObject value) {
        return new JAXBElement<CatalogObject>(_PerspectiveObj_QNAME, CatalogObject.class, Initiative.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sortOrderCaseSensitive", scope = DescribeTableWithSort.class)
    public JAXBElement<String> createDescribeTableWithSortSortOrderCaseSensitive(String value) {
        return new JAXBElement<String>(_DescribeSubjectAreaWithSortSortOrderCaseSensitive_QNAME, String.class, DescribeTableWithSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sortOrder", scope = DescribeTableWithSort.class)
    public JAXBElement<String> createDescribeTableWithSortSortOrder(String value) {
        return new JAXBElement<String>(_DescribeSubjectAreaWithSortSortOrder_QNAME, String.class, DescribeTableWithSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = CancelScorecardAssessment.class)
    public JAXBElement<String> createCancelScorecardAssessmentSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, CancelScorecardAssessment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = UpdateScorecardSettings.class)
    public JAXBElement<String> createUpdateScorecardSettingsSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, UpdateScorecardSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "permission", scope = Objective.class)
    public JAXBElement<Integer> createObjectivePermission(Integer value) {
        return new JAXBElement<Integer>(_PerspectivePermission_QNAME, Integer.class, Objective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "obj", scope = Objective.class)
    public JAXBElement<CatalogObject> createObjectiveObj(CatalogObject value) {
        return new JAXBElement<CatalogObject>(_PerspectiveObj_QNAME, CatalogObject.class, Objective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = GetScorecardKPIDimensions.class)
    public JAXBElement<String> createGetScorecardKPIDimensionsSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, GetScorecardKPIDimensions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = GenerateDrillTo.class)
    public JAXBElement<String> createGenerateDrillToSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, GenerateDrillTo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = OpenTreeNode.class)
    public JAXBElement<String> createOpenTreeNodeSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, OpenTreeNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = AddScorecardView.class)
    public JAXBElement<String> createAddScorecardViewSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, AddScorecardView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "levelID", scope = KPIDimensionValue.class)
    public JAXBElement<String> createKPIDimensionValueLevelID(String value) {
        return new JAXBElement<String>(_KPIDimensionValueLevelID_QNAME, String.class, KPIDimensionValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "displayValue", scope = KPIDimensionValue.class)
    public JAXBElement<String> createKPIDimensionValueDisplayValue(String value) {
        return new JAXBElement<String>(_KPIDimensionPinningDisplayValue_QNAME, String.class, KPIDimensionValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrategyNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "node", scope = UpdateStrategyNodeResult.class)
    public JAXBElement<StrategyNode> createUpdateStrategyNodeResultNode(StrategyNode value) {
        return new JAXBElement<StrategyNode>(_AddStrategyNodeResultNode_QNAME, StrategyNode.class, UpdateStrategyNodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = UpdateStrategyNode.class)
    public JAXBElement<String> createUpdateStrategyNodeSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, UpdateStrategyNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = FetchScorecardAssessment.class)
    public JAXBElement<String> createFetchScorecardAssessmentSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, FetchScorecardAssessment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = DeleteInitiativeNode.class)
    public JAXBElement<String> createDeleteInitiativeNodeSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, DeleteInitiativeNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = DeletePerspective.class)
    public JAXBElement<String> createDeletePerspectiveSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, DeletePerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "permission", scope = ScorecardView.class)
    public JAXBElement<Integer> createScorecardViewPermission(Integer value) {
        return new JAXBElement<Integer>(_PerspectivePermission_QNAME, Integer.class, ScorecardView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "obj", scope = ScorecardView.class)
    public JAXBElement<CatalogObject> createScorecardViewObj(CatalogObject value) {
        return new JAXBElement<CatalogObject>(_PerspectiveObj_QNAME, CatalogObject.class, ScorecardView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "mappedToDimensionID", scope = KPIDimensionReferences.KPIDimensionReference.class)
    public JAXBElement<String> createKPIDimensionReferencesKPIDimensionReferenceMappedToDimensionID(String value) {
        return new JAXBElement<String>(_KPIDimensionReferencesKPIDimensionReferenceMappedToDimensionID_QNAME, String.class, KPIDimensionReferences.KPIDimensionReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KPIDimensionValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "defaultValue", scope = KPIDimensionReferences.KPIDimensionReference.class)
    public JAXBElement<KPIDimensionValue> createKPIDimensionReferencesKPIDimensionReferenceDefaultValue(KPIDimensionValue value) {
        return new JAXBElement<KPIDimensionValue>(_KPIDimensionReferencesKPIDimensionReferenceDefaultValue_QNAME, KPIDimensionValue.class, KPIDimensionReferences.KPIDimensionReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "displayLabel", scope = KPIDimensionReferences.KPIDimensionReference.class)
    public JAXBElement<String> createKPIDimensionReferencesKPIDimensionReferenceDisplayLabel(String value) {
        return new JAXBElement<String>(_KPIDimensionReferencesKPIDimensionReferenceDisplayLabel_QNAME, String.class, KPIDimensionReferences.KPIDimensionReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitiativeNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "node", scope = UpdateInitiativeNodeResult.class)
    public JAXBElement<InitiativeNode> createUpdateInitiativeNodeResultNode(InitiativeNode value) {
        return new JAXBElement<InitiativeNode>(_AddStrategyNodeResultNode_QNAME, InitiativeNode.class, UpdateInitiativeNodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "overriddenTimeDisplay", scope = OverriddenAssessment.class)
    public JAXBElement<String> createOverriddenAssessmentOverriddenTimeDisplay(String value) {
        return new JAXBElement<String>(_OverriddenAssessmentOverriddenTimeDisplay_QNAME, String.class, OverriddenAssessment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = ExecuteKPI.class)
    public JAXBElement<String> createExecuteKPISessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, ExecuteKPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScorecardDetailsOptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "options", scope = GetScorecardDetails.class)
    public JAXBElement<ScorecardDetailsOptions> createGetScorecardDetailsOptions(ScorecardDetailsOptions value) {
        return new JAXBElement<ScorecardDetailsOptions>(_GetScorecardDetailsOptions_QNAME, ScorecardDetailsOptions.class, GetScorecardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = GetScorecardDetails.class)
    public JAXBElement<String> createGetScorecardDetailsSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, GetScorecardDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = GetKPIWatchlistDimensions.class)
    public JAXBElement<String> createGetKPIWatchlistDimensionsSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, GetKPIWatchlistDimensions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "mappedToDimensionID", scope = ScorecardDimensionReferences.ScorecardDimensionReference.class)
    public JAXBElement<String> createScorecardDimensionReferencesScorecardDimensionReferenceMappedToDimensionID(String value) {
        return new JAXBElement<String>(_KPIDimensionReferencesKPIDimensionReferenceMappedToDimensionID_QNAME, String.class, ScorecardDimensionReferences.ScorecardDimensionReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KPIDimensionValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "defaultValue", scope = ScorecardDimensionReferences.ScorecardDimensionReference.class)
    public JAXBElement<KPIDimensionValue> createScorecardDimensionReferencesScorecardDimensionReferenceDefaultValue(KPIDimensionValue value) {
        return new JAXBElement<KPIDimensionValue>(_KPIDimensionReferencesKPIDimensionReferenceDefaultValue_QNAME, KPIDimensionValue.class, ScorecardDimensionReferences.ScorecardDimensionReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "displayLabel", scope = ScorecardDimensionReferences.ScorecardDimensionReference.class)
    public JAXBElement<String> createScorecardDimensionReferencesScorecardDimensionReferenceDisplayLabel(String value) {
        return new JAXBElement<String>(_KPIDimensionReferencesKPIDimensionReferenceDisplayLabel_QNAME, String.class, ScorecardDimensionReferences.ScorecardDimensionReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = MoveStrategyNode.class)
    public JAXBElement<String> createMoveStrategyNodeSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, MoveStrategyNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = OverrideAssessment.class)
    public JAXBElement<String> createOverrideAssessmentSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, OverrideAssessment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = AddPerspective.class)
    public JAXBElement<String> createAddPerspectiveSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, AddPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "mappedToDimensionID", scope = DimensionMapping.class)
    public JAXBElement<String> createDimensionMappingMappedToDimensionID(String value) {
        return new JAXBElement<String>(_KPIDimensionReferencesKPIDimensionReferenceMappedToDimensionID_QNAME, String.class, DimensionMapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KPIDimensionValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "defaultValue", scope = DimensionMapping.class)
    public JAXBElement<KPIDimensionValue> createDimensionMappingDefaultValue(KPIDimensionValue value) {
        return new JAXBElement<KPIDimensionValue>(_KPIDimensionReferencesKPIDimensionReferenceDefaultValue_QNAME, KPIDimensionValue.class, DimensionMapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "displayLabel", scope = DimensionMapping.class)
    public JAXBElement<String> createDimensionMappingDisplayLabel(String value) {
        return new JAXBElement<String>(_KPIDimensionReferencesKPIDimensionReferenceDisplayLabel_QNAME, String.class, DimensionMapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "overridesOnly", scope = GetAnnotations.class)
    public JAXBElement<Boolean> createGetAnnotationsOverridesOnly(Boolean value) {
        return new JAXBElement<Boolean>(_GetAnnotationsOverridesOnly_QNAME, Boolean.class, GetAnnotations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = GetAnnotations.class)
    public JAXBElement<String> createGetAnnotationsSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, GetAnnotations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = DeleteScorecardView.class)
    public JAXBElement<String> createDeleteScorecardViewSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, DeleteScorecardView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitiativeNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "node", scope = AddInitiativeNodeResult.class)
    public JAXBElement<InitiativeNode> createAddInitiativeNodeResultNode(InitiativeNode value) {
        return new JAXBElement<InitiativeNode>(_AddStrategyNodeResultNode_QNAME, InitiativeNode.class, AddInitiativeNodeResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = FetchKPIAssessment.class)
    public JAXBElement<String> createFetchKPIAssessmentSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, FetchKPIAssessment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn://oracle.bi.webservices/v12", name = "sessionID", scope = FetchNextKPIDimensionLOV.class)
    public JAXBElement<String> createFetchNextKPIDimensionLOVSessionID(String value) {
        return new JAXBElement<String>(_UpdateCauseAndEffectLinkagesSessionID_QNAME, String.class, FetchNextKPIDimensionLOV.class, value);
    }

}
