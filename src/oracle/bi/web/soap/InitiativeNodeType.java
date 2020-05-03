
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitiativeNodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitiativeNodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INITIATIVE_NODE"/>
 *     &lt;enumeration value="PINNEDKPI_NODE"/>
 *     &lt;enumeration value="LINKED_NODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InitiativeNodeType")
@XmlEnum
public enum InitiativeNodeType {

    INITIATIVE_NODE,
    PINNEDKPI_NODE,
    LINKED_NODE;

    public String value() {
        return name();
    }

    public static InitiativeNodeType fromValue(String v) {
        return valueOf(v);
    }

}
