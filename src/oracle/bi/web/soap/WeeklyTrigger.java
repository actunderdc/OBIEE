
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeeklyTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeeklyTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weeksInterval" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="dayOfWeek" type="{urn://oracle.bi.webservices/v12}DayOfWeek" maxOccurs="7"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeeklyTrigger", propOrder = {
    "weeksInterval",
    "dayOfWeek"
})
public class WeeklyTrigger {

    @XmlSchemaType(name = "unsignedShort")
    protected int weeksInterval;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<DayOfWeek> dayOfWeek;

    /**
     * Gets the value of the weeksInterval property.
     * 
     */
    public int getWeeksInterval() {
        return weeksInterval;
    }

    /**
     * Sets the value of the weeksInterval property.
     * 
     */
    public void setWeeksInterval(int value) {
        this.weeksInterval = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeek }
     * 
     * 
     */
    public List<DayOfWeek> getDayOfWeek() {
        if (dayOfWeek == null) {
            dayOfWeek = new ArrayList<DayOfWeek>();
        }
        return this.dayOfWeek;
    }

}
