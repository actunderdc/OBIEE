
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MRUItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MRUItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalogPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isFavorite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="itemInfo" type="{urn://oracle.bi.webservices/v12}ItemInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MRUItem", propOrder = {
    "catalogPath",
    "isFavorite",
    "itemInfo"
})
public class MRUItem {

    @XmlElement(required = true)
    protected String catalogPath;
    protected boolean isFavorite;
    @XmlElement(required = true)
    protected ItemInfo itemInfo;

    /**
     * Gets the value of the catalogPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogPath() {
        return catalogPath;
    }

    /**
     * Sets the value of the catalogPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogPath(String value) {
        this.catalogPath = value;
    }

    /**
     * Gets the value of the isFavorite property.
     * 
     */
    public boolean isIsFavorite() {
        return isFavorite;
    }

    /**
     * Sets the value of the isFavorite property.
     * 
     */
    public void setIsFavorite(boolean value) {
        this.isFavorite = value;
    }

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInfo }
     *     
     */
    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfo }
     *     
     */
    public void setItemInfo(ItemInfo value) {
        this.itemInfo = value;
    }

}
