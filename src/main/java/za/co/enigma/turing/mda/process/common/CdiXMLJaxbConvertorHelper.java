package za.co.enigma.turing.mda.process.common;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import za.co.enigma.turing.mda.jee.xsd.cdi.Beans;
import za.co.enigma.turing.mda.jee.xsd.cdi.ObjectFactory;

public class CdiXMLJaxbConvertorHelper {

	public static void main(String[] args) {
		CdiXMLJaxbConvertorHelper helper = new CdiXMLJaxbConvertorHelper();
		helper.saveFromObjectToXML();
		helper.readFromXMLToObject();
	}

	private void saveFromObjectToXML() {
		ObjectFactory objectFactory = new ObjectFactory();
		Beans beans = objectFactory.createBeans();
		beans.setVersion("1.1");
		beans.setBeanDiscoveryMode("all");
		
		try {
			File file = new File("/home/luckson/turing_enigma_mda/proof-of-concept/beans.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Beans.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(beans, file);
			jaxbMarshaller.marshal(beans, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	private void readFromXMLToObject() {
		try {
			File file = new File("/home/luckson/turing_enigma_mda/proof-of-concept/beans.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Beans.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Beans beans = (Beans) jaxbUnmarshaller.unmarshal(file);
			System.out.println("read cdi: " + beans);
		} catch (JAXBException e) {
			e.printStackTrace();
		}	
	}
}
