//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:37:37 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.application;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *         The message-destination-linkType is used to link a message
 *         destination reference or message-driven bean to a message
 *         destination.
 *         
 *         The Assembler sets the value to reflect the flow of messages
 *         between producers and consumers in the application.
 *         
 *         The value must be the message-destination-name of a message
 *         destination in the same Deployment File or in another
 *         Deployment File in the same Java EE application unit.
 *         
 *         Alternatively, the value may be composed of a path name
 *         specifying a Deployment File containing the referenced
 *         message destination with the message-destination-name of the
 *         destination appended and separated from the path name by
 *         "#". The path name is relative to the Deployment File
 *         containing Deployment Component that is referencing the
 *         message destination.  This allows multiple message
 *         destinations with the same name to be uniquely identified.
 *         
 *       
 * 
 * <p>Java class for message-destination-linkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message-destination-linkType">
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
@XmlType(name = "message-destination-linkType")
public class MessageDestinationLinkType
    extends String
{


}
