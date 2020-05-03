
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DailyTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailyTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="daysInterval" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyTrigger", propOrder = {
    "daysInterval"
})
public class DailyTrigger {

    @XmlSchemaType(name = "unsignedShort")
    protected int daysInterval;

    /**
     * Gets the value of the daysInterval property.
     * 
     */
    public int getDaysInterval() {
        return daysInterval;
    }

    /**
     * Sets the value of the daysInterval property.
     * 
     */
    public void setDaysInterval(int value) {
        this.daysInterval = value;
    }

}
