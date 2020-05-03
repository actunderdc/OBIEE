
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="type" type="{urn://oracle.bi.webservices/v12}ScorecardViewType"/>
 *         &lt;element name="scorecardViewPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scorecardViewXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "type",
    "scorecardViewPath",
    "scorecardViewXML",
    "sessionID"
})
@XmlRootElement(name = "getScorecardViewDimensions")
public class GetScorecardViewDimensions {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ScorecardViewType type;
    @XmlElement(required = true, nillable = true)
    protected String scorecardViewPath;
    @XmlElement(required = true, nillable = true)
    protected String scorecardViewXML;
    @XmlElementRef(name = "sessionID", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionID;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardViewType }
     *     
     */
    public ScorecardViewType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardViewType }
     *     
     */
    public void setType(ScorecardViewType value) {
        this.type = value;
    }

    /**
     * Gets the value of the scorecardViewPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecardViewPath() {
        return scorecardViewPath;
    }

    /**
     * Sets the value of the scorecardViewPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecardViewPath(String value) {
        this.scorecardViewPath = value;
    }

    /**
     * Gets the value of the scorecardViewXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecardViewXML() {
        return scorecardViewXML;
    }

    /**
     * Sets the value of the scorecardViewXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecardViewXML(String value) {
        this.scorecardViewXML = value;
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
