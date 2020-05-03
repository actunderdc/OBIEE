
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInstanceConfigParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInstanceConfigParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceInstanceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceInstanceCatalogSizeLimitMB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="personalStorageLimitMB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInstanceConfigParams", propOrder = {
    "serviceInstanceID",
    "serviceInstanceCatalogSizeLimitMB",
    "personalStorageLimitMB"
})
public class ServiceInstanceConfigParams {

    @XmlElement(required = true)
    protected String serviceInstanceID;
    protected Integer serviceInstanceCatalogSizeLimitMB;
    protected Integer personalStorageLimitMB;

    /**
     * Gets the value of the serviceInstanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInstanceID() {
        return serviceInstanceID;
    }

    /**
     * Sets the value of the serviceInstanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInstanceID(String value) {
        this.serviceInstanceID = value;
    }

    /**
     * Gets the value of the serviceInstanceCatalogSizeLimitMB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceInstanceCatalogSizeLimitMB() {
        return serviceInstanceCatalogSizeLimitMB;
    }

    /**
     * Sets the value of the serviceInstanceCatalogSizeLimitMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceInstanceCatalogSizeLimitMB(Integer value) {
        this.serviceInstanceCatalogSizeLimitMB = value;
    }

    /**
     * Gets the value of the personalStorageLimitMB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonalStorageLimitMB() {
        return personalStorageLimitMB;
    }

    /**
     * Sets the value of the personalStorageLimitMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonalStorageLimitMB(Integer value) {
        this.personalStorageLimitMB = value;
    }

}
