
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="cancelJobInstanceResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "cancelJobInstanceResponse"
})
@XmlRootElement(name = "cancelJobInstanceResult")
public class CancelJobInstanceResult {

    protected boolean cancelJobInstanceResponse;

    /**
     * Gets the value of the cancelJobInstanceResponse property.
     * 
     */
    public boolean isCancelJobInstanceResponse() {
        return cancelJobInstanceResponse;
    }

    /**
     * Sets the value of the cancelJobInstanceResponse property.
     * 
     */
    public void setCancelJobInstanceResponse(boolean value) {
        this.cancelJobInstanceResponse = value;
    }

}
