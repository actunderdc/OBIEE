
package oracle.bi.web.soap;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
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
 *         &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="restoreOptions" type="{urn://oracle.bi.webservices/v12}RestoreOptions"/>
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
    "archive",
    "restoreOptions",
    "sessionID"
})
@XmlRootElement(name = "restoreTenantEx")
public class RestoreTenantEx {

    @XmlElement(required = true)
    @XmlMimeType("application/obipsarchive")
    protected DataHandler archive;
    @XmlElement(required = true)
    protected RestoreOptions restoreOptions;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the archive property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setArchive(DataHandler value) {
        this.archive = value;
    }

    /**
     * Gets the value of the restoreOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RestoreOptions }
     *     
     */
    public RestoreOptions getRestoreOptions() {
        return restoreOptions;
    }

    /**
     * Sets the value of the restoreOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestoreOptions }
     *     
     */
    public void setRestoreOptions(RestoreOptions value) {
        this.restoreOptions = value;
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
