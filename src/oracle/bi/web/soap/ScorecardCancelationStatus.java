
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardCancelationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScorecardCancelationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scorecardExecutionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ScorecardCancelationStatus", propOrder = {
    "scorecardExecutionID",
    "canceled"
})
public class ScorecardCancelationStatus {

    @XmlElement(required = true)
    protected String scorecardExecutionID;
    protected boolean canceled;

    /**
     * Gets the value of the scorecardExecutionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecardExecutionID() {
        return scorecardExecutionID;
    }

    /**
     * Sets the value of the scorecardExecutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecardExecutionID(String value) {
        this.scorecardExecutionID = value;
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
