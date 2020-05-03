
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardCloseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScorecardCloseStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scorecardExecutionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardCloseStatus", propOrder = {
    "scorecardExecutionID",
    "closed"
})
public class ScorecardCloseStatus {

    @XmlElement(required = true)
    protected String scorecardExecutionID;
    protected boolean closed;

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
     * Gets the value of the closed property.
     * 
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     */
    public void setClosed(boolean value) {
        this.closed = value;
    }

}
