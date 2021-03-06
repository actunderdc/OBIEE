
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="subjectAreaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detailsLevel" type="{urn://oracle.bi.webservices/v12}SASubjectAreaDetails"/>
 *         &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortOrderCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "subjectAreaName",
    "detailsLevel",
    "sortOrder",
    "sortOrderCaseSensitive",
    "sessionID"
})
@XmlRootElement(name = "describeSubjectAreaWithSort")
public class DescribeSubjectAreaWithSort {

    @XmlElement(required = true)
    protected String subjectAreaName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SASubjectAreaDetails detailsLevel;
    @XmlElementRef(name = "sortOrder", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sortOrder;
    @XmlElementRef(name = "sortOrderCaseSensitive", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sortOrderCaseSensitive;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the subjectAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectAreaName() {
        return subjectAreaName;
    }

    /**
     * Sets the value of the subjectAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectAreaName(String value) {
        this.subjectAreaName = value;
    }

    /**
     * Gets the value of the detailsLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SASubjectAreaDetails }
     *     
     */
    public SASubjectAreaDetails getDetailsLevel() {
        return detailsLevel;
    }

    /**
     * Sets the value of the detailsLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SASubjectAreaDetails }
     *     
     */
    public void setDetailsLevel(SASubjectAreaDetails value) {
        this.detailsLevel = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSortOrder(JAXBElement<String> value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the sortOrderCaseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSortOrderCaseSensitive() {
        return sortOrderCaseSensitive;
    }

    /**
     * Sets the value of the sortOrderCaseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSortOrderCaseSensitive(JAXBElement<String> value) {
        this.sortOrderCaseSensitive = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

}
