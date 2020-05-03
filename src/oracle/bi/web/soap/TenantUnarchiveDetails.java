
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TenantUnarchiveDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenantUnarchiveDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="srcTenantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetTenantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unarchivePaths" type="{urn://oracle.bi.webservices/v12}UnarchivePathType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenantUnarchiveDetails", propOrder = {
    "srcTenantId",
    "targetTenantId",
    "unarchivePaths"
})
public class TenantUnarchiveDetails {

    @XmlElement(required = true)
    protected String srcTenantId;
    @XmlElement(required = true, nillable = true)
    protected String targetTenantId;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<UnarchivePathType> unarchivePaths;

    /**
     * Gets the value of the srcTenantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcTenantId() {
        return srcTenantId;
    }

    /**
     * Sets the value of the srcTenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcTenantId(String value) {
        this.srcTenantId = value;
    }

    /**
     * Gets the value of the targetTenantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetTenantId() {
        return targetTenantId;
    }

    /**
     * Sets the value of the targetTenantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetTenantId(String value) {
        this.targetTenantId = value;
    }

    /**
     * Gets the value of the unarchivePaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unarchivePaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnarchivePaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnarchivePathType }
     * 
     * 
     */
    public List<UnarchivePathType> getUnarchivePaths() {
        if (unarchivePaths == null) {
            unarchivePaths = new ArrayList<UnarchivePathType>();
        }
        return this.unarchivePaths;
    }

}
