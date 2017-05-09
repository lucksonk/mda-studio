package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_efforttypes database table.
 * 
 */
@Entity
@Table(name="t_efforttypes")
@NamedQuery(name="TEfforttype.findAll", query="SELECT t FROM TEfforttype t")
public class TEfforttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String effortType;

	private String description;

	private String notes;

	private double numericWeight;

	public TEfforttype() {
	}

	public String getEffortType() {
		return this.effortType;
	}

	public void setEffortType(String effortType) {
		this.effortType = effortType;
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