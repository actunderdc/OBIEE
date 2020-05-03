
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TenantArchiveDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenantArchiveDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srcTenantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="anonymizedId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenantArchiveDetails", propOrder = {
    "srcTenantId",
    "anonymizedId"
})
public class TenantArchiveDetails {

    @XmlElement(required = true)
    protected String srcTenantId;
    @XmlElement(required = true, nillable = true)
    protected String anonymizedId;

    /**
     * Gets the value of the srcTenantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcTenantId() {
        return srcTenantId;
    }

    /**
     * Sets the value of the srcTenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcTenantId(String value) {
        this.srcTenantId = value;
    }

    /**
     * Gets the value of the anonymizedId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymizedId() {
        return anonymizedId;
    }

    /**
     * Sets the value of the anonymizedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymizedId(String value) {
        this.anonymizedId = value;
    }

}
