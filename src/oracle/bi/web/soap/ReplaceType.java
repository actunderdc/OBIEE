
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReplaceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReplaceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReplaceAll "/>
 *     &lt;enumeration value="ReplaceOld"/>
 *     &lt;enumeration value="ReplaceNone"/>
 *     &lt;enumeration value="ReplaceForce "/>
 *     &lt;enumeration value="ReplaceClean"/>
 *     &lt;enumeration value="ReplaceAutomaticallyMakeACopy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReplaceType")
@XmlEnum
public enum ReplaceType {

    @XmlEnumValue("ReplaceAll ")
    REPLACE_ALL("ReplaceAll "),
    @XmlEnumValue("ReplaceOld")
    REPLACE_OLD("ReplaceOld"),
    @XmlEnumValue("ReplaceNone")
    REPLACE_NONE("ReplaceNone"),
    @XmlEnumValue("ReplaceForce ")
    REPLACE_FORCE("ReplaceForce "),
    @XmlEnumValue("ReplaceClean")
    REPLACE_CLEAN("ReplaceClean"),
    @XmlEnumValue("ReplaceAutomaticallyMakeACopy")
    REPLACE_AUTOMATICALLY_MAKE_A_COPY("ReplaceAutomaticallyMakeACopy");
    private final String value;

    ReplaceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReplaceType fromValue(String v) {
        for (ReplaceType c: ReplaceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
