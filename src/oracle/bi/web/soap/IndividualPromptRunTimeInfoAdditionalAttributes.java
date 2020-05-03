
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoAdditionalAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoAdditionalAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opMinNumValues" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="opMaxNumValues" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoAdditionalAttributes", propOrder = {
    "opMinNumValues",
    "opMaxNumValues"
})
public class IndividualPromptRunTimeInfoAdditionalAttributes {

    protected int opMinNumValues;
    protected int opMaxNumValues;

    /**
     * Gets the value of the opMinNumValues property.
     * 
     */
    public int getOpMinNumValues() {
        return opMinNumValues;
    }

    /**
     * Sets the value of the opMinNumValues property.
     * 
     */
    public void setOpMinNumValues(int value) {
        this.opMinNumValues = value;
    }

    /**
     * Gets the value of the opMaxNumValues property.
     * 
     */
    public int getOpMaxNumValues() {
        return opMaxNumValues;
    }

    /**
     * Sets the value of the opMaxNumValues property.
     * 
     */
    public void setOpMaxNumValues(int value) {
        this.opMaxNumValues = value;
    }

}
