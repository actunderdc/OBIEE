
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountsStatus" type="{urn://oracle.bi.webservices/v12}ForgetAccountsStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountsStatus"
})
@XmlRootElement(name = "forgetAccountsExResult")
public class ForgetAccountsExResult {

    @XmlElement(required = true)
    protected ForgetAccountsStatus accountsStatus;

    /**
     * Gets the value of the accountsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ForgetAccountsStatus }
     *     
     */
    public ForgetAccountsStatus getAccountsStatus() {
        return accountsStatus;
    }

    /**
     * Sets the value of the accountsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForgetAccountsStatus }
     *     
     */
    public void setAccountsStatus(ForgetAccountsStatus value) {
        this.accountsStatus = value;
    }

}
