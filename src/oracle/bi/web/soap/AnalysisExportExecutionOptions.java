
package oracle.bi.web.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnalysisExportExecutionOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalysisExportExecutionOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="async" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="useMtom" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refresh" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisExportExecutionOptions", propOrder = {
    "async",
    "useMtom",
    "refresh"
})
public class AnalysisExportExecutionOptions {

    protected boolean async;
    protected boolean useMtom;
    protected boolean refresh;

    /**
     * Gets the value of the async property.
     * 
     */
    public boolean isAsync() {
        return async;
    }

    /**
     * Sets the value of the async property.
     * 
     */
    public void setAsync(boolean value) {
        this.async = value;
    }

    /**
     * Gets the value of the useMtom property.
     * 
     */
    public boolean isUseMtom() {
        return useMtom;
    }

    /**
     * Sets the value of the useMtom property.
     * 
     */
    public void setUseMtom(boolean value) {
        this.useMtom = value;
    }

    /**
     * Gets the value of the refresh property.
     * 
     */
    public boolean isRefresh() {
        return refresh;
    }

    /**
     * Sets the value of the refresh property.
     * 
     */
    public void setRefresh(boolean value) {
        this.refresh = value;
    }

}
