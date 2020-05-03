
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                attributes field value is  a combination of the following flags:
 *                1 - read only,
 *                2 - archive,
 *                4 - hidden,
 *                8 - system,
 *                16 - dont index
 * 
 *                operationPermissions field value is  a combination of the following flags:
 *                1 - kOpRead (The ability to read the object or retrieve a listing of directories)
 *                2 - kOpWrite (The ability to replace an item, or write to a directory)
 *                4 - kOpDelete (The ability to delete an item, or remove a directory (does not check for items in a directory))
 *                8 - kOpChangePermissions (The ability to change permissions on the item or folder)
 *                16 - kOpSetOwnership (The ability to set ownership)
 *                32 - kOpRename
 *                64 - kOpSeePermissions (UNUSED (ie fixed getItemACL :))
 *                128 - kOpSetProperties
 *                256 - kOpGetProperties (UNUSED)
 *                512 - kOpDeleteRenameSubItems (UNUSED)
 *                4096 - kOpSetAttributes (Set read, system, hidden... attributes // UNUSED)
 *                8192 - kOpPublisherRunLive (to open (run) BI-P reports.)
 *                16384 - kOpPublisherSchedule (to schedule BI-P reports.)
 *                32768 - kOpPublisherViewOutput (view history of BI-P repots.)
 *                65535 - kOpAllOperations=65535
 *              
 * 
 * <p>Java class for ItemInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{urn://oracle.bi.webservices/v12}ItemInfoType"/>
 *         &lt;element name="caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="accessed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="executed" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creator" type="{urn://oracle.bi.webservices/v12}Account" minOccurs="0"/>
 *         &lt;element name="lastModifier" type="{urn://oracle.bi.webservices/v12}Account" minOccurs="0"/>
 *         &lt;element name="accessor" type="{urn://oracle.bi.webservices/v12}Account" minOccurs="0"/>
 *         &lt;element name="executor" type="{urn://oracle.bi.webservices/v12}Account" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acl" type="{urn://oracle.bi.webservices/v12}ACL" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn://oracle.bi.webservices/v12}Account" minOccurs="0"/>
 *         &lt;element name="itemProperties" type="{urn://oracle.bi.webservices/v12}NameValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operationPermissions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="itemInternalProperties" type="{urn://oracle.bi.webservices/v12}NameValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contentState" type="{urn://oracle.bi.webservices/v12}ContentStateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInfo", propOrder = {
    "path",
    "type",
    "caption",
    "description",
    "attributes",
    "size",
    "lastModified",
    "created",
    "accessed",
    "executed",
    "creator",
    "lastModifier",
    "accessor",
    "executor",
    "signature",
    "targetPath",
    "acl",
    "owner",
    "itemProperties",
    "operationPermissions",
    "itemInternalProperties",
    "contentState"
})
public class ItemInfo {

    @XmlElement(required = true)
    protected String path;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ItemInfoType type;
    protected String caption;
    protected String description;
    protected Integer attributes;
    protected Integer size;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accessed;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executed;
    protected Account creator;
    protected Account lastModifier;
    protected Account accessor;
    protected Account executor;
    protected String signature;
    protected String targetPath;
    protected ACL acl;
    protected Account owner;
    protected List<NameValuePair> itemProperties;
    protected Integer operationPermissions;
    protected List<NameValuePair> itemInternalProperties;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ContentStateType contentState;

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
     * @return
     *     possible object is
     *     {@link ItemInfoType }
     *     
     */
    public ItemInfoType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInfoType }
     *     
     */
    public void setType(ItemInfoType value) {
        this.type = value;
    }

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
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAttributes(Integer value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the accessed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccessed() {
        return accessed;
    }

    /**
     * Sets the value of the accessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccessed(XMLGregorianCalendar value) {
        this.accessed = value;
    }

    /**
     * Gets the value of the executed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecuted() {
        return executed;
    }

    /**
     * Sets the value of the executed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecuted(XMLGregorianCalendar value) {
        this.executed = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setCreator(Account value) {
        this.creator = value;
    }

    /**
     * Gets the value of the lastModifier property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getLastModifier() {
        return lastModifier;
    }

    /**
     * Sets the value of the lastModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setLastModifier(Account value) {
        this.lastModifier = value;
    }

    /**
     * Gets the value of the accessor property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccessor() {
        return accessor;
    }

    /**
     * Sets the value of the accessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccessor(Account value) {
        this.accessor = value;
    }

    /**
     * Gets the value of the executor property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getExecutor() {
        return executor;
    }

    /**
     * Sets the value of the executor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setExecutor(Account value) {
        this.executor = value;
    }

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
     * Gets the value of the targetPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * Sets the value of the targetPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPath(String value) {
        this.targetPath = value;
    }

    /**
     * Gets the value of the acl property.
     * 
     * @return
     *     possible object is
     *     {@link ACL }
     *     
     */
    public ACL getAcl() {
        return acl;
    }

    /**
     * Sets the value of the acl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACL }
     *     
     */
    public void setAcl(ACL value) {
        this.acl = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setOwner(Account value) {
        this.owner = value;
    }

    /**
     * Gets the value of the itemProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getItemProperties() {
        if (itemProperties == null) {
            itemProperties = new ArrayList<NameValuePair>();
        }
        return this.itemProperties;
    }

    /**
     * Gets the value of the operationPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationPermissions() {
        return operationPermissions;
    }

    /**
     * Sets the value of the operationPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationPermissions(Integer value) {
        this.operationPermissions = value;
    }

    /**
     * Gets the value of the itemInternalProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInternalProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInternalProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getItemInternalProperties() {
        if (itemInternalProperties == null) {
            itemInternalProperties = new ArrayList<NameValuePair>();
        }
        return this.itemInternalProperties;
    }

    /**
     * Gets the value of the contentState property.
     * 
     * @return
     *     possible object is
     *     {@link ContentStateType }
     *     
     */
    public ContentStateType getContentState() {
        return contentState;
    }

    /**
     * Sets the value of the contentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentStateType }
     *     
     */
    public void setContentState(ContentStateType value) {
        this.contentState = value;
    }

}
