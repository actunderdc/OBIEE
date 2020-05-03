
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardViewType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScorecardViewType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISION"/>
 *     &lt;enumeration value="MISSION"/>
 *     &lt;enumeration value="STRATEGY_MAP_VIEW"/>
 *     &lt;enumeration value="STRATEGY_TREE_VIEW"/>
 *     &lt;enumeration value="CAUSE_AND_EFFECT_VIEW"/>
 *     &lt;enumeration value="CUSTOM_VIEW"/>
 *     &lt;enumeration value="ACCOUNTABILITY_MAP_VIEW"/>
 *     &lt;enumeration value="KPI_WATCHLIST"/>
 *     &lt;enumeration value="FILTERED_WATCHLIST_VIEW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScorecardViewType")
@XmlEnum
public enum ScorecardViewType {

    VISION,
    MISSION,
    STRATEGY_MAP_VIEW,
    STRATEGY_TREE_VIEW,
    CAUSE_AND_EFFECT_VIEW,
    CUSTOM_VIEW,
    ACCOUNTABILITY_MAP_VIEW,
    KPI_WATCHLIST,
    FILTERED_WATCHLIST_VIEW;

    public String value() {
        return name();
    }

    public static ScorecardViewType fromValue(String v) {
        return valueOf(v);
    }

}
