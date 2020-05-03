
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for URLGeneratorParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="URLGeneratorParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commandAndPageURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staticResourcesURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "URLGeneratorParams", propOrder = {
    "commandAndPageURL",
    "staticResourcesURL"
})
public class URLGeneratorParams {

    @XmlElement(required = true)
    protected String commandAndPageURL;
    @XmlElement(required = true)
    protected String staticResourcesURL;

    /**
     * Gets the value of the commandAndPageURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandAndPageURL() {
        return commandAndPageURL;
    }

    /**
     * Sets the value of the commandAndPageURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandAndPageURL(String value) {
        this.commandAndPageURL = value;
    }

    /**
     * Gets the value of the staticResourcesURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticResourcesURL() {
        return staticResourcesURL;
    }

    /**
     * Sets the value of the staticResourcesURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticResourcesURL(String value) {
        this.staticResourcesURL = value;
    }

}
