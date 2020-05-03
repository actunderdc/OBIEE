
package oracle.bi.web.soap;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a Weight
 * 
 * <p>Java class for Weight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Weight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="childId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="weightPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weight", propOrder = {
    "childId",
    "weightPercentage"
})
public class Weight {

    @XmlElement(required = true)
    protected String childId;
    @XmlElement(required = true)
    protected BigDecimal weightPercentage;

    /**
     * Gets the value of the childId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildId() {
        return childId;
    }

    /**
     * Sets the value of the childId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildId(String value) {
        this.childId = value;
    }

    /**
     * Gets the value of the weightPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightPercentage() {
        return weightPercentage;
    }

    /**
     * Sets the value of the weightPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightPercentage(BigDecimal value) {
        this.weightPercentage = value;
    }

}
