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
 *         The assembly-descriptorType defines
 *         application-assembly information.
 *         
 *         The application-assembly information consists of the
 *         following parts: the definition of security roles, the
 *         definition of method permissions, the definition of
 *         transaction attributes for enterprise beans with
 *         container-managed transaction demarcation, the definition
 *         of interceptor bindings, a list of
 *         methods to be excluded from being invoked, and a list of
 *         exception types that should be treated as application exceptions.
 *         
 *         All the parts are optional in the sense that they are
 *         omitted if the lists represented by them are empty.
 *         
 *         Providing an assembly-descriptor in the deployment
 *         descriptor is optional for the ejb-jar file or .war file producer.
 *         
 *       
 * 
 * <p>Java class for assembly-descriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assembly-descriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="security-role" type="{http://xmlns.jcp.org/xml/ns/javaee}security-roleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="method-permission" type="{http://xmlns.jcp.org/xml/ns/javaee}method-permissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="container-transaction" type="{http://xmlns.jcp.org/xml/ns/javaee}container-transactionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interceptor-binding" type="{http://xmlns.jcp.org/xml/ns/javaee}interceptor-bindingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message-destination" type="{http://xmlns.jcp.org/xml/ns/javaee}message-destinationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="exclude-list" type="{http://xmlns.jcp.org/xml/ns/javaee}exclude-listType" minOccurs="0"/>
 *         &lt;element name="application-exception" type="{http://xmlns.jcp.org/xml/ns/javaee}application-exceptionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "assembly-descriptorType", propOrder = {
    "securityRole",
    "methodPermission",
    "containerTransaction",
    "interceptorBinding",
    "messageDestination",
    "excludeList",
    "applicationException"
})
public class AssemblyDescriptorType {

    @XmlElement(name = "security-role")
    protected List<SecurityRoleType> securityRole;
    @XmlElement(name = "method-permission")
    protected List<MethodPermissionType> methodPermission;
    @XmlElement(name = "container-transaction")
    protected List<ContainerTransactionType> containerTransaction;
    @XmlElement(name = "interceptor-binding")
    protected List<InterceptorBindingType> interceptorBinding;
    @XmlElement(name = "message-destination")
    protected List<MessageDestinationType> messageDestination;
    @XmlElement(name = "exclude-list")
    protected ExcludeListType excludeList;
    @XmlElement(name = "application-exception")
    protected List<ApplicationExceptionType> applicationException;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the securityRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityRoleType }
     * 
     * 
     */
    public List<SecurityRoleType> getSecurityRole() {
        if (securityRole == null) {
            securityRole = new ArrayList<SecurityRoleType>();
        }
        return this.securityRole;
    }

    /**
     * Gets the value of the methodPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodPermissionType }
     * 
     * 
     */
    public List<MethodPermissionType> getMethodPermission() {
        if (methodPermission == null) {
            methodPermission = new ArrayList<MethodPermissionType>();
        }
        return this.methodPermission;
    }

    /**
     * Gets the value of the containerTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerTransactionType }
     * 
     * 
     */
    public List<ContainerTransactionType> getContainerTransaction() {
        if (containerTransaction == null) {
            containerTransaction = new ArrayList<ContainerTransactionType>();
        }
        return this.containerTransaction;
    }

    /**
     * Gets the value of the interceptorBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interceptorBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterceptorBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterceptorBindingType }
     * 
     * 
     */
    public List<InterceptorBindingType> getInterceptorBinding() {
        if (interceptorBinding == null) {
            interceptorBinding = new ArrayList<InterceptorBindingType>();
        }
        return this.interceptorBinding;
    }

    /**
     * Gets the value of the messageDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDestinationType }
     * 
     * 
     */
    public List<MessageDestinationType> getMessageDestination() {
        if (messageDestination == null) {
            messageDestination = new ArrayList<MessageDestinationType>();
        }
        return this.messageDestination;
    }

    /**
     * Gets the value of the excludeList property.
     * 
     * @return
     *     possible object is
     *     {@link ExcludeListType }
     *     
     */
    public ExcludeListType getExcludeList() {
        return excludeList;
    }

    /**
     * Sets the value of the excludeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcludeListType }
     *     
     */
    public void setExcludeList(ExcludeListType value) {
        this.excludeList = value;
    }

    /**
     * Gets the value of the applicationException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationExceptionType }
     * 
     * 
     */
    public List<ApplicationExceptionType> getApplicationException() {
        if (applicationException == null) {
            applicationException = new ArrayList<ApplicationExceptionType>();
        }
        return this.applicationException;
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
