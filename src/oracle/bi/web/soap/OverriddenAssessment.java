
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OverriddenAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverriddenAssessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalNormalizedAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="originalAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="computedNormalizedAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="computedAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overriddenNormalizedAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="overriddenAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overriddenTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="overriddenTimeDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverriddenAssessment", propOrder = {
    "context",
    "originalNormalizedAssessmentResult",
    "originalAssessmentResult",
    "computedNormalizedAssessmentResult",
    "computedAssessmentResult",
    "overriddenNormalizedAssessmentResult",
    "overriddenAssessmentResult",
    "user",
    "overriddenTime",
    "subject",
    "comment",
    "overriddenTimeDisplay"
})
public class OverriddenAssessment {

    @XmlElement(required = true)
    protected String context;
    protected double originalNormalizedAssessmentResult;
    @XmlElement(required = true)
    protected String originalAssessmentResult;
    protected double computedNormalizedAssessmentResult;
    @XmlElement(required = true)
    protected String computedAssessmentResult;
    protected double overriddenNormalizedAssessmentResult;
    @XmlElement(required = true)
    protected String overriddenAssessmentResult;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar overriddenTime;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String comment;
    @XmlElementRef(name = "overriddenTimeDisplay", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overriddenTimeDisplay;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the originalNormalizedAssessmentResult property.
     * 
     */
    public double getOriginalNormalizedAssessmentResult() {
        return originalNormalizedAssessmentResult;
    }

    /**
     * Sets the value of the originalNormalizedAssessmentResult property.
     * 
     */
    public void setOriginalNormalizedAssessmentResult(double value) {
        this.originalNormalizedAssessmentResult = value;
    }

    /**
     * Gets the value of the originalAssessmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalAssessmentResult() {
        return originalAssessmentResult;
    }

    /**
     * Sets the value of the originalAssessmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalAssessmentResult(String value) {
        this.originalAssessmentResult = value;
    }

    /**
     * Gets the value of the computedNormalizedAssessmentResult property.
     * 
     */
    public double getComputedNormalizedAssessmentResult() {
        return computedNormalizedAssessmentResult;
    }

    /**
     * Sets the value of the computedNormalizedAssessmentResult property.
     * 
     */
    public void setComputedNormalizedAssessmentResult(double value) {
        this.computedNormalizedAssessmentResult = value;
    }

    /**
     * Gets the value of the computedAssessmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputedAssessmentResult() {
        return computedAssessmentResult;
    }

    /**
     * Sets the value of the computedAssessmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputedAssessmentResult(String value) {
        this.computedAssessmentResult = value;
    }

    /**
     * Gets the value of the overriddenNormalizedAssessmentResult property.
     * 
     */
    public double getOverriddenNormalizedAssessmentResult() {
        return overriddenNormalizedAssessmentResult;
    }

    /**
     * Sets the value of the overriddenNormalizedAssessmentResult property.
     * 
     */
    public void setOverriddenNormalizedAssessmentResult(double value) {
        this.overriddenNormalizedAssessmentResult = value;
    }

    /**
     * Gets the value of the overriddenAssessmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverriddenAssessmentResult() {
        return overriddenAssessmentResult;
    }

    /**
     * Sets the value of the overriddenAssessmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverriddenAssessmentResult(String value) {
        this.overriddenAssessmentResult = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the overriddenTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOverriddenTime() {
        return overriddenTime;
    }

    /**
     * Sets the value of the overriddenTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOverriddenTime(XMLGregorianCalendar value) {
        this.overriddenTime = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the overriddenTimeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverriddenTimeDisplay() {
        return overriddenTimeDisplay;
    }

    /**
     * Sets the value of the overriddenTimeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverriddenTimeDisplay(JAXBElement<String> value) {
        this.overriddenTimeDisplay = value;
    }

}
