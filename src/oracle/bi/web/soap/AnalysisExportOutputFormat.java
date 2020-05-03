
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnalysisExportOutputFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnalysisExportOutputFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="MHT"/>
 *     &lt;enumeration value="EXCEL2007"/>
 *     &lt;enumeration value="CSV"/>
 *     &lt;enumeration value="FLASH"/>
 *     &lt;enumeration value="SVG"/>
 *     &lt;enumeration value="GIF"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="JPEG"/>
 *     &lt;enumeration value="SVGFOP"/>
 *     &lt;enumeration value="VML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnalysisExportOutputFormat")
@XmlEnum
public enum AnalysisExportOutputFormat {

    PDF("PDF"),
    MHT("MHT"),
    @XmlEnumValue("EXCEL2007")
    EXCEL_2007("EXCEL2007"),
    CSV("CSV"),
    FLASH("FLASH"),
    SVG("SVG"),
    GIF("GIF"),
    PNG("PNG"),
    JPEG("JPEG"),
    SVGFOP("SVGFOP"),
    VML("VML");
    private final String value;

    AnalysisExportOutputFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnalysisExportOutputFormat fromValue(String v) {
        for (AnalysisExportOutputFormat c: AnalysisExportOutputFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
