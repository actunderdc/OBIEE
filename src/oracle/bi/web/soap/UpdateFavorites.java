
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="favoriteItem" type="{urn://oracle.bi.webservices/v12}FavoriteItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "favoriteItem",
    "sessionID"
})
@XmlRootElement(name = "updateFavorites")
public class UpdateFavorites {

    protected List<FavoriteItem> favoriteItem;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the favoriteItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the favoriteItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFavoriteItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FavoriteItem }
     * 
     * 
     */
    public List<FavoriteItem> getFavoriteItem() {
        if (favoriteItem == null) {
            favoriteItem = new ArrayList<FavoriteItem>();
        }
        return this.favoriteItem;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

}
