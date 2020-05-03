
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="promptRef" type="{urn://oracle.bi.webservices/v12}ReportRef"/>
 *         &lt;element name="viewState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portalPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionalParams" type="{urn://oracle.bi.webservices/v12}NameValuePair" maxOccurs="unbounded" minOccurs="0"/>
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
    "promptRef",
    "viewState",
    "viewID",
    "portalPath",
    "page",
    "optionalParams",
    "sessionID"
})
@XmlRootElement(name = "getPromptElements")
public class GetPromptElements {

    @XmlElement(required = true)
    protected ReportRef promptRef;
    @XmlElement(required = true)
    protected String viewState;
    @XmlElement(required = true)
    protected String viewID;
    @XmlElement(required = true, nillable = true)
    protected String portalPath;
    @XmlElement(required = true, nillable = true)
    protected String page;
    protected List<NameValuePair> optionalParams;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the promptRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRef }
     *     
     */
    public ReportRef getPromptRef() {
        return promptRef;
    }

    /**
     * Sets the value of the promptRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRef }
     *     
     */
    public void setPromptRef(ReportRef value) {
        this.promptRef = value;
    }

    /**
     * Gets the value of the viewState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewState() {
        return viewState;
    }

    /**
     * Sets the value of the viewState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewState(String value) {
        this.viewState = value;
    }

    /**
     * Gets the value of the viewID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewID() {
        return viewID;
    }

    /**
     * Sets the value of the viewID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewID(String value) {
        this.viewID = value;
    }

    /**
     * Gets the value of the portalPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalPath() {
        return portalPath;
    }

    /**
     * Sets the value of the portalPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalPath(String value) {
        this.portalPath = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the optionalParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getOptionalParams() {
        if (optionalParams == null) {
            optionalParams = new ArrayList<NameValuePair>();
        }
        return this.optionalParams;
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
