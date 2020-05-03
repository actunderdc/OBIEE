
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;choice>
 *         &lt;element name="nodeStrategy" type="{urn://oracle.bi.webservices/v12}StrategyNode" minOccurs="0"/>
 *         &lt;element name="nodeInitiative" type="{urn://oracle.bi.webservices/v12}InitiativeNode" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nodeStrategy",
    "nodeInitiative"
})
@XmlRootElement(name = "openTreeNodeResult")
public class OpenTreeNodeResult {

    @XmlElementRef(name = "nodeStrategy", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategyNode> nodeStrategy;
    @XmlElementRef(name = "nodeInitiative", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<InitiativeNode> nodeInitiative;

    /**
     * Gets the value of the nodeStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategyNode }{@code >}
     *     
     */
    public JAXBElement<StrategyNode> getNodeStrategy() {
        return nodeStrategy;
    }

    /**
     * Sets the value of the nodeStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategyNode }{@code >}
     *     
     */
    public void setNodeStrategy(JAXBElement<StrategyNode> value) {
        this.nodeStrategy = value;
    }

    /**
     * Gets the value of the nodeInitiative property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InitiativeNode }{@code >}
     *     
     */
    public JAXBElement<InitiativeNode> getNodeInitiative() {
        return nodeInitiative;
    }

    /**
     * Sets the value of the nodeInitiative property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InitiativeNode }{@code >}
     *     
     */
    public void setNodeInitiative(JAXBElement<InitiativeNode> value) {
        this.nodeInitiative = value;
    }

}
