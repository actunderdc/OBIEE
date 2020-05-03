
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnotationStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnotationStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="context" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="annotationsList" type="{urn://oracle.bi.webservices/v12}AnnotationsList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationStatus", propOrder = {
    "context",
    "success",
    "annotationsList"
})
public class AnnotationStatus {

    @XmlElement(required = true)
    protected String context;
    protected boolean success;
    @XmlElement(required = true)
    protected AnnotationsList annotationsList;

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
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the annotationsList property.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationsList }
     *     
     */
    public AnnotationsList getAnnotationsList() {
        return annotationsList;
    }

    /**
     * Sets the value of the annotationsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationsList }
     *     
     */
    public void setAnnotationsList(AnnotationsList value) {
        this.annotationsList = value;
    }

}
