
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualPromptRunTimeInfoDataTypeHierarchyLevels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPromptRunTimeInfoDataTypeHierarchyLevels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="levelInfo" type="{urn://oracle.bi.webservices/v12}IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPromptRunTimeInfoDataTypeHierarchyLevels", propOrder = {
    "levelInfo"
})
public class IndividualPromptRunTimeInfoDataTypeHierarchyLevels {

    protected List<IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo> levelInfo;

    /**
     * Gets the value of the levelInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo }
     * 
     * 
     */
    public List<IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo> getLevelInfo() {
        if (levelInfo == null) {
            levelInfo = new ArrayList<IndividualPromptRunTimeInfoDataTypeHierarchyLevelInfo>();
        }
        return this.levelInfo;
    }

}
