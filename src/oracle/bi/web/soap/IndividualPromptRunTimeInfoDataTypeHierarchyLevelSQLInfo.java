
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sqlFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primaryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nullable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isMeasure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aggType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aggRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo", propOrder = {
    "displayFormula",
    "sqlFormula",
    "dataType",
    "category",
    "primaryType",
    "nullable",
    "isMeasure",
    "aggType",
    "aggRule"
})
public class IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo {

    @XmlElement(required = true)
    protected String displayFormula;
    @XmlElement(required = true)
    protected String sqlFormula;
    @XmlElement(required = true)
    protected String dataType;
    @XmlElement(required = true)
    protected String category;
    @XmlElement(required = true)
    protected String primaryType;
    protected boolean nullable;
    protected boolean isMeasure;
    @XmlElement(required = true)
    protected String aggType;
    @XmlElement(required = true)
    protected String aggRule;

    /**
     * Gets the value of the displayFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFormula() {
        return displayFormula;
    }

    /**
     * Sets the value of the displayFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFormula(String value) {
        this.displayFormula = value;
    }

    /**
     * Gets the value of the sqlFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlFormula() {
        return sqlFormula;
    }

    /**
     * Sets the value of the sqlFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlFormula(String value) {
        this.sqlFormula = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the primaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryType() {
        return primaryType;
    }

    /**
     * Sets the value of the primaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryType(String value) {
        this.primaryType = value;
    }

    /**
     * Gets the value of the nullable property.
     * 
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * Sets the value of the nullable property.
     * 
     */
    public void setNullable(boolean value) {
        this.nullable = value;
    }

    /**
     * Gets the value of the isMeasure property.
     * 
     */
    public boolean isIsMeasure() {
        return isMeasure;
    }

    /**
     * Sets the value of the isMeasure property.
     * 
     */
    public void setIsMeasure(boolean value) {
        this.isMeasure = value;
    }

    /**
     * Gets the value of the aggType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggType() {
        return aggType;
    }

    /**
     * Sets the value of the aggType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggType(String value) {
        this.aggType = value;
    }

    /**
     * Gets the value of the aggRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggRule() {
        return aggRule;
    }

    /**
     * Sets the value of the aggRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggRule(String value) {
        this.aggRule = value;
    }

}
