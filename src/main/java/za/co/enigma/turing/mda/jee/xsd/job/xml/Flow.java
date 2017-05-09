//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:45:09 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.job.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Flow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="decision" type="{http://xmlns.jcp.org/xml/ns/javaee}Decision"/>
 *           &lt;element name="flow" type="{http://xmlns.jcp.org/xml/ns/javaee}Flow"/>
 *           &lt;element name="split" type="{http://xmlns.jcp.org/xml/ns/javaee}Split"/>
 *           &lt;element name="step" type="{http://xmlns.jcp.org/xml/ns/javaee}Step"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://xmlns.jcp.org/xml/ns/javaee}TransitionElements" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="next" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", propOrder = {
    "decisionOrFlowOrSplit",
    "transitionElements"
})
public class Flow {

    @XmlElements({
        @XmlElement(name = "decision", type = Decision.class),
        @XmlElement(name = "flow", type = Flow.class),
        @XmlElement(name = "split", type = Split.class),
        @XmlElement(name = "step", type = Step.class)
    })
    protected List<Object> decisionOrFlowOrSplit;
    @XmlElements({
        @XmlElement(name = "end", type = End.class),
        @XmlElement(name = "fail", type = Fail.class),
        @XmlElement(name = "next", type = Next.class),
        @XmlElement(name = "stop", type = Stop.class)
    })
    protected List<Object> transitionElements;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "next")
    protected String next;

    /**
     * Gets the value of the decisionOrFlowOrSplit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisionOrFlowOrSplit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisionOrFlowOrSplit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Decision }
     * {@link Flow }
     * {@link Split }
     * {@link Step }
     * 
     * 
     */
    public List<Object> getDecisionOrFlowOrSplit() {
        if (decisionOrFlowOrSplit == null) {
            decisionOrFlowOrSplit = new ArrayList<Object>();
        }
        return this.decisionOrFlowOrSplit;
    }

    /**
     * Gets the value of the transitionElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitionElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitionElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link End }
     * {@link Fail }
     * {@link Next }
     * {@link Stop }
     * 
     * 
     */
    public List<Object> getTransitionElements() {
        if (transitionElements == null) {
            transitionElements = new ArrayList<Object>();
        }
        return this.transitionElements;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNext(String value) {
        this.next = value;
    }

}
