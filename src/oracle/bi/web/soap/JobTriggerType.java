
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobTriggerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobTriggerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RunNever"/>
 *     &lt;enumeration value="RunOnce"/>
 *     &lt;enumeration value="RunDaily"/>
 *     &lt;enumeration value="RunWeekly"/>
 *     &lt;enumeration value="RunMonthlyByDate"/>
 *     &lt;enumeration value="RunMonthlyByDayOfWeek"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JobTriggerType")
@XmlEnum
public enum JobTriggerType {

    @XmlEnumValue("RunNever")
    RUN_NEVER("RunNever"),
    @XmlEnumValue("RunOnce")
    RUN_ONCE("RunOnce"),
    @XmlEnumValue("RunDaily")
    RUN_DAILY("RunDaily"),
    @XmlEnumValue("RunWeekly")
    RUN_WEEKLY("RunWeekly"),
    @XmlEnumValue("RunMonthlyByDate")
    RUN_MONTHLY_BY_DATE("RunMonthlyByDate"),
    @XmlEnumValue("RunMonthlyByDayOfWeek")
    RUN_MONTHLY_BY_DAY_OF_WEEK("RunMonthlyByDayOfWeek");
    private final String value;

    JobTriggerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobTriggerType fromValue(String v) {
        for (JobTriggerType c: JobTriggerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
