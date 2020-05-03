
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition that contains a strategy Node
 * 
 * <p>Java class for BalanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="financial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="internalFacing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="leading" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceInfo", propOrder = {
    "financial",
    "internalFacing",
    "leading"
})
public class BalanceInfo {

    @XmlElement(required = true)
    protected String financial;
    @XmlElement(required = true)
    protected String internalFacing;
    @XmlElement(required = true)
    protected String leading;

    /**
     * Gets the value of the financial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancial() {
        return financial;
    }

    /**
     * Sets the value of the financial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancial(String value) {
        this.financial = value;
    }

    /**
     * Gets the value of the internalFacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalFacing() {
        return internalFacing;
    }

    /**
     * Sets the value of the internalFacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalFacing(String value) {
        this.internalFacing = value;
    }

    /**
     * Gets the value of the leading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeading() {
        return leading;
    }

    /**
     * Sets the value of the leading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeading(String value) {
        this.leading = value;
    }

}
