
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="subjectAreaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="includeXSAs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "subjectAreaName",
    "includeXSAs",
    "sessionID"
})
@XmlRootElement(name = "getRelatedSubjectAreas")
public class GetRelatedSubjectAreas {

    @XmlElement(required = true)
    protected String subjectAreaName;
    @XmlElement(defaultValue = "false")
    protected boolean includeXSAs;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the subjectAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectAreaName() {
        return subjectAreaName;
    }

    /**
     * Sets the value of the subjectAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectAreaName(String value) {
        this.subjectAreaName = value;
    }

    /**
     * Gets the value of the includeXSAs property.
     * 
     */
    public boolean isIncludeXSAs() {
        return includeXSAs;
    }

    /**
     * Sets the value of the includeXSAs property.
     * 
     */
    public void setIncludeXSAs(boolean value) {
        this.includeXSAs = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

}
