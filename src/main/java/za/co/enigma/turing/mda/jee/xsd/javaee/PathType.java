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
 *         The elements that use this type designate either a relative
 *         path or an absolute path starting with a "/".
 *         
 *         In elements that specify a pathname to a file within the
 *         same Deployment File, relative filenames (i.e., those not
 *         starting with "/") are considered relative to the root of
 *         the Deployment File's namespace.  Absolute filenames (i.e.,
 *         those starting with "/") also specify names in the root of
 *         the Deployment File's namespace.  In general, relative names
 *         are preferred.  The exception is .war files where absolute
 *         names are preferred for consistency with the Servlet API.
 *         
 *       
 * 
 * <p>Java class for pathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pathType">
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
@XmlType(name = "pathType")
public class PathType
    extends String
{


}
