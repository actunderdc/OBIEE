
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
 *         &lt;element name="scorecardID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="removeLinkedObject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "scorecardID",
    "nodeID",
    "removeLinkedObject",
    "recursive",
    "sessionID"
})
@XmlRootElement(name = "deleteInitiativeNode")
public class DeleteInitiativeNode {

    @XmlElement(required = true)
    protected String scorecardID;
    @XmlElement(required = true)
    protected String nodeID;
    protected boolean removeLinkedObject;
    protected boolean recursive;
    @XmlElementRef(name = "sessionID", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionID;

    /**
     * Gets the value of the scorecardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecardID() {
        return scorecardID;
    }

    /**
     * Sets the value of the scorecardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecardID(String value) {
        this.scorecardID = value;
    }

    /**
     * Gets the value of the nodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the removeLinkedObject property.
     * 
     */
    public boolean isRemoveLinkedObject() {
        return removeLinkedObject;
    }

    /**
     * Sets the value of the removeLinkedObject property.
     * 
     */
    public void setRemoveLinkedObject(boolean value) {
        this.removeLinkedObject = value;
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
