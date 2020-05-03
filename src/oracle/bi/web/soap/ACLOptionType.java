
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACLOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ACLOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACLPreserve"/>
 *     &lt;enumeration value="ACLPreserveAndDoNotScrubGuids"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACLOptionType")
@XmlEnum
public enum ACLOptionType {

    @XmlEnumValue("ACLPreserve")
    ACL_PRESERVE("ACLPreserve"),
    @XmlEnumValue("ACLPreserveAndDoNotScrubGuids")
    ACL_PRESERVE_AND_DO_NOT_SCRUB_GUIDS("ACLPreserveAndDoNotScrubGuids");
    private final String value;

    ACLOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ACLOptionType fromValue(String v) {
        for (ACLOptionType c: ACLOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
