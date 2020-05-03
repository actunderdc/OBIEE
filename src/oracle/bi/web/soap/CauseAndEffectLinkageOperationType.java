
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CauseAndEffectLinkageOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CauseAndEffectLinkageOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="DELETE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CauseAndEffectLinkageOperationType")
@XmlEnum
public enum CauseAndEffectLinkageOperationType {

    ADD,
    UPDATE,
    DELETE;

    public String value() {
        return name();
    }

    public static CauseAndEffectLinkageOperationType fromValue(String v) {
        return valueOf(v);
    }

}
