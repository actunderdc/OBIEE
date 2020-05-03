
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
 *         &lt;element name="parameterADF" type="{urn://oracle.bi.webservices/v12}ReportADFParameters"/>
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
    "parameterADF"
})
@XmlRootElement(name = "getReportElementsResult")
public class GetReportElementsResult {

    @XmlElement(required = true, nillable = true)
    protected ReportADFParameters parameterADF;

    /**
     * Gets the value of the parameterADF property.
     * 
     * @return
     *     possible object is
     *     {@link ReportADFParameters }
     *     
     */
    public ReportADFParameters getParameterADF() {
        return parameterADF;
    }

    /**
     * Sets the value of the parameterADF property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportADFParameters }
     *     
     */
    public void setParameterADF(ReportADFParameters value) {
        this.parameterADF = value;
    }

}
