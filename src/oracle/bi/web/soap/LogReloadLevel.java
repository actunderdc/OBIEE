
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogReloadLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogReloadLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="INCIDENT"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="INFORMATION"/>
 *     &lt;enumeration value="TRACE"/>
 *     &lt;enumeration value="DISABLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LogReloadLevel")
@XmlEnum
public enum LogReloadLevel {

    DEFAULT,
    INCIDENT,
    ERROR,
    WARNING,
    INFORMATION,
    TRACE,
    DISABLED;

    public String value() {
        return name();
    }

    public static LogReloadLevel fromValue(String v) {
        return valueOf(v);
    }

}
