
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subjectArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dimensionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hierarchyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hierarchyDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sqlFormulaIn2Parts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sqlFormulaDisplaySubjectAreaPart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="levels" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoDataTypeHierarchyLevels"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels", propOrder = {
    "subjectArea",
    "dimensionID",
    "tableName",
    "hierarchyID",
    "displayName",
    "tableDisplayName",
    "hierarchyDisplayName",
    "sqlFormulaIn2Parts",
    "sqlFormulaDisplaySubjectAreaPart",
    "levels"
})
public class IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels {

    @XmlElement(required = true)
    protected String subjectArea;
    @XmlElement(required = true)
    protected String dimensionID;
    @XmlElement(required = true)
    protected String tableName;
    @XmlElement(required = true)
    protected String hierarchyID;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected String tableDisplayName;
    @XmlElement(required = true)
    protected String hierarchyDisplayName;
    @XmlElement(required = true)
    protected String sqlFormulaIn2Parts;
    @XmlElement(required = true)
    protected String sqlFormulaDisplaySubjectAreaPart;
    @XmlElement(required = true)
    protected IndividualPromptRunTimeInfoDataTypeHierarchyLevels levels;

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
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the hierarchyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyID() {
        return hierarchyID;
    }

    /**
     * Sets the value of the hierarchyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyID(String value) {
        this.hierarchyID = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the tableDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableDisplayName() {
        return tableDisplayName;
    }

    /**
     * Sets the value of the tableDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableDisplayName(String value) {
        this.tableDisplayName = value;
    }

    /**
     * Gets the value of the hierarchyDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHierarchyDisplayName() {
        return hierarchyDisplayName;
    }

    /**
     * Sets the value of the hierarchyDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHierarchyDisplayName(String value) {
        this.hierarchyDisplayName = value;
    }

    /**
     * Gets the value of the sqlFormulaIn2Parts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlFormulaIn2Parts() {
        return sqlFormulaIn2Parts;
    }

    /**
     * Sets the value of the sqlFormulaIn2Parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlFormulaIn2Parts(String value) {
        this.sqlFormulaIn2Parts = value;
    }

    /**
     * Gets the value of the sqlFormulaDisplaySubjectAreaPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlFormulaDisplaySubjectAreaPart() {
        return sqlFormulaDisplaySubjectAreaPart;
    }

    /**
     * Sets the value of the sqlFormulaDisplaySubjectAreaPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlFormulaDisplaySubjectAreaPart(String value) {
        this.sqlFormulaDisplaySubjectAreaPart = value;
    }

    /**
     * Gets the value of the levels property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevels }
     *     
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyLevels getLevels() {
        return levels;
    }

    /**
     * Sets the value of the levels property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevels }
     *     
     */
    public void setLevels(IndividualPromptRunTimeInfoDataTypeHierarchyLevels value) {
        this.levels = value;
    }

}
