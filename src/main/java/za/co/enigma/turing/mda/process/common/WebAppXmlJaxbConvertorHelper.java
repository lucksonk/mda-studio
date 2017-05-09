package za.co.enigma.turing.mda.process.common;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import  za.co.enigma.turing.mda.jee.xsd.web.app.ObjectFactory;
import za.co.enigma.turing.mda.jee.xsd.web.app.WebAppType;


public class WebAppXmlJaxbConvertorHelper {


	public static void main(String[] args) {
		WebAppXmlJaxbConvertorHelper helper = new WebAppXmlJaxbConvertorHelper();
		helper.saveFromObjectToXML();
		helper.readFromXMLToObject();
	}

	private void saveFromObjectToXML() {
		ObjectFactory objectFactory = new ObjectFactory();
		WebAppType webAppType = objectFactory.createWebAppType();
		webAppType.setVersion("3.1");
		
		try {
			File file = new File("/home/luckson/turing_enigma_mda/proof-of-concept/web.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(WebAppType.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(webAppType, file);
			jaxbMarshaller.marshal(webAppType, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	

	private void readFromXMLToObject() {
		try {

			File file = new File("/home/luckson/turing_enigma_mda/proof-of-concept/web.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(WebAppType.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			WebAppType webAppType = (WebAppType) jaxbUnmarshaller.unmarshal(file);
			System.out.println("read web: " + webAppType);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
