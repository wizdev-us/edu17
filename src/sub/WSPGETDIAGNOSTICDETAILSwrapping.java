package sub;




import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WSP_GETDIAGNOSTICDETAILSwrapping complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="WSP_GETDIAGNOSTICDETAILSwrapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IFID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPANY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SENDER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PARTNER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IN_DATA" type="{http://wm.hmausa.com/CommSupplier.TM_GEN2.COVISINT:WSP_GETDIAGNOSTICDETAILS}IN_DATA" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSP_GETDIAGNOSTICDETAILSwrapping", propOrder = {
    "ifid",
    "company",
    "sender",
    "receiver",
    "partner",
    "indata"
})
public class WSPGETDIAGNOSTICDETAILSwrapping {

    @XmlElementRef(name = "IFID", type = JAXBElement.class)
    protected JAXBElement<String> ifid;
    @XmlElementRef(name = "COMPANY", type = JAXBElement.class)
    protected JAXBElement<String> company;
    @XmlElementRef(name = "SENDER", type = JAXBElement.class)
    protected JAXBElement<String> sender;
    @XmlElementRef(name = "RECEIVER", type = JAXBElement.class)
    protected JAXBElement<String> receiver;
    @XmlElementRef(name = "PARTNER", type = JAXBElement.class)
    protected JAXBElement<String> partner;
    @XmlElementRef(name = "IN_DATA", type = JAXBElement.class)
    protected JAXBElement<INDATA> indata;

    /**
     * ifid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIFID() {
        return ifid;
    }

    /**
     * ifid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIFID(JAXBElement<String> value) {
        this.ifid = value;
    }

    /**
     * company 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMPANY() {
        return company;
    }

    /**
     * company 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMPANY(JAXBElement<String> value) {
        this.company = value;
    }

    /**
     * sender 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSENDER() {
        return sender;
    }

    /**
     * sender 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSENDER(JAXBElement<String> value) {
        this.sender = value;
    }

    /**
     * receiver 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRECEIVER() {
        return receiver;
    }

    /**
     * receiver 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRECEIVER(JAXBElement<String> value) {
        this.receiver = value;
    }

    /**
     * partner 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPARTNER() {
        return partner;
    }

    /**
     * partner 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPARTNER(JAXBElement<String> value) {
        this.partner = value;
    }

    /**
     * indata 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link INDATA }{@code >}
     *     
     */
    public JAXBElement<INDATA> getINDATA() {
        return indata;
    }

    /**
     * indata 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link INDATA }{@code >}
     *     
     */
    public void setINDATA(JAXBElement<INDATA> value) {
        this.indata = value;
    }

}
