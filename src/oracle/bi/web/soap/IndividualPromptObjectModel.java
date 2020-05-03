
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptObjectModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptObjectModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subjectArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placedOnNewColumn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="formulaExprString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promptUIControlType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promptOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customWidthUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customWidthWidth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="setPromptVariableType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="setVariableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="limitedByInfo" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoLimitedByInfo"/>
 *         &lt;element name="runTimeInfo" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptObjectModel", propOrder = {
    "label",
    "description",
    "type",
    "subjectArea",
    "placedOnNewColumn",
    "required",
    "formulaExprString",
    "promptUIControlType",
    "promptOperator",
    "customWidthUsage",
    "customWidthWidth",
    "setPromptVariableType",
    "setVariableName",
    "limitedByInfo",
    "runTimeInfo"
})
public class IndividualPromptObjectModel {

    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String subjectArea;
    protected boolean placedOnNewColumn;
    protected boolean required;
    @XmlElement(required = true)
    protected String formulaExprString;
    @XmlElement(required = true)
    protected String promptUIControlType;
    @XmlElement(required = true)
    protected String promptOperator;
    @XmlElement(required = true)
    protected String customWidthUsage;
    @XmlElement(required = true)
    protected String customWidthWidth;
    @XmlElement(required = true)
    protected String setPromptVariableType;
    @XmlElement(required = true)
    protected String setVariableName;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoLimitedByInfo limitedByInfo;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfo runTimeInfo;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectArea(String value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the placedOnNewColumn property.
     * 
     */
    public boolean isPlacedOnNewColumn() {
        return placedOnNewColumn;
    }

    /**
     * Sets the value of the placedOnNewColumn property.
     * 
     */
    public void setPlacedOnNewColumn(boolean value) {
        this.placedOnNewColumn = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the formulaExprString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaExprString() {
        return formulaExprString;
    }

    /**
     * Sets the value of the formulaExprString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaExprString(String value) {
        this.formulaExprString = value;
    }

    /**
     * Gets the value of the promptUIControlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptUIControlType() {
        return promptUIControlType;
    }

    /**
     * Sets the value of the promptUIControlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptUIControlType(String value) {
        this.promptUIControlType = value;
    }

    /**
     * Gets the value of the promptOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptOperator() {
        return promptOperator;
    }

    /**
     * Sets the value of the promptOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptOperator(String value) {
        this.promptOperator = value;
    }

    /**
     * Gets the value of the customWidthUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomWidthUsage() {
        return customWidthUsage;
    }

    /**
     * Sets the value of the customWidthUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomWidthUsage(String value) {
        this.customWidthUsage = value;
    }

    /**
     * Gets the value of the customWidthWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomWidthWidth() {
        return customWidthWidth;
    }

    /**
     * Sets the value of the customWidthWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomWidthWidth(String value) {
        this.customWidthWidth = value;
    }

    /**
     * Gets the value of the setPromptVariableType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetPromptVariableType() {
        return setPromptVariableType;
    }

    /**
     * Sets the value of the setPromptVariableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetPromptVariableType(String value) {
        this.setPromptVariableType = value;
    }

    /**
     * Gets the value of the setVariableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetVariableName() {
        return setVariableName;
    }

    /**
     * Sets the value of the setVariableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetVariableName(String value) {
        this.setVariableName = value;
    }

    /**
     * Gets the value of the limitedByInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoLimitedByInfo }
     *     
     */
    public IndividualPromptRunTimeInfoLimitedByInfo getLimitedByInfo() {
        return limitedByInfo;
    }

    /**
     * Sets the value of the limitedByInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoLimitedByInfo }
     *     
     */
    public void setLimitedByInfo(IndividualPromptRunTimeInfoLimitedByInfo value) {
        this.limitedByInfo = value;
    }

    /**
     * Gets the value of the runTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfo }
     *     
     */
    public IndividualPromptRunTimeInfo getRunTimeInfo() {
        return runTimeInfo;
    }

    /**
     * Sets the value of the runTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfo }
     *     
     */
    public void setRunTimeInfo(IndividualPromptRunTimeInfo value) {
        this.runTimeInfo = value;
    }

}
