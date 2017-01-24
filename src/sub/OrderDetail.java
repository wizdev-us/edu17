package sub;

import javax.xml.bind.annotation.XmlAttribute;

public class OrderDetail {

	String lineId = null;
	String itemNumber = null;
	int quantity = 0;
	Double price = null;

	public String getLineId() {
		return lineId;
	}

	// this makes it an attribute for the parent node
	@XmlAttribute
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}