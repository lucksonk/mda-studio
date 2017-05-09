//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:40:30 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.connector;

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
 *         The config-propertyType contains a declaration of a single
 *         configuration property that may be used for providing
 *         configuration information.
 *         
 *         The declaration consists of an optional description, name,
 *         type and an optional value of the configuration property. If
 *         the resource adapter provider does not specify a value than
 *         the deployer is responsible for providing a valid value for
 *         a configuration property.
 *         
 *         Any bounds or well-defined values of properties should be
 *         described in the description element.
 *         
 *       
 * 
 * <p>Java class for config-propertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="config-propertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://xmlns.jcp.org/xml/ns/javaee}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="config-property-name" type="{http://xmlns.jcp.org/xml/ns/javaee}config-property-nameType"/>
 *         &lt;element name="config-property-type" type="{http://xmlns.jcp.org/xml/ns/javaee}config-property-typeType"/>
 *         &lt;element name="config-property-value" type="{http://xmlns.jcp.org/xml/ns/javaee}xsdStringType" minOccurs="0"/>
 *         &lt;element name="config-property-ignore" type="{http://xmlns.jcp.org/xml/ns/javaee}true-falseType" minOccurs="0"/>
 *         &lt;element name="config-property-supports-dynamic-updates" type="{http://xmlns.jcp.org/xml/ns/javaee}true-falseType" minOccurs="0"/>
 *         &lt;element name="config-property-confidential" type="{http://xmlns.jcp.org/xml/ns/javaee}true-falseType" minOccurs="0"/>
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
@XmlType(name = "config-propertyType", propOrder = {
    "description",
    "configPropertyName",
    "configPropertyType",
    "configPropertyValue",
    "configPropertyIgnore",
    "configPropertySupportsDynamicUpdates",
    "configPropertyConfidential"
})
public class ConfigPropertyType {

    protected List<DescriptionType> description;
    @XmlElement(name = "config-property-name", required = true)
    protected ConfigPropertyNameType configPropertyName;
    @XmlElement(name = "config-property-type", required = true)
    protected ConfigPropertyTypeType configPropertyType;
    @XmlElement(name = "config-property-value")
    protected XsdStringType configPropertyValue;
    @XmlElement(name = "config-property-ignore")
    protected TrueFalseType configPropertyIgnore;
    @XmlElement(name = "config-property-supports-dynamic-updates")
    protected TrueFalseType configPropertySupportsDynamicUpdates;
    @XmlElement(name = "config-property-confidential")
    protected TrueFalseType configPropertyConfidential;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the configPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigPropertyNameType }
     *     
     */
    public ConfigPropertyNameType getConfigPropertyName() {
        return configPropertyName;
    }

    /**
     * Sets the value of the configPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigPropertyNameType }
     *     
     */
    public void setConfigPropertyName(ConfigPropertyNameType value) {
        this.configPropertyName = value;
    }

    /**
     * Gets the value of the configPropertyType property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigPropertyTypeType }
     *     
     */
    public ConfigPropertyTypeType getConfigPropertyType() {
        return configPropertyType;
    }

    /**
     * Sets the value of the configPropertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigPropertyTypeType }
     *     
     */
    public void setConfigPropertyType(ConfigPropertyTypeType value) {
        this.configPropertyType = value;
    }

    /**
     * Gets the value of the configPropertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link XsdStringType }
     *     
     */
    public XsdStringType getConfigPropertyValue() {
        return configPropertyValue;
    }

    /**
     * Sets the value of the configPropertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsdStringType }
     *     
     */
    public void setConfigPropertyValue(XsdStringType value) {
        this.configPropertyValue = value;
    }

    /**
     * Gets the value of the configPropertyIgnore property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getConfigPropertyIgnore() {
        return configPropertyIgnore;
    }

    /**
     * Sets the value of the configPropertyIgnore property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setConfigPropertyIgnore(TrueFalseType value) {
        this.configPropertyIgnore = value;
    }

    /**
     * Gets the value of the configPropertySupportsDynamicUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getConfigPropertySupportsDynamicUpdates() {
        return configPropertySupportsDynamicUpdates;
    }

    /**
     * Sets the value of the configPropertySupportsDynamicUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setConfigPropertySupportsDynamicUpdates(TrueFalseType value) {
        this.configPropertySupportsDynamicUpdates = value;
    }

    /**
     * Gets the value of the configPropertyConfidential property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getConfigPropertyConfidential() {
        return configPropertyConfidential;
    }

    /**
     * Sets the value of the configPropertyConfidential property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setConfigPropertyConfidential(TrueFalseType value) {
        this.configPropertyConfidential = value;
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