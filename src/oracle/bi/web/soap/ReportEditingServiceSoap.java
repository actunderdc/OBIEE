
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
@WebService(name = "ReportEditingServiceSoap", targetNamespace = "urn://oracle.bi.webservices/v12")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReportEditingServiceSoap {


    /**
     * 
     * @param reportParams
     * @param encodeInString
     * @param sessionID
     * @param reportRef
     * @return
     *     returns java.lang.Object
     */
    @WebMethod(action = "#applyReportParams")
    @WebResult(targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "applyReportParams", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ApplyReportParams")
    @ResponseWrapper(localName = "applyReportParamsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ApplyReportParamsResult")
    public Object applyReportParams(
        @WebParam(name = "reportRef", targetNamespace = "urn://oracle.bi.webservices/v12")
        ReportRef reportRef,
        @WebParam(name = "reportParams", targetNamespace = "urn://oracle.bi.webservices/v12")
        ReportParams reportParams,
        @WebParam(name = "encodeInString", targetNamespace = "urn://oracle.bi.webservices/v12")
        boolean encodeInString,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param reportParams
     * @param sessionID
     * @param reportRef
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "#generateReportSQL")
    @WebResult(targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "generateReportSQL", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GenerateReportSQL")
    @ResponseWrapper(localName = "generateReportSQLResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GenerateReportSQLResult")
    public String generateReportSQL(
        @WebParam(name = "reportRef", targetNamespace = "urn://oracle.bi.webservices/v12")
        ReportRef reportRef,
        @WebParam(name = "reportParams", targetNamespace = "urn://oracle.bi.webservices/v12")
        ReportParams reportParams,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param reportRefs
     * @param sessionID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "#applyReportDefaults")
    @WebResult(name = "reportXml", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "applyReportDefaults", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ApplyReportDefaults")
    @ResponseWrapper(localName = "applyReportDefaultsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.ApplyReportDefaultsResult")
    public String applyReportDefaults(
        @WebParam(name = "reportRefs", targetNamespace = "urn://oracle.bi.webservices/v12")
        ReportRef reportRefs,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param sessionID
     * @return
     *     returns oracle.bi.web.soap.ReportADFParameters
     */
    @WebMethod(action = "#getReportElements")
    @WebResult(name = "parameterADF", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getReportElements", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetReportElements")
    @ResponseWrapper(localName = "getReportElementsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetReportElementsResult")
    public ReportADFParameters getReportElements(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param viewID
     * @param promptRef
     * @param portalPath
     * @param viewState
     * @param optionalParams
     * @param page
     * @param sessionID
     * @return
     *     returns oracle.bi.web.soap.PromptsObjectModel
     */
    @WebMethod(action = "#getPromptElements")
    @WebResult(name = "promptsObj", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getPromptElements", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetPromptElements")
    @ResponseWrapper(localName = "getPromptElementsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetPromptElementsResult")
    public PromptsObjectModel getPromptElements(
        @WebParam(name = "promptRef", targetNamespace = "urn://oracle.bi.webservices/v12")
        ReportRef promptRef,
        @WebParam(name = "viewState", targetNamespace = "urn://oracle.bi.webservices/v12")
        String viewState,
        @WebParam(name = "viewID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String viewID,
        @WebParam(name = "portalPath", targetNamespace = "urn://oracle.bi.webservices/v12")
        String portalPath,
        @WebParam(name = "page", targetNamespace = "urn://oracle.bi.webservices/v12")
        String page,
        @WebParam(name = "optionalParams", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<NameValuePair> optionalParams,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param sessionID
     * @param reportRef
     * @return
     *     returns java.util.List<oracle.bi.web.soap.ReportColumn>
     */
    @WebMethod(action = "#getReportColumns")
    @WebResult(name = "columns", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getReportColumns", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetReportColumns")
    @ResponseWrapper(localName = "getReportColumnsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetReportColumnsResult")
    public List<ReportColumn> getReportColumns(
        @WebParam(name = "reportRef", targetNamespace = "urn://oracle.bi.webservices/v12")
        ReportRef reportRef,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

}
