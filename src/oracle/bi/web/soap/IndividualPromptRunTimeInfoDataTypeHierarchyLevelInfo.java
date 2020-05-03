
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="levelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sqlFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isDoubleColumn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="keyColumnInfo" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo"/>
 *         &lt;element name="displayColumnInfo" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo", propOrder = {
    "levelID",
    "displayName",
    "displayFormula",
    "sqlFormula",
    "isDoubleColumn",
    "keyColumnInfo",
    "displayColumnInfo"
})
public class IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo {

    @XmlElement(required = true)
    protected String levelID;
    @XmlElement(required = true)
    protected String displayName;
    @XmlElement(required = true)
    protected String displayFormula;
    @XmlElement(required = true)
    protected String sqlFormula;
    protected boolean isDoubleColumn;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo keyColumnInfo;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo displayColumnInfo;

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
     * Gets the value of the isDoubleColumn property.
     * 
     */
    public boolean isIsDoubleColumn() {
        return isDoubleColumn;
    }

    /**
     * Sets the value of the isDoubleColumn property.
     * 
     */
    public void setIsDoubleColumn(boolean value) {
        this.isDoubleColumn = value;
    }

    /**
     * Gets the value of the keyColumnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo }
     *     
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo getKeyColumnInfo() {
        return keyColumnInfo;
    }

    /**
     * Sets the value of the keyColumnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo }
     *     
     */
    public void setKeyColumnInfo(IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo value) {
        this.keyColumnInfo = value;
    }

    /**
     * Gets the value of the displayColumnInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo }
     *     
     */
    public IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo getDisplayColumnInfo() {
        return displayColumnInfo;
    }

    /**
     * Sets the value of the displayColumnInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo }
     *     
     */
    public void setDisplayColumnInfo(IndividualPromptRunTimeInfoDataTypeHierarchyLevelSQLInfo value) {
        this.displayColumnInfo = value;
    }

}
