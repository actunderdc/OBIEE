
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a AssessmentRule which contains one or more weights
 * 
 * <p>Java class for AssessmentRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleType" type="{urn://oracle.bi.webservices/v12}AssessmentRuleType"/>
 *         &lt;element name="tieBreaker" type="{urn://oracle.bi.webservices/v12}TieBreakerRuleType"/>
 *         &lt;element name="weightedRule" type="{urn://oracle.bi.webservices/v12}WeightedRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentRule", propOrder = {
    "ruleType",
    "tieBreaker",
    "weightedRule"
})
public class AssessmentRule {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AssessmentRuleType ruleType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TieBreakerRuleType tieBreaker;
    protected WeightedRule weightedRule;

    /**
     * Gets the value of the ruleType property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentRuleType }
     *     
     */
    public AssessmentRuleType getRuleType() {
        return ruleType;
    }

    /**
     * Sets the value of the ruleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentRuleType }
     *     
     */
    public void setRuleType(AssessmentRuleType value) {
        this.ruleType = value;
    }

    /**
     * Gets the value of the tieBreaker property.
     * 
     * @return
     *     possible object is
     *     {@link TieBreakerRuleType }
     *     
     */
    public TieBreakerRuleType getTieBreaker() {
        return tieBreaker;
    }

    /**
     * Sets the value of the tieBreaker property.
     * 
     * @param value
     *     allowed object is
     *     {@link TieBreakerRuleType }
     *     
     */
    public void setTieBreaker(TieBreakerRuleType value) {
        this.tieBreaker = value;
    }

    /**
     * Gets the value of the weightedRule property.
     * 
     * @return
     *     possible object is
     *     {@link WeightedRule }
     *     
     */
    public WeightedRule getWeightedRule() {
        return weightedRule;
    }

    /**
     * Sets the value of the weightedRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightedRule }
     *     
     */
    public void setWeightedRule(WeightedRule value) {
        this.weightedRule = value;
    }

}
