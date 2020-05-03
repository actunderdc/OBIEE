
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
 *         &lt;element name="scorecardView" type="{urn://oracle.bi.webservices/v12}ScorecardView"/>
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
    "scorecardView"
})
@XmlRootElement(name = "addScorecardViewResult")
public class AddScorecardViewResult {

    @XmlElement(required = true)
    protected ScorecardView scorecardView;

    /**
     * Gets the value of the scorecardView property.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardView }
     *     
     */
    public ScorecardView getScorecardView() {
        return scorecardView;
    }

    /**
     * Sets the value of the scorecardView property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardView }
     *     
     */
    public void setScorecardView(ScorecardView value) {
        this.scorecardView = value;
    }

}
