
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScorecardItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCORECARD"/>
 *     &lt;enumeration value="PERSPECTIVE"/>
 *     &lt;enumeration value="STRATEGY_NODE"/>
 *     &lt;enumeration value="INTIATIVE_NODE"/>
 *     &lt;enumeration value="VIEWS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScorecardItemType")
@XmlEnum
public enum ScorecardItemType {

    SCORECARD,
    PERSPECTIVE,
    STRATEGY_NODE,
    INTIATIVE_NODE,
    VIEWS;

    public String value() {
        return name();
    }

    public static ScorecardItemType fromValue(String v) {
        return valueOf(v);
    }

}
