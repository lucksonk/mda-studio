//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:55:29 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.web.app;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *         The domain name that will be assigned to any session tracking
 *         cookies created by this web application.
 *         
 *         Used in: cookie-config
 *         
 *       
 * 
 * <p>Java class for cookie-domainType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cookie-domainType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://xmlns.jcp.org/xml/ns/javaee>nonEmptyStringType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cookie-domainType")
public class CookieDomainType
    extends NonEmptyStringType
{


}