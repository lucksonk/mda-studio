package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_problemtypes database table.
 * 
 */
@Entity
@Table(name="t_problemtypes")
@NamedQuery(name="TProblemtype.findAll", query="SELECT t FROM TProblemtype t")
public class TProblemtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String problemType;

	private String description;

	private String notes;

	private double numericWeight;

	public TProblemtype() {
	}

	public String getProblemType() {
		return this.problemType;
	}

	public void setProblemType(String problemType) {
		this.problemType = problemType;
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