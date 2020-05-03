
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPICancelationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPICancelationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kpiExecutionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="canceled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPICancelationStatus", propOrder = {
    "kpiExecutionID",
    "canceled"
})
public class KPICancelationStatus {

    @XmlElement(required = true)
    protected String kpiExecutionID;
    protected boolean canceled;

    /**
     * Gets the value of the kpiExecutionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiExecutionID() {
        return kpiExecutionID;
    }

    /**
     * Sets the value of the kpiExecutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiExecutionID(String value) {
        this.kpiExecutionID = value;
    }

    /**
     * Gets the value of the canceled property.
     * 
     */
    public boolean isCanceled() {
        return canceled;
    }

    /**
     * Sets the value of the canceled property.
     * 
     */
    public void setCanceled(boolean value) {
        this.canceled = value;
    }

}
