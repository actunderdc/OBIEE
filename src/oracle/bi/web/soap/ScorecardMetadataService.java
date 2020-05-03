
package oracle.bi.web.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ScorecardMetadataService", targetNamespace = "urn://oracle.bi.webservices/v12", wsdlLocation = "http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12")
public class ScorecardMetadataService
    extends Service
{

    private final static URL SCORECARDMETADATASERVICE_WSDL_LOCATION;
    private final static WebServiceException SCORECARDMETADATASERVICE_EXCEPTION;
    private final static QName SCORECARDMETADATASERVICE_QNAME = new QName("urn://oracle.bi.webservices/v12", "ScorecardMetadataService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SCORECARDMETADATASERVICE_WSDL_LOCATION = url;
        SCORECARDMETADATASERVICE_EXCEPTION = e;
    }

    public ScorecardMetadataService() {
        super(__getWsdlLocation(), SCORECARDMETADATASERVICE_QNAME);
    }

    public ScorecardMetadataService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SCORECARDMETADATASERVICE_QNAME, features);
    }

    public ScorecardMetadataService(URL wsdlLocation) {
        super(wsdlLocation, SCORECARDMETADATASERVICE_QNAME);
    }

    public ScorecardMetadataService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SCORECARDMETADATASERVICE_QNAME, features);
    }

    public ScorecardMetadataService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScorecardMetadataService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ScorecardMetadataServiceSoap
     */
    @WebEndpoint(name = "ScorecardMetadataServiceSoap")
    public ScorecardMetadataServiceSoap getScorecardMetadataServiceSoap() {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "ScorecardMetadataServiceSoap"), ScorecardMetadataServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScorecardMetadataServiceSoap
     */
    @WebEndpoint(name = "ScorecardMetadataServiceSoap")
    public ScorecardMetadataServiceSoap getScorecardMetadataServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "ScorecardMetadataServiceSoap"), ScorecardMetadataServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SCORECARDMETADATASERVICE_EXCEPTION!= null) {
            throw SCORECARDMETADATASERVICE_EXCEPTION;
        }
        return SCORECARDMETADATASERVICE_WSDL_LOCATION;
    }

}
