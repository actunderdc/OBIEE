
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             IntrisicType value is  a combination of the following flags:
 * 
 *             0 - Unknown,
 *             1 - XML,
 *             2 - Text,
 *             3 - Binary,
 *             4 - Folder
 * 
 *             FolderType value is  a combination of the following flags:
 * 
 *             0 - Undefined,
 *             1 - Folder,
 *             2 - Object,
 *             3 - Expandable
 * 
 *           
 * 
 * <p>Java class for ObjectTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="intrinsicType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="categoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vpat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canBeFavorite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="editPrivilege" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customAttributes" type="{urn://oracle.bi.webservices/v12}CustomAttributes" minOccurs="0"/>
 *         &lt;element name="subTypes" type="{urn://oracle.bi.webservices/v12}SubTypes" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thumbnailsSizes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="notSearchType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="icons" type="{urn://oracle.bi.webservices/v12}ObjectIcons" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectTypes", propOrder = {
    "signature",
    "intrinsicType",
    "categoryID",
    "folderType",
    "extension",
    "vpat",
    "canBeFavorite",
    "editPrivilege",
    "customAttributes",
    "subTypes",
    "name",
    "description",
    "thumbnailsSizes",
    "notSearchType",
    "icons"
})
public class ObjectTypes {

    @XmlElement(required = true)
    protected String signature;
    protected int intrinsicType;
    protected String categoryID;
    protected Integer folderType;
    protected String extension;
    protected Boolean vpat;
    protected Boolean canBeFavorite;
    protected String editPrivilege;
    protected CustomAttributes customAttributes;
    protected SubTypes subTypes;
    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected Integer thumbnailsSizes;
    protected Boolean notSearchType;
    protected ObjectIcons icons;

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the intrinsicType property.
     * 
     */
    public int getIntrinsicType() {
        return intrinsicType;
    }

    /**
     * Sets the value of the intrinsicType property.
     * 
     */
    public void setIntrinsicType(int value) {
        this.intrinsicType = value;
    }

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the folderType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderType() {
        return folderType;
    }

    /**
     * Sets the value of the folderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderType(Integer value) {
        this.folderType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the vpat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVpat() {
        return vpat;
    }

    /**
     * Sets the value of the vpat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVpat(Boolean value) {
        this.vpat = value;
    }

    /**
     * Gets the value of the canBeFavorite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeFavorite() {
        return canBeFavorite;
    }

    /**
     * Sets the value of the canBeFavorite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeFavorite(Boolean value) {
        this.canBeFavorite = value;
    }

    /**
     * Gets the value of the editPrivilege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditPrivilege() {
        return editPrivilege;
    }

    /**
     * Sets the value of the editPrivilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditPrivilege(String value) {
        this.editPrivilege = value;
    }

    /**
     * Gets the value of the customAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CustomAttributes }
     *     
     */
    public CustomAttributes getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomAttributes }
     *     
     */
    public void setCustomAttributes(CustomAttributes value) {
        this.customAttributes = value;
    }

    /**
     * Gets the value of the subTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SubTypes }
     *     
     */
    public SubTypes getSubTypes() {
        return subTypes;
    }

    /**
     * Sets the value of the subTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubTypes }
     *     
     */
    public void setSubTypes(SubTypes value) {
        this.subTypes = value;
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
     * Gets the value of the thumbnailsSizes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThumbnailsSizes() {
        return thumbnailsSizes;
    }

    /**
     * Sets the value of the thumbnailsSizes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThumbnailsSizes(Integer value) {
        this.thumbnailsSizes = value;
    }

    /**
     * Gets the value of the notSearchType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotSearchType() {
        return notSearchType;
    }

    /**
     * Sets the value of the notSearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotSearchType(Boolean value) {
        this.notSearchType = value;
    }

    /**
     * Gets the value of the icons property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIcons }
     *     
     */
    public ObjectIcons getIcons() {
        return icons;
    }

    /**
     * Sets the value of the icons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIcons }
     *     
     */
    public void setIcons(ObjectIcons value) {
        this.icons = value;
    }

}
