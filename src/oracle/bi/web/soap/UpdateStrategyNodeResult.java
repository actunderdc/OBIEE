
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
 *       &lt;sequence>
 *         &lt;element name="node" type="{urn://oracle.bi.webservices/v12}StrategyNode" minOccurs="0"/>
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
    "node"
})
@XmlRootElement(name = "updateStrategyNodeResult")
public class UpdateStrategyNodeResult {

    @XmlElementRef(name = "node", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<StrategyNode> node;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StrategyNode }{@code >}
     *     
     */
    public JAXBElement<StrategyNode> getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StrategyNode }{@code >}
     *     
     */
    public void setNode(JAXBElement<StrategyNode> value) {
        this.node = value;
    }

}
