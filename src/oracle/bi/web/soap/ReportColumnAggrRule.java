
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportColumnAggrRule.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportColumnAggrRule">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="server"/>
 *     &lt;enumeration value="sum"/>
 *     &lt;enumeration value="avg"/>
 *     &lt;enumeration value="count"/>
 *     &lt;enumeration value="countDistinct"/>
 *     &lt;enumeration value="min"/>
 *     &lt;enumeration value="max"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="serverAggregate"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportColumnAggrRule")
@XmlEnum
public enum ReportColumnAggrRule {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("server")
    SERVER("server"),
    @XmlEnumValue("sum")
    SUM("sum"),
    @XmlEnumValue("avg")
    AVG("avg"),
    @XmlEnumValue("count")
    COUNT("count"),
    @XmlEnumValue("countDistinct")
    COUNT_DISTINCT("countDistinct"),
    @XmlEnumValue("min")
    MIN("min"),
    @XmlEnumValue("max")
    MAX("max"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("serverAggregate")
    SERVER_AGGREGATE("serverAggregate"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    ReportColumnAggrRule(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportColumnAggrRule fromValue(String v) {
        for (ReportColumnAggrRule c: ReportColumnAggrRule.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
