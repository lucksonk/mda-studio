//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.22 at 12:45:09 PM SAST 
//


package za.co.enigma.turing.mda.jee.xsd.job.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Partition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Partition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="mapper" type="{http://xmlns.jcp.org/xml/ns/javaee}PartitionMapper"/>
 *           &lt;element name="plan" type="{http://xmlns.jcp.org/xml/ns/javaee}PartitionPlan"/>
 *         &lt;/choice>
 *         &lt;element name="collector" type="{http://xmlns.jcp.org/xml/ns/javaee}Collector" minOccurs="0"/>
 *         &lt;element name="analyzer" type="{http://xmlns.jcp.org/xml/ns/javaee}Analyzer" minOccurs="0"/>
 *         &lt;element name="reducer" type="{http://xmlns.jcp.org/xml/ns/javaee}PartitionReducer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Partition", propOrder = {
    "mapper",
    "plan",
    "collector",
    "analyzer",
    "reducer"
})
public class Partition {

    protected PartitionMapper mapper;
    protected PartitionPlan plan;
    protected Collector collector;
    protected Analyzer analyzer;
    protected PartitionReducer reducer;

    /**
     * Gets the value of the mapper property.
     * 
     * @return
     *     possible object is
     *     {@link PartitionMapper }
     *     
     */
    public PartitionMapper getMapper() {
        return mapper;
    }

    /**
     * Sets the value of the mapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartitionMapper }
     *     
     */
    public void setMapper(PartitionMapper value) {
        this.mapper = value;
    }

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link PartitionPlan }
     *     
     */
    public PartitionPlan getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartitionPlan }
     *     
     */
    public void setPlan(PartitionPlan value) {
        this.plan = value;
    }

    /**
     * Gets the value of the collector property.
     * 
     * @return
     *     possible object is
     *     {@link Collector }
     *     
     */
    public Collector getCollector() {
        return collector;
    }

    /**
     * Sets the value of the collector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collector }
     *     
     */
    public void setCollector(Collector value) {
        this.collector = value;
    }

    /**
     * Gets the value of the analyzer property.
     * 
     * @return
     *     possible object is
     *     {@link Analyzer }
     *     
     */
    public Analyzer getAnalyzer() {
        return analyzer;
    }

    /**
     * Sets the value of the analyzer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Analyzer }
     *     
     */
    public void setAnalyzer(Analyzer value) {
        this.analyzer = value;
    }

    /**
     * Gets the value of the reducer property.
     * 
     * @return
     *     possible object is
     *     {@link PartitionReducer }
     *     
     */
    public PartitionReducer getReducer() {
        return reducer;
    }

    /**
     * Sets the value of the reducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartitionReducer }
     *     
     */
    public void setReducer(PartitionReducer value) {
        this.reducer = value;
    }

}
