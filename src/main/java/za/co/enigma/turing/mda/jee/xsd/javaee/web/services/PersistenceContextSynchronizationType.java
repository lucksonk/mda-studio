//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:43:28 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.javaee.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *         The persistence-context-synchronizationType specifies 
 *         whether a container-managed persistence context is automatically
 *         synchronized with the current transaction.
 *         
 *         The value of the persistence-context-synchronization element 
 *         must be one of the following:
 *         Synchronized
 *         Unsynchronized
 *         
 *       
 * 
 * <p>Java class for persistence-context-synchronizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistence-context-synchronizationType">
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
@XmlType(name = "persistence-context-synchronizationType")
public class PersistenceContextSynchronizationType
    extends String
{


}
