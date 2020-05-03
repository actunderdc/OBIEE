
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="kpiRequest" type="{urn://oracle.bi.webservices/v12}KPIRequest"/>
 *         &lt;element name="kpiColumnList" type="{urn://oracle.bi.webservices/v12}KPIColumnList"/>
 *         &lt;element name="kpiVariableList" type="{urn://oracle.bi.webservices/v12}KPIVariableList"/>
 *         &lt;element name="reportPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "kpiRequest",
    "kpiColumnList",
    "kpiVariableList",
    "reportPath",
    "sessionID"
})
@XmlRootElement(name = "generateDrillTo")
public class GenerateDrillTo {

    @XmlElement(required = true)
    protected KPIRequest kpiRequest;
    @XmlElement(required = true)
    protected KPIColumnList kpiColumnList;
    @XmlElement(required = true)
    protected KPIVariableList kpiVariableList;
    @XmlElement(required = true)
    protected String reportPath;
    @XmlElementRef(name = "sessionID", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionID;

    /**
     * Gets the value of the kpiRequest property.
     * 
     * @return
     *     possible object is
     *     {@link KPIRequest }
     *     
     */
    public KPIRequest getKpiRequest() {
        return kpiRequest;
    }

    /**
     * Sets the value of the kpiRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPIRequest }
     *     
     */
    public void setKpiRequest(KPIRequest value) {
        this.kpiRequest = value;
    }

    /**
     * Gets the value of the kpiColumnList property.
     * 
     * @return
     *     possible object is
     *     {@link KPIColumnList }
     *     
     */
    public KPIColumnList getKpiColumnList() {
        return kpiColumnList;
    }

    /**
     * Sets the value of the kpiColumnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPIColumnList }
     *     
     */
    public void setKpiColumnList(KPIColumnList value) {
        this.kpiColumnList = value;
    }

    /**
     * Gets the value of the kpiVariableList property.
     * 
     * @return
     *     possible object is
     *     {@link KPIVariableList }
     *     
     */
    public KPIVariableList getKpiVariableList() {
        return kpiVariableList;
    }

    /**
     * Sets the value of the kpiVariableList property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPIVariableList }
     *     
     */
    public void setKpiVariableList(KPIVariableList value) {
        this.kpiVariableList = value;
    }

    /**
     * Gets the value of the reportPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportPath() {
        return reportPath;
    }

    /**
     * Sets the value of the reportPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportPath(String value) {
        this.reportPath = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionID(JAXBElement<String> value) {
        this.sessionID = value;
    }

}
