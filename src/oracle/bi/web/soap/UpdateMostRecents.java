
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
 *         &lt;element name="catalogObjectPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionType" type="{urn://oracle.bi.webservices/v12}ActionType"/>
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
    "catalogObjectPath",
    "actionType",
    "sessionID"
})
@XmlRootElement(name = "updateMostRecents")
public class UpdateMostRecents {

    @XmlElement(required = true)
    protected String catalogObjectPath;
    protected int actionType;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the catalogObjectPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogObjectPath() {
        return catalogObjectPath;
    }

    /**
     * Sets the value of the catalogObjectPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogObjectPath(String value) {
        this.catalogObjectPath = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     */
    public int getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     */
    public void setActionType(int value) {
        this.actionType = value;
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
