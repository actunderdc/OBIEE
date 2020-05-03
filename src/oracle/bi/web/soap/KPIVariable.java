
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPIVariable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variableValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variableType" type="{urn://oracle.bi.webservices/v12}KPIVariableType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPIVariable", propOrder = {
    "variableName",
    "variableValue",
    "variableType"
})
public class KPIVariable {

    @XmlElement(required = true)
    protected String variableName;
    @XmlElement(required = true)
    protected String variableValue;
    @XmlSchemaType(name = "string")
    protected List<KPIVariableType> variableType;

    /**
     * Gets the value of the variableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * Sets the value of the variableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableName(String value) {
        this.variableName = value;
    }

    /**
     * Gets the value of the variableValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableValue() {
        return variableValue;
    }

    /**
     * Sets the value of the variableValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableValue(String value) {
        this.variableValue = value;
    }

    /**
     * Gets the value of the variableType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KPIVariableType }
     * 
     * 
     */
    public List<KPIVariableType> getVariableType() {
        if (variableType == null) {
            variableType = new ArrayList<KPIVariableType>();
        }
        return this.variableType;
    }

}
