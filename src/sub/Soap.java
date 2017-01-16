package sub;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Soap {
	public static void main(String[] args) {   
  
  try {   
      
   // create JAXB context and initializing Marshaller   
   JAXBContext jaxbContext = JAXBContext.newInstance(WSPGETDIAGNOSTICDETAILSwrapping.class);   
  
   Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();   
      
   // specify the location and name of xml file to be read   
   File XMLfile = new File("C:\\abc.xml");   
      
   // this will create Java object - country from the XML file   
   WSPGETDIAGNOSTICDETAILSwrapping countryIndia = (WSPGETDIAGNOSTICDETAILSwrapping) jaxbUnmarshaller.unmarshal(XMLfile);   
  
  } catch (JAXBException e) {   
   // some exception occured   
   e.printStackTrace();   
  }   
  
 }

}