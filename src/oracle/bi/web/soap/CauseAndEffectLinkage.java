
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CauseAndEffectLinkage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CauseAndEffectLinkage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="degreeStrength" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interaction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="causeRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="effectRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operation" type="{urn://oracle.bi.webservices/v12}CauseAndEffectLinkageOperationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CauseAndEffectLinkage", propOrder = {
    "id",
    "degreeStrength",
    "interaction",
    "causeRef",
    "effectRef",
    "operation"
})
public class CauseAndEffectLinkage {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String degreeStrength;
    @XmlElement(required = true)
    protected String interaction;
    @XmlElement(required = true)
    protected String causeRef;
    @XmlElement(required = true)
    protected String effectRef;
    @XmlSchemaType(name = "string")
    protected CauseAndEffectLinkageOperationType operation;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the degreeStrength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeStrength() {
        return degreeStrength;
    }

    /**
     * Sets the value of the degreeStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeStrength(String value) {
        this.degreeStrength = value;
    }

    /**
     * Gets the value of the interaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteraction() {
        return interaction;
    }

    /**
     * Sets the value of the interaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteraction(String value) {
        this.interaction = value;
    }

    /**
     * Gets the value of the causeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseRef() {
        return causeRef;
    }

    /**
     * Sets the value of the causeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseRef(String value) {
        this.causeRef = value;
    }

    /**
     * Gets the value of the effectRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectRef() {
        return effectRef;
    }

    /**
     * Sets the value of the effectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectRef(String value) {
        this.effectRef = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link CauseAndEffectLinkageOperationType }
     *     
     */
    public CauseAndEffectLinkageOperationType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseAndEffectLinkageOperationType }
     *     
     */
    public void setOperation(CauseAndEffectLinkageOperationType value) {
        this.operation = value;
    }

}
