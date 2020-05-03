
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KPIResultColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KPIResultColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kpiResultColumnName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectContext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isAnnotated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isWritable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kpiResultColumnType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kpiResultColumnValueIsNull" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kpiResultColumnValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kpiResultColumnFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kpiResultColumnLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KPIResultColumn", propOrder = {
    "kpiResultColumnName",
    "objectContext",
    "isAnnotated",
    "isWritable",
    "kpiResultColumnType",
    "kpiResultColumnValueIsNull",
    "kpiResultColumnValue",
    "kpiResultColumnFormat",
    "kpiResultColumnLabel"
})
public class KPIResultColumn {

    @XmlElement(required = true)
    protected String kpiResultColumnName;
    @XmlElement(required = true)
    protected String objectContext;
    protected boolean isAnnotated;
    protected boolean isWritable;
    @XmlElement(required = true)
    protected String kpiResultColumnType;
    protected boolean kpiResultColumnValueIsNull;
    @XmlElement(required = true)
    protected String kpiResultColumnValue;
    protected String kpiResultColumnFormat;
    protected String kpiResultColumnLabel;

    /**
     * Gets the value of the kpiResultColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiResultColumnName() {
        return kpiResultColumnName;
    }

    /**
     * Sets the value of the kpiResultColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiResultColumnName(String value) {
        this.kpiResultColumnName = value;
    }

    /**
     * Gets the value of the objectContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectContext() {
        return objectContext;
    }

    /**
     * Sets the value of the objectContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectContext(String value) {
        this.objectContext = value;
    }

    /**
     * Gets the value of the isAnnotated property.
     * 
     */
    public boolean isIsAnnotated() {
        return isAnnotated;
    }

    /**
     * Sets the value of the isAnnotated property.
     * 
     */
    public void setIsAnnotated(boolean value) {
        this.isAnnotated = value;
    }

    /**
     * Gets the value of the isWritable property.
     * 
     */
    public boolean isIsWritable() {
        return isWritable;
    }

    /**
     * Sets the value of the isWritable property.
     * 
     */
    public void setIsWritable(boolean value) {
        this.isWritable = value;
    }

    /**
     * Gets the value of the kpiResultColumnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiResultColumnType() {
        return kpiResultColumnType;
    }

    /**
     * Sets the value of the kpiResultColumnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiResultColumnType(String value) {
        this.kpiResultColumnType = value;
    }

    /**
     * Gets the value of the kpiResultColumnValueIsNull property.
     * 
     */
    public boolean isKpiResultColumnValueIsNull() {
        return kpiResultColumnValueIsNull;
    }

    /**
     * Sets the value of the kpiResultColumnValueIsNull property.
     * 
     */
    public void setKpiResultColumnValueIsNull(boolean value) {
        this.kpiResultColumnValueIsNull = value;
    }

    /**
     * Gets the value of the kpiResultColumnValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiResultColumnValue() {
        return kpiResultColumnValue;
    }

    /**
     * Sets the value of the kpiResultColumnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiResultColumnValue(String value) {
        this.kpiResultColumnValue = value;
    }

    /**
     * Gets the value of the kpiResultColumnFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiResultColumnFormat() {
        return kpiResultColumnFormat;
    }

    /**
     * Sets the value of the kpiResultColumnFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiResultColumnFormat(String value) {
        this.kpiResultColumnFormat = value;
    }

    /**
     * Gets the value of the kpiResultColumnLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKpiResultColumnLabel() {
        return kpiResultColumnLabel;
    }

    /**
     * Sets the value of the kpiResultColumnLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKpiResultColumnLabel(String value) {
        this.kpiResultColumnLabel = value;
    }

}
