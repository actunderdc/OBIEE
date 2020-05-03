
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoDataTypeHierarchyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoDataTypeHierarchyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hierarchyID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dimensionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formulaLevels" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoDataTypeHierarchyInfo", propOrder = {
    "hierarchyID",
    "dimensionID",
    "tableName",
    "formulaLevels"
})
public class IndividualPromptRunTimeInfoDataTypeHierarchyInfo {

    @XmlElement(required = true)
    protected String hierarchyID;
    @XmlElement(required = true)
    protected String dimensionID;
    @XmlElement(required = true)
    protected String tableName;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels formulaLevels;

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
     * Gets the value of the formulaLevels property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels }
     *     
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels getFormulaLevels() {
        return formulaLevels;
    }

    /**
     * Sets the value of the formulaLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels }
     *     
     */
    public void setFormulaLevels(IndividualPromptRunTimeInfoDataTypeHierarchyFormulaLevels value) {
        this.formulaLevels = value;
    }

}
