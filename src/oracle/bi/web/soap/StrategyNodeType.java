
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StrategyNodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StrategyNodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OBJECTIVE_NODE"/>
 *     &lt;enumeration value="PINNEDKPI_NODE"/>
 *     &lt;enumeration value="LINKED_NODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StrategyNodeType")
@XmlEnum
public enum StrategyNodeType {

    OBJECTIVE_NODE,
    PINNEDKPI_NODE,
    LINKED_NODE;

    public String value() {
        return name();
    }

    public static StrategyNodeType fromValue(String v) {
        return valueOf(v);
    }

}
