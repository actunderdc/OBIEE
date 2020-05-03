
package oracle.bi.web.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScorecardSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScorecardSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentMappings" type="{urn://oracle.bi.webservices/v12}AssessmentMappings" minOccurs="0"/>
 *         &lt;element name="dimensionMappings" type="{urn://oracle.bi.webservices/v12}DimensionMappings" minOccurs="0"/>
 *         &lt;element name="watchlistStylesSet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemInfo" type="{urn://oracle.bi.webservices/v12}ItemInfo" minOccurs="0"/>
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timeOut" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScorecardSettings", propOrder = {
    "assessmentMappings",
    "dimensionMappings",
    "watchlistStylesSet",
    "itemInfo",
    "permission",
    "timeOut"
})
public class ScorecardSettings {

    protected AssessmentMappings assessmentMappings;
    protected DimensionMappings dimensionMappings;
    protected String watchlistStylesSet;
    @XmlElementRef(name = "itemInfo", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<ItemInfo> itemInfo;
    protected Integer permission;
    @XmlElementRef(name = "timeOut", namespace = "urn://oracle.bi.webservices/v12", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timeOut;

    /**
     * Gets the value of the assessmentMappings property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentMappings }
     *     
     */
    public AssessmentMappings getAssessmentMappings() {
        return assessmentMappings;
    }

    /**
     * Sets the value of the assessmentMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentMappings }
     *     
     */
    public void setAssessmentMappings(AssessmentMappings value) {
        this.assessmentMappings = value;
    }

    /**
     * Gets the value of the dimensionMappings property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionMappings }
     *     
     */
    public DimensionMappings getDimensionMappings() {
        return dimensionMappings;
    }

    /**
     * Sets the value of the dimensionMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionMappings }
     *     
     */
    public void setDimensionMappings(DimensionMappings value) {
        this.dimensionMappings = value;
    }

    /**
     * Gets the value of the watchlistStylesSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatchlistStylesSet() {
        return watchlistStylesSet;
    }

    /**
     * Sets the value of the watchlistStylesSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatchlistStylesSet(String value) {
        this.watchlistStylesSet = value;
    }

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItemInfo }{@code >}
     *     
     */
    public JAXBElement<ItemInfo> getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItemInfo }{@code >}
     *     
     */
    public void setItemInfo(JAXBElement<ItemInfo> value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPermission() {
        return permission;
    }

    /**
     * Sets the value of the permission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPermission(Integer value) {
        this.permission = value;
    }

    /**
     * Gets the value of the timeOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimeOut() {
        return timeOut;
    }

    /**
     * Sets the value of the timeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimeOut(JAXBElement<Integer> value) {
        this.timeOut = value;
    }

}
