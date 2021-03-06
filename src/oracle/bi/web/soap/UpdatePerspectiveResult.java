
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
 *         &lt;element name="perspective" type="{urn://oracle.bi.webservices/v12}Perspective"/>
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
    "perspective"
})
@XmlRootElement(name = "updatePerspectiveResult")
public class UpdatePerspectiveResult {

    @XmlElement(required = true)
    protected Perspective perspective;

    /**
     * Gets the value of the perspective property.
     * 
     * @return
     *     possible object is
     *     {@link Perspective }
     *     
     */
    public Perspective getPerspective() {
        return perspective;
    }

    /**
     * Sets the value of the perspective property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perspective }
     *     
     */
    public void setPerspective(Perspective value) {
        this.perspective = value;
    }

}
