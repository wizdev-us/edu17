package sub;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IN_DATA complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IN_DATA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NADID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ODOMETER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SIGNALTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IN_DATA", propOrder = {
    "vin",
    "tid",
    "nadid",
    "odometer",
    "signaltype"
})
public class INDATA {

    @XmlElementRef(name = "VIN", type = JAXBElement.class)
    protected JAXBElement<String> vin;
    @XmlElementRef(name = "TID", type = JAXBElement.class)
    protected JAXBElement<String> tid;
    @XmlElementRef(name = "NADID", type = JAXBElement.class)
    protected JAXBElement<String> nadid;
    @XmlElementRef(name = "ODOMETER", type = JAXBElement.class)
    protected JAXBElement<String> odometer;
    @XmlElementRef(name = "SIGNALTYPE", type = JAXBElement.class)
    protected JAXBElement<String> signaltype;

    /**
     * vin 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVIN() {
        return vin;
    }

    /**
     * vin 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVIN(JAXBElement<String> value) {
        this.vin = value;
    }

    /**
     * tid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTID() {
        return tid;
    }

    /**
     * tid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTID(JAXBElement<String> value) {
        this.tid = value;
    }

    /**
     * nadid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNADID() {
        return nadid;
    }

    /**
     * nadid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNADID(JAXBElement<String> value) {
        this.nadid = value;
    }

    /**
     * odometer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getODOMETER() {
        return odometer;
    }

    /**
     * odometer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setODOMETER(JAXBElement<String> value) {
        this.odometer = value;
    }

    /**
     * signaltype 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSIGNALTYPE() {
        return signaltype;
    }

    /**
     * signaltype 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSIGNALTYPE(JAXBElement<String> value) {
        this.signaltype = value;
    }

}
