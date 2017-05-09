package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_requiretypes database table.
 * 
 */
@Entity
@Table(name="t_requiretypes")
@NamedQuery(name="TRequiretype.findAll", query="SELECT t FROM TRequiretype t")
public class TRequiretype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String requirement;

	private String description;

	private String notes;

	private double numericWeight;

	public TRequiretype() {
	}

	public String getRequirement() {
		return this.requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
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