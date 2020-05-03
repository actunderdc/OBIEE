
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creatableItem" type="{urn://oracle.bi.webservices/v12}CreatableItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iconMedium" type="{urn://oracle.bi.webservices/v12}ObjectIcon" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectGroup", propOrder = {
    "creatableItem",
    "name",
    "iconMedium",
    "description"
})
public class ObjectGroup {

    protected List<CreatableItem> creatableItem;
    protected String name;
    protected ObjectIcon iconMedium;
    protected String description;

    /**
     * Gets the value of the creatableItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creatableItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatableItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreatableItem }
     * 
     * 
     */
    public List<CreatableItem> getCreatableItem() {
        if (creatableItem == null) {
            creatableItem = new ArrayList<CreatableItem>();
        }
        return this.creatableItem;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the iconMedium property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIcon }
     *     
     */
    public ObjectIcon getIconMedium() {
        return iconMedium;
    }

    /**
     * Sets the value of the iconMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIcon }
     *     
     */
    public void setIconMedium(ObjectIcon value) {
        this.iconMedium = value;
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

}
