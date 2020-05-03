
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
@WebServiceClient(name = "AdministrationService", targetNamespace = "urn://oracle.bi.webservices/v12", wsdlLocation = "http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12")
public class AdministrationService
    extends Service
{

    private final static URL ADMINISTRATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADMINISTRATIONSERVICE_EXCEPTION;
    private final static QName ADMINISTRATIONSERVICE_QNAME = new QName("urn://oracle.bi.webservices/v12", "AdministrationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADMINISTRATIONSERVICE_WSDL_LOCATION = url;
        ADMINISTRATIONSERVICE_EXCEPTION = e;
    }

    public AdministrationService() {
        super(__getWsdlLocation(), ADMINISTRATIONSERVICE_QNAME);
    }

    public AdministrationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADMINISTRATIONSERVICE_QNAME, features);
    }

    public AdministrationService(URL wsdlLocation) {
        super(wsdlLocation, ADMINISTRATIONSERVICE_QNAME);
    }

    public AdministrationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADMINISTRATIONSERVICE_QNAME, features);
    }

    public AdministrationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdministrationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SAWAdministrationServiceSoap
     */
    @WebEndpoint(name = "SAWAdministrationServiceSoap")
    public SAWAdministrationServiceSoap getSAWAdministrationServiceSoap() {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "SAWAdministrationServiceSoap"), SAWAdministrationServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SAWAdministrationServiceSoap
     */
    @WebEndpoint(name = "SAWAdministrationServiceSoap")
    public SAWAdministrationServiceSoap getSAWAdministrationServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "SAWAdministrationServiceSoap"), SAWAdministrationServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADMINISTRATIONSERVICE_EXCEPTION!= null) {
            throw ADMINISTRATIONSERVICE_EXCEPTION;
        }
        return ADMINISTRATIONSERVICE_WSDL_LOCATION;
    }

}
