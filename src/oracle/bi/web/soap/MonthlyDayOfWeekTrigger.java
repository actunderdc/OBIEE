
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MonthlyDayOfWeekTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonthlyDayOfWeekTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weeksOccurrence" type="{urn://oracle.bi.webservices/v12}WeekOccurrence" maxOccurs="5"/>
 *         &lt;element name="dayOfWeek" type="{urn://oracle.bi.webservices/v12}DayOfWeek" maxOccurs="7"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}gMonth" maxOccurs="12"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyDayOfWeekTrigger", propOrder = {
    "weeksOccurrence",
    "dayOfWeek",
    "month"
})
public class MonthlyDayOfWeekTrigger {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<WeekOccurrence> weeksOccurrence;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<DayOfWeek> dayOfWeek;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gMonth")
    protected List<XMLGregorianCalendar> month;

    /**
     * Gets the value of the weeksOccurrence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weeksOccurrence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeeksOccurrence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeekOccurrence }
     * 
     * 
     */
    public List<WeekOccurrence> getWeeksOccurrence() {
        if (weeksOccurrence == null) {
            weeksOccurrence = new ArrayList<WeekOccurrence>();
        }
        return this.weeksOccurrence;
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

    /**
     * Gets the value of the month property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the month property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getMonth() {
        if (month == null) {
            month = new ArrayList<XMLGregorianCalendar>();
        }
        return this.month;
    }

}
