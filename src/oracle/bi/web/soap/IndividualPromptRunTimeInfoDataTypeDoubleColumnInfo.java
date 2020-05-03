
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeColumnFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeColumnCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeColumnPrimaryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeColumnDBPrimaryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enableDoubleColumnInput" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codeColumnLabel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectedByCodeValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo", propOrder = {
    "codeColumnFormula",
    "codeColumnCategory",
    "codeColumnPrimaryType",
    "codeColumnDBPrimaryType",
    "enableDoubleColumnInput",
    "codeColumnLabel",
    "selectedByCodeValue"
})
public class IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo {

    @XmlElement(required = true)
    protected String codeColumnFormula;
    @XmlElement(required = true)
    protected String codeColumnCategory;
    @XmlElement(required = true)
    protected String codeColumnPrimaryType;
    @XmlElement(required = true)
    protected String codeColumnDBPrimaryType;
    protected boolean enableDoubleColumnInput;
    @XmlElement(required = true, nillable = true)
    protected String codeColumnLabel;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean selectedByCodeValue;

    /**
     * Gets the value of the codeColumnFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeColumnFormula() {
        return codeColumnFormula;
    }

    /**
     * Sets the value of the codeColumnFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeColumnFormula(String value) {
        this.codeColumnFormula = value;
    }

    /**
     * Gets the value of the codeColumnCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeColumnCategory() {
        return codeColumnCategory;
    }

    /**
     * Sets the value of the codeColumnCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeColumnCategory(String value) {
        this.codeColumnCategory = value;
    }

    /**
     * Gets the value of the codeColumnPrimaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeColumnPrimaryType() {
        return codeColumnPrimaryType;
    }

    /**
     * Sets the value of the codeColumnPrimaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeColumnPrimaryType(String value) {
        this.codeColumnPrimaryType = value;
    }

    /**
     * Gets the value of the codeColumnDBPrimaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeColumnDBPrimaryType() {
        return codeColumnDBPrimaryType;
    }

    /**
     * Sets the value of the codeColumnDBPrimaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeColumnDBPrimaryType(String value) {
        this.codeColumnDBPrimaryType = value;
    }

    /**
     * Gets the value of the enableDoubleColumnInput property.
     * 
     */
    public boolean isEnableDoubleColumnInput() {
        return enableDoubleColumnInput;
    }

    /**
     * Sets the value of the enableDoubleColumnInput property.
     * 
     */
    public void setEnableDoubleColumnInput(boolean value) {
        this.enableDoubleColumnInput = value;
    }

    /**
     * Gets the value of the codeColumnLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeColumnLabel() {
        return codeColumnLabel;
    }

    /**
     * Sets the value of the codeColumnLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeColumnLabel(String value) {
        this.codeColumnLabel = value;
    }

    /**
     * Gets the value of the selectedByCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectedByCodeValue() {
        return selectedByCodeValue;
    }

    /**
     * Sets the value of the selectedByCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectedByCodeValue(Boolean value) {
        this.selectedByCodeValue = value;
    }

}
