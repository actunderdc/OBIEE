
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="scorecardID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strategyNode" type="{urn://oracle.bi.webservices/v12}StrategyNode" minOccurs="0"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "scorecardID",
    "strategyNode",
    "sessionID"
})
@XmlRootElement(name = "updateStrategyNode")
public class UpdateStrategyNode {

    @XmlElement(required = true)
    protected String scorecardID;
    protected StrategyNode strategyNode;
    @XmlElementRef(name = "sessionID", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionID;

    /**
     * Gets the value of the scorecardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecardID() {
        return scorecardID;
    }

    /**
     * Sets the value of the scorecardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecardID(String value) {
        this.scorecardID = value;
    }

    /**
     * Gets the value of the strategyNode property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyNode }
     *     
     */
    public StrategyNode getStrategyNode() {
        return strategyNode;
    }

    /**
     * Sets the value of the strategyNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyNode }
     *     
     */
    public void setStrategyNode(StrategyNode value) {
        this.strategyNode = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionID(JAXBElement<String> value) {
        this.sessionID = value;
    }

}
