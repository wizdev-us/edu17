package sub;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

public class JAXBGenerateXML {

	public static void main(String[] args) {

		OrderHeader orderHeader = new OrderHeader();
		orderHeader.setCustomerId("CUST01");
		orderHeader.setOrderId("101010");
		orderHeader.setOrderTotal(99.99);

		ArrayList<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();

		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setLineId("1");
		orderDetail.setItemNumber("ABC");
		orderDetail.setQuantity(9);
		orderDetail.setPrice(10.00);
		orderDetailList.add(orderDetail);

		orderDetail = new OrderDetail();
		orderDetail.setLineId("2");
		orderDetail.setItemNumber("XYZ");
		orderDetail.setQuantity(1);
		orderDetail.setPrice(9.99);
		orderDetailList.add(orderDetail);

		orderHeader.setOrderDetailList(orderDetailList);

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(OrderHeader.class);
			// class responsible for the process of
			// serializing Java object into XML data
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// marshalled XML data is formatted with linefeeds and indentation
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// specify the xsi:schemaLocation attribute value
			// to place in the marshalled XML output
			jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,
					"http://www.mysamplecode.com/ws/v10 OrderService_v10.xsd");
//			try {
//				// override for custom namespace prefix
//				jaxbMarshaller.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper", new MyNamespaceMapper());
//			} catch (PropertyException e) {
//				System.out.println(e);
//			}

			// send to console
			jaxbMarshaller.marshal(orderHeader, System.out);
			// send to file system
//			OutputStream os = new FileOutputStream("D:\\MyOrder.xml");
			OutputStream os = new FileOutputStream(System.getProperty("user.dir") + "\\MyOrder.xml");
			jaxbMarshaller.marshal(orderHeader, os);

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}