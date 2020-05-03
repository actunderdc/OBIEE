
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestoreOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestoreOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tenantsToUnarchive" type="{urn://oracle.bi.webservices/v12}TenantUnarchiveDetails" maxOccurs="unbounded"/>
 *         &lt;element name="flagOverwrite" type="{urn://oracle.bi.webservices/v12}ReplaceType"/>
 *         &lt;element name="flagACL" type="{urn://oracle.bi.webservices/v12}ACLOptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestoreOptions", propOrder = {
    "tenantsToUnarchive",
    "flagOverwrite",
    "flagACL"
})
public class RestoreOptions {

    @XmlElement(required = true)
    protected List<TenantUnarchiveDetails> tenantsToUnarchive;
    @XmlElement(required = true, defaultValue = "ReplaceClean")
    @XmlSchemaType(name = "string")
    protected ReplaceType flagOverwrite;
    @XmlElement(defaultValue = "ACLPreserveAndDoNotScrubGuids")
    @XmlSchemaType(name = "string")
    protected ACLOptionType flagACL;

    /**
     * Gets the value of the tenantsToUnarchive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenantsToUnarchive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenantsToUnarchive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenantUnarchiveDetails }
     * 
     * 
     */
    public List<TenantUnarchiveDetails> getTenantsToUnarchive() {
        if (tenantsToUnarchive == null) {
            tenantsToUnarchive = new ArrayList<TenantUnarchiveDetails>();
        }
        return this.tenantsToUnarchive;
    }

    /**
     * Gets the value of the flagOverwrite property.
     * 
     * @return
     *     possible object is
     *     {@link ReplaceType }
     *     
     */
    public ReplaceType getFlagOverwrite() {
        return flagOverwrite;
    }

    /**
     * Sets the value of the flagOverwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplaceType }
     *     
     */
    public void setFlagOverwrite(ReplaceType value) {
        this.flagOverwrite = value;
    }

    /**
     * Gets the value of the flagACL property.
     * 
     * @return
     *     possible object is
     *     {@link ACLOptionType }
     *     
     */
    public ACLOptionType getFlagACL() {
        return flagACL;
    }

    /**
     * Sets the value of the flagACL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACLOptionType }
     *     
     */
    public void setFlagACL(ACLOptionType value) {
        this.flagACL = value;
    }

}
