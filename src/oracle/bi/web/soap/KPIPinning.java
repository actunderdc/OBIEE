
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIPinning complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPIPinning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kpiDimensionPinning" type="{urn://oracle.bi.webservices/v12}KPIDimensionPinning" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPIPinning", propOrder = {
    "kpiDimensionPinning"
})
public class KPIPinning {

    protected List<KPIDimensionPinning> kpiDimensionPinning;

    /**
     * Gets the value of the kpiDimensionPinning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kpiDimensionPinning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKpiDimensionPinning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KPIDimensionPinning }
     * 
     * 
     */
    public List<KPIDimensionPinning> getKpiDimensionPinning() {
        if (kpiDimensionPinning == null) {
            kpiDimensionPinning = new ArrayList<KPIDimensionPinning>();
        }
        return this.kpiDimensionPinning;
    }

}
