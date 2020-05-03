
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromptStepRunTimeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromptStepRunTimeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applyToAllSteps" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="autoApplyPrompt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showResetButton" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="remaininglRequiredPromptsOnSubsequentSteps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstPromptStartIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromptStepRunTimeInfo", propOrder = {
    "applyToAllSteps",
    "autoApplyPrompt",
    "showResetButton",
    "remaininglRequiredPromptsOnSubsequentSteps",
    "firstPromptStartIndex"
})
public class PromptStepRunTimeInfo {

    protected boolean applyToAllSteps;
    protected boolean autoApplyPrompt;
    protected boolean showResetButton;
    protected int remaininglRequiredPromptsOnSubsequentSteps;
    protected int firstPromptStartIndex;

    /**
     * Gets the value of the applyToAllSteps property.
     * 
     */
    public boolean isApplyToAllSteps() {
        return applyToAllSteps;
    }

    /**
     * Sets the value of the applyToAllSteps property.
     * 
     */
    public void setApplyToAllSteps(boolean value) {
        this.applyToAllSteps = value;
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
     * Gets the value of the remaininglRequiredPromptsOnSubsequentSteps property.
     * 
     */
    public int getRemaininglRequiredPromptsOnSubsequentSteps() {
        return remaininglRequiredPromptsOnSubsequentSteps;
    }

    /**
     * Sets the value of the remaininglRequiredPromptsOnSubsequentSteps property.
     * 
     */
    public void setRemaininglRequiredPromptsOnSubsequentSteps(int value) {
        this.remaininglRequiredPromptsOnSubsequentSteps = value;
    }

    /**
     * Gets the value of the firstPromptStartIndex property.
     * 
     */
    public int getFirstPromptStartIndex() {
        return firstPromptStartIndex;
    }

    /**
     * Sets the value of the firstPromptStartIndex property.
     * 
     */
    public void setFirstPromptStartIndex(int value) {
        this.firstPromptStartIndex = value;
    }

}
