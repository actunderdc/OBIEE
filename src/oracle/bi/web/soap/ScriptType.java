
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScriptType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScriptType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Agent"/>
 *     &lt;enumeration value="VBScript"/>
 *     &lt;enumeration value="JScript"/>
 *     &lt;enumeration value="Java"/>
 *     &lt;enumeration value="NQCmd"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScriptType")
@XmlEnum
public enum ScriptType {

    @XmlEnumValue("Agent")
    AGENT("Agent"),
    @XmlEnumValue("VBScript")
    VB_SCRIPT("VBScript"),
    @XmlEnumValue("JScript")
    J_SCRIPT("JScript"),
    @XmlEnumValue("Java")
    JAVA("Java"),
    @XmlEnumValue("NQCmd")
    NQ_CMD("NQCmd");
    private final String value;

    ScriptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScriptType fromValue(String v) {
        for (ScriptType c: ScriptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
