
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentRuleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssessmentRuleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="BEST_CASE"/>
 *     &lt;enumeration value="WORST_CASE"/>
 *     &lt;enumeration value="MOST_FREQUENT"/>
 *     &lt;enumeration value="WEIGHTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssessmentRuleType")
@XmlEnum
public enum AssessmentRuleType {

    NONE,
    BEST_CASE,
    WORST_CASE,
    MOST_FREQUENT,
    WEIGHTED;

    public String value() {
        return name();
    }

    public static AssessmentRuleType fromValue(String v) {
        return valueOf(v);
    }

}
