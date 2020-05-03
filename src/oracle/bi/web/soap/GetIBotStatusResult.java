
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
 *         &lt;element name="lastRun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nextRun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastRunStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agentEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subscribed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="specificRecipient" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "lastRun",
    "nextRun",
    "lastRunStatus",
    "priority",
    "agentEnabled",
    "subscribed",
    "specificRecipient"
})
@XmlRootElement(name = "getIBotStatusResult")
public class GetIBotStatusResult {

    @XmlElement(required = true)
    protected String lastRun;
    @XmlElement(required = true)
    protected String nextRun;
    @XmlElement(required = true)
    protected String lastRunStatus;
    @XmlElement(required = true)
    protected String priority;
    protected boolean agentEnabled;
    protected boolean subscribed;
    protected boolean specificRecipient;

    /**
     * Gets the value of the lastRun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRun() {
        return lastRun;
    }

    /**
     * Sets the value of the lastRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRun(String value) {
        this.lastRun = value;
    }

    /**
     * Gets the value of the nextRun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextRun() {
        return nextRun;
    }

    /**
     * Sets the value of the nextRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextRun(String value) {
        this.nextRun = value;
    }

    /**
     * Gets the value of the lastRunStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRunStatus() {
        return lastRunStatus;
    }

    /**
     * Sets the value of the lastRunStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRunStatus(String value) {
        this.lastRunStatus = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the agentEnabled property.
     * 
     */
    public boolean isAgentEnabled() {
        return agentEnabled;
    }

    /**
     * Sets the value of the agentEnabled property.
     * 
     */
    public void setAgentEnabled(boolean value) {
        this.agentEnabled = value;
    }

    /**
     * Gets the value of the subscribed property.
     * 
     */
    public boolean isSubscribed() {
        return subscribed;
    }

    /**
     * Sets the value of the subscribed property.
     * 
     */
    public void setSubscribed(boolean value) {
        this.subscribed = value;
    }

    /**
     * Gets the value of the specificRecipient property.
     * 
     */
    public boolean isSpecificRecipient() {
        return specificRecipient;
    }

    /**
     * Sets the value of the specificRecipient property.
     * 
     */
    public void setSpecificRecipient(boolean value) {
        this.specificRecipient = value;
    }

}
