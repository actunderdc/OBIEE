
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
@WebServiceClient(name = "HtmlViewService", targetNamespace = "urn://oracle.bi.webservices/v12", wsdlLocation = "http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12")
public class HtmlViewService
    extends Service
{

    private final static URL HTMLVIEWSERVICE_WSDL_LOCATION;
    private final static WebServiceException HTMLVIEWSERVICE_EXCEPTION;
    private final static QName HTMLVIEWSERVICE_QNAME = new QName("urn://oracle.bi.webservices/v12", "HtmlViewService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://127.0.0.1:7780/analytics/saw.dll/wsdl/v12");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HTMLVIEWSERVICE_WSDL_LOCATION = url;
        HTMLVIEWSERVICE_EXCEPTION = e;
    }

    public HtmlViewService() {
        super(__getWsdlLocation(), HTMLVIEWSERVICE_QNAME);
    }

    public HtmlViewService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HTMLVIEWSERVICE_QNAME, features);
    }

    public HtmlViewService(URL wsdlLocation) {
        super(wsdlLocation, HTMLVIEWSERVICE_QNAME);
    }

    public HtmlViewService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HTMLVIEWSERVICE_QNAME, features);
    }

    public HtmlViewService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HtmlViewService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HtmlViewServiceSoap
     */
    @WebEndpoint(name = "HtmlViewService")
    public HtmlViewServiceSoap getHtmlViewService() {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "HtmlViewService"), HtmlViewServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HtmlViewServiceSoap
     */
    @WebEndpoint(name = "HtmlViewService")
    public HtmlViewServiceSoap getHtmlViewService(WebServiceFeature... features) {
        return super.getPort(new QName("urn://oracle.bi.webservices/v12", "HtmlViewService"), HtmlViewServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HTMLVIEWSERVICE_EXCEPTION!= null) {
            throw HTMLVIEWSERVICE_EXCEPTION;
        }
        return HTMLVIEWSERVICE_WSDL_LOCATION;
    }

}
