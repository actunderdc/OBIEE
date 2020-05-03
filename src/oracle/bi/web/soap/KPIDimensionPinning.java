
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIDimensionPinning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPIDimensionPinning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimensionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variableType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="levelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPIDimensionPinning", propOrder = {
    "dimensionID",
    "variableType",
    "variableName",
    "value",
    "levelID",
    "displayValue"
})
public class KPIDimensionPinning {

    @XmlElement(required = true)
    protected String dimensionID;
    @XmlElement(required = true)
    protected String variableType;
    @XmlElement(required = true)
    protected String variableName;
    @XmlElement(required = true)
    protected String value;
    protected String levelID;
    @XmlElementRef(name = "displayValue", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayValue;

    /**
     * Gets the value of the dimensionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionID() {
        return dimensionID;
    }

    /**
     * Sets the value of the dimensionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionID(String value) {
        this.dimensionID = value;
    }

    /**
     * Gets the value of the variableType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableType() {
        return variableType;
    }

    /**
     * Sets the value of the variableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableType(String value) {
        this.variableType = value;
    }

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the levelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelID() {
        return levelID;
    }

    /**
     * Sets the value of the levelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelID(String value) {
        this.levelID = value;
    }

    /**
     * Gets the value of the displayValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayValue() {
        return displayValue;
    }

    /**
     * Sets the value of the displayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayValue(JAXBElement<String> value) {
        this.displayValue = value;
    }

}
