//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:38:27 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.application.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for isolation-levelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="isolation-levelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRANSACTION_READ_UNCOMMITTED"/>
 *     &lt;enumeration value="TRANSACTION_READ_COMMITTED"/>
 *     &lt;enumeration value="TRANSACTION_REPEATABLE_READ"/>
 *     &lt;enumeration value="TRANSACTION_SERIALIZABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "isolation-levelType")
@XmlEnum
public enum IsolationLevelType {

    TRANSACTION_READ_UNCOMMITTED,
    TRANSACTION_READ_COMMITTED,
    TRANSACTION_REPEATABLE_READ,
    TRANSACTION_SERIALIZABLE;

    public java.lang.String value() {
        return name();
    }

    public static IsolationLevelType fromValue(java.lang.String v) {
        return valueOf(v);
    }

}
