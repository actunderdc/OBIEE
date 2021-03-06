
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobInstanceFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobInstanceFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobReference" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" maxOccurs="unbounded"/>
 *         &lt;element name="jobInstanceStatus" type="{urn://oracle.bi.webservices/v12}JobInstanceStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobInstanceFilter", propOrder = {
    "jobReference",
    "jobInstanceStatus"
})
public class JobInstanceFilter {

    @XmlElement(type = Long.class)
    @XmlSchemaType(name = "unsignedInt")
    protected List<Long> jobReference;
    @XmlSchemaType(name = "string")
    protected JobInstanceStatus jobInstanceStatus;

    /**
     * Gets the value of the jobReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getJobReference() {
        if (jobReference == null) {
            jobReference = new ArrayList<Long>();
        }
        return this.jobReference;
    }

    /**
     * Gets the value of the jobInstanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JobInstanceStatus }
     *     
     */
    public JobInstanceStatus getJobInstanceStatus() {
        return jobInstanceStatus;
    }

    /**
     * Sets the value of the jobInstanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInstanceStatus }
     *     
     */
    public void setJobInstanceStatus(JobInstanceStatus value) {
        this.jobInstanceStatus = value;
    }

}
