
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoCurrentValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoCurrentValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emptyAsAllChoices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="values" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoValuesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoCurrentValues", propOrder = {
    "currentOperator",
    "emptyAsAllChoices",
    "values"
})
public class IndividualPromptRunTimeInfoCurrentValues {

    @XmlElement(required = true)
    protected String currentOperator;
    protected boolean emptyAsAllChoices;
    @XmlElement(required = true, nillable = true)
    protected IndividualPromptRunTimeInfoValuesType values;

    /**
     * Gets the value of the currentOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentOperator() {
        return currentOperator;
    }

    /**
     * Sets the value of the currentOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentOperator(String value) {
        this.currentOperator = value;
    }

    /**
     * Gets the value of the emptyAsAllChoices property.
     * 
     */
    public boolean isEmptyAsAllChoices() {
        return emptyAsAllChoices;
    }

    /**
     * Sets the value of the emptyAsAllChoices property.
     * 
     */
    public void setEmptyAsAllChoices(boolean value) {
        this.emptyAsAllChoices = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPromptRunTimeInfoValuesType }
     *     
     */
    public IndividualPromptRunTimeInfoValuesType getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPromptRunTimeInfoValuesType }
     *     
     */
    public void setValues(IndividualPromptRunTimeInfoValuesType value) {
        this.values = value;
    }

}
