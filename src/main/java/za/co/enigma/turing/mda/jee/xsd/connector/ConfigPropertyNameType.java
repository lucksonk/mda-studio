//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:40:30 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.connector;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         [
 *         The config-property-nameType contains the name of a
 *         configuration property.
 *         
 *         The connector architecture defines a set of well-defined
 *         properties all of type java.lang.String. These are as
 *         follows.
 *         
 *         ServerName
 *         PortNumber
 *         UserName
 *         Password
 *         ConnectionURL
 *         
 *         A resource adapter provider can extend this property set to
 *         include properties specific to the resource adapter and its
 *         underlying EIS.
 *         
 *         Possible values include
 *         	  ServerName
 *         	  PortNumber
 *         	  UserName
 *         	  Password
 *         	  ConnectionURL
 *         
 *         Example: <config-property-name>ServerName</config-property-name>
 *         
 *         
 *       
 * 
 * <p>Java class for config-property-nameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="config-property-nameType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://xmlns.jcp.org/xml/ns/javaee>xsdStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "config-property-nameType")
public class ConfigPropertyNameType
    extends XsdStringType
{


}
