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
 *         Corresponds to the javax.xml.ws.RespectBinding annotation
 *         or its corresponding javax.xml.ws.RespectBindingFeature web
 *         service feature. This is used to control whether a JAX-WS
 *         implementation must respect/honor the contents of the
 *         wsdl:binding in the WSDL that is associated with the service.
 *         
 *         If the "enabled" element is "true", wsdl:binding in the
 *         associated WSDL, if any, must be respected/honored.
 *         
 *       
 * 
 * <p>Java class for respect-bindingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respect-bindingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enabled" type="{http://xmlns.jcp.org/xml/ns/javaee}true-falseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respect-bindingType", propOrder = {
    "enabled"
})
public class RespectBindingType {

    protected TrueFalseType enabled;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setEnabled(TrueFalseType value) {
        this.enabled = value;
    }

}
