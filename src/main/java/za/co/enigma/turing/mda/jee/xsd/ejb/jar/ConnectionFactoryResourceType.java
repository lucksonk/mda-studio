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
 *         Configuration of a Connector Connection Factory resource.
 *         
 *       
 * 
 * <p>Java class for connection-factory-resourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connection-factory-resourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://xmlns.jcp.org/xml/ns/javaee}descriptionType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://xmlns.jcp.org/xml/ns/javaee}jndi-nameType"/>
 *         &lt;element name="interface-name" type="{http://xmlns.jcp.org/xml/ns/javaee}fully-qualified-classType"/>
 *         &lt;element name="resource-adapter" type="{http://xmlns.jcp.org/xml/ns/javaee}string"/>
 *         &lt;element name="max-pool-size" type="{http://xmlns.jcp.org/xml/ns/javaee}xsdIntegerType" minOccurs="0"/>
 *         &lt;element name="min-pool-size" type="{http://xmlns.jcp.org/xml/ns/javaee}xsdIntegerType" minOccurs="0"/>
 *         &lt;element name="transaction-support" type="{http://xmlns.jcp.org/xml/ns/javaee}transaction-supportType" minOccurs="0"/>
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
@XmlType(name = "connection-factory-resourceType", propOrder = {
    "description",
    "name",
    "interfaceName",
    "resourceAdapter",
    "maxPoolSize",
    "minPoolSize",
    "transactionSupport",
    "property"
})
public class ConnectionFactoryResourceType {

    protected DescriptionType description;
    @XmlElement(required = true)
    protected JndiNameType name;
    @XmlElement(name = "interface-name", required = true)
    protected FullyQualifiedClassType interfaceName;
    @XmlElement(name = "resource-adapter", required = true)
    protected za.co.enigma.turing.mda.jee.xsd.ejb.jar.String resourceAdapter;
    @XmlElement(name = "max-pool-size")
    protected XsdIntegerType maxPoolSize;
    @XmlElement(name = "min-pool-size")
    protected XsdIntegerType minPoolSize;
    @XmlElement(name = "transaction-support")
    protected TransactionSupportType transactionSupport;
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
     * Gets the value of the maxPoolSize property.
     * 
     * @return
     *     possible object is
     *     {@link XsdIntegerType }
     *     
     */
    public XsdIntegerType getMaxPoolSize() {
        return maxPoolSize;
    }

    /**
     * Sets the value of the maxPoolSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdIntegerType }
     *     
     */
    public void setMaxPoolSize(XsdIntegerType value) {
        this.maxPoolSize = value;
    }

    /**
     * Gets the value of the minPoolSize property.
     * 
     * @return
     *     possible object is
     *     {@link XsdIntegerType }
     *     
     */
    public XsdIntegerType getMinPoolSize() {
        return minPoolSize;
    }

    /**
     * Sets the value of the minPoolSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdIntegerType }
     *     
     */
    public void setMinPoolSize(XsdIntegerType value) {
        this.minPoolSize = value;
    }

    /**
     * Gets the value of the transactionSupport property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSupportType }
     *     
     */
    public TransactionSupportType getTransactionSupport() {
        return transactionSupport;
    }

    /**
     * Sets the value of the transactionSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSupportType }
     *     
     */
    public void setTransactionSupport(TransactionSupportType value) {
        this.transactionSupport = value;
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
