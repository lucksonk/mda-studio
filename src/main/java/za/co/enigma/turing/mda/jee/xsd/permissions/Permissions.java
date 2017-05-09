//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:56:23 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.permissions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="permission" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="class-name" type="{http://xmlns.jcp.org/xml/ns/javaee}fully-qualified-classType"/>
 *                   &lt;element name="name" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *                   &lt;element name="actions" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://xmlns.jcp.org/xml/ns/javaee}dewey-versionType" fixed="7" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permission"
})
@XmlRootElement(name = "permissions")
public class Permissions {

    protected List<Permissions.Permission> permission;
    @XmlAttribute(name = "version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String version;

    /**
     * Gets the value of the permission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Permissions.Permission }
     * 
     * 
     */
    public List<Permissions.Permission> getPermission() {
        if (permission == null) {
            permission = new ArrayList<Permissions.Permission>();
        }
        return this.permission;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVersion() {
        if (version == null) {
            return "7";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVersion(java.lang.String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="class-name" type="{http://xmlns.jcp.org/xml/ns/javaee}fully-qualified-classType"/>
     *         &lt;element name="name" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
     *         &lt;element name="actions" type="{http://xmlns.jcp.org/xml/ns/javaee}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "className",
        "name",
        "actions"
    })
    public static class Permission {

        @XmlElement(name = "class-name", required = true)
        protected FullyQualifiedClassType className;
        protected za.co.enigma.turing.mda.jee.xsd.permissions.String name;
        protected za.co.enigma.turing.mda.jee.xsd.permissions.String actions;

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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link za.co.enigma.turing.mda.jee.xsd.permissions.String }
         *     
         */
        public za.co.enigma.turing.mda.jee.xsd.permissions.String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link za.co.enigma.turing.mda.jee.xsd.permissions.String }
         *     
         */
        public void setName(za.co.enigma.turing.mda.jee.xsd.permissions.String value) {
            this.name = value;
        }

        /**
         * Gets the value of the actions property.
         * 
         * @return
         *     possible object is
         *     {@link za.co.enigma.turing.mda.jee.xsd.permissions.String }
         *     
         */
        public za.co.enigma.turing.mda.jee.xsd.permissions.String getActions() {
            return actions;
        }

        /**
         * Sets the value of the actions property.
         * 
         * @param value
         *     allowed object is
         *     {@link za.co.enigma.turing.mda.jee.xsd.permissions.String }
         *     
         */
        public void setActions(za.co.enigma.turing.mda.jee.xsd.permissions.String value) {
            this.actions = value;
        }

    }

}
