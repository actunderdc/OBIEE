
package oracle.bi.web.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IBotServiceSoap", targetNamespace = "urn://oracle.bi.webservices/v12")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IBotServiceSoap {


    /**
     * 
     * @param path
     * @param sessionID
     */
    @WebMethod(action = "#executeIBotNow")
    @RequestWrapper(localName = "executeIBotNow", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ExecuteIBotNow")
    @ResponseWrapper(localName = "executeIBotNowResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ExecuteIBotNowResult")
    public void executeIBotNow(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param enable
     * @param sessionID
     * @return
     *     returns int
     */
    @WebMethod(action = "#enableIBot")
    @WebResult(name = "jobID", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "enableIBot", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.EnableIBot")
    @ResponseWrapper(localName = "enableIBotResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.EnableIBotResult")
    public int enableIBot(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "enable", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean enable,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param subscribed
     * @param lastRun
     * @param specificRecipient
     * @param lastRunStatus
     * @param agentEnabled
     * @param sessionID
     * @param priority
     * @param nextRun
     */
    @WebMethod(action = "#getIBotStatus")
    @RequestWrapper(localName = "getIBotStatus", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetIBotStatus")
    @ResponseWrapper(localName = "getIBotStatusResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetIBotStatusResult")
    public void getIBotStatus(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID,
        @WebParam(name = "lastRun", targetNamespace = "urn://oracle.bi.webservices/v12", mode = WebParam.Mode.OUT)
        Holder<String> lastRun,
        @WebParam(name = "nextRun", targetNamespace = "urn://oracle.bi.webservices/v12", mode = WebParam.Mode.OUT)
        Holder<String> nextRun,
        @WebParam(name = "lastRunStatus", targetNamespace = "urn://oracle.bi.webservices/v12", mode = WebParam.Mode.OUT)
        Holder<String> lastRunStatus,
        @WebParam(name = "priority", targetNamespace = "urn://oracle.bi.webservices/v12", mode = WebParam.Mode.OUT)
        Holder<String> priority,
        @WebParam(name = "agentEnabled", targetNamespace = "urn://oracle.bi.webservices/v12", mode = WebParam.Mode.OUT)
        Holder<Boolean> agentEnabled,
        @WebParam(name = "subscribed", targetNamespace = "urn://oracle.bi.webservices/v12", mode = WebParam.Mode.OUT)
        Holder<Boolean> subscribed,
        @WebParam(name = "specificRecipient", targetNamespace = "urn://oracle.bi.webservices/v12", mode = WebParam.Mode.OUT)
        Holder<Boolean> specificRecipient);

    /**
     * 
     * @param path
     * @param resolveLinks
     * @param obj
     * @param allowOverwrite
     * @param sessionID
     * @return
     *     returns int
     */
    @WebMethod(action = "#writeIBot")
    @WebResult(name = "jobID", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "writeIBot", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.WriteIBot")
    @ResponseWrapper(localName = "writeIBotResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.WriteIBotResult")
    public int writeIBot(
        @WebParam(name = "obj", targetNamespace = "urn://oracle.bi.webservices/v12")
        CatalogObject obj,
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "resolveLinks", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean resolveLinks,
        @WebParam(name = "allowOverwrite", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean allowOverwrite,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param fromPath
     * @param toPath
     * @param resolveLinks
     * @param allowOverwrite
     * @param sessionID
     */
    @WebMethod(action = "#moveIBot")
    @RequestWrapper(localName = "moveIBot", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.MoveIBot")
    @ResponseWrapper(localName = "moveIBotResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.MoveIBotResult")
    public void moveIBot(
        @WebParam(name = "fromPath", targetNamespace = "urn://oracle.bi.webservices/v12")
        String fromPath,
        @WebParam(name = "toPath", targetNamespace = "urn://oracle.bi.webservices/v12")
        String toPath,
        @WebParam(name = "resolveLinks", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean resolveLinks,
        @WebParam(name = "allowOverwrite", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean allowOverwrite,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param customizationXml
     * @param sessionID
     */
    @WebMethod(action = "#subscribe")
    @RequestWrapper(localName = "subscribe", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.Subscribe")
    @ResponseWrapper(localName = "subscribeResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.SubscribeResult")
    public void subscribe(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "customizationXml", targetNamespace = "urn://oracle.bi.webservices/v12")
        String customizationXml,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param sessionID
     */
    @WebMethod(action = "#unsubscribe")
    @RequestWrapper(localName = "unsubscribe", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.Unsubscribe")
    @ResponseWrapper(localName = "unsubscribeResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.UnsubscribeResult")
    public void unsubscribe(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param sessionID
     */
    @WebMethod(action = "#deleteIBot")
    @RequestWrapper(localName = "deleteIBot", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.DeleteIBot")
    @ResponseWrapper(localName = "deleteIBotResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.DeleteIBotResult")
    public void deleteIBot(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param subject
     * @param recipient
     * @param sessionID
     * @param body
     * @param priority
     * @param group
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "#sendMessage")
    @WebResult(name = "status", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "sendMessage", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.SendMessage")
    @ResponseWrapper(localName = "sendMessageResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.SendMessageResult")
    public String sendMessage(
        @WebParam(name = "recipient", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> recipient,
        @WebParam(name = "group", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> group,
        @WebParam(name = "subject", targetNamespace = "urn://oracle.bi.webservices/v12")
        String subject,
        @WebParam(name = "body", targetNamespace = "urn://oracle.bi.webservices/v12")
        String body,
        @WebParam(name = "priority", targetNamespace = "urn://oracle.bi.webservices/v12")
        String priority,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

}
