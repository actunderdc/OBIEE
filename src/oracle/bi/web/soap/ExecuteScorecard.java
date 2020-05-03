
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
 *         &lt;element name="executionOptions" type="{urn://oracle.bi.webservices/v12}ScorecardExecutionOptions"/>
 *         &lt;element name="scorecardPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nodeList" type="{urn://oracle.bi.webservices/v12}ScorecardNodeList"/>
 *         &lt;element name="variableList" type="{urn://oracle.bi.webservices/v12}ScorecardVariableList"/>
 *         &lt;element name="kpiColumnList" type="{urn://oracle.bi.webservices/v12}KPIColumnList"/>
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
    "executionOptions",
    "scorecardPath",
    "nodeList",
    "variableList",
    "kpiColumnList",
    "sessionID"
})
@XmlRootElement(name = "executeScorecard")
public class ExecuteScorecard {

    @XmlElement(required = true)
    protected ScorecardExecutionOptions executionOptions;
    @XmlElement(required = true)
    protected String scorecardPath;
    @XmlElement(required = true)
    protected ScorecardNodeList nodeList;
    @XmlElement(required = true)
    protected ScorecardVariableList variableList;
    @XmlElement(required = true)
    protected KPIColumnList kpiColumnList;
    @XmlElementRef(name = "sessionID", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionID;

    /**
     * Gets the value of the executionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardExecutionOptions }
     *     
     */
    public ScorecardExecutionOptions getExecutionOptions() {
        return executionOptions;
    }

    /**
     * Sets the value of the executionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardExecutionOptions }
     *     
     */
    public void setExecutionOptions(ScorecardExecutionOptions value) {
        this.executionOptions = value;
    }

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
     * Gets the value of the nodeList property.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardNodeList }
     *     
     */
    public ScorecardNodeList getNodeList() {
        return nodeList;
    }

    /**
     * Sets the value of the nodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardNodeList }
     *     
     */
    public void setNodeList(ScorecardNodeList value) {
        this.nodeList = value;
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
