
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="scorecardSettings" type="{urn://oracle.bi.webservices/v12}ScorecardSettings" minOccurs="0"/>
 *         &lt;element name="perspectives" type="{urn://oracle.bi.webservices/v12}PerspectiveList" minOccurs="0"/>
 *         &lt;element name="strategyNodes" type="{urn://oracle.bi.webservices/v12}StrategyNodeList" minOccurs="0"/>
 *         &lt;element name="initiativeNodes" type="{urn://oracle.bi.webservices/v12}InitiativeNodeList" minOccurs="0"/>
 *         &lt;element name="causeEffectLinkages" type="{urn://oracle.bi.webservices/v12}CauseAndEffectLinkages" minOccurs="0"/>
 *         &lt;element name="viewDocuments" type="{urn://oracle.bi.webservices/v12}ScorecardViewDocuments" minOccurs="0"/>
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
    "scorecardSettings",
    "perspectives",
    "strategyNodes",
    "initiativeNodes",
    "causeEffectLinkages",
    "viewDocuments"
})
@XmlRootElement(name = "getScorecardDetailsResult")
public class GetScorecardDetailsResult {

    protected ScorecardSettings scorecardSettings;
    protected PerspectiveList perspectives;
    protected StrategyNodeList strategyNodes;
    protected InitiativeNodeList initiativeNodes;
    protected CauseAndEffectLinkages causeEffectLinkages;
    protected ScorecardViewDocuments viewDocuments;

    /**
     * Gets the value of the scorecardSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardSettings }
     *     
     */
    public ScorecardSettings getScorecardSettings() {
        return scorecardSettings;
    }

    /**
     * Sets the value of the scorecardSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardSettings }
     *     
     */
    public void setScorecardSettings(ScorecardSettings value) {
        this.scorecardSettings = value;
    }

    /**
     * Gets the value of the perspectives property.
     * 
     * @return
     *     possible object is
     *     {@link PerspectiveList }
     *     
     */
    public PerspectiveList getPerspectives() {
        return perspectives;
    }

    /**
     * Sets the value of the perspectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerspectiveList }
     *     
     */
    public void setPerspectives(PerspectiveList value) {
        this.perspectives = value;
    }

    /**
     * Gets the value of the strategyNodes property.
     * 
     * @return
     *     possible object is
     *     {@link StrategyNodeList }
     *     
     */
    public StrategyNodeList getStrategyNodes() {
        return strategyNodes;
    }

    /**
     * Sets the value of the strategyNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategyNodeList }
     *     
     */
    public void setStrategyNodes(StrategyNodeList value) {
        this.strategyNodes = value;
    }

    /**
     * Gets the value of the initiativeNodes property.
     * 
     * @return
     *     possible object is
     *     {@link InitiativeNodeList }
     *     
     */
    public InitiativeNodeList getInitiativeNodes() {
        return initiativeNodes;
    }

    /**
     * Sets the value of the initiativeNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiativeNodeList }
     *     
     */
    public void setInitiativeNodes(InitiativeNodeList value) {
        this.initiativeNodes = value;
    }

    /**
     * Gets the value of the causeEffectLinkages property.
     * 
     * @return
     *     possible object is
     *     {@link CauseAndEffectLinkages }
     *     
     */
    public CauseAndEffectLinkages getCauseEffectLinkages() {
        return causeEffectLinkages;
    }

    /**
     * Sets the value of the causeEffectLinkages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseAndEffectLinkages }
     *     
     */
    public void setCauseEffectLinkages(CauseAndEffectLinkages value) {
        this.causeEffectLinkages = value;
    }

    /**
     * Gets the value of the viewDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ScorecardViewDocuments }
     *     
     */
    public ScorecardViewDocuments getViewDocuments() {
        return viewDocuments;
    }

    /**
     * Sets the value of the viewDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorecardViewDocuments }
     *     
     */
    public void setViewDocuments(ScorecardViewDocuments value) {
        this.viewDocuments = value;
    }

}
