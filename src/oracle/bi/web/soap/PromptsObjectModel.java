
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromptsObjectModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromptsObjectModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subjectArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="layout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="runTimeInfo" type="{urn://oracle.bi.webservices/v12}PromptCollectionRunTimeInfo"/>
 *         &lt;element name="promptStepObj" type="{urn://oracle.bi.webservices/v12}PromptStepObjectModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromptsObjectModel", propOrder = {
    "name",
    "description",
    "scope",
    "subjectArea",
    "layout",
    "runTimeInfo",
    "promptStepObj"
})
public class PromptsObjectModel {

    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true)
    protected String scope;
    @XmlElement(required = true)
    protected String subjectArea;
    @XmlElement(required = true)
    protected String layout;
    @XmlElement(required = true, nillable = true)
    protected PromptCollectionRunTimeInfo runTimeInfo;
    protected List<PromptStepObjectModel> promptStepObj;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectArea(String value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

    /**
     * Gets the value of the runTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PromptCollectionRunTimeInfo }
     *     
     */
    public PromptCollectionRunTimeInfo getRunTimeInfo() {
        return runTimeInfo;
    }

    /**
     * Sets the value of the runTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptCollectionRunTimeInfo }
     *     
     */
    public void setRunTimeInfo(PromptCollectionRunTimeInfo value) {
        this.runTimeInfo = value;
    }

    /**
     * Gets the value of the promptStepObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promptStepObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromptStepObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromptStepObjectModel }
     * 
     * 
     */
    public List<PromptStepObjectModel> getPromptStepObj() {
        if (promptStepObj == null) {
            promptStepObj = new ArrayList<PromptStepObjectModel>();
        }
        return this.promptStepObj;
    }

}
