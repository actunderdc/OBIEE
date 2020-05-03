
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayColumnFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayColumnCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayColumnPrimaryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayColumnDBPrimaryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isMeasureColumn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayTimeZone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataTimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="displayToDataOffset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="promptSourceDataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hierarchyInfo" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoDataTypeHierarchyInfo"/>
 *         &lt;element name="isDoubleColumnInput" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codeColumnInfo" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoDataType", propOrder = {
    "subjectArea",
    "displayColumnFormula",
    "displayColumnCategory",
    "displayColumnPrimaryType",
    "displayColumnDBPrimaryType",
    "isMeasureColumn",
    "displayTimeZone",
    "dataTimeZoneOffset",
    "displayToDataOffset",
    "promptSourceDataType",
    "isHierarchy",
    "hierarchyInfo",
    "isDoubleColumnInput",
    "codeColumnInfo"
})
public class IndividualPromptRunTimeInfoDataType {

    @XmlElement(required = true)
    protected String subjectArea;
    @XmlElement(required = true)
    protected String displayColumnFormula;
    @XmlElement(required = true)
    protected String displayColumnCategory;
    @XmlElement(required = true)
    protected String displayColumnPrimaryType;
    @XmlElement(required = true)
    protected String displayColumnDBPrimaryType;
    protected boolean isMeasureColumn;
    @XmlElement(required = true, nillable = true)
    protected String displayTimeZone;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer dataTimeZoneOffset;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer displayToDataOffset;
    @XmlElement(required = true)
    protected String promptSourceDataType;
    protected boolean isHierarchy;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoDataTypeHierarchyInfo hierarchyInfo;
    protected boolean isDoubleColumnInput;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo codeColumnInfo;

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
     * Gets the value of the displayColumnFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayColumnFormula() {
        return displayColumnFormula;
    }

    /**
     * Sets the value of the displayColumnFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayColumnFormula(String value) {
        this.displayColumnFormula = value;
    }

    /**
     * Gets the value of the displayColumnCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayColumnCategory() {
        return displayColumnCategory;
    }

    /**
     * Sets the value of the displayColumnCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayColumnCategory(String value) {
        this.displayColumnCategory = value;
    }

    /**
     * Gets the value of the displayColumnPrimaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayColumnPrimaryType() {
        return displayColumnPrimaryType;
    }

    /**
     * Sets the value of the displayColumnPrimaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayColumnPrimaryType(String value) {
        this.displayColumnPrimaryType = value;
    }

    /**
     * Gets the value of the displayColumnDBPrimaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayColumnDBPrimaryType() {
        return displayColumnDBPrimaryType;
    }

    /**
     * Sets the value of the displayColumnDBPrimaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayColumnDBPrimaryType(String value) {
        this.displayColumnDBPrimaryType = value;
    }

    /**
     * Gets the value of the isMeasureColumn property.
     * 
     */
    public boolean isIsMeasureColumn() {
        return isMeasureColumn;
    }

    /**
     * Sets the value of the isMeasureColumn property.
     * 
     */
    public void setIsMeasureColumn(boolean value) {
        this.isMeasureColumn = value;
    }

    /**
     * Gets the value of the displayTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTimeZone() {
        return displayTimeZone;
    }

    /**
     * Sets the value of the displayTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTimeZone(String value) {
        this.displayTimeZone = value;
    }

    /**
     * Gets the value of the dataTimeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataTimeZoneOffset() {
        return dataTimeZoneOffset;
    }

    /**
     * Sets the value of the dataTimeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataTimeZoneOffset(Integer value) {
        this.dataTimeZoneOffset = value;
    }

    /**
     * Gets the value of the displayToDataOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayToDataOffset() {
        return displayToDataOffset;
    }

    /**
     * Sets the value of the displayToDataOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayToDataOffset(Integer value) {
        this.displayToDataOffset = value;
    }

    /**
     * Gets the value of the promptSourceDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptSourceDataType() {
        return promptSourceDataType;
    }

    /**
     * Sets the value of the promptSourceDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptSourceDataType(String value) {
        this.promptSourceDataType = value;
    }

    /**
     * Gets the value of the isHierarchy property.
     * 
     */
    public boolean isIsHierarchy() {
        return isHierarchy;
    }

    /**
     * Sets the value of the isHierarchy property.
     * 
     */
    public void setIsHierarchy(boolean value) {
        this.isHierarchy = value;
    }

    /**
     * Gets the value of the hierarchyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyInfo }
     *     
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyInfo getHierarchyInfo() {
        return hierarchyInfo;
    }

    /**
     * Sets the value of the hierarchyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyInfo }
     *     
     */
    public void setHierarchyInfo(IndividualPromptRunTimeInfoDataTypeHierarchyInfo value) {
        this.hierarchyInfo = value;
    }

    /**
     * Gets the value of the isDoubleColumnInput property.
     * 
     */
    public boolean isIsDoubleColumnInput() {
        return isDoubleColumnInput;
    }

    /**
     * Sets the value of the isDoubleColumnInput property.
     * 
     */
    public void setIsDoubleColumnInput(boolean value) {
        this.isDoubleColumnInput = value;
    }

    /**
     * Gets the value of the codeColumnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo }
     *     
     */
    public IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo getCodeColumnInfo() {
        return codeColumnInfo;
    }

    /**
     * Sets the value of the codeColumnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo }
     *     
     */
    public void setCodeColumnInfo(IndividualPromptRunTimeInfoDataTypeDoubleColumnInfo value) {
        this.codeColumnInfo = value;
    }

}
