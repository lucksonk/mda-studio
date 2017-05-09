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
 *         [
 *         The required-config-propertyType contains a declaration
 *         of a single configuration property used for specifying a
 *         required configuration property name. It is used
 *         by required-config-property elements.
 *         
 *         Usage of this type is deprecated from Connectors 1.6 specification. 
 *         Refer to required-config-property element for more information.
 *         
 *         Example:
 *         
 *         <required-config-property>
 *         <config-property-name>Destination</config-property-name>
 *         </required-config-property>
 *         
 *         
 *       
 * 
 * <p>Java class for required-config-propertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="required-config-propertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://xmlns.jcp.org/xml/ns/javaee}descriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="config-property-name" type="{http://xmlns.jcp.org/xml/ns/javaee}config-property-nameType"/>
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
@XmlType(name = "required-config-propertyType", propOrder = {
    "description",
    "configPropertyName"
})
public class RequiredConfigPropertyType {

    protected List<DescriptionType> description;
    @XmlElement(name = "config-property-name", required = true)
    protected ConfigPropertyNameType configPropertyName;
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