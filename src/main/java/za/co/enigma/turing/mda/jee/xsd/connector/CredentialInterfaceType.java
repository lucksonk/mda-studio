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
 * 
 *         The credential-interfaceType specifies the
 *         interface that the resource adapter implementation
 *         supports for the representation of the
 *         credentials. This element(s) that use this type,
 *         i.e. credential-interface,  should be used by
 *         application server to find out the Credential
 *         interface it should use as part of the security
 *         contract.
 *         
 *         The possible values are:
 *         
 *         javax.resource.spi.security.PasswordCredential
 *         org.ietf.jgss.GSSCredential
 *         javax.resource.spi.security.GenericCredential
 *         
 *       
 * 
 * <p>Java class for credential-interfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="credential-interfaceType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://xmlns.jcp.org/xml/ns/javaee>fully-qualified-classType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credential-interfaceType")
public class CredentialInterfaceType
    extends FullyQualifiedClassType
{


}
