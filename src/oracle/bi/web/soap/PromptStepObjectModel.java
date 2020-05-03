
package oracle.bi.web.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromptStepObjectModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromptStepObjectModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instruction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="buttonsPosition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="labelPosition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wrapLabelText" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customWidthUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customWidthWidth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="setWidthToAllPrompts" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoApplyPrompt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showResetButton" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="runTimeInfo" type="{urn://oracle.bi.webservices/v12}PromptStepRunTimeInfo"/>
 *         &lt;element name="promptObj" type="{urn://oracle.bi.webservices/v12}IndividualPromptObjectModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromptStepObjectModel", propOrder = {
    "title",
    "instruction",
    "buttonsPosition",
    "labelPosition",
    "wrapLabelText",
    "customWidthUsage",
    "customWidthWidth",
    "setWidthToAllPrompts",
    "autoApplyPrompt",
    "showResetButton",
    "runTimeInfo",
    "promptObj"
})
public class PromptStepObjectModel {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String instruction;
    @XmlElement(required = true)
    protected String buttonsPosition;
    @XmlElement(required = true)
    protected String labelPosition;
    protected boolean wrapLabelText;
    @XmlElement(required = true)
    protected String customWidthUsage;
    @XmlElement(required = true)
    protected String customWidthWidth;
    protected boolean setWidthToAllPrompts;
    protected boolean autoApplyPrompt;
    protected boolean showResetButton;
    @XmlElement(required = true, nillable = true)
    protected PromptStepRunTimeInfo runTimeInfo;
    protected List<IndividualPromptObjectModel> promptObj;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    /**
     * Gets the value of the buttonsPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonsPosition() {
        return buttonsPosition;
    }

    /**
     * Sets the value of the buttonsPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonsPosition(String value) {
        this.buttonsPosition = value;
    }

    /**
     * Gets the value of the labelPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelPosition() {
        return labelPosition;
    }

    /**
     * Sets the value of the labelPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelPosition(String value) {
        this.labelPosition = value;
    }

    /**
     * Gets the value of the wrapLabelText property.
     * 
     */
    public boolean isWrapLabelText() {
        return wrapLabelText;
    }

    /**
     * Sets the value of the wrapLabelText property.
     * 
     */
    public void setWrapLabelText(boolean value) {
        this.wrapLabelText = value;
    }

    /**
     * Gets the value of the customWidthUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomWidthUsage() {
        return customWidthUsage;
    }

    /**
     * Sets the value of the customWidthUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomWidthUsage(String value) {
        this.customWidthUsage = value;
    }

    /**
     * Gets the value of the customWidthWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomWidthWidth() {
        return customWidthWidth;
    }

    /**
     * Sets the value of the customWidthWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomWidthWidth(String value) {
        this.customWidthWidth = value;
    }

    /**
     * Gets the value of the setWidthToAllPrompts property.
     * 
     */
    public boolean isSetWidthToAllPrompts() {
        return setWidthToAllPrompts;
    }

    /**
     * Sets the value of the setWidthToAllPrompts property.
     * 
     */
    public void setSetWidthToAllPrompts(boolean value) {
        this.setWidthToAllPrompts = value;
    }

    /**
     * Gets the value of the autoApplyPrompt property.
     * 
     */
    public boolean isAutoApplyPrompt() {
        return autoApplyPrompt;
    }

    /**
     * Sets the value of the autoApplyPrompt property.
     * 
     */
    public void setAutoApplyPrompt(boolean value) {
        this.autoApplyPrompt = value;
    }

    /**
     * Gets the value of the showResetButton property.
     * 
     */
    public boolean isShowResetButton() {
        return showResetButton;
    }

    /**
     * Sets the value of the showResetButton property.
     * 
     */
    public void setShowResetButton(boolean value) {
        this.showResetButton = value;
    }

    /**
     * Gets the value of the runTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PromptStepRunTimeInfo }
     *     
     */
    public PromptStepRunTimeInfo getRunTimeInfo() {
        return runTimeInfo;
    }

    /**
     * Sets the value of the runTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptStepRunTimeInfo }
     *     
     */
    public void setRunTimeInfo(PromptStepRunTimeInfo value) {
        this.runTimeInfo = value;
    }

    /**
     * Gets the value of the promptObj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promptObj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromptObj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualPromptObjectModel }
     * 
     * 
     */
    public List<IndividualPromptObjectModel> getPromptObj() {
        if (promptObj == null) {
            promptObj = new ArrayList<IndividualPromptObjectModel>();
        }
        return this.promptObj;
    }

}
