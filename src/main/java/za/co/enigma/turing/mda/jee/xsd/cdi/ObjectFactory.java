//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:12:30 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.cdi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.co.enigma.turing.mda.jee.xsd.cdi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlternativesStereotype_QNAME = new QName("http://xmlns.jcp.org/xml/ns/javaee", "stereotype");
    private final static QName _AlternativesClass_QNAME = new QName("http://xmlns.jcp.org/xml/ns/javaee", "class");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.co.enigma.turing.mda.jee.xsd.cdi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Scan }
     * 
     */
    public Scan createScan() {
        return new Scan();
    }

    /**
     * Create an instance of {@link Scan.Exclude }
     * 
     */
    public Scan.Exclude createScanExclude() {
        return new Scan.Exclude();
    }

    /**
     * Create an instance of {@link Decorators }
     * 
     */
    public Decorators createDecorators() {
        return new Decorators();
    }

    /**
     * Create an instance of {@link Beans }
     * 
     */
    public Beans createBeans() {
        return new Beans();
    }

    /**
     * Create an instance of {@link Interceptors }
     * 
     */
    public Interceptors createInterceptors() {
        return new Interceptors();
    }

    /**
     * Create an instance of {@link Alternatives }
     * 
     */
    public Alternatives createAlternatives() {
        return new Alternatives();
    }

    /**
     * Create an instance of {@link Scan.Exclude.IfClassAvailable }
     * 
     */
    public Scan.Exclude.IfClassAvailable createScanExcludeIfClassAvailable() {
        return new Scan.Exclude.IfClassAvailable();
    }

    /**
     * Create an instance of {@link Scan.Exclude.IfClassNotAvailable }
     * 
     */
    public Scan.Exclude.IfClassNotAvailable createScanExcludeIfClassNotAvailable() {
        return new Scan.Exclude.IfClassNotAvailable();
    }

    /**
     * Create an instance of {@link Scan.Exclude.IfSystemProperty }
     * 
     */
    public Scan.Exclude.IfSystemProperty createScanExcludeIfSystemProperty() {
        return new Scan.Exclude.IfSystemProperty();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.jcp.org/xml/ns/javaee", name = "stereotype", scope = Alternatives.class)
    public JAXBElement<String> createAlternativesStereotype(String value) {
        return new JAXBElement<String>(_AlternativesStereotype_QNAME, String.class, Alternatives.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.jcp.org/xml/ns/javaee", name = "class", scope = Alternatives.class)
    public JAXBElement<String> createAlternativesClass(String value) {
        return new JAXBElement<String>(_AlternativesClass_QNAME, String.class, Alternatives.class, value);
    }

}
