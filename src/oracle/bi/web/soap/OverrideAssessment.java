
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalNormalizedAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="overriddenNormalizedAssessmentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "context",
    "originalNormalizedAssessmentResult",
    "overriddenNormalizedAssessmentResult",
    "subject",
    "comment",
    "sessionID"
})
@XmlRootElement(name = "overrideAssessment")
public class OverrideAssessment {

    @XmlElement(required = true)
    protected String context;
    protected double originalNormalizedAssessmentResult;
    protected double overriddenNormalizedAssessmentResult;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String comment;
    @XmlElementRef(name = "sessionID", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionID;

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
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionID(JAXBElement<String> value) {
        this.sessionID = value;
    }

}
