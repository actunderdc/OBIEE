
package oracle.bi.web.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SecurityServiceSoap", targetNamespace = "urn://oracle.bi.webservices/v12")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SecurityServiceSoap {


    /**
     * 
     * @param sessionID
     * @return
     *     returns java.util.List<oracle.bi.web.soap.Privilege>
     */
    @WebMethod(action = "#getGlobalPrivileges")
    @WebResult(name = "sawPrivileges", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getGlobalPrivileges", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetGlobalPrivileges")
    @ResponseWrapper(localName = "getGlobalPrivilegesResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetGlobalPrivilegesResult")
    public List<Privilege> getGlobalPrivileges(
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @param privilegeName
     * @return
     *     returns oracle.bi.web.soap.ACL
     */
    @WebMethod(action = "#getGlobalPrivilegeACL")
    @WebResult(name = "acl", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getGlobalPrivilegeACL", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetGlobalPrivilegeACL")
    @ResponseWrapper(localName = "getGlobalPrivilegeACLResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetGlobalPrivilegeACLResult")
    public ACL getGlobalPrivilegeACL(
        @WebParam(name = "privilegeName", targetNamespace = "urn://oracle.bi.webservices/v12")
        String privilegeName,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param updateACLParams
     * @param acl
     * @param sessionID
     * @param privilegeName
     */
    @WebMethod(action = "#updateGlobalPrivilegeACL")
    @RequestWrapper(localName = "updateGlobalPrivilegeACL", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.UpdateGlobalPrivilegeACL")
    @ResponseWrapper(localName = "updateGlobalPrivilegeACLResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.UpdateGlobalPrivilegeACLResult")
    public void updateGlobalPrivilegeACL(
        @WebParam(name = "privilegeName", targetNamespace = "urn://oracle.bi.webservices/v12")
        String privilegeName,
        @WebParam(name = "acl", targetNamespace = "urn://oracle.bi.webservices/v12")
        ACL acl,
        @WebParam(name = "updateACLParams", targetNamespace = "urn://oracle.bi.webservices/v12")
        UpdateACLParams updateACLParams,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param cleanuplevel
     * @param sessionID
     * @param account
     */
    @WebMethod(action = "#forgetAccounts")
    @RequestWrapper(localName = "forgetAccounts", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ForgetAccounts")
    @ResponseWrapper(localName = "forgetAccountsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ForgetAccountsResult")
    public void forgetAccounts(
        @WebParam(name = "account", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> account,
        @WebParam(name = "cleanuplevel", targetNamespace = "urn://oracle.bi.webservices/v12")
        int cleanuplevel,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param from
     * @param to
     * @param sessionID
     */
    @WebMethod(action = "#renameAccounts")
    @RequestWrapper(localName = "renameAccounts", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.RenameAccounts")
    @ResponseWrapper(localName = "renameAccountsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.RenameAccountsResult")
    public void renameAccounts(
        @WebParam(name = "from", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> from,
        @WebParam(name = "to", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> to,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param forgetAccountsList
     * @param sessionID
     * @return
     *     returns oracle.bi.web.soap.ForgetAccountsStatus
     */
    @WebMethod(action = "#forgetAccountsEx")
    @WebResult(name = "accountsStatus", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "forgetAccountsEx", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ForgetAccountsEx")
    @ResponseWrapper(localName = "forgetAccountsExResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ForgetAccountsExResult")
    public ForgetAccountsStatus forgetAccountsEx(
        @WebParam(name = "forgetAccountsList", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<ForgetAccount> forgetAccountsList,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @param renameAccountsList
     * @return
     *     returns oracle.bi.web.soap.RenameAccountsStatus
     */
    @WebMethod(action = "#renameAccountsEx")
    @WebResult(name = "accountsStatus", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "renameAccountsEx", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.RenameAccountsEx")
    @ResponseWrapper(localName = "renameAccountsExResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.RenameAccountsExResult")
    public RenameAccountsStatus renameAccountsEx(
        @WebParam(name = "renameAccountsList", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<RenameAccount> renameAccountsList,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param member
     * @param sessionID
     * @param group
     */
    @WebMethod(action = "#joinGroups")
    @RequestWrapper(localName = "joinGroups", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.JoinGroups")
    @ResponseWrapper(localName = "joinGroupsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.JoinGroupsResult")
    public void joinGroups(
        @WebParam(name = "group", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> group,
        @WebParam(name = "member", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> member,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param member
     * @param sessionID
     * @param group
     */
    @WebMethod(action = "#leaveGroups")
    @RequestWrapper(localName = "leaveGroups", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.LeaveGroups")
    @ResponseWrapper(localName = "leaveGroupsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.LeaveGroupsResult")
    public void leaveGroups(
        @WebParam(name = "group", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> group,
        @WebParam(name = "member", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> member,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param expandGroups
     * @param member
     * @param sessionID
     * @return
     *     returns java.util.List<oracle.bi.web.soap.Account>
     */
    @WebMethod(action = "#getGroups")
    @WebResult(name = "account", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getGroups", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetGroups")
    @ResponseWrapper(localName = "getGroupsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetGroupsResult")
    public List<Account> getGroups(
        @WebParam(name = "member", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> member,
        @WebParam(name = "expandGroups", targetNamespace = "urn://oracle.bi.webservices/v12")
        Boolean expandGroups,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param expandGroups
     * @param sessionID
     * @param group
     * @return
     *     returns java.util.List<oracle.bi.web.soap.Account>
     */
    @WebMethod(action = "#getMembers")
    @WebResult(name = "account", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getMembers", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetMembers")
    @ResponseWrapper(localName = "getMembersResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetMembersResult")
    public List<Account> getMembers(
        @WebParam(name = "group", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> group,
        @WebParam(name = "expandGroups", targetNamespace = "urn://oracle.bi.webservices/v12")
        Boolean expandGroups,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param expandGroups
     * @param member
     * @param sessionID
     * @param group
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(action = "#isMember")
    @WebResult(targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "isMember", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.IsMember")
    @ResponseWrapper(localName = "isMemberResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.IsMemberResult")
    public Boolean isMember(
        @WebParam(name = "group", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> group,
        @WebParam(name = "member", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> member,
        @WebParam(name = "expandGroups", targetNamespace = "urn://oracle.bi.webservices/v12")
        Boolean expandGroups,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param acls
     * @param sessionID
     * @param account
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod(action = "#getPermissions")
    @WebResult(targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getPermissions", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetPermissions")
    @ResponseWrapper(localName = "getPermissionsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetPermissionsResult")
    public List<Integer> getPermissions(
        @WebParam(name = "acls", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<ACL> acls,
        @WebParam(name = "account", targetNamespace = "urn://oracle.bi.webservices/v12")
        Account account,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param owner
     * @param creator
     * @param acls
     * @param sessionID
     * @param account
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod(action = "#getPermissionsEx")
    @WebResult(targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getPermissionsEx", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetPermissionsEx")
    @ResponseWrapper(localName = "getPermissionsExResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetPermissionsExResult")
    public List<Integer> getPermissionsEx(
        @WebParam(name = "acls", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<ACL> acls,
        @WebParam(name = "account", targetNamespace = "urn://oracle.bi.webservices/v12")
        Account account,
        @WebParam(name = "owner", targetNamespace = "urn://oracle.bi.webservices/v12")
        Account owner,
        @WebParam(name = "creator", targetNamespace = "urn://oracle.bi.webservices/v12")
        Account creator,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param privileges
     * @param sessionID
     * @return
     *     returns java.util.List<java.lang.Boolean>
     */
    @WebMethod(action = "#getPrivilegesStatus")
    @WebResult(targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getPrivilegesStatus", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetPrivilegesStatus")
    @ResponseWrapper(localName = "getPrivilegesStatusResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetPrivilegesStatusResult")
    public List<Boolean> getPrivilegesStatus(
        @WebParam(name = "privileges", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> privileges,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @param account
     * @return
     *     returns java.util.List<oracle.bi.web.soap.Account>
     */
    @WebMethod(action = "#getAccounts")
    @WebResult(name = "accountDetails", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getAccounts", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetAccounts")
    @ResponseWrapper(localName = "getAccountsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetAccountsResult")
    public List<Account> getAccounts(
        @WebParam(name = "account", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<Account> account,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @param account
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "#getAccountTenantID")
    @WebResult(targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getAccountTenantID", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetAccountTenantID")
    @ResponseWrapper(localName = "getAccountTenantIDResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetAccountTenantIDResult")
    public String getAccountTenantID(
        @WebParam(name = "account", targetNamespace = "urn://oracle.bi.webservices/v12")
        Account account,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

}
