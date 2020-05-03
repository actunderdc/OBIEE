
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 "type" value is as following flags:
 * 
 *                 0 - Catalog Item,
 *                 1 - Folder / Category
 * 
 *                 "itemInfo" will be populated only for type = 0
 *              
 * 
 * <p>Java class for FavoriteItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FavoriteItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="catalogPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemInfo" type="{urn://oracle.bi.webservices/v12}ItemInfo" minOccurs="0"/>
 *         &lt;element name="favoriteItem" type="{urn://oracle.bi.webservices/v12}FavoriteItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FavoriteItem", propOrder = {
    "name",
    "path",
    "type",
    "catalogPath",
    "itemInfo",
    "favoriteItem"
})
public class FavoriteItem {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String path;
    @XmlSchemaType(name = "unsignedShort")
    protected int type;
    protected String catalogPath;
    protected ItemInfo itemInfo;
    protected List<FavoriteItem> favoriteItem;

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
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

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

    /**
     * Gets the value of the favoriteItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the favoriteItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFavoriteItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FavoriteItem }
     * 
     * 
     */
    public List<FavoriteItem> getFavoriteItem() {
        if (favoriteItem == null) {
            favoriteItem = new ArrayList<FavoriteItem>();
        }
        return this.favoriteItem;
    }

}
