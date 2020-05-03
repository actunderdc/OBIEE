
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobInstanceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JobInstanceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Running"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="TimedOut"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="TryAgain"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JobInstanceStatus")
@XmlEnum
public enum JobInstanceStatus {

    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Running")
    RUNNING("Running"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("TimedOut")
    TIMED_OUT("TimedOut"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("TryAgain")
    TRY_AGAIN("TryAgain");
    private final String value;

    JobInstanceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JobInstanceStatus fromValue(String v) {
        for (JobInstanceStatus c: JobInstanceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
