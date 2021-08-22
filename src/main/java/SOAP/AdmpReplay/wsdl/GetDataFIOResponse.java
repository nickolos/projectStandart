
package SOAP.AdmpReplay.wsdl;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetDataFIOResult" type="{http://gibdd.ru}Result"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getDataFIOResult"
})
@XmlRootElement(name = "GetDataFIOResponse")
public class GetDataFIOResponse {

    @XmlElement(name = "GetDataFIOResult", required = true)
    protected Result getDataFIOResult;

    /**
     * Gets the value of the getDataFIOResult property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getGetDataFIOResult() {
        return getDataFIOResult;
    }

    /**
     * Sets the value of the getDataFIOResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setGetDataFIOResult(Result value) {
        this.getDataFIOResult = value;
    }

}
