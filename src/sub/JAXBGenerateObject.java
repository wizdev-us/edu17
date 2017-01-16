package sub;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBGenerateObject {

	public static void main(String[] args) {

		try {

			// create file input stream
			InputStream is = new FileInputStream("D:\\MyOrder.xml");
			// XML and Java binding
			JAXBContext jaxbContext = JAXBContext.newInstance(OrderHeader.class);

			// class responsible for the process of deserializing
			// XML data into Java object
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			OrderHeader orderHeader = (OrderHeader) jaxbUnmarshaller.unmarshal(is);

			// print the response for debugging
			System.out.println("Order Information --->");
			System.out.println("Customer Id: " + orderHeader.getCustomerId());
			System.out.println("Order Id: " + orderHeader.getOrderId());
			System.out.println("Order Total: " + orderHeader.getOrderTotal());

			ArrayList<OrderDetail> orderDetailList = orderHeader.getOrderDetailList();
			for (int i = 0; i < orderDetailList.size(); i++) {
				System.out.println("Order Detail --->");
				OrderDetail orderDetail = orderDetailList.get(i);
				System.out.println("Line Id: " + orderDetail.getLineId());
				System.out.println("Item Number: " + orderDetail.getItemNumber());
				System.out.println("Quantity: " + orderDetail.getQuantity());
				System.out.println("Price: " + orderDetail.getPrice());

			}

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
