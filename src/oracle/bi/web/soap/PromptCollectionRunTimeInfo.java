
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromptCollectionRunTimeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromptCollectionRunTimeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collectionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="viewStatePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currentStep" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numPromptSteps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reloadInline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="supportAutoComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showReturnLink" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="currentAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromptCollectionRunTimeInfo", propOrder = {
    "collectionID",
    "viewStatePath",
    "currentStep",
    "numPromptSteps",
    "reloadInline",
    "supportAutoComplete",
    "showReturnLink",
    "currentAction"
})
public class PromptCollectionRunTimeInfo {

    @XmlElement(required = true)
    protected String collectionID;
    @XmlElement(required = true)
    protected String viewStatePath;
    protected int currentStep;
    protected int numPromptSteps;
    protected boolean reloadInline;
    protected boolean supportAutoComplete;
    protected boolean showReturnLink;
    @XmlElement(required = true)
    protected String currentAction;

    /**
     * Gets the value of the collectionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionID() {
        return collectionID;
    }

    /**
     * Sets the value of the collectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionID(String value) {
        this.collectionID = value;
    }

    /**
     * Gets the value of the viewStatePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewStatePath() {
        return viewStatePath;
    }

    /**
     * Sets the value of the viewStatePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewStatePath(String value) {
        this.viewStatePath = value;
    }

    /**
     * Gets the value of the currentStep property.
     * 
     */
    public int getCurrentStep() {
        return currentStep;
    }

    /**
     * Sets the value of the currentStep property.
     * 
     */
    public void setCurrentStep(int value) {
        this.currentStep = value;
    }

    /**
     * Gets the value of the numPromptSteps property.
     * 
     */
    public int getNumPromptSteps() {
        return numPromptSteps;
    }

    /**
     * Sets the value of the numPromptSteps property.
     * 
     */
    public void setNumPromptSteps(int value) {
        this.numPromptSteps = value;
    }

    /**
     * Gets the value of the reloadInline property.
     * 
     */
    public boolean isReloadInline() {
        return reloadInline;
    }

    /**
     * Sets the value of the reloadInline property.
     * 
     */
    public void setReloadInline(boolean value) {
        this.reloadInline = value;
    }

    /**
     * Gets the value of the supportAutoComplete property.
     * 
     */
    public boolean isSupportAutoComplete() {
        return supportAutoComplete;
    }

    /**
     * Sets the value of the supportAutoComplete property.
     * 
     */
    public void setSupportAutoComplete(boolean value) {
        this.supportAutoComplete = value;
    }

    /**
     * Gets the value of the showReturnLink property.
     * 
     */
    public boolean isShowReturnLink() {
        return showReturnLink;
    }

    /**
     * Sets the value of the showReturnLink property.
     * 
     */
    public void setShowReturnLink(boolean value) {
        this.showReturnLink = value;
    }

    /**
     * Gets the value of the currentAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentAction() {
        return currentAction;
    }

    /**
     * Sets the value of the currentAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentAction(String value) {
        this.currentAction = value;
    }

}
