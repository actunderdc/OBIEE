
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DimensionMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimensionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isMapped" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isDefaulted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mappedToDimensionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{urn://oracle.bi.webservices/v12}KPIDimensionValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionMapping", propOrder = {
    "dimensionID",
    "isMapped",
    "isDefaulted",
    "displayLabel",
    "mappedToDimensionID",
    "defaultValue"
})
public class DimensionMapping {

    @XmlElement(required = true)
    protected String dimensionID;
    protected boolean isMapped;
    protected boolean isDefaulted;
    @XmlElementRef(name = "displayLabel", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayLabel;
    @XmlElementRef(name = "mappedToDimensionID", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mappedToDimensionID;
    @XmlElementRef(name = "defaultValue", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<KPIDimensionValue> defaultValue;

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
     * Gets the value of the isMapped property.
     * 
     */
    public boolean isIsMapped() {
        return isMapped;
    }

    /**
     * Sets the value of the isMapped property.
     * 
     */
    public void setIsMapped(boolean value) {
        this.isMapped = value;
    }

    /**
     * Gets the value of the isDefaulted property.
     * 
     */
    public boolean isIsDefaulted() {
        return isDefaulted;
    }

    /**
     * Sets the value of the isDefaulted property.
     * 
     */
    public void setIsDefaulted(boolean value) {
        this.isDefaulted = value;
    }

    /**
     * Gets the value of the displayLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayLabel() {
        return displayLabel;
    }

    /**
     * Sets the value of the displayLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayLabel(JAXBElement<String> value) {
        this.displayLabel = value;
    }

    /**
     * Gets the value of the mappedToDimensionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMappedToDimensionID() {
        return mappedToDimensionID;
    }

    /**
     * Sets the value of the mappedToDimensionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMappedToDimensionID(JAXBElement<String> value) {
        this.mappedToDimensionID = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KPIDimensionValue }{@code >}
     *     
     */
    public JAXBElement<KPIDimensionValue> getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KPIDimensionValue }{@code >}
     *     
     */
    public void setDefaultValue(JAXBElement<KPIDimensionValue> value) {
        this.defaultValue = value;
    }

}
