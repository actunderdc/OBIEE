
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIDimensionLOVExecutionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPIDimensionLOVExecutionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kpiLOVExecutionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endOfData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="resultSet" type="{urn://oracle.bi.webservices/v12}KPIDimensionLOVResultSet"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPIDimensionLOVExecutionStatus", propOrder = {
    "kpiLOVExecutionID",
    "endOfData",
    "resultSet"
})
public class KPIDimensionLOVExecutionStatus {

    @XmlElement(required = true)
    protected String kpiLOVExecutionID;
    protected boolean endOfData;
    @XmlElement(required = true)
    protected KPIDimensionLOVResultSet resultSet;

    /**
     * Gets the value of the kpiLOVExecutionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiLOVExecutionID() {
        return kpiLOVExecutionID;
    }

    /**
     * Sets the value of the kpiLOVExecutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiLOVExecutionID(String value) {
        this.kpiLOVExecutionID = value;
    }

    /**
     * Gets the value of the endOfData property.
     * 
     */
    public boolean isEndOfData() {
        return endOfData;
    }

    /**
     * Sets the value of the endOfData property.
     * 
     */
    public void setEndOfData(boolean value) {
        this.endOfData = value;
    }

    /**
     * Gets the value of the resultSet property.
     * 
     * @return
     *     possible object is
     *     {@link KPIDimensionLOVResultSet }
     *     
     */
    public KPIDimensionLOVResultSet getResultSet() {
        return resultSet;
    }

    /**
     * Sets the value of the resultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPIDimensionLOVResultSet }
     *     
     */
    public void setResultSet(KPIDimensionLOVResultSet value) {
        this.resultSet = value;
    }

}
