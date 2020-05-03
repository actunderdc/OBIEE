
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoLimitedByPromptReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoLimitedByPromptReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promptID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="formulaExprString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoLimitedByPromptReference", propOrder = {
    "promptID",
    "formulaExprString"
})
public class IndividualPromptRunTimeInfoLimitedByPromptReference {

    protected int promptID;
    @XmlElement(required = true)
    protected String formulaExprString;

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

}
