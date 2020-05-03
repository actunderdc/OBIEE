
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PasteItem2Params complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PasteItem2Params">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saveAsName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="replaceReference" type="{urn://oracle.bi.webservices/v12}NameValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PasteItem2Params", propOrder = {
    "saveAsName",
    "replaceReference"
})
public class PasteItem2Params {

    @XmlElement(required = true, nillable = true)
    protected String saveAsName;
    protected List<NameValuePair> replaceReference;

    /**
     * Gets the value of the saveAsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveAsName() {
        return saveAsName;
    }

    /**
     * Sets the value of the saveAsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveAsName(String value) {
        this.saveAsName = value;
    }

    /**
     * Gets the value of the replaceReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replaceReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplaceReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getReplaceReference() {
        if (replaceReference == null) {
            replaceReference = new ArrayList<NameValuePair>();
        }
        return this.replaceReference;
    }

}
