
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="numberJobsRemoved" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
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
    "numberJobsRemoved"
})
@XmlRootElement(name = "removeJobsResult")
public class RemoveJobsResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long numberJobsRemoved;

    /**
     * Gets the value of the numberJobsRemoved property.
     * 
     */
    public long getNumberJobsRemoved() {
        return numberJobsRemoved;
    }

    /**
     * Sets the value of the numberJobsRemoved property.
     * 
     */
    public void setNumberJobsRemoved(long value) {
        this.numberJobsRemoved = value;
    }

}
