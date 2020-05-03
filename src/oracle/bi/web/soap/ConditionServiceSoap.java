
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
@WebService(name = "ConditionServiceSoap", targetNamespace = "urn://oracle.bi.webservices/v12")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConditionServiceSoap {


    /**
     * 
     * @param path
     * @param reportCustomizationParameters
     * @param sessionID
     * @return
     *     returns boolean
     */
    @WebMethod(action = "#evaluateCondition")
    @WebResult(name = "conditionIsTrue", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "evaluateCondition", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.EvaluateCondition")
    @ResponseWrapper(localName = "evaluateConditionResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.EvaluateConditionResult")
    public boolean evaluateCondition(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "reportCustomizationParameters", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> reportCustomizationParameters,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param reportCustomizationParameters
     * @param sessionID
     * @param conditionXML
     * @return
     *     returns boolean
     */
    @WebMethod(action = "#evaluateInlineCondition")
    @WebResult(name = "conditionIsTrue", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "evaluateInlineCondition", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.EvaluateInlineCondition")
    @ResponseWrapper(localName = "evaluateInlineConditionResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.EvaluateInlineConditionResult")
    public boolean evaluateInlineCondition(
        @WebParam(name = "conditionXML", targetNamespace = "urn://oracle.bi.webservices/v12")
        String conditionXML,
        @WebParam(name = "reportCustomizationParameters", targetNamespace = "urn://oracle.bi.webservices/v12")
        List<String> reportCustomizationParameters,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

    /**
     * 
     * @param path
     * @param sessionID
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(action = "#getConditionCustomizableReportElements")
    @WebResult(name = "customizableElement", targetNamespace = "urn://oracle.bi.webservices/v12")
    @RequestWrapper(localName = "getConditionCustomizableReportElements", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetConditionCustomizableReportElements")
    @ResponseWrapper(localName = "getConditionCustomizableReportElementsResult", targetNamespace = "urn://oracle.bi.webservices/v12", className = "oracle.bi.web.soap.GetConditionCustomizableReportElementsResult")
    public List<String> getConditionCustomizableReportElements(
        @WebParam(name = "path", targetNamespace = "urn://oracle.bi.webservices/v12")
        String path,
        @WebParam(name = "sessionID", targetNamespace = "urn://oracle.bi.webservices/v12")
        String sessionID);

}
