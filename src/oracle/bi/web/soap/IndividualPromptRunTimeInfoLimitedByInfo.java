
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoLimitedByInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoLimitedByInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limitedByType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isLimitedByNotApplied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="specificPrompts" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoLimitedByPromptRefGroups"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoLimitedByInfo", propOrder = {
    "limitedByType",
    "isLimitedByNotApplied",
    "specificPrompts"
})
public class IndividualPromptRunTimeInfoLimitedByInfo {

    @XmlElement(required = true)
    protected String limitedByType;
    protected boolean isLimitedByNotApplied;
    @XmlElement(required = true)
    protected IndividualPromptRunTimeInfoLimitedByPromptRefGroups specificPrompts;

    /**
     * Gets the value of the limitedByType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitedByType() {
        return limitedByType;
    }

    /**
     * Sets the value of the limitedByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitedByType(String value) {
        this.limitedByType = value;
    }

    /**
     * Gets the value of the isLimitedByNotApplied property.
     * 
     */
    public boolean isIsLimitedByNotApplied() {
        return isLimitedByNotApplied;
    }

    /**
     * Sets the value of the isLimitedByNotApplied property.
     * 
     */
    public void setIsLimitedByNotApplied(boolean value) {
        this.isLimitedByNotApplied = value;
    }

    /**
     * Gets the value of the specificPrompts property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoLimitedByPromptRefGroups }
     *     
     */
    public IndividualPromptRunTimeInfoLimitedByPromptRefGroups getSpecificPrompts() {
        return specificPrompts;
    }

    /**
     * Sets the value of the specificPrompts property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoLimitedByPromptRefGroups }
     *     
     */
    public void setSpecificPrompts(IndividualPromptRunTimeInfoLimitedByPromptRefGroups value) {
        this.specificPrompts = value;
    }

}
