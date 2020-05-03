
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
 * <p>Java class for MonthlyDateTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonthlyDateTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}gDay" maxOccurs="31"/>
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
@XmlType(name = "MonthlyDateTrigger", propOrder = {
    "day",
    "month"
})
public class MonthlyDateTrigger {

    @XmlElement(required = true)
    @XmlSchemaType(name = "gDay")
    protected List<XMLGregorianCalendar> day;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gMonth")
    protected List<XMLGregorianCalendar> month;

    /**
     * Gets the value of the day property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the day property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getDay() {
        if (day == null) {
            day = new ArrayList<XMLGregorianCalendar>();
        }
        return this.day;
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
