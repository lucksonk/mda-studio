//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:37:37 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.application;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 *         The port-component-ref element declares a client dependency
 *         on the container for resolving a Service Endpoint Interface
 *         to a WSDL port. It optionally associates the Service Endpoint
 *         Interface with a particular port-component. This is only used
 *         by the container for a Service.getPort(Class) method call.
 *         
 *       
 * 
 * <p>Java class for port-component-refType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="port-component-refType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service-endpoint-interface" type="{http://xmlns.jcp.org/xml/ns/javaee}fully-qualified-classType"/>
 *         &lt;element name="enable-mtom" type="{http://xmlns.jcp.org/xml/ns/javaee}true-falseType" minOccurs="0"/>
 *         &lt;element name="mtom-threshold" type="{http://xmlns.jcp.org/xml/ns/javaee}xsdNonNegativeIntegerType" minOccurs="0"/>
 *         &lt;element name="addressing" type="{http://xmlns.jcp.org/xml/ns/javaee}addressingType" minOccurs="0"/>
 *         &lt;element name="respect-binding" type="{http://xmlns.jcp.org/xml/ns/javaee}respect-bindingType" minOccurs="0"/>
 *         &lt;element name="port-component-link" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "port-component-refType", propOrder = {
    "serviceEndpointInterface",
    "enableMtom",
    "mtomThreshold",
    "addressing",
    "respectBinding",
    "portComponentLink"
})
public class PortComponentRefType {

    @XmlElement(name = "service-endpoint-interface", required = true)
    protected FullyQualifiedClassType serviceEndpointInterface;
    @XmlElement(name = "enable-mtom")
    protected TrueFalseType enableMtom;
    @XmlElement(name = "mtom-threshold")
    protected XsdNonNegativeIntegerType mtomThreshold;
    protected AddressingType addressing;
    @XmlElement(name = "respect-binding")
    protected RespectBindingType respectBinding;
    @XmlElement(name = "port-component-link")
    protected za.co.enigma.turing.mda.jee.xsd.application.String portComponentLink;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the serviceEndpointInterface property.
     * 
     * @return
     *     possible object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public FullyQualifiedClassType getServiceEndpointInterface() {
        return serviceEndpointInterface;
    }

    /**
     * Sets the value of the serviceEndpointInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public void setServiceEndpointInterface(FullyQualifiedClassType value) {
        this.serviceEndpointInterface = value;
    }

    /**
     * Gets the value of the enableMtom property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getEnableMtom() {
        return enableMtom;
    }

    /**
     * Sets the value of the enableMtom property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setEnableMtom(TrueFalseType value) {
        this.enableMtom = value;
    }

    /**
     * Gets the value of the mtomThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link XsdNonNegativeIntegerType }
     *     
     */
    public XsdNonNegativeIntegerType getMtomThreshold() {
        return mtomThreshold;
    }

    /**
     * Sets the value of the mtomThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdNonNegativeIntegerType }
     *     
     */
    public void setMtomThreshold(XsdNonNegativeIntegerType value) {
        this.mtomThreshold = value;
    }

    /**
     * Gets the value of the addressing property.
     * 
     * @return
     *     possible object is
     *     {@link AddressingType }
     *     
     */
    public AddressingType getAddressing() {
        return addressing;
    }

    /**
     * Sets the value of the addressing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressingType }
     *     
     */
    public void setAddressing(AddressingType value) {
        this.addressing = value;
    }

    /**
     * Gets the value of the respectBinding property.
     * 
     * @return
     *     possible object is
     *     {@link RespectBindingType }
     *     
     */
    public RespectBindingType getRespectBinding() {
        return respectBinding;
    }

    /**
     * Sets the value of the respectBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespectBindingType }
     *     
     */
    public void setRespectBinding(RespectBindingType value) {
        this.respectBinding = value;
    }

    /**
     * Gets the value of the portComponentLink property.
     * 
     * @return
     *     possible object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.application.String }
     *     
     */
    public za.co.enigma.turing.mda.jee.xsd.application.String getPortComponentLink() {
        return portComponentLink;
    }

    /**
     * Sets the value of the portComponentLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.application.String }
     *     
     */
    public void setPortComponentLink(za.co.enigma.turing.mda.jee.xsd.application.String value) {
        this.portComponentLink = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
