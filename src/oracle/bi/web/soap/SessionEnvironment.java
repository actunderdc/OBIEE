
package oracle.bi.web.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionEnvironment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionEnvironment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="homeDirectory" type="{urn://oracle.bi.webservices/v12}ItemInfo"/>
 *         &lt;element name="locale" type="{urn://oracle.bi.webservices/v12}SAWLocale" minOccurs="0"/>
 *         &lt;element name="language" type="{urn://oracle.bi.webservices/v12}SAWLocale" minOccurs="0"/>
 *         &lt;element name="timezoneid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sharedDirectories" type="{urn://oracle.bi.webservices/v12}ItemInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sessionExpireMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionEnvironment", propOrder = {
    "userName",
    "homeDirectory",
    "locale",
    "language",
    "timezoneid",
    "sharedDirectories",
    "sessionExpireMinutes"
})
public class SessionEnvironment {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected ItemInfo homeDirectory;
    protected SAWLocale locale;
    protected SAWLocale language;
    protected String timezoneid;
    protected List<ItemInfo> sharedDirectories;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sessionExpireMinutes;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the homeDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInfo }
     *     
     */
    public ItemInfo getHomeDirectory() {
        return homeDirectory;
    }

    /**
     * Sets the value of the homeDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfo }
     *     
     */
    public void setHomeDirectory(ItemInfo value) {
        this.homeDirectory = value;
    }

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
     * Gets the value of the timezoneid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneid() {
        return timezoneid;
    }

    /**
     * Sets the value of the timezoneid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneid(String value) {
        this.timezoneid = value;
    }

    /**
     * Gets the value of the sharedDirectories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedDirectories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedDirectories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInfo }
     * 
     * 
     */
    public List<ItemInfo> getSharedDirectories() {
        if (sharedDirectories == null) {
            sharedDirectories = new ArrayList<ItemInfo>();
        }
        return this.sharedDirectories;
    }

    /**
     * Gets the value of the sessionExpireMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSessionExpireMinutes() {
        return sessionExpireMinutes;
    }

    /**
     * Sets the value of the sessionExpireMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSessionExpireMinutes(BigInteger value) {
        this.sessionExpireMinutes = value;
    }

}
