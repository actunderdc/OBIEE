
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition that contains a Linked Node
 * 
 * <p>Java class for LinkedStrategyNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedStrategyNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scorecardPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkedNodeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedStrategyNode", propOrder = {
    "caption",
    "scorecardPath",
    "linkedNodeID"
})
public class LinkedStrategyNode {

    @XmlElement(required = true)
    protected String caption;
    @XmlElement(required = true)
    protected String scorecardPath;
    @XmlElement(required = true)
    protected String linkedNodeID;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the scorecardPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecardPath() {
        return scorecardPath;
    }

    /**
     * Sets the value of the scorecardPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecardPath(String value) {
        this.scorecardPath = value;
    }

    /**
     * Gets the value of the linkedNodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedNodeID() {
        return linkedNodeID;
    }

    /**
     * Sets the value of the linkedNodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedNodeID(String value) {
        this.linkedNodeID = value;
    }

}
