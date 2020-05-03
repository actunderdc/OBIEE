
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardExecutionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScorecardExecutionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scorecardExecutionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finished" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="assessmentResultSet" type="{urn://oracle.bi.webservices/v12}ScorecardAssessmentResultSet"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardExecutionStatus", propOrder = {
    "scorecardExecutionID",
    "finished",
    "assessmentResultSet"
})
public class ScorecardExecutionStatus {

    @XmlElement(required = true)
    protected String scorecardExecutionID;
    protected boolean finished;
    @XmlElement(required = true)
    protected ScorecardAssessmentResultSet assessmentResultSet;

    /**
     * Gets the value of the scorecardExecutionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScorecardExecutionID() {
        return scorecardExecutionID;
    }

    /**
     * Sets the value of the scorecardExecutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScorecardExecutionID(String value) {
        this.scorecardExecutionID = value;
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
     * Gets the value of the assessmentResultSet property.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardAssessmentResultSet }
     *     
     */
    public ScorecardAssessmentResultSet getAssessmentResultSet() {
        return assessmentResultSet;
    }

    /**
     * Sets the value of the assessmentResultSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardAssessmentResultSet }
     *     
     */
    public void setAssessmentResultSet(ScorecardAssessmentResultSet value) {
        this.assessmentResultSet = value;
    }

}
