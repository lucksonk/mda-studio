package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_testtypes database table.
 * 
 */
@Entity
@Table(name="t_testtypes")
@NamedQuery(name="TTesttype.findAll", query="SELECT t FROM TTesttype t")
public class TTesttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String testType;

	private String description;

	private String notes;

	private double numericWeight;

	public TTesttype() {
	}

	public String getTestType() {
		return this.testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public double getNumericWeight() {
		return this.numericWeight;
	}

	public void setNumericWeight(double numericWeight) {
		this.numericWeight = numericWeight;
	}

}