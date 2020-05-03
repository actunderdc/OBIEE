
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SAWSessionParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SAWSessionParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locale" type="{urn://oracle.bi.webservices/v12}SAWLocale"/>
 *         &lt;element name="language" type="{urn://oracle.bi.webservices/v12}SAWLocale"/>
 *         &lt;element name="userAgent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="asyncLogon" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="logonParams" type="{urn://oracle.bi.webservices/v12}LogonParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="syndicate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URLGeneratorParams" type="{urn://oracle.bi.webservices/v12}URLGeneratorParams"/>
 *         &lt;element name="userAgentLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAWSessionParameters", propOrder = {
    "locale",
    "language",
    "userAgent",
    "asyncLogon",
    "logonParams",
    "sessionID",
    "syndicate",
    "urlGeneratorParams",
    "userAgentLanguage"
})
public class SAWSessionParameters {

    @XmlElement(required = true, nillable = true)
    protected SAWLocale locale;
    @XmlElement(required = true, nillable = true)
    protected SAWLocale language;
    @XmlElement(required = true, nillable = true)
    protected String userAgent;
    protected boolean asyncLogon;
    @XmlElement(nillable = true)
    protected List<LogonParameter> logonParams;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;
    @XmlElement(required = true, nillable = true)
    protected String syndicate;
    @XmlElement(name = "URLGeneratorParams", required = true, nillable = true)
    protected URLGeneratorParams urlGeneratorParams;
    @XmlElement(required = true, nillable = true)
    protected String userAgentLanguage;

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link SAWLocale }
     *     
     */
    public SAWLocale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAWLocale }
     *     
     */
    public void setLocale(SAWLocale value) {
        this.locale = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link SAWLocale }
     *     
     */
    public SAWLocale getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAWLocale }
     *     
     */
    public void setLanguage(SAWLocale value) {
        this.language = value;
    }

    /**
     * Gets the value of the userAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the value of the userAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Gets the value of the asyncLogon property.
     * 
     */
    public boolean isAsyncLogon() {
        return asyncLogon;
    }

    /**
     * Sets the value of the asyncLogon property.
     * 
     */
    public void setAsyncLogon(boolean value) {
        this.asyncLogon = value;
    }

    /**
     * Gets the value of the logonParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logonParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogonParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogonParameter }
     * 
     * 
     */
    public List<LogonParameter> getLogonParams() {
        if (logonParams == null) {
            logonParams = new ArrayList<LogonParameter>();
        }
        return this.logonParams;
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

    /**
     * Gets the value of the syndicate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyndicate() {
        return syndicate;
    }

    /**
     * Sets the value of the syndicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyndicate(String value) {
        this.syndicate = value;
    }

    /**
     * Gets the value of the urlGeneratorParams property.
     * 
     * @return
     *     possible object is
     *     {@link URLGeneratorParams }
     *     
     */
    public URLGeneratorParams getURLGeneratorParams() {
        return urlGeneratorParams;
    }

    /**
     * Sets the value of the urlGeneratorParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLGeneratorParams }
     *     
     */
    public void setURLGeneratorParams(URLGeneratorParams value) {
        this.urlGeneratorParams = value;
    }

    /**
     * Gets the value of the userAgentLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgentLanguage() {
        return userAgentLanguage;
    }

    /**
     * Sets the value of the userAgentLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgentLanguage(String value) {
        this.userAgentLanguage = value;
    }

}
