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
 *         The result-type-mappingType is used in the query element to
 *         specify whether an abstract schema type returned by a query
 *         for a select method is to be mapped to an EJBLocalObject or
 *         EJBObject type.
 *         
 *         The value must be one of the following:
 *         
 *         Local
 *         Remote
 *         
 *       
 * 
 * <p>Java class for result-type-mappingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="result-type-mappingType">
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
@XmlType(name = "result-type-mappingType")
public class ResultTypeMappingType
    extends String
{


}
