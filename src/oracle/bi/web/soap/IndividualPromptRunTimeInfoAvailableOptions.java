
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoAvailableOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoAvailableOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numOptionsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currentPageInOptions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="moreOptions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeAllChoices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="needToPopulateDropDown" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="valueTablePromptSourceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sql" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runTimeCodeAndDisplayValueFormatStr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filterXmlString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupPaths" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoValuesType"/>
 *         &lt;element name="populatedOptions" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoValuesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoAvailableOptions", propOrder = {
    "numOptionsPerPage",
    "currentPageInOptions",
    "moreOptions",
    "includeAllChoices",
    "needToPopulateDropDown",
    "valueTablePromptSourceType",
    "sql",
    "runTimeCodeAndDisplayValueFormatStr",
    "filterXmlString",
    "groupPaths",
    "populatedOptions"
})
public class IndividualPromptRunTimeInfoAvailableOptions {

    protected int numOptionsPerPage;
    protected int currentPageInOptions;
    protected boolean moreOptions;
    protected boolean includeAllChoices;
    protected boolean needToPopulateDropDown;
    @XmlElement(required = true)
    protected String valueTablePromptSourceType;
    @XmlElement(required = true)
    protected String sql;
    @XmlElement(required = true)
    protected String runTimeCodeAndDisplayValueFormatStr;
    @XmlElement(required = true, nillable = true)
    protected String filterXmlString;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoValuesType groupPaths;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoValuesType populatedOptions;

    /**
     * Gets the value of the numOptionsPerPage property.
     * 
     */
    public int getNumOptionsPerPage() {
        return numOptionsPerPage;
    }

    /**
     * Sets the value of the numOptionsPerPage property.
     * 
     */
    public void setNumOptionsPerPage(int value) {
        this.numOptionsPerPage = value;
    }

    /**
     * Gets the value of the currentPageInOptions property.
     * 
     */
    public int getCurrentPageInOptions() {
        return currentPageInOptions;
    }

    /**
     * Sets the value of the currentPageInOptions property.
     * 
     */
    public void setCurrentPageInOptions(int value) {
        this.currentPageInOptions = value;
    }

    /**
     * Gets the value of the moreOptions property.
     * 
     */
    public boolean isMoreOptions() {
        return moreOptions;
    }

    /**
     * Sets the value of the moreOptions property.
     * 
     */
    public void setMoreOptions(boolean value) {
        this.moreOptions = value;
    }

    /**
     * Gets the value of the includeAllChoices property.
     * 
     */
    public boolean isIncludeAllChoices() {
        return includeAllChoices;
    }

    /**
     * Sets the value of the includeAllChoices property.
     * 
     */
    public void setIncludeAllChoices(boolean value) {
        this.includeAllChoices = value;
    }

    /**
     * Gets the value of the needToPopulateDropDown property.
     * 
     */
    public boolean isNeedToPopulateDropDown() {
        return needToPopulateDropDown;
    }

    /**
     * Sets the value of the needToPopulateDropDown property.
     * 
     */
    public void setNeedToPopulateDropDown(boolean value) {
        this.needToPopulateDropDown = value;
    }

    /**
     * Gets the value of the valueTablePromptSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueTablePromptSourceType() {
        return valueTablePromptSourceType;
    }

    /**
     * Sets the value of the valueTablePromptSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueTablePromptSourceType(String value) {
        this.valueTablePromptSourceType = value;
    }

    /**
     * Gets the value of the sql property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSql() {
        return sql;
    }

    /**
     * Sets the value of the sql property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSql(String value) {
        this.sql = value;
    }

    /**
     * Gets the value of the runTimeCodeAndDisplayValueFormatStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunTimeCodeAndDisplayValueFormatStr() {
        return runTimeCodeAndDisplayValueFormatStr;
    }

    /**
     * Sets the value of the runTimeCodeAndDisplayValueFormatStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunTimeCodeAndDisplayValueFormatStr(String value) {
        this.runTimeCodeAndDisplayValueFormatStr = value;
    }

    /**
     * Gets the value of the filterXmlString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterXmlString() {
        return filterXmlString;
    }

    /**
     * Sets the value of the filterXmlString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterXmlString(String value) {
        this.filterXmlString = value;
    }

    /**
     * Gets the value of the groupPaths property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoValuesType }
     *     
     */
    public IndividualPromptRunTimeInfoValuesType getGroupPaths() {
        return groupPaths;
    }

    /**
     * Sets the value of the groupPaths property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoValuesType }
     *     
     */
    public void setGroupPaths(IndividualPromptRunTimeInfoValuesType value) {
        this.groupPaths = value;
    }

    /**
     * Gets the value of the populatedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoValuesType }
     *     
     */
    public IndividualPromptRunTimeInfoValuesType getPopulatedOptions() {
        return populatedOptions;
    }

    /**
     * Sets the value of the populatedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoValuesType }
     *     
     */
    public void setPopulatedOptions(IndividualPromptRunTimeInfoValuesType value) {
        this.populatedOptions = value;
    }

}
