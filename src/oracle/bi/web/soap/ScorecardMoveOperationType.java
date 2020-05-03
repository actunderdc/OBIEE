
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardMoveOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScorecardMoveOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BEFORE"/>
 *     &lt;enumeration value="AFTER"/>
 *     &lt;enumeration value="CHILD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScorecardMoveOperationType")
@XmlEnum
public enum ScorecardMoveOperationType {

    BEFORE,
    AFTER,
    CHILD;

    public String value() {
        return name();
    }

    public static ScorecardMoveOperationType fromValue(String v) {
        return valueOf(v);
    }

}
