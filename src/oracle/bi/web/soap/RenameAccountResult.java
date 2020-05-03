
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 status field tells the status of rename operation.
 *                 status values:
 *                 0 - Success
 *                 1 - Error
 *              
 * 
 * <p>Java class for RenameAccountResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenameAccountResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenameAccountResult", propOrder = {
    "oldAccountName",
    "newAccountName",
    "accountType",
    "status"
})
public class RenameAccountResult {

    @XmlElement(required = true)
    protected String oldAccountName;
    @XmlElement(required = true)
    protected String newAccountName;
    protected int accountType;
    protected int status;

    /**
     * Gets the value of the oldAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldAccountName() {
        return oldAccountName;
    }

    /**
     * Sets the value of the oldAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldAccountName(String value) {
        this.oldAccountName = value;
    }

    /**
     * Gets the value of the newAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAccountName() {
        return newAccountName;
    }

    /**
     * Sets the value of the newAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAccountName(String value) {
        this.newAccountName = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     */
    public int getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     */
    public void setAccountType(int value) {
        this.accountType = value;
    }

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

}
