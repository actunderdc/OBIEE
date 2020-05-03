
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIColumnName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KPIColumnName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="STATUS"/>
 *     &lt;enumeration value="ACTUAL_VALUE"/>
 *     &lt;enumeration value="TARGET_VALUE"/>
 *     &lt;enumeration value="VARIANCE"/>
 *     &lt;enumeration value="VARIANCE_PERCENT"/>
 *     &lt;enumeration value="CHANGE"/>
 *     &lt;enumeration value="CHANGE_PERCENT"/>
 *     &lt;enumeration value="TREND"/>
 *     &lt;enumeration value="OBJECT_CONTEXT"/>
 *     &lt;enumeration value="STATUS_TEXT"/>
 *     &lt;enumeration value="OWNER"/>
 *     &lt;enumeration value="STATUS_INFO"/>
 *     &lt;enumeration value="DIMENSION_CONTEXT"/>
 *     &lt;enumeration value="CUSTOM_COLUMN1"/>
 *     &lt;enumeration value="CUSTOM_COLUMN2"/>
 *     &lt;enumeration value="CUSTOM_COLUMN3"/>
 *     &lt;enumeration value="CUSTOM_COLUMN4"/>
 *     &lt;enumeration value="CUSTOM_COLUMN5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KPIColumnName")
@XmlEnum
public enum KPIColumnName {

    NAME("NAME"),
    STATUS("STATUS"),
    ACTUAL_VALUE("ACTUAL_VALUE"),
    TARGET_VALUE("TARGET_VALUE"),
    VARIANCE("VARIANCE"),
    VARIANCE_PERCENT("VARIANCE_PERCENT"),
    CHANGE("CHANGE"),
    CHANGE_PERCENT("CHANGE_PERCENT"),
    TREND("TREND"),
    OBJECT_CONTEXT("OBJECT_CONTEXT"),
    STATUS_TEXT("STATUS_TEXT"),
    OWNER("OWNER"),
    STATUS_INFO("STATUS_INFO"),
    DIMENSION_CONTEXT("DIMENSION_CONTEXT"),
    @XmlEnumValue("CUSTOM_COLUMN1")
    CUSTOM_COLUMN_1("CUSTOM_COLUMN1"),
    @XmlEnumValue("CUSTOM_COLUMN2")
    CUSTOM_COLUMN_2("CUSTOM_COLUMN2"),
    @XmlEnumValue("CUSTOM_COLUMN3")
    CUSTOM_COLUMN_3("CUSTOM_COLUMN3"),
    @XmlEnumValue("CUSTOM_COLUMN4")
    CUSTOM_COLUMN_4("CUSTOM_COLUMN4"),
    @XmlEnumValue("CUSTOM_COLUMN5")
    CUSTOM_COLUMN_5("CUSTOM_COLUMN5");
    private final String value;

    KPIColumnName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KPIColumnName fromValue(String v) {
        for (KPIColumnName c: KPIColumnName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
