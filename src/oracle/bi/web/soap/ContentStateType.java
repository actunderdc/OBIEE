
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContentStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="FactoryContent"/>
 *     &lt;enumeration value="FactoryContentCustomized"/>
 *     &lt;enumeration value="NonFactoryContent"/>
 *     &lt;enumeration value="AutoCreatedFactoryContent"/>
 *     &lt;enumeration value="NotTaggedFactoryContent"/>
 *     &lt;enumeration value="PermissionsCustomized"/>
 *     &lt;enumeration value="AttributesAndPropertiesCustomized"/>
 *     &lt;enumeration value="OnlyObjectCustomized"/>
 *     &lt;enumeration value="PermissionsAttributesAndPropertiesCustomized"/>
 *     &lt;enumeration value="PermissionsAndObjectCustomized"/>
 *     &lt;enumeration value="AttributesPropertiesAndObjectCustomized"/>
 *     &lt;enumeration value="AllCustomized"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentStateType")
@XmlEnum
public enum ContentStateType {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("FactoryContent")
    FACTORY_CONTENT("FactoryContent"),
    @XmlEnumValue("FactoryContentCustomized")
    FACTORY_CONTENT_CUSTOMIZED("FactoryContentCustomized"),
    @XmlEnumValue("NonFactoryContent")
    NON_FACTORY_CONTENT("NonFactoryContent"),
    @XmlEnumValue("AutoCreatedFactoryContent")
    AUTO_CREATED_FACTORY_CONTENT("AutoCreatedFactoryContent"),
    @XmlEnumValue("NotTaggedFactoryContent")
    NOT_TAGGED_FACTORY_CONTENT("NotTaggedFactoryContent"),
    @XmlEnumValue("PermissionsCustomized")
    PERMISSIONS_CUSTOMIZED("PermissionsCustomized"),
    @XmlEnumValue("AttributesAndPropertiesCustomized")
    ATTRIBUTES_AND_PROPERTIES_CUSTOMIZED("AttributesAndPropertiesCustomized"),
    @XmlEnumValue("OnlyObjectCustomized")
    ONLY_OBJECT_CUSTOMIZED("OnlyObjectCustomized"),
    @XmlEnumValue("PermissionsAttributesAndPropertiesCustomized")
    PERMISSIONS_ATTRIBUTES_AND_PROPERTIES_CUSTOMIZED("PermissionsAttributesAndPropertiesCustomized"),
    @XmlEnumValue("PermissionsAndObjectCustomized")
    PERMISSIONS_AND_OBJECT_CUSTOMIZED("PermissionsAndObjectCustomized"),
    @XmlEnumValue("AttributesPropertiesAndObjectCustomized")
    ATTRIBUTES_PROPERTIES_AND_OBJECT_CUSTOMIZED("AttributesPropertiesAndObjectCustomized"),
    @XmlEnumValue("AllCustomized")
    ALL_CUSTOMIZED("AllCustomized");
    private final String value;

    ContentStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentStateType fromValue(String v) {
        for (ContentStateType c: ContentStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
