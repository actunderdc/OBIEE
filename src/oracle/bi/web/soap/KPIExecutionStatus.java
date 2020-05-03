
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIExecutionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPIExecutionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kpiExecutionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finished" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="resultSet" type="{urn://oracle.bi.webservices/v12}KPIResultSet"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPIExecutionStatus", propOrder = {
    "kpiExecutionID",
    "finished",
    "resultSet"
})
public class KPIExecutionStatus {

    @XmlElement(required = true)
    protected String kpiExecutionID;
    protected boolean finished;
    @XmlElement(required = true)
    protected KPIResultSet resultSet;

    /**
     * Gets the value of the kpiExecutionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiExecutionID() {
        return kpiExecutionID;
    }

    /**
     * Sets the value of the kpiExecutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiExecutionID(String value) {
        this.kpiExecutionID = value;
    }

    /**
     * Gets the value of the finished property.
     * 
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Sets the value of the finished property.
     * 
     */
    public void setFinished(boolean value) {
        this.finished = value;
    }

    /**
     * Gets the value of the resultSet property.
     * 
     * @return
     *     possible object is
     *     {@link KPIResultSet }
     *     
     */
    public KPIResultSet getResultSet() {
        return resultSet;
    }

    /**
     * Sets the value of the resultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link KPIResultSet }
     *     
     */
    public void setResultSet(KPIResultSet value) {
        this.resultSet = value;
    }

}
