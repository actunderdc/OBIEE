
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="permissions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timestamps" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="useMtom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="skipPath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
    "path",
    "recursive",
    "permissions",
    "timestamps",
    "useMtom",
    "skipPath",
    "sessionID"
})
@XmlRootElement(name = "copyItem2")
public class CopyItem2 {

    @XmlElement(required = true)
    protected List<String> path;
    protected boolean recursive;
    protected boolean permissions;
    protected boolean timestamps;
    @XmlElement(defaultValue = "false")
    protected boolean useMtom;
    protected List<String> skipPath;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the path property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the path property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPath() {
        if (path == null) {
            path = new ArrayList<String>();
        }
        return this.path;
    }

    /**
     * Gets the value of the recursive property.
     * 
     */
    public boolean isRecursive() {
        return recursive;
    }

    /**
     * Sets the value of the recursive property.
     * 
     */
    public void setRecursive(boolean value) {
        this.recursive = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     */
    public boolean isPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     */
    public void setPermissions(boolean value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the timestamps property.
     * 
     */
    public boolean isTimestamps() {
        return timestamps;
    }

    /**
     * Sets the value of the timestamps property.
     * 
     */
    public void setTimestamps(boolean value) {
        this.timestamps = value;
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
     * Gets the value of the skipPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skipPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkipPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSkipPath() {
        if (skipPath == null) {
            skipPath = new ArrayList<String>();
        }
        return this.skipPath;
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
