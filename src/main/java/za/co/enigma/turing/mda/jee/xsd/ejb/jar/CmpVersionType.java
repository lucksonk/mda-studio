//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:41:27 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.ejb.jar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *         The cmp-versionType specifies the version of an entity bean
 *         with container-managed persistence. It is used by
 *         cmp-version elements.
 *         
 *         The value must be one of the two following:
 *         
 *         1.x
 *         2.x
 *         
 *         Support for entity beans is optional as of EJB 3.2.
 *         
 *       
 * 
 * <p>Java class for cmp-versionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmp-versionType">
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
@XmlType(name = "cmp-versionType")
public class CmpVersionType
    extends String
{


}
