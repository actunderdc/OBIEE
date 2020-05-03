
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogReloadDomain.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LogReloadDomain">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="TENANT"/>
 *     &lt;enumeration value="SESSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LogReloadDomain")
@XmlEnum
public enum LogReloadDomain {

    SYSTEM,
    TENANT,
    SESSION;

    public String value() {
        return name();
    }

    public static LogReloadDomain fromValue(String v) {
        return valueOf(v);
    }

}
