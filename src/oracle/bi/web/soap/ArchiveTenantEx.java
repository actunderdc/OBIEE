
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
 *         &lt;element name="archiveOptions" type="{urn://oracle.bi.webservices/v12}ArchiveOptions"/>
 *         &lt;element name="useMtom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "archiveOptions",
    "useMtom",
    "sessionID"
})
@XmlRootElement(name = "archiveTenantEx")
public class ArchiveTenantEx {

    @XmlElement(required = true)
    protected ArchiveOptions archiveOptions;
    @XmlElement(defaultValue = "false")
    protected boolean useMtom;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the archiveOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveOptions }
     *     
     */
    public ArchiveOptions getArchiveOptions() {
        return archiveOptions;
    }

    /**
     * Sets the value of the archiveOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveOptions }
     *     
     */
    public void setArchiveOptions(ArchiveOptions value) {
        this.archiveOptions = value;
    }

    /**
     * Gets the value of the useMtom property.
     * 
     */
    public boolean isUseMtom() {
        return useMtom;
    }

    /**
     * Sets the value of the useMtom property.
     * 
     */
    public void setUseMtom(boolean value) {
        this.useMtom = value;
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
