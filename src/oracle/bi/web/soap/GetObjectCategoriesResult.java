
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="objectCategory" type="{urn://oracle.bi.webservices/v12}ObjectCategory" maxOccurs="unbounded" minOccurs="0"/>
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
    "objectCategory"
})
@XmlRootElement(name = "getObjectCategoriesResult")
public class GetObjectCategoriesResult {

    protected List<ObjectCategory> objectCategory;

    /**
     * Gets the value of the objectCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectCategory }
     * 
     * 
     */
    public List<ObjectCategory> getObjectCategory() {
        if (objectCategory == null) {
            objectCategory = new ArrayList<ObjectCategory>();
        }
        return this.objectCategory;
    }

}
