
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenameAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenameAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oldAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenameAccount", propOrder = {
    "oldAccountName",
    "newAccountName",
    "accountType"
})
public class RenameAccount {

    @XmlElement(required = true)
    protected String oldAccountName;
    @XmlElement(required = true)
    protected String newAccountName;
    protected int accountType;

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

}
