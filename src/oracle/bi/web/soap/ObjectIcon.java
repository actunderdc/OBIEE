
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectIcon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectIcon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iconType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iconPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectIcon", propOrder = {
    "iconType",
    "iconPath"
})
public class ObjectIcon {

    @XmlElement(required = true)
    protected String iconType;
    @XmlElement(required = true)
    protected String iconPath;

    /**
     * Gets the value of the iconType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconType() {
        return iconType;
    }

    /**
     * Sets the value of the iconType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconType(String value) {
        this.iconType = value;
    }

    /**
     * Gets the value of the iconPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconPath() {
        return iconPath;
    }

    /**
     * Sets the value of the iconPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconPath(String value) {
        this.iconPath = value;
    }

}
