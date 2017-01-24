package sub;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

//the root-element of our order XML file
@XmlRootElement(namespace = "http://www.mysamplecode.com/ws/v10")
public class OrderHeader {

	String customerId = null;
	String orderId = null;
	Double orderTotal = null;
	ArrayList<OrderDetail> orderDetailList;

	public String getCustomerId() {
		return customerId;
	}

	// defines the XML element name and it's namespace
	@XmlElement(name = "CustomerId", namespace = "http://www.mysamplecode.com/ws/v10")
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getOrderId() {
		return orderId;
	}

	// this makes it an attribute for the parent node
	@XmlAttribute
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Double getOrderTotal() {
		return orderTotal;
	}

	// rename the given element
	@XmlElement(name = "OrderTotal")
	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public ArrayList<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	// adds a wrapper element around the XML representation
	@XmlElementWrapper(name = "OrderDetails")

	// override the name for the XML element
	@XmlElement(name = "OrderDetail")
	public void setOrderDetailList(ArrayList<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

}