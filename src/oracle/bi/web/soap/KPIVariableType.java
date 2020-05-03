
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIVariableType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KPIVariableType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SESSION"/>
 *     &lt;enumeration value="PRESENTATION"/>
 *     &lt;enumeration value="REPOSITORY"/>
 *     &lt;enumeration value="REQUEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KPIVariableType")
@XmlEnum
public enum KPIVariableType {

    NONE,
    SESSION,
    PRESENTATION,
    REPOSITORY,
    REQUEST;

    public String value() {
        return name();
    }

    public static KPIVariableType fromValue(String v) {
        return valueOf(v);
    }

}
