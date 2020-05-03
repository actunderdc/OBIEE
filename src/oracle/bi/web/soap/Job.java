
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scriptType" type="{urn://oracle.bi.webservices/v12}ScriptType"/>
 *         &lt;element name="scriptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxRunTimeMS" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="runningInstancesCount" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="maxConcurrentInstances" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastRunDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nextRunDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="intervalMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deleteJobWhenDone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="executeWhenMissed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="jobTrigger" type="{urn://oracle.bi.webservices/v12}JobTrigger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job", propOrder = {
    "name",
    "description",
    "userID",
    "scriptType",
    "scriptID",
    "maxRunTimeMS",
    "runningInstancesCount",
    "maxConcurrentInstances",
    "timeZone",
    "lastRunDateTime",
    "nextRunDateTime",
    "beginDate",
    "startTime",
    "endDate",
    "endTime",
    "intervalMinutes",
    "disabled",
    "deleteJobWhenDone",
    "executeWhenMissed",
    "jobTrigger"
})
public class Job {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ScriptType scriptType;
    protected String scriptID;
    @XmlSchemaType(name = "unsignedInt")
    protected long maxRunTimeMS;
    @XmlSchemaType(name = "unsignedShort")
    protected int runningInstancesCount;
    @XmlSchemaType(name = "unsignedShort")
    protected int maxConcurrentInstances;
    protected String timeZone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRunDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextRunDateTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlSchemaType(name = "unsignedInt")
    protected long intervalMinutes;
    protected boolean disabled;
    protected boolean deleteJobWhenDone;
    protected boolean executeWhenMissed;
    @XmlElement(required = true)
    protected JobTrigger jobTrigger;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the scriptType property.
     * 
     * @return
     *     possible object is
     *     {@link ScriptType }
     *     
     */
    public ScriptType getScriptType() {
        return scriptType;
    }

    /**
     * Sets the value of the scriptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptType }
     *     
     */
    public void setScriptType(ScriptType value) {
        this.scriptType = value;
    }

    /**
     * Gets the value of the scriptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptID() {
        return scriptID;
    }

    /**
     * Sets the value of the scriptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptID(String value) {
        this.scriptID = value;
    }

    /**
     * Gets the value of the maxRunTimeMS property.
     * 
     */
    public long getMaxRunTimeMS() {
        return maxRunTimeMS;
    }

    /**
     * Sets the value of the maxRunTimeMS property.
     * 
     */
    public void setMaxRunTimeMS(long value) {
        this.maxRunTimeMS = value;
    }

    /**
     * Gets the value of the runningInstancesCount property.
     * 
     */
    public int getRunningInstancesCount() {
        return runningInstancesCount;
    }

    /**
     * Sets the value of the runningInstancesCount property.
     * 
     */
    public void setRunningInstancesCount(int value) {
        this.runningInstancesCount = value;
    }

    /**
     * Gets the value of the maxConcurrentInstances property.
     * 
     */
    public int getMaxConcurrentInstances() {
        return maxConcurrentInstances;
    }

    /**
     * Sets the value of the maxConcurrentInstances property.
     * 
     */
    public void setMaxConcurrentInstances(int value) {
        this.maxConcurrentInstances = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the lastRunDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRunDateTime() {
        return lastRunDateTime;
    }

    /**
     * Sets the value of the lastRunDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRunDateTime(XMLGregorianCalendar value) {
        this.lastRunDateTime = value;
    }

    /**
     * Gets the value of the nextRunDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextRunDateTime() {
        return nextRunDateTime;
    }

    /**
     * Sets the value of the nextRunDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextRunDateTime(XMLGregorianCalendar value) {
        this.nextRunDateTime = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the intervalMinutes property.
     * 
     */
    public long getIntervalMinutes() {
        return intervalMinutes;
    }

    /**
     * Sets the value of the intervalMinutes property.
     * 
     */
    public void setIntervalMinutes(long value) {
        this.intervalMinutes = value;
    }

    /**
     * Gets the value of the disabled property.
     * 
     */
    public boolean isDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     */
    public void setDisabled(boolean value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the deleteJobWhenDone property.
     * 
     */
    public boolean isDeleteJobWhenDone() {
        return deleteJobWhenDone;
    }

    /**
     * Sets the value of the deleteJobWhenDone property.
     * 
     */
    public void setDeleteJobWhenDone(boolean value) {
        this.deleteJobWhenDone = value;
    }

    /**
     * Gets the value of the executeWhenMissed property.
     * 
     */
    public boolean isExecuteWhenMissed() {
        return executeWhenMissed;
    }

    /**
     * Sets the value of the executeWhenMissed property.
     * 
     */
    public void setExecuteWhenMissed(boolean value) {
        this.executeWhenMissed = value;
    }

    /**
     * Gets the value of the jobTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link JobTrigger }
     *     
     */
    public JobTrigger getJobTrigger() {
        return jobTrigger;
    }

    /**
     * Sets the value of the jobTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTrigger }
     *     
     */
    public void setJobTrigger(JobTrigger value) {
        this.jobTrigger = value;
    }

}
