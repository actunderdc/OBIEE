
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition that contains a strategy Node
 * 
 * <p>Java class for StrategyNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyNode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn://oracle.bi.webservices/v12}StrategyNodeType"/>
 *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perspectiveID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assessmentRule" type="{urn://oracle.bi.webservices/v12}AssessmentRule"/>
 *         &lt;element name="objective" type="{urn://oracle.bi.webservices/v12}Objective" minOccurs="0"/>
 *         &lt;element name="pinnedKPI" type="{urn://oracle.bi.webservices/v12}PinnedKPI" minOccurs="0"/>
 *         &lt;element name="linkedStrategyNode" type="{urn://oracle.bi.webservices/v12}LinkedStrategyNode" minOccurs="0"/>
 *         &lt;element name="itemInfo" type="{urn://oracle.bi.webservices/v12}ItemInfo" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="balanceInfo" type="{urn://oracle.bi.webservices/v12}BalanceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyNode", propOrder = {
    "type",
    "nodeID",
    "parentID",
    "perspectiveID",
    "assessmentRule",
    "objective",
    "pinnedKPI",
    "linkedStrategyNode",
    "itemInfo",
    "permission",
    "balanceInfo"
})
public class StrategyNode {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StrategyNodeType type;
    @XmlElement(required = true)
    protected String nodeID;
    @XmlElement(required = true)
    protected String parentID;
    @XmlElement(required = true)
    protected String perspectiveID;
    @XmlElement(required = true)
    protected AssessmentRule assessmentRule;
    protected Objective objective;
    protected PinnedKPI pinnedKPI;
    protected LinkedStrategyNode linkedStrategyNode;
    @XmlElementRef(name = "itemInfo", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<ItemInfo> itemInfo;
    @XmlElementRef(name = "permission", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> permission;
    @XmlElementRef(name = "balanceInfo", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<BalanceInfo> balanceInfo;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyNodeType }
     *     
     */
    public StrategyNodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyNodeType }
     *     
     */
    public void setType(StrategyNodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the nodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the parentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentID() {
        return parentID;
    }

    /**
     * Sets the value of the parentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentID(String value) {
        this.parentID = value;
    }

    /**
     * Gets the value of the perspectiveID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerspectiveID() {
        return perspectiveID;
    }

    /**
     * Sets the value of the perspectiveID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerspectiveID(String value) {
        this.perspectiveID = value;
    }

    /**
     * Gets the value of the assessmentRule property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentRule }
     *     
     */
    public AssessmentRule getAssessmentRule() {
        return assessmentRule;
    }

    /**
     * Sets the value of the assessmentRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentRule }
     *     
     */
    public void setAssessmentRule(AssessmentRule value) {
        this.assessmentRule = value;
    }

    /**
     * Gets the value of the objective property.
     * 
     * @return
     *     possible object is
     *     {@link Objective }
     *     
     */
    public Objective getObjective() {
        return objective;
    }

    /**
     * Sets the value of the objective property.
     * 
     * @param value
     *     allowed object is
     *     {@link Objective }
     *     
     */
    public void setObjective(Objective value) {
        this.objective = value;
    }

    /**
     * Gets the value of the pinnedKPI property.
     * 
     * @return
     *     possible object is
     *     {@link PinnedKPI }
     *     
     */
    public PinnedKPI getPinnedKPI() {
        return pinnedKPI;
    }

    /**
     * Sets the value of the pinnedKPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinnedKPI }
     *     
     */
    public void setPinnedKPI(PinnedKPI value) {
        this.pinnedKPI = value;
    }

    /**
     * Gets the value of the linkedStrategyNode property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedStrategyNode }
     *     
     */
    public LinkedStrategyNode getLinkedStrategyNode() {
        return linkedStrategyNode;
    }

    /**
     * Sets the value of the linkedStrategyNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedStrategyNode }
     *     
     */
    public void setLinkedStrategyNode(LinkedStrategyNode value) {
        this.linkedStrategyNode = value;
    }

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItemInfo }{@code >}
     *     
     */
    public JAXBElement<ItemInfo> getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItemInfo }{@code >}
     *     
     */
    public void setItemInfo(JAXBElement<ItemInfo> value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPermission(JAXBElement<Integer> value) {
        this.permission = value;
    }

    /**
     * Gets the value of the balanceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BalanceInfo }{@code >}
     *     
     */
    public JAXBElement<BalanceInfo> getBalanceInfo() {
        return balanceInfo;
    }

    /**
     * Sets the value of the balanceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BalanceInfo }{@code >}
     *     
     */
    public void setBalanceInfo(JAXBElement<BalanceInfo> value) {
        this.balanceInfo = value;
    }

}
