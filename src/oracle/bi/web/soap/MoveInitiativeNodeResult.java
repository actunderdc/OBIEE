
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
 *         &lt;element name="initiativeNodes" type="{urn://oracle.bi.webservices/v12}InitiativeNodeList" minOccurs="0"/>
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
    "initiativeNodes"
})
@XmlRootElement(name = "moveInitiativeNodeResult")
public class MoveInitiativeNodeResult {

    protected InitiativeNodeList initiativeNodes;

    /**
     * Gets the value of the initiativeNodes property.
     * 
     * @return
     *     possible object is
     *     {@link InitiativeNodeList }
     *     
     */
    public InitiativeNodeList getInitiativeNodes() {
        return initiativeNodes;
    }

    /**
     * Sets the value of the initiativeNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiativeNodeList }
     *     
     */
    public void setInitiativeNodes(InitiativeNodeList value) {
        this.initiativeNodes = value;
    }

}
