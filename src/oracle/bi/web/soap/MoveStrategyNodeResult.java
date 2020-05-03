
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="strategyNodes" type="{urn://oracle.bi.webservices/v12}StrategyNodeList" minOccurs="0"/>
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
    "strategyNodes"
})
@XmlRootElement(name = "moveStrategyNodeResult")
public class MoveStrategyNodeResult {

    protected StrategyNodeList strategyNodes;

    /**
     * Gets the value of the strategyNodes property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyNodeList }
     *     
     */
    public StrategyNodeList getStrategyNodes() {
        return strategyNodes;
    }

    /**
     * Sets the value of the strategyNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyNodeList }
     *     
     */
    public void setStrategyNodes(StrategyNodeList value) {
        this.strategyNodes = value;
    }

}
