
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPIRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kpiPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kpiPinning" type="{urn://oracle.bi.webservices/v12}KPIPinning"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPIRequest", propOrder = {
    "kpiPath",
    "kpiPinning"
})
public class KPIRequest {

    @XmlElement(required = true)
    protected String kpiPath;
    @XmlElement(required = true)
    protected KPIPinning kpiPinning;

    /**
     * Gets the value of the kpiPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiPath() {
        return kpiPath;
    }

    /**
     * Sets the value of the kpiPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiPath(String value) {
        this.kpiPath = value;
    }

    /**
     * Gets the value of the kpiPinning property.
     * 
     * @return
     *     possible object is
     *     {@link KPIPinning }
     *     
     */
    public KPIPinning getKpiPinning() {
        return kpiPinning;
    }

    /**
     * Sets the value of the kpiPinning property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPIPinning }
     *     
     */
    public void setKpiPinning(KPIPinning value) {
        this.kpiPinning = value;
    }

}
