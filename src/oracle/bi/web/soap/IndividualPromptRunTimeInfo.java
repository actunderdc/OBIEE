
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promptID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="allowUserTypeValues" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowAutoComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="multiSelect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showSearch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataType" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoDataType"/>
 *         &lt;element name="currentValues" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoCurrentValues"/>
 *         &lt;element name="availableOptions" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoAvailableOptions"/>
 *         &lt;element name="attributes" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoAdditionalAttributes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfo", propOrder = {
    "promptID",
    "allowUserTypeValues",
    "allowAutoComplete",
    "multiSelect",
    "showSearch",
    "dataType",
    "currentValues",
    "availableOptions",
    "attributes"
})
public class IndividualPromptRunTimeInfo {

    protected int promptID;
    protected boolean allowUserTypeValues;
    protected boolean allowAutoComplete;
    protected boolean multiSelect;
    @XmlElement(required = true)
    protected String showSearch;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoDataType dataType;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoCurrentValues currentValues;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoAvailableOptions availableOptions;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoAdditionalAttributes attributes;

    /**
     * Gets the value of the promptID property.
     * 
     */
    public int getPromptID() {
        return promptID;
    }

    /**
     * Sets the value of the promptID property.
     * 
     */
    public void setPromptID(int value) {
        this.promptID = value;
    }

    /**
     * Gets the value of the allowUserTypeValues property.
     * 
     */
    public boolean isAllowUserTypeValues() {
        return allowUserTypeValues;
    }

    /**
     * Sets the value of the allowUserTypeValues property.
     * 
     */
    public void setAllowUserTypeValues(boolean value) {
        this.allowUserTypeValues = value;
    }

    /**
     * Gets the value of the allowAutoComplete property.
     * 
     */
    public boolean isAllowAutoComplete() {
        return allowAutoComplete;
    }

    /**
     * Sets the value of the allowAutoComplete property.
     * 
     */
    public void setAllowAutoComplete(boolean value) {
        this.allowAutoComplete = value;
    }

    /**
     * Gets the value of the multiSelect property.
     * 
     */
    public boolean isMultiSelect() {
        return multiSelect;
    }

    /**
     * Sets the value of the multiSelect property.
     * 
     */
    public void setMultiSelect(boolean value) {
        this.multiSelect = value;
    }

    /**
     * Gets the value of the showSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowSearch() {
        return showSearch;
    }

    /**
     * Sets the value of the showSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowSearch(String value) {
        this.showSearch = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoDataType }
     *     
     */
    public IndividualPromptRunTimeInfoDataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoDataType }
     *     
     */
    public void setDataType(IndividualPromptRunTimeInfoDataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the currentValues property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoCurrentValues }
     *     
     */
    public IndividualPromptRunTimeInfoCurrentValues getCurrentValues() {
        return currentValues;
    }

    /**
     * Sets the value of the currentValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoCurrentValues }
     *     
     */
    public void setCurrentValues(IndividualPromptRunTimeInfoCurrentValues value) {
        this.currentValues = value;
    }

    /**
     * Gets the value of the availableOptions property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoAvailableOptions }
     *     
     */
    public IndividualPromptRunTimeInfoAvailableOptions getAvailableOptions() {
        return availableOptions;
    }

    /**
     * Sets the value of the availableOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoAvailableOptions }
     *     
     */
    public void setAvailableOptions(IndividualPromptRunTimeInfoAvailableOptions value) {
        this.availableOptions = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoAdditionalAttributes }
     *     
     */
    public IndividualPromptRunTimeInfoAdditionalAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoAdditionalAttributes }
     *     
     */
    public void setAttributes(IndividualPromptRunTimeInfoAdditionalAttributes value) {
        this.attributes = value;
    }

}
