
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardNodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScorecardNodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRATEGY_NODE"/>
 *     &lt;enumeration value="INITIATIVE_NODE"/>
 *     &lt;enumeration value="ACCOUNTABILITY_NODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScorecardNodeType")
@XmlEnum
public enum ScorecardNodeType {

    STRATEGY_NODE,
    INITIATIVE_NODE,
    ACCOUNTABILITY_NODE;

    public String value() {
        return name();
    }

    public static ScorecardNodeType fromValue(String v) {
        return valueOf(v);
    }

}
