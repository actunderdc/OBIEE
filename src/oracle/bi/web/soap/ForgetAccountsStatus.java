
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 status field tells the status of overall delete accounts operation.
 *                 status values:
 *                 0 - Success
 *                 1 - Error
 * 
 *                 accountsResult field is Account Name with Success/Fail message for each account.
 *              
 * 
 * <p>Java class for ForgetAccountsStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForgetAccountsStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accountsResult" type="{urn://oracle.bi.webservices/v12}ForgetAccountResult" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForgetAccountsStatus", propOrder = {
    "status",
    "accountsResult"
})
public class ForgetAccountsStatus {

    protected int status;
    @XmlElement(required = true)
    protected List<ForgetAccountResult> accountsResult;

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the accountsResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountsResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForgetAccountResult }
     * 
     * 
     */
    public List<ForgetAccountResult> getAccountsResult() {
        if (accountsResult == null) {
            accountsResult = new ArrayList<ForgetAccountResult>();
        }
        return this.accountsResult;
    }

}
