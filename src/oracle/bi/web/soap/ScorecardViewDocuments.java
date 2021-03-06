
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition that contains a strategy Nodes
 * 
 * <p>Java class for ScorecardViewDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScorecardViewDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scorecardView" type="{urn://oracle.bi.webservices/v12}ScorecardView" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardViewDocuments", propOrder = {
    "scorecardView"
})
public class ScorecardViewDocuments {

    protected List<ScorecardView> scorecardView;

    /**
     * Gets the value of the scorecardView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scorecardView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScorecardView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScorecardView }
     * 
     * 
     */
    public List<ScorecardView> getScorecardView() {
        if (scorecardView == null) {
            scorecardView = new ArrayList<ScorecardView>();
        }
        return this.scorecardView;
    }

}
