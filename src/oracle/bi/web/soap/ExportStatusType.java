
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExportStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Done"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExportStatusType")
@XmlEnum
public enum ExportStatusType {

    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Done")
    DONE("Done");
    private final String value;

    ExportStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportStatusType fromValue(String v) {
        for (ExportStatusType c: ExportStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
