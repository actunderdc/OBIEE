
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition that contains a Perspective
 * 
 * <p>Java class for PerspectiveList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerspectiveList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="perspective" type="{urn://oracle.bi.webservices/v12}Perspective" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerspectiveList", propOrder = {
    "perspective"
})
public class PerspectiveList {

    protected List<Perspective> perspective;

    /**
     * Gets the value of the perspective property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perspective property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerspective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Perspective }
     * 
     * 
     */
    public List<Perspective> getPerspective() {
        if (perspective == null) {
            perspective = new ArrayList<Perspective>();
        }
        return this.perspective;
    }

}
