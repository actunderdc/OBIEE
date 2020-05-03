
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPIResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kpiResultColumn" type="{urn://oracle.bi.webservices/v12}KPIResultColumn" maxOccurs="11" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPIResult", propOrder = {
    "kpiResultColumn"
})
public class KPIResult {

    protected List<KPIResultColumn> kpiResultColumn;

    /**
     * Gets the value of the kpiResultColumn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kpiResultColumn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKpiResultColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KPIResultColumn }
     * 
     * 
     */
    public List<KPIResultColumn> getKpiResultColumn() {
        if (kpiResultColumn == null) {
            kpiResultColumn = new ArrayList<KPIResultColumn>();
        }
        return this.kpiResultColumn;
    }

}
