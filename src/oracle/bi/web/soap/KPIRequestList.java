
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIRequestList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPIRequestList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kpiRequest" type="{urn://oracle.bi.webservices/v12}KPIRequest" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPIRequestList", propOrder = {
    "kpiRequest"
})
public class KPIRequestList {

    @XmlElement(required = true)
    protected List<KPIRequest> kpiRequest;

    /**
     * Gets the value of the kpiRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kpiRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKpiRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KPIRequest }
     * 
     * 
     */
    public List<KPIRequest> getKpiRequest() {
        if (kpiRequest == null) {
            kpiRequest = new ArrayList<KPIRequest>();
        }
        return this.kpiRequest;
    }

}
