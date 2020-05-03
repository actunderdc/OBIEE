
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TieBreakerRuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TieBreakerRuleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="BEST_CASE"/>
 *     &lt;enumeration value="WORST_CASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TieBreakerRuleType")
@XmlEnum
public enum TieBreakerRuleType {

    NONE,
    BEST_CASE,
    WORST_CASE;

    public String value() {
        return name();
    }

    public static TieBreakerRuleType fromValue(String v) {
        return valueOf(v);
    }

}
