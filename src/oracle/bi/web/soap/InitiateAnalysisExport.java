
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="report" type="{urn://oracle.bi.webservices/v12}ReportRef"/>
 *         &lt;element name="outputFormat" type="{urn://oracle.bi.webservices/v12}AnalysisExportOutputFormat"/>
 *         &lt;element name="executionOptions" type="{urn://oracle.bi.webservices/v12}AnalysisExportExecutionOptions"/>
 *         &lt;element name="reportParams" type="{urn://oracle.bi.webservices/v12}ReportParams"/>
 *         &lt;element name="reportViewName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "report",
    "outputFormat",
    "executionOptions",
    "reportParams",
    "reportViewName",
    "sessionID"
})
@XmlRootElement(name = "initiateAnalysisExport")
public class InitiateAnalysisExport {

    @XmlElement(required = true)
    protected ReportRef report;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AnalysisExportOutputFormat outputFormat;
    @XmlElement(required = true, nillable = true)
    protected AnalysisExportExecutionOptions executionOptions;
    @XmlElement(required = true, nillable = true)
    protected ReportParams reportParams;
    @XmlElement(required = true, nillable = true)
    protected String reportViewName;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRef }
     *     
     */
    public ReportRef getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRef }
     *     
     */
    public void setReport(ReportRef value) {
        this.report = value;
    }

    /**
     * Gets the value of the outputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisExportOutputFormat }
     *     
     */
    public AnalysisExportOutputFormat getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the value of the outputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisExportOutputFormat }
     *     
     */
    public void setOutputFormat(AnalysisExportOutputFormat value) {
        this.outputFormat = value;
    }

    /**
     * Gets the value of the executionOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisExportExecutionOptions }
     *     
     */
    public AnalysisExportExecutionOptions getExecutionOptions() {
        return executionOptions;
    }

    /**
     * Sets the value of the executionOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisExportExecutionOptions }
     *     
     */
    public void setExecutionOptions(AnalysisExportExecutionOptions value) {
        this.executionOptions = value;
    }

    /**
     * Gets the value of the reportParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParams }
     *     
     */
    public ReportParams getReportParams() {
        return reportParams;
    }

    /**
     * Sets the value of the reportParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParams }
     *     
     */
    public void setReportParams(ReportParams value) {
        this.reportParams = value;
    }

    /**
     * Gets the value of the reportViewName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportViewName() {
        return reportViewName;
    }

    /**
     * Sets the value of the reportViewName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportViewName(String value) {
        this.reportViewName = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

}
