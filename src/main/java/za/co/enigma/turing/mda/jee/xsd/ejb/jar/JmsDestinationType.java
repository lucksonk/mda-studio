//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:41:27 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.ejb.jar;

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
 *         Configuration of a JMS Destination.
 *         
 *       
 * 
 * <p>Java class for jms-destinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jms-destinationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://xmlns.jcp.org/xml/ns/javaee}descriptionType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://xmlns.jcp.org/xml/ns/javaee}jndi-nameType"/>
 *         &lt;element name="interface-name" type="{http://xmlns.jcp.org/xml/ns/javaee}fully-qualified-classType"/>
 *         &lt;element name="class-name" type="{http://xmlns.jcp.org/xml/ns/javaee}fully-qualified-classType" minOccurs="0"/>
 *         &lt;element name="resource-adapter" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *         &lt;element name="destination-name" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
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
@XmlType(name = "jms-destinationType", propOrder = {
    "description",
    "name",
    "interfaceName",
    "className",
    "resourceAdapter",
    "destinationName",
    "property"
})
public class JmsDestinationType {

    protected DescriptionType description;
    @XmlElement(required = true)
    protected JndiNameType name;
    @XmlElement(name = "interface-name", required = true)
    protected FullyQualifiedClassType interfaceName;
    @XmlElement(name = "class-name")
    protected FullyQualifiedClassType className;
    @XmlElement(name = "resource-adapter")
    protected za.co.enigma.turing.mda.jee.xsd.ejb.jar.String resourceAdapter;
    @XmlElement(name = "destination-name")
    protected za.co.enigma.turing.mda.jee.xsd.ejb.jar.String destinationName;
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
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public FullyQualifiedClassType getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public void setInterfaceName(FullyQualifiedClassType value) {
        this.interfaceName = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public FullyQualifiedClassType getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyQualifiedClassType }
     *     
     */
    public void setClassName(FullyQualifiedClassType value) {
        this.className = value;
    }

    /**
     * Gets the value of the resourceAdapter property.
     * 
     * @return
     *     possible object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.ejb.jar.String }
     *     
     */
    public za.co.enigma.turing.mda.jee.xsd.ejb.jar.String getResourceAdapter() {
        return resourceAdapter;
    }

    /**
     * Sets the value of the resourceAdapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.ejb.jar.String }
     *     
     */
    public void setResourceAdapter(za.co.enigma.turing.mda.jee.xsd.ejb.jar.String value) {
        this.resourceAdapter = value;
    }

    /**
     * Gets the value of the destinationName property.
     * 
     * @return
     *     possible object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.ejb.jar.String }
     *     
     */
    public za.co.enigma.turing.mda.jee.xsd.ejb.jar.String getDestinationName() {
        return destinationName;
    }

    /**
     * Sets the value of the destinationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link za.co.enigma.turing.mda.jee.xsd.ejb.jar.String }
     *     
     */
    public void setDestinationName(za.co.enigma.turing.mda.jee.xsd.ejb.jar.String value) {
        this.destinationName = value;
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
