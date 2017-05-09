package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_mainttypes database table.
 * 
 */
@Entity
@Table(name="t_mainttypes")
@NamedQuery(name="TMainttype.findAll", query="SELECT t FROM TMainttype t")
public class TMainttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String maintType;

	private String description;

	private String notes;

	private double numericWeight;

	public TMainttype() {
	}

	public String getMaintType() {
		return this.maintType;
	}

	public void setMaintType(String maintType) {
		this.maintType = maintType;
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