
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRegularColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportRegularColumn">
 *   &lt;complexContent>
 *     &lt;extension base="{urn://oracle.bi.webservices/v12}ReportColumn">
 *       &lt;sequence>
 *         &lt;element name="sqlFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="measure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aggrRule" type="{urn://oracle.bi.webservices/v12}ReportColumnAggrRule"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRegularColumn", propOrder = {
    "sqlFormula",
    "measure",
    "aggrRule"
})
public class ReportRegularColumn
    extends ReportColumn
{

    @XmlElement(required = true)
    protected String sqlFormula;
    protected boolean measure;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReportColumnAggrRule aggrRule;

    /**
     * Gets the value of the sqlFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlFormula() {
        return sqlFormula;
    }

    /**
     * Sets the value of the sqlFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlFormula(String value) {
        this.sqlFormula = value;
    }

    /**
     * Gets the value of the measure property.
     * 
     */
    public boolean isMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     */
    public void setMeasure(boolean value) {
        this.measure = value;
    }

    /**
     * Gets the value of the aggrRule property.
     * 
     * @return
     *     possible object is
     *     {@link ReportColumnAggrRule }
     *     
     */
    public ReportColumnAggrRule getAggrRule() {
        return aggrRule;
    }

    /**
     * Sets the value of the aggrRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportColumnAggrRule }
     *     
     */
    public void setAggrRule(ReportColumnAggrRule value) {
        this.aggrRule = value;
    }

}
