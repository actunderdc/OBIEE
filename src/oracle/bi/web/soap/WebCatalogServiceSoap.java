
package oracle.bi.web.soap;

import java.util.List;
import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebCatalogServiceSoap", targetNamespace = "urn://oracle.bi.webservices/v12")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebCatalogServiceSoap {


    /**
     * 
     * @param path
     * @param sessionID
     */
    @WebMethod(action = "#deleteItem")
    @RequestWrapper(localName = "deleteItem", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.DeleteItem")
    @ResponseWrapper(localName = "deleteItemResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.DeleteItemResult")
    public void deleteItem(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param sessionID
     * @param createIntermediateDirs
     * @param createIfNotExists
     */
    @WebMethod(action = "#createFolder")
    @RequestWrapper(localName = "createFolder", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.CreateFolder")
    @ResponseWrapper(localName = "createFolderResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.CreateFolderResult")
    public void createFolder(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "createIfNotExists", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean createIfNotExists,
        @WebParam(name = "createIntermediateDirs", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean createIntermediateDirs,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param pathTarget
     * @param overwriteIfExists
     * @param sessionID
     */
    @WebMethod(action = "#createLink")
    @RequestWrapper(localName = "createLink", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.CreateLink")
    @ResponseWrapper(localName = "createLinkResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.CreateLinkResult")
    public void createLink(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "pathTarget", targetNamespace = "urn://oracle.bi.webservices/v12")
        String pathTarget,
        @WebParam(name = "overwriteIfExists", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean overwriteIfExists,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param sessionID
     * @param recursive
     */
    @WebMethod(action = "#removeFolder")
    @RequestWrapper(localName = "removeFolder", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.RemoveFolder")
    @ResponseWrapper(localName = "removeFolderResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.RemoveFolderResult")
    public void removeFolder(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "recursive", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean recursive,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param flagACL
     * @param pathDest
     * @param sessionID
     * @param pathSrc
     */
    @WebMethod(action = "#moveItem")
    @RequestWrapper(localName = "moveItem", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.MoveItem")
    @ResponseWrapper(localName = "moveItemResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.MoveItemResult")
    public void moveItem(
        @WebParam(name = "pathSrc", targetNamespace = "urn://oracle.bi.webservices/v12")
        String pathSrc,
        @WebParam(name = "pathDest", targetNamespace = "urn://oracle.bi.webservices/v12")
        String pathDest,
        @WebParam(name = "flagACL", targetNamespace = "urn://oracle.bi.webservices/v12")
        int flagACL,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param flagACL
     * @param pathDest
     * @param sessionID
     * @param pathSrc
     */
    @WebMethod(action = "#copyItem")
    @RequestWrapper(localName = "copyItem", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.CopyItem")
    @ResponseWrapper(localName = "copyItemResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.CopyItemResult")
    public void copyItem(
        @WebParam(name = "pathSrc", targetNamespace = "urn://oracle.bi.webservices/v12")
        String pathSrc,
        @WebParam(name = "pathDest", targetNamespace = "urn://oracle.bi.webservices/v12")
        String pathDest,
        @WebParam(name = "flagACL", targetNamespace = "urn://oracle.bi.webservices/v12")
        int flagACL,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param permissions
     * @param timestamps
     * @param useMtom
     * @param skipPath
     * @param sessionID
     * @param recursive
     * @return
     *     returns javax.activation.DataHandler
     */
    @WebMethod(action = "#copyItem2")
    @WebResult(name = "archive", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "copyItem2", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.CopyItem2")
    @ResponseWrapper(localName = "copyItem2Result", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.CopyItem2Result")
    public DataHandler copyItem2(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> path,
        @WebParam(name = "recursive", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean recursive,
        @WebParam(name = "permissions", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean permissions,
        @WebParam(name = "timestamps", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean timestamps,
        @WebParam(name = "useMtom", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean useMtom,
        @WebParam(name = "skipPath", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> skipPath,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param flagACL
     * @param options
     * @param archive
     * @param replacePath
     * @param sessionID
     * @param flagOverwrite
     * @param flagReplaceReferences
     */
    @WebMethod(action = "#pasteItem2")
    @RequestWrapper(localName = "pasteItem2", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.PasteItem2")
    @ResponseWrapper(localName = "pasteItem2Result", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.PasteItem2Result")
    public void pasteItem2(
        @WebParam(name = "archive", targetNamespace = "urn://oracle.bi.webservices/v12")
        DataHandler archive,
        @WebParam(name = "replacePath", targetNamespace = "urn://oracle.bi.webservices/v12")
        String replacePath,
        @WebParam(name = "flagACL", targetNamespace = "urn://oracle.bi.webservices/v12")
        int flagACL,
        @WebParam(name = "flagOverwrite", targetNamespace = "urn://oracle.bi.webservices/v12")
        int flagOverwrite,
        @WebParam(name = "flagReplaceReferences", targetNamespace = "urn://oracle.bi.webservices/v12")
        int flagReplaceReferences,
        @WebParam(name = "options", targetNamespace = "urn://oracle.bi.webservices/v12")
        PasteItem2Params options,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param resolveLinks
     * @param options
     * @param sessionID
     * @param mask
     * @return
     *     returns java.util.List<oracle.bi.web.soap.ItemInfo>
     */
    @WebMethod(action = "#getSubItems")
    @WebResult(name = "itemInfo", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getSubItems", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetSubItems")
    @ResponseWrapper(localName = "getSubItemsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetSubItemsResult")
    public List<ItemInfo> getSubItems(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "mask", targetNamespace = "urn://oracle.bi.webservices/v12")
        String mask,
        @WebParam(name = "resolveLinks", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean resolveLinks,
        @WebParam(name = "options", targetNamespace = "urn://oracle.bi.webservices/v12")
        GetSubItemsParams options,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param resolveLinks
     * @param sessionID
     * @return
     *     returns oracle.bi.web.soap.ItemInfo
     */
    @WebMethod(action = "#getItemInfo")
    @WebResult(targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getItemInfo", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetItemInfo")
    @ResponseWrapper(localName = "getItemInfoResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetItemInfoResult")
    public ItemInfo getItemInfo(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "resolveLinks", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean resolveLinks,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param name
     * @param lastModified
     * @param sessionID
     * @param value
     * @param recursive
     */
    @WebMethod(action = "#setItemProperty")
    @RequestWrapper(localName = "setItemProperty", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.SetItemProperty")
    @ResponseWrapper(localName = "setItemPropertyResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.SetItemPropertyResult")
    public void setItemProperty(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> path,
        @WebParam(name = "lastModified", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<XMLGregorianCalendar> lastModified,
        @WebParam(name = "name", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> name,
        @WebParam(name = "value", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> value,
        @WebParam(name = "recursive", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean recursive,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param flag
     * @param sessionID
     */
    @WebMethod(action = "#maintenanceMode")
    @RequestWrapper(localName = "maintenanceMode", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.MaintenanceMode")
    @ResponseWrapper(localName = "maintenanceModeResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.MaintenanceModeResult")
    public void maintenanceMode(
        @WebParam(name = "flag", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean flag,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(action = "#getMaintenanceMode")
    @WebResult(targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getMaintenanceMode", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetMaintenanceMode")
    @ResponseWrapper(localName = "getMaintenanceModeResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetMaintenanceModeResult")
    public Boolean getMaintenanceMode(
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param returnOptions
     * @param resolveLinks
     * @param paths
     * @param errorMode
     * @param sessionID
     * @return
     *     returns java.util.List<oracle.bi.web.soap.CatalogObject>
     */
    @WebMethod(action = "#readObjects")
    @WebResult(name = "catalogObject", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "readObjects", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ReadObjects")
    @ResponseWrapper(localName = "readObjectsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ReadObjectsResult")
    public List<CatalogObject> readObjects(
        @WebParam(name = "paths", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> paths,
        @WebParam(name = "resolveLinks", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean resolveLinks,
        @WebParam(name = "errorMode", targetNamespace = "urn://oracle.bi.webservices/v12")
        ErrorDetailsLevel errorMode,
        @WebParam(name = "returnOptions", targetNamespace = "urn://oracle.bi.webservices/v12")
        ReadObjectsReturnOptions returnOptions,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param catalogObjects
     * @param allowOverwrite
     * @param errorMode
     * @param sessionID
     * @param createIntermediateDirs
     * @return
     *     returns java.util.List<oracle.bi.web.soap.ErrorInfo>
     */
    @WebMethod(action = "#writeObjects")
    @WebResult(name = "errorInfo", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "writeObjects", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.WriteObjects")
    @ResponseWrapper(localName = "writeObjectsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.WriteObjectsResult")
    public List<ErrorInfo> writeObjects(
        @WebParam(name = "catalogObjects", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<CatalogObject> catalogObjects,
        @WebParam(name = "allowOverwrite", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean allowOverwrite,
        @WebParam(name = "createIntermediateDirs", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean createIntermediateDirs,
        @WebParam(name = "errorMode", targetNamespace = "urn://oracle.bi.webservices/v12")
        ErrorDetailsLevel errorMode,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param options
     * @param acl
     * @param sessionID
     */
    @WebMethod(action = "#updateCatalogItemACL")
    @RequestWrapper(localName = "updateCatalogItemACL", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.UpdateCatalogItemACL")
    @ResponseWrapper(localName = "updateCatalogItemACLResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.UpdateCatalogItemACLResult")
    public void updateCatalogItemACL(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> path,
        @WebParam(name = "acl", targetNamespace = "urn://oracle.bi.webservices/v12")
        ACL acl,
        @WebParam(name = "options", targetNamespace = "urn://oracle.bi.webservices/v12")
        UpdateCatalogItemACLParams options,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param owner
     * @param path
     * @param sessionID
     * @param recursive
     */
    @WebMethod(action = "#setOwnership")
    @RequestWrapper(localName = "setOwnership", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.SetOwnership")
    @ResponseWrapper(localName = "setOwnershipResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.SetOwnershipResult")
    public void setOwnership(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> path,
        @WebParam(name = "owner", targetNamespace = "urn://oracle.bi.webservices/v12")
        Account owner,
        @WebParam(name = "recursive", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean recursive,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param sessionID
     * @param valueOff
     * @param value
     * @param recursive
     */
    @WebMethod(action = "#setItemAttributes")
    @RequestWrapper(localName = "setItemAttributes", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.SetItemAttributes")
    @ResponseWrapper(localName = "setItemAttributesResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.SetItemAttributesResult")
    public void setItemAttributes(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> path,
        @WebParam(name = "value", targetNamespace = "urn://oracle.bi.webservices/v12")
        int value,
        @WebParam(name = "valueOff", targetNamespace = "urn://oracle.bi.webservices/v12")
        int valueOff,
        @WebParam(name = "recursive", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean recursive,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @return
     *     returns java.util.List<oracle.bi.web.soap.ObjectTypes>
     */
    @WebMethod(action = "#getObjectTypes")
    @WebResult(name = "objectTypes", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getObjectTypes", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetObjectTypes")
    @ResponseWrapper(localName = "getObjectTypesResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetObjectTypesResult")
    public List<ObjectTypes> getObjectTypes(
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @return
     *     returns java.util.List<oracle.bi.web.soap.ObjectCategory>
     */
    @WebMethod(action = "#getObjectCategories")
    @WebResult(name = "objectCategory", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getObjectCategories", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetObjectCategories")
    @ResponseWrapper(localName = "getObjectCategoriesResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetObjectCategoriesResult")
    public List<ObjectCategory> getObjectCategories(
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @return
     *     returns java.util.List<oracle.bi.web.soap.ObjectGroup>
     */
    @WebMethod(action = "#getObjectCreateList")
    @WebResult(name = "objectGroup", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getObjectCreateList", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetObjectCreateList")
    @ResponseWrapper(localName = "getObjectCreateListResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetObjectCreateListResult")
    public List<ObjectGroup> getObjectCreateList(
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "#getUserHomeDirPath")
    @WebResult(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getUserHomeDirPath", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetUserHomeDirPath")
    @ResponseWrapper(localName = "getUserHomeDirPathResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetUserHomeDirPathResult")
    public String getUserHomeDirPath(
        @WebParam(name = "username", targetNamespace = "urn://oracle.bi.webservices/v12")
        String username,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

}
