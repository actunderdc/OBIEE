
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
@WebServiceClient(name = "WebCatalogService", targetNamespace = "urn://oracle.bi.webservices/v12", wsdlLocation = "http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12")
public class WebCatalogService
    extends Service
{

    private final static URL WEBCATALOGSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBCATALOGSERVICE_EXCEPTION;
    private final static QName WEBCATALOGSERVICE_QNAME = new QName("urn://oracle.bi.webservices/v12", "WebCatalogService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBCATALOGSERVICE_WSDL_LOCATION = url;
        WEBCATALOGSERVICE_EXCEPTION = e;
    }

    public WebCatalogService() {
        super(__getWsdlLocation(), WEBCATALOGSERVICE_QNAME);
    }

    public WebCatalogService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBCATALOGSERVICE_QNAME, features);
    }

    public WebCatalogService(URL wsdlLocation) {
        super(wsdlLocation, WEBCATALOGSERVICE_QNAME);
    }

    public WebCatalogService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBCATALOGSERVICE_QNAME, features);
    }

    public WebCatalogService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebCatalogService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebCatalogServiceSoap
     */
    @WebEndpoint(name = "WebCatalogServiceSoap")
    public WebCatalogServiceSoap getWebCatalogServiceSoap() {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "WebCatalogServiceSoap"), WebCatalogServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebCatalogServiceSoap
     */
    @WebEndpoint(name = "WebCatalogServiceSoap")
    public WebCatalogServiceSoap getWebCatalogServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "WebCatalogServiceSoap"), WebCatalogServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBCATALOGSERVICE_EXCEPTION!= null) {
            throw WEBCATALOGSERVICE_EXCEPTION;
        }
        return WEBCATALOGSERVICE_WSDL_LOCATION;
    }

}
