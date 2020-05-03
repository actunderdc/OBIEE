
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="promptsObj" type="{urn://oracle.bi.webservices/v12}PromptsObjectModel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "promptsObj"
})
@XmlRootElement(name = "getPromptElementsResult")
public class GetPromptElementsResult {

    @XmlElement(required = true, nillable = true)
    protected PromptsObjectModel promptsObj;

    /**
     * Gets the value of the promptsObj property.
     * 
     * @return
     *     possible object is
     *     {@link PromptsObjectModel }
     *     
     */
    public PromptsObjectModel getPromptsObj() {
        return promptsObj;
    }

    /**
     * Sets the value of the promptsObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptsObjectModel }
     *     
     */
    public void setPromptsObj(PromptsObjectModel value) {
        this.promptsObj = value;
    }

}
