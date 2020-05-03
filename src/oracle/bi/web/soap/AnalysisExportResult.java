
package oracle.bi.web.soap;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnalysisExportResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalysisExportResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="viewData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exportStatus" type="{urn://oracle.bi.webservices/v12}ExportStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisExportResult", propOrder = {
    "viewData",
    "mimeType",
    "queryID",
    "exportStatus"
})
public class AnalysisExportResult {

    @XmlMimeType("*/*")
    protected DataHandler viewData;
    protected String mimeType;
    protected String queryID;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ExportStatusType exportStatus;

    /**
     * Gets the value of the viewData property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getViewData() {
        return viewData;
    }

    /**
     * Sets the value of the viewData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setViewData(DataHandler value) {
        this.viewData = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the queryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryID() {
        return queryID;
    }

    /**
     * Sets the value of the queryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryID(String value) {
        this.queryID = value;
    }

    /**
     * Gets the value of the exportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExportStatusType }
     *     
     */
    public ExportStatusType getExportStatus() {
        return exportStatus;
    }

    /**
     * Sets the value of the exportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportStatusType }
     *     
     */
    public void setExportStatus(ExportStatusType value) {
        this.exportStatus = value;
    }

}
