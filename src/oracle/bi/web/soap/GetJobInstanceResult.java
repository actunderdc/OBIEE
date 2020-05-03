
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
 *         &lt;element name="jobInstance" type="{urn://oracle.bi.webservices/v12}JobInstance"/>
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
    "jobInstance"
})
@XmlRootElement(name = "getJobInstanceResult")
public class GetJobInstanceResult {

    @XmlElement(required = true)
    protected JobInstance jobInstance;

    /**
     * Gets the value of the jobInstance property.
     * 
     * @return
     *     possible object is
     *     {@link JobInstance }
     *     
     */
    public JobInstance getJobInstance() {
        return jobInstance;
    }

    /**
     * Sets the value of the jobInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobInstance }
     *     
     */
    public void setJobInstance(JobInstance value) {
        this.jobInstance = value;
    }

}
