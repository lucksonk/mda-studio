//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:42:32 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.javaee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *         The res-sharing-scope type specifies whether connections
 *         obtained through the given resource manager connection
 *         factory reference can be shared. The value, if specified,
 *         must be one of the two following:
 *         
 *         Shareable
 *         Unshareable
 *         
 *         The default value is Shareable.
 *         
 *       
 * 
 * <p>Java class for res-sharing-scopeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="res-sharing-scopeType">
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
@XmlType(name = "res-sharing-scopeType")
public class ResSharingScopeType
    extends String
{


}
