//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:42:32 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.javaee;

import java.util.ArrayList;
import java.util.List;
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
 *         Configuration of a Mail Session resource.
 *         
 *       
 * 
 * <p>Java class for mail-sessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mail-sessionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://xmlns.jcp.org/xml/ns/javaee}descriptionType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://xmlns.jcp.org/xml/ns/javaee}jndi-nameType"/>
 *         &lt;element name="store-protocol" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *         &lt;element name="store-protocol-class" type="{http://xmlns.jcp.org/xml/ns/javaee}fully-qualified-classType" minOccurs="0"/>
 *         &lt;element name="transport-protocol" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *         &lt;element name="transport-protocol-class" type="{http://xmlns.jcp.org/xml/ns/javaee}fully-qualified-classType" minOccurs="0"/>
 *         &lt;element name="host" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *         &lt;element name="from" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *         &lt;element name="property" type="{http://xmlns.jcp.org/xml/ns/javaee}propertyType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "mail-sessionType", propOrder = {
    "description",
    "name",
    "storeProtocol",
    "storeProtocolClass",
    "transportProtocol",
    "transportProtocolClass",
    "host",
    "user",
    "password",
    "from",
    "property"
})
public class MailSessionType {

    protected DescriptionType description;
    @XmlElement(required = true)
    protected JndiNameType name;
    @XmlElement(name = "store-protocol")
    protected za.co.enigma.turing.mda.jee.xsd.javaee.String storeProtocol;
    @XmlElement(name = "store-protocol-class")
    protected FullyQualifiedClassType storeProtocolClass;
    @XmlElement(name = "transport-protocol")
    protected za.co.enigma.turing.mda.jee.xsd.javaee.String transportProtocol;
    @XmlElement(name = "transport-protocol-class")
    protected FullyQualifiedClassType transportProtocolClass;
    protected za.co.enigma.turing.mda.jee.xsd.javaee.String host;
    protected za.co.enigma.turing.mda.jee.xsd.javaee.String user;
    protected za.co.enigma.turing.mda.jee.xsd.javaee.String password;
    protected za.co.enigma.turing.mda.jee.xsd.javaee.String from;
    protected List<PropertyType> property;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JndiNameType }
     *     
     */
    public JndiNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JndiNameType }
     *     
     */
    public void setName(JndiNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the storeProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public za.co.enigma.turing.mda.jee.xsd.javaee.String getStoreProtocol() {
        return storeProtocol;
    }

    /**
     * Sets the value of the storeProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public void setStoreProtocol(za.co.enigma.turing.mda.jee.xsd.javaee.String value) {
        this.storeProtocol = value;
    }

    /**
     * Gets the value of the storeProtocolClass property.
     * 
     * @return
     *     possible object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public FullyQualifiedClassType getStoreProtocolClass() {
        return storeProtocolClass;
    }

    /**
     * Sets the value of the storeProtocolClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public void setStoreProtocolClass(FullyQualifiedClassType value) {
        this.storeProtocolClass = value;
    }

    /**
     * Gets the value of the transportProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public za.co.enigma.turing.mda.jee.xsd.javaee.String getTransportProtocol() {
        return transportProtocol;
    }

    /**
     * Sets the value of the transportProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public void setTransportProtocol(za.co.enigma.turing.mda.jee.xsd.javaee.String value) {
        this.transportProtocol = value;
    }

    /**
     * Gets the value of the transportProtocolClass property.
     * 
     * @return
     *     possible object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public FullyQualifiedClassType getTransportProtocolClass() {
        return transportProtocolClass;
    }

    /**
     * Sets the value of the transportProtocolClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public void setTransportProtocolClass(FullyQualifiedClassType value) {
        this.transportProtocolClass = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public za.co.enigma.turing.mda.jee.xsd.javaee.String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public void setHost(za.co.enigma.turing.mda.jee.xsd.javaee.String value) {
        this.host = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public za.co.enigma.turing.mda.jee.xsd.javaee.String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public void setUser(za.co.enigma.turing.mda.jee.xsd.javaee.String value) {
        this.user = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public za.co.enigma.turing.mda.jee.xsd.javaee.String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public void setPassword(za.co.enigma.turing.mda.jee.xsd.javaee.String value) {
        this.password = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public za.co.enigma.turing.mda.jee.xsd.javaee.String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.javaee.String }
     *     
     */
    public void setFrom(za.co.enigma.turing.mda.jee.xsd.javaee.String value) {
        this.from = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<PropertyType>();
        }
        return this.property;
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
