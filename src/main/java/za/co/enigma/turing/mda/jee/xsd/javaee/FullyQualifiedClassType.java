//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:42:32 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.javaee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *         The elements that use this type designate the name of a
 *         Java class or interface.  The name is in the form of a
 *         "binary name", as defined in the JLS.  This is the form
 *         of name used in Class.forName().  Tools that need the
 *         canonical name (the name used in source code) will need
 *         to convert this binary name to the canonical name.
 *         
 *       
 * 
 * <p>Java class for fully-qualified-classType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fully-qualified-classType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://xmlns.jcp.org/xml/ns/javaee>string">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fully-qualified-classType")
@XmlSeeAlso({
    LocalHomeType.class,
    RemoteType.class,
    MessageDestinationTypeType.class,
    HomeType.class,
    LocalType.class,
    EnvEntryTypeValuesType.class
})
public class FullyQualifiedClassType
    extends String
{


}
