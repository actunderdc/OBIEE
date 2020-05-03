
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArchiveOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchiveOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tenantsToArchive" type="{urn://oracle.bi.webservices/v12}TenantArchiveDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchiveOptions", propOrder = {
    "tenantsToArchive"
})
public class ArchiveOptions {

    @XmlElement(nillable = true)
    protected List<TenantArchiveDetails> tenantsToArchive;

    /**
     * Gets the value of the tenantsToArchive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenantsToArchive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenantsToArchive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenantArchiveDetails }
     * 
     * 
     */
    public List<TenantArchiveDetails> getTenantsToArchive() {
        if (tenantsToArchive == null) {
            tenantsToArchive = new ArrayList<TenantArchiveDetails>();
        }
        return this.tenantsToArchive;
    }

}
