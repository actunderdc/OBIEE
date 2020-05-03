
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnarchivePathType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnarchivePathType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USERS"/>
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="SHARED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnarchivePathType")
@XmlEnum
public enum UnarchivePathType {

    USERS,
    SYSTEM,
    SHARED;

    public String value() {
        return name();
    }

    public static UnarchivePathType fromValue(String v) {
        return valueOf(v);
    }

}
