
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
 *         &lt;element name="scorecardPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variableList" type="{urn://oracle.bi.webservices/v12}ScorecardVariableList"/>
 *         &lt;element name="kpiColumnList" type="{urn://oracle.bi.webservices/v12}KPIColumnList"/>
 *         &lt;element name="isDrillTo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "scorecardPath",
    "nodeID",
    "nodeType",
    "reportPath",
    "variableList",
    "kpiColumnList",
    "isDrillTo",
    "sessionID"
})
@XmlRootElement(name = "generateKPIDrillTo")
public class GenerateKPIDrillTo {

    @XmlElement(required = true)
    protected String scorecardPath;
    @XmlElement(required = true)
    protected String nodeID;
    @XmlElement(required = true)
    protected String nodeType;
    @XmlElement(required = true)
    protected String reportPath;
    @XmlElement(required = true)
    protected ScorecardVariableList variableList;
    @XmlElement(required = true)
    protected KPIColumnList kpiColumnList;
    protected boolean isDrillTo;
    @XmlElementRef(name = "sessionID", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionID;

    /**
     * Gets the value of the scorecardPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecardPath() {
        return scorecardPath;
    }

    /**
     * Sets the value of the scorecardPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecardPath(String value) {
        this.scorecardPath = value;
    }

    /**
     * Gets the value of the nodeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeID() {
        return nodeID;
    }

    /**
     * Sets the value of the nodeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeID(String value) {
        this.nodeID = value;
    }

    /**
     * Gets the value of the nodeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * Sets the value of the nodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeType(String value) {
        this.nodeType = value;
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
     * Gets the value of the variableList property.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardVariableList }
     *     
     */
    public ScorecardVariableList getVariableList() {
        return variableList;
    }

    /**
     * Sets the value of the variableList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardVariableList }
     *     
     */
    public void setVariableList(ScorecardVariableList value) {
        this.variableList = value;
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
     * Gets the value of the isDrillTo property.
     * 
     */
    public boolean isIsDrillTo() {
        return isDrillTo;
    }

    /**
     * Sets the value of the isDrillTo property.
     * 
     */
    public void setIsDrillTo(boolean value) {
        this.isDrillTo = value;
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
