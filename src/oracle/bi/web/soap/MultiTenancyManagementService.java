
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
@WebServiceClient(name = "MultiTenancyManagementService", targetNamespace = "urn://oracle.bi.webservices/v12", wsdlLocation = "http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12")
public class MultiTenancyManagementService
    extends Service
{

    private final static URL MULTITENANCYMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static WebServiceException MULTITENANCYMANAGEMENTSERVICE_EXCEPTION;
    private final static QName MULTITENANCYMANAGEMENTSERVICE_QNAME = new QName("urn://oracle.bi.webservices/v12", "MultiTenancyManagementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MULTITENANCYMANAGEMENTSERVICE_WSDL_LOCATION = url;
        MULTITENANCYMANAGEMENTSERVICE_EXCEPTION = e;
    }

    public MultiTenancyManagementService() {
        super(__getWsdlLocation(), MULTITENANCYMANAGEMENTSERVICE_QNAME);
    }

    public MultiTenancyManagementService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MULTITENANCYMANAGEMENTSERVICE_QNAME, features);
    }

    public MultiTenancyManagementService(URL wsdlLocation) {
        super(wsdlLocation, MULTITENANCYMANAGEMENTSERVICE_QNAME);
    }

    public MultiTenancyManagementService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MULTITENANCYMANAGEMENTSERVICE_QNAME, features);
    }

    public MultiTenancyManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MultiTenancyManagementService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MultiTenancyManagementServiceSoap
     */
    @WebEndpoint(name = "MultiTenancyManagementServiceSoap")
    public MultiTenancyManagementServiceSoap getMultiTenancyManagementServiceSoap() {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "MultiTenancyManagementServiceSoap"), MultiTenancyManagementServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MultiTenancyManagementServiceSoap
     */
    @WebEndpoint(name = "MultiTenancyManagementServiceSoap")
    public MultiTenancyManagementServiceSoap getMultiTenancyManagementServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "MultiTenancyManagementServiceSoap"), MultiTenancyManagementServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MULTITENANCYMANAGEMENTSERVICE_EXCEPTION!= null) {
            throw MULTITENANCYMANAGEMENTSERVICE_EXCEPTION;
        }
        return MULTITENANCYMANAGEMENTSERVICE_WSDL_LOCATION;
    }

}