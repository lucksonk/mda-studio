package za.co.enigma.turing.mda.process.common;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import  za.co.enigma.turing.mda.jee.xsd.persistence.ObjectFactory;
import za.co.enigma.turing.mda.jee.xsd.persistence.Persistence;
import za.co.enigma.turing.mda.jee.xsd.persistence.Persistence.PersistenceUnit;
import za.co.enigma.turing.mda.jee.xsd.persistence.Persistence.PersistenceUnit.Properties;
import za.co.enigma.turing.mda.jee.xsd.persistence.Persistence.PersistenceUnit.Properties.Property;
import za.co.enigma.turing.mda.jee.xsd.persistence.PersistenceUnitTransactionType;


public class PersistenceXMLJAXBConvertorHelper {

	public static void main(String[] args) {
		PersistenceXMLJAXBConvertorHelper helper = new PersistenceXMLJAXBConvertorHelper();

		helper.saveFromObjectToXML();
		helper.readFromXMLToObject();
	}

	private void saveFromObjectToXML() {
		ObjectFactory objectFactory = new ObjectFactory();

		PersistenceUnit persistenceUnit = objectFactory.createPersistencePersistenceUnit();
		persistenceUnit.setName("enigmaTuringDS");
		persistenceUnit.setTransactionType(PersistenceUnitTransactionType.JTA);
		persistenceUnit.setProvider("org.hibernate.jpa.HibernatePersistenceProvider");
		persistenceUnit.setJtaDataSource("java:jboss/datasources/enigmaTuringDS");
		persistenceUnit.setExcludeUnlistedClasses(false);

		Properties persistenceUnitProperties = objectFactory.createPersistencePersistenceUnitProperties();


		Property property1 = objectFactory.createPersistencePersistenceUnitPropertiesProperty();
		property1.setName("hibernate.hbm2ddl.auto");
		property1.setValue("update");

		Property property2 = objectFactory.createPersistencePersistenceUnitPropertiesProperty();
		property2.setName("hibernate.show_sql");
		property2.setValue("true");

		Property property3 = objectFactory.createPersistencePersistenceUnitPropertiesProperty();
		property3.setName("hibernate.format_sql");
		property3.setValue("true");

		persistenceUnitProperties.getProperty().add(property1);
		persistenceUnitProperties.getProperty().add(property2);
		persistenceUnitProperties.getProperty().add(property3);

		persistenceUnit.setProperties(persistenceUnitProperties);

		Persistence persistence = objectFactory.createPersistence();
		persistence.setVersion("2.1");
		persistence.getPersistenceUnit().add(persistenceUnit);

		try {
			File file = new File("/home/luckson/turing_enigma_mda/proof-of-concept/persistence.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Persistence.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(persistence, file);
			jaxbMarshaller.marshal(persistence, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	private void readFromXMLToObject() {
		try {

			File file = new File("/home/luckson/turing_enigma_mda/proof-of-concept/persistence.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Persistence.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Persistence persistence = (Persistence) jaxbUnmarshaller.unmarshal(file);
			System.out.println("read persistence: " + persistence);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
