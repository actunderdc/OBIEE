
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition that contains a Pinned KPI
 * 
 * <p>Java class for PinnedKPI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinnedKPI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kpiPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pinning" type="{urn://oracle.bi.webservices/v12}KPIPinning"/>
 *         &lt;element name="obj" type="{urn://oracle.bi.webservices/v12}CatalogObject" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PinnedKPI", propOrder = {
    "caption",
    "description",
    "kpiPath",
    "pinning",
    "obj",
    "permission"
})
public class PinnedKPI {

    @XmlElement(required = true)
    protected String caption;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String kpiPath;
    @XmlElement(required = true)
    protected KPIPinning pinning;
    @XmlElementRef(name = "obj", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<CatalogObject> obj;
    @XmlElementRef(name = "permission", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> permission;

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the kpiPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiPath() {
        return kpiPath;
    }

    /**
     * Sets the value of the kpiPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiPath(String value) {
        this.kpiPath = value;
    }

    /**
     * Gets the value of the pinning property.
     * 
     * @return
     *     possible object is
     *     {@link KPIPinning }
     *     
     */
    public KPIPinning getPinning() {
        return pinning;
    }

    /**
     * Sets the value of the pinning property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPIPinning }
     *     
     */
    public void setPinning(KPIPinning value) {
        this.pinning = value;
    }

    /**
     * Gets the value of the obj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CatalogObject }{@code >}
     *     
     */
    public JAXBElement<CatalogObject> getObj() {
        return obj;
    }

    /**
     * Sets the value of the obj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CatalogObject }{@code >}
     *     
     */
    public void setObj(JAXBElement<CatalogObject> value) {
        this.obj = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPermission(JAXBElement<Integer> value) {
        this.permission = value;
    }

}
