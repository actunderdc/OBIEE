
package oracle.bi.web.soap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobReferenceAndInstanceReferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobReferenceAndInstanceReferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobReference" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="jobInstanceReference" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobReferenceAndInstanceReferences", propOrder = {
    "jobReference",
    "jobInstanceReference"
})
public class JobReferenceAndInstanceReferences {

    @XmlSchemaType(name = "unsignedInt")
    protected long jobReference;
    @XmlSchemaType(name = "unsignedLong")
    protected List<BigInteger> jobInstanceReference;

    /**
     * Gets the value of the jobReference property.
     * 
     */
    public long getJobReference() {
        return jobReference;
    }

    /**
     * Sets the value of the jobReference property.
     * 
     */
    public void setJobReference(long value) {
        this.jobReference = value;
    }

    /**
     * Gets the value of the jobInstanceReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobInstanceReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobInstanceReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getJobInstanceReference() {
        if (jobInstanceReference == null) {
            jobInstanceReference = new ArrayList<BigInteger>();
        }
        return this.jobInstanceReference;
    }

}
