
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobTriggerType" type="{urn://oracle.bi.webservices/v12}JobTriggerType"/>
 *         &lt;element name="dailyTrigger" type="{urn://oracle.bi.webservices/v12}DailyTrigger" minOccurs="0"/>
 *         &lt;element name="weeklyTrigger" type="{urn://oracle.bi.webservices/v12}WeeklyTrigger" minOccurs="0"/>
 *         &lt;element name="monthlyDateTrigger" type="{urn://oracle.bi.webservices/v12}MonthlyDateTrigger" minOccurs="0"/>
 *         &lt;element name="monthlyDOWTrigger" type="{urn://oracle.bi.webservices/v12}MonthlyDayOfWeekTrigger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobTrigger", propOrder = {
    "jobTriggerType",
    "dailyTrigger",
    "weeklyTrigger",
    "monthlyDateTrigger",
    "monthlyDOWTrigger"
})
public class JobTrigger {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected JobTriggerType jobTriggerType;
    protected DailyTrigger dailyTrigger;
    protected WeeklyTrigger weeklyTrigger;
    protected MonthlyDateTrigger monthlyDateTrigger;
    protected MonthlyDayOfWeekTrigger monthlyDOWTrigger;

    /**
     * Gets the value of the jobTriggerType property.
     * 
     * @return
     *     possible object is
     *     {@link JobTriggerType }
     *     
     */
    public JobTriggerType getJobTriggerType() {
        return jobTriggerType;
    }

    /**
     * Sets the value of the jobTriggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTriggerType }
     *     
     */
    public void setJobTriggerType(JobTriggerType value) {
        this.jobTriggerType = value;
    }

    /**
     * Gets the value of the dailyTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link DailyTrigger }
     *     
     */
    public DailyTrigger getDailyTrigger() {
        return dailyTrigger;
    }

    /**
     * Sets the value of the dailyTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyTrigger }
     *     
     */
    public void setDailyTrigger(DailyTrigger value) {
        this.dailyTrigger = value;
    }

    /**
     * Gets the value of the weeklyTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyTrigger }
     *     
     */
    public WeeklyTrigger getWeeklyTrigger() {
        return weeklyTrigger;
    }

    /**
     * Sets the value of the weeklyTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyTrigger }
     *     
     */
    public void setWeeklyTrigger(WeeklyTrigger value) {
        this.weeklyTrigger = value;
    }

    /**
     * Gets the value of the monthlyDateTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyDateTrigger }
     *     
     */
    public MonthlyDateTrigger getMonthlyDateTrigger() {
        return monthlyDateTrigger;
    }

    /**
     * Sets the value of the monthlyDateTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyDateTrigger }
     *     
     */
    public void setMonthlyDateTrigger(MonthlyDateTrigger value) {
        this.monthlyDateTrigger = value;
    }

    /**
     * Gets the value of the monthlyDOWTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyDayOfWeekTrigger }
     *     
     */
    public MonthlyDayOfWeekTrigger getMonthlyDOWTrigger() {
        return monthlyDOWTrigger;
    }

    /**
     * Sets the value of the monthlyDOWTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyDayOfWeekTrigger }
     *     
     */
    public void setMonthlyDOWTrigger(MonthlyDayOfWeekTrigger value) {
        this.monthlyDOWTrigger = value;
    }

}
