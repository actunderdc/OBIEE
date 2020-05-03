
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableHeading" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="columnHeading" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportColumn", propOrder = {
    "id",
    "tableHeading",
    "columnHeading",
    "hidden"
})
@XmlSeeAlso({
    ReportRegularColumn.class,
    ReportHierarchicalColumn.class
})
public abstract class ReportColumn {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String tableHeading;
    @XmlElement(required = true)
    protected String columnHeading;
    protected boolean hidden;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the tableHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableHeading() {
        return tableHeading;
    }

    /**
     * Sets the value of the tableHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableHeading(String value) {
        this.tableHeading = value;
    }

    /**
     * Gets the value of the columnHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnHeading() {
        return columnHeading;
    }

    /**
     * Sets the value of the columnHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnHeading(String value) {
        this.columnHeading = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
    }

}
