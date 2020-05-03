
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ACLType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ACLType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Privilege"/>
 *     &lt;enumeration value="Catalog"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACLType")
@XmlEnum
public enum ACLType {

    @XmlEnumValue("Privilege")
    PRIVILEGE("Privilege"),
    @XmlEnumValue("Catalog")
    CATALOG("Catalog");
    private final String value;

    ACLType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ACLType fromValue(String v) {
        for (ACLType c: ACLType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
