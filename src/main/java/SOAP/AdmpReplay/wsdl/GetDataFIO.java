
package SOAP.AdmpReplay.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="pFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pBirtdhDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pOGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="pINN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "pFamily",
    "pName",
    "pFatherName",
    "pBirtdhDate",
    "pogrn",
    "pStartDate",
    "pinn"
})
@XmlRootElement(name = "GetDataFIO")
public class GetDataFIO {

    protected String pFamily;
    protected String pName;
    protected String pFatherName;
    protected String pBirtdhDate;
    @XmlElement(name = "pOGRN")
    protected String pogrn;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pStartDate;
    @XmlElement(name = "pINN")
    protected String pinn;

    /**
     * Gets the value of the pFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFamily() {
        return pFamily;
    }

    /**
     * Sets the value of the pFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFamily(String value) {
        this.pFamily = value;
    }

    /**
     * Gets the value of the pName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPName() {
        return pName;
    }

    /**
     * Sets the value of the pName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPName(String value) {
        this.pName = value;
    }

    /**
     * Gets the value of the pFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFatherName() {
        return pFatherName;
    }

    /**
     * Sets the value of the pFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFatherName(String value) {
        this.pFatherName = value;
    }

    /**
     * Gets the value of the pBirtdhDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBirtdhDate() {
        return pBirtdhDate;
    }

    /**
     * Sets the value of the pBirtdhDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBirtdhDate(String value) {
        this.pBirtdhDate = value;
    }

    /**
     * Gets the value of the pogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOGRN() {
        return pogrn;
    }

    /**
     * Sets the value of the pogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOGRN(String value) {
        this.pogrn = value;
    }

    /**
     * Gets the value of the pStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPStartDate() {
        return pStartDate;
    }

    /**
     * Sets the value of the pStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPStartDate(XMLGregorianCalendar value) {
        this.pStartDate = value;
    }

    /**
     * Gets the value of the pinn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINN() {
        return pinn;
    }

    /**
     * Sets the value of the pinn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINN(String value) {
        this.pinn = value;
    }

}
