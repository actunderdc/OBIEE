
package oracle.bi.web.soap;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardExecutionOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScorecardExecutionOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="executionTreeOptions" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="bypassCache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardExecutionOptions", propOrder = {
    "async",
    "executionTreeOptions",
    "bypassCache"
})
public class ScorecardExecutionOptions {

    protected boolean async;
    @XmlElement(required = true)
    protected BigInteger executionTreeOptions;
    protected Boolean bypassCache;

    /**
     * Gets the value of the async property.
     * 
     */
    public boolean isAsync() {
        return async;
    }

    /**
     * Sets the value of the async property.
     * 
     */
    public void setAsync(boolean value) {
        this.async = value;
    }

    /**
     * Gets the value of the executionTreeOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExecutionTreeOptions() {
        return executionTreeOptions;
    }

    /**
     * Sets the value of the executionTreeOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExecutionTreeOptions(BigInteger value) {
        this.executionTreeOptions = value;
    }

    /**
     * Gets the value of the bypassCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassCache() {
        return bypassCache;
    }

    /**
     * Sets the value of the bypassCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassCache(Boolean value) {
        this.bypassCache = value;
    }

}
