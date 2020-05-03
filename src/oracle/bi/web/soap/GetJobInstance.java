
package oracle.bi.web.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="jobReference" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="jobInstanceReference" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
    "jobReference",
    "jobInstanceReference",
    "sessionID"
})
@XmlRootElement(name = "getJobInstance")
public class GetJobInstance {

    @XmlSchemaType(name = "unsignedInt")
    protected long jobReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger jobInstanceReference;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the jobReference property.
     * 
     */
    public long getJobReference() {
        return jobReference;
    }

    /**
     * Sets the value of the jobReference property.
     * 
     */
    public void setJobReference(long value) {
        this.jobReference = value;
    }

    /**
     * Gets the value of the jobInstanceReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getJobInstanceReference() {
        return jobInstanceReference;
    }

    /**
     * Sets the value of the jobInstanceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setJobInstanceReference(BigInteger value) {
        this.jobInstanceReference = value;
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
