
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kpiWatchlistPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kpiWatchlistXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kpiWatchlistPath",
    "kpiWatchlistXML",
    "sessionID"
})
@XmlRootElement(name = "getKPIWatchlistDimensions")
public class GetKPIWatchlistDimensions {

    @XmlElement(required = true, nillable = true)
    protected String kpiWatchlistPath;
    @XmlElement(required = true, nillable = true)
    protected String kpiWatchlistXML;
    @XmlElementRef(name = "sessionID", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionID;

    /**
     * Gets the value of the kpiWatchlistPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiWatchlistPath() {
        return kpiWatchlistPath;
    }

    /**
     * Sets the value of the kpiWatchlistPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiWatchlistPath(String value) {
        this.kpiWatchlistPath = value;
    }

    /**
     * Gets the value of the kpiWatchlistXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiWatchlistXML() {
        return kpiWatchlistXML;
    }

    /**
     * Sets the value of the kpiWatchlistXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiWatchlistXML(String value) {
        this.kpiWatchlistXML = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionID(JAXBElement<String> value) {
        this.sessionID = value;
    }

}
