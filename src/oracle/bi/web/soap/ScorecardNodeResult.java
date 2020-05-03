
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardNodeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScorecardNodeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeType" type="{urn://oracle.bi.webservices/v12}ScorecardNodeType"/>
 *         &lt;element name="normalizedAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="formattedNormalizedAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="assessmentResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectContext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isAnnotated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isOverridden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overriddenAssessment" type="{urn://oracle.bi.webservices/v12}OverriddenAssessment" minOccurs="0"/>
 *         &lt;element name="kpiResult" type="{urn://oracle.bi.webservices/v12}KPIResult" minOccurs="0"/>
 *         &lt;element name="validActionLinks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardNodeResult", propOrder = {
    "nodeID",
    "nodeType",
    "normalizedAssessmentResult",
    "formattedNormalizedAssessmentResult",
    "assessmentResult",
    "objectContext",
    "isAnnotated",
    "isOverridden",
    "overriddenAssessment",
    "kpiResult",
    "validActionLinks"
})
public class ScorecardNodeResult {

    @XmlElement(required = true)
    protected String nodeID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ScorecardNodeType nodeType;
    protected double normalizedAssessmentResult;
    @XmlElement(required = true)
    protected String formattedNormalizedAssessmentResult;
    @XmlElement(required = true)
    protected String assessmentResult;
    @XmlElement(required = true)
    protected String objectContext;
    protected boolean isAnnotated;
    protected boolean isOverridden;
    protected OverriddenAssessment overriddenAssessment;
    protected KPIResult kpiResult;
    @XmlElementRef(name = "validActionLinks", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validActionLinks;

    /**
     * Gets the value of the nodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the nodeType property.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardNodeType }
     *     
     */
    public ScorecardNodeType getNodeType() {
        return nodeType;
    }

    /**
     * Sets the value of the nodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardNodeType }
     *     
     */
    public void setNodeType(ScorecardNodeType value) {
        this.nodeType = value;
    }

    /**
     * Gets the value of the normalizedAssessmentResult property.
     * 
     */
    public double getNormalizedAssessmentResult() {
        return normalizedAssessmentResult;
    }

    /**
     * Sets the value of the normalizedAssessmentResult property.
     * 
     */
    public void setNormalizedAssessmentResult(double value) {
        this.normalizedAssessmentResult = value;
    }

    /**
     * Gets the value of the formattedNormalizedAssessmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedNormalizedAssessmentResult() {
        return formattedNormalizedAssessmentResult;
    }

    /**
     * Sets the value of the formattedNormalizedAssessmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedNormalizedAssessmentResult(String value) {
        this.formattedNormalizedAssessmentResult = value;
    }

    /**
     * Gets the value of the assessmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentResult() {
        return assessmentResult;
    }

    /**
     * Sets the value of the assessmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentResult(String value) {
        this.assessmentResult = value;
    }

    /**
     * Gets the value of the objectContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectContext() {
        return objectContext;
    }

    /**
     * Sets the value of the objectContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectContext(String value) {
        this.objectContext = value;
    }

    /**
     * Gets the value of the isAnnotated property.
     * 
     */
    public boolean isIsAnnotated() {
        return isAnnotated;
    }

    /**
     * Sets the value of the isAnnotated property.
     * 
     */
    public void setIsAnnotated(boolean value) {
        this.isAnnotated = value;
    }

    /**
     * Gets the value of the isOverridden property.
     * 
     */
    public boolean isIsOverridden() {
        return isOverridden;
    }

    /**
     * Sets the value of the isOverridden property.
     * 
     */
    public void setIsOverridden(boolean value) {
        this.isOverridden = value;
    }

    /**
     * Gets the value of the overriddenAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link OverriddenAssessment }
     *     
     */
    public OverriddenAssessment getOverriddenAssessment() {
        return overriddenAssessment;
    }

    /**
     * Sets the value of the overriddenAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverriddenAssessment }
     *     
     */
    public void setOverriddenAssessment(OverriddenAssessment value) {
        this.overriddenAssessment = value;
    }

    /**
     * Gets the value of the kpiResult property.
     * 
     * @return
     *     possible object is
     *     {@link KPIResult }
     *     
     */
    public KPIResult getKpiResult() {
        return kpiResult;
    }

    /**
     * Sets the value of the kpiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPIResult }
     *     
     */
    public void setKpiResult(KPIResult value) {
        this.kpiResult = value;
    }

    /**
     * Gets the value of the validActionLinks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidActionLinks() {
        return validActionLinks;
    }

    /**
     * Sets the value of the validActionLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidActionLinks(JAXBElement<String> value) {
        this.validActionLinks = value;
    }

}
