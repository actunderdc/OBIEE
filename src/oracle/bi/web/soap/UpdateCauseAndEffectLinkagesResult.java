
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
 *         &lt;element name="causeEffectLinkages" type="{urn://oracle.bi.webservices/v12}CauseAndEffectLinkages"/>
 *         &lt;element name="failedUpdates" type="{urn://oracle.bi.webservices/v12}CauseAndEffectLinkagesUpdateFailures" minOccurs="0"/>
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
    "causeEffectLinkages",
    "failedUpdates"
})
@XmlRootElement(name = "updateCauseAndEffectLinkagesResult")
public class UpdateCauseAndEffectLinkagesResult {

    @XmlElement(required = true)
    protected CauseAndEffectLinkages causeEffectLinkages;
    protected CauseAndEffectLinkagesUpdateFailures failedUpdates;

    /**
     * Gets the value of the causeEffectLinkages property.
     * 
     * @return
     *     possible object is
     *     {@link CauseAndEffectLinkages }
     *     
     */
    public CauseAndEffectLinkages getCauseEffectLinkages() {
        return causeEffectLinkages;
    }

    /**
     * Sets the value of the causeEffectLinkages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseAndEffectLinkages }
     *     
     */
    public void setCauseEffectLinkages(CauseAndEffectLinkages value) {
        this.causeEffectLinkages = value;
    }

    /**
     * Gets the value of the failedUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link CauseAndEffectLinkagesUpdateFailures }
     *     
     */
    public CauseAndEffectLinkagesUpdateFailures getFailedUpdates() {
        return failedUpdates;
    }

    /**
     * Sets the value of the failedUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseAndEffectLinkagesUpdateFailures }
     *     
     */
    public void setFailedUpdates(CauseAndEffectLinkagesUpdateFailures value) {
        this.failedUpdates = value;
    }

}
